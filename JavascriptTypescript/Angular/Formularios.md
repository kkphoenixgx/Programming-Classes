# Formulários
2025-11-23
tags: [[index Angular]]

## NgForm
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 10/Aula20.md ]

Como já dito em aulas anteriores, para usar o FromsModule, o módulo de formulários do Angular, precisamos colocar nos imports e nas importações o FormsModule no module.ts.

### ngForm + input text

Podemos usa-lo, definindo que # (sem esse espaço)nomeDoSeuFormulario é = ngForm:

~~~html
<form #nomeDoSeuFormulario>
	<input type="text" name:"name" ngModel >
</form>

<!-- transfomando com pipe o value do form para json e colocando na tela -->
{{ nomeDoSeuFormulario.value | json }}
~~~

### ngForm + Input rádio

Basicamente a aula é sobre input type radio com o ngForms:

~~~html
<form #nomeDoSeuFormulario autocomplete="off">
		<p>--- Defina seu sexo ---</p>
		Masculino: <input type="radio" name:"sexo" value="Masculino" ngModel >
		Feminino: <input type="radio" name:"sexo" value="Feminino" ngModel >
		Outros: <input type="radio" name:"sexo" value="Outros" ngModel >
</form>

{{ nomeDoSeuFormulario.value | json }}
~~~

* Dica de html:
	Ao colocar os names iguais, só pode ter um radio checked.

### ngForm + Input checkbox

~~~ html
<form #nomeDoSeuFormulario autocomplete="off">
		<p>--- Defina seus frameworks ---</p>
		Angular: <input type="checkbox" name:"angular" ngModel >
		React:   <input type="checkbox" name:"react" ngModel >
		Vue:     <input type="checkbox" name:"vue" ngModel >
</form>
~~~

### ngForm + Select

Uma forma mais expansível e de melhor manipulação:

~~~ html
<select name="comidas">
	<option value="">Selecione uma comida</option>
	<option *ngFor="let item of someArrayList" [value]="item.name" > {{item.name}} </option>
</select>
~~~

Detalhe no propety binding do value para poder receber uma variável em seu valor.

### ngForm + Errors

Basicamente, para tratarmos erros no angular de uma maneira bem simples, podemos fazer uso das validações com uma dupla de atributos que permite relacionar o próprio input e seu valor, falando que o # (sem o espaço do lado)textInput = ngModel e que o ngModel = o value do input, percebemos que o textInput recebe sempre o value:

~~~html
<input type="text" #textInput="ngModel" [ngModel]="textInput.value" >
~~~

Dessa forma, podemos relacionar um span com o valor. Usando os atributos do input pelo angular, recebemos alguns atributos de brinde por fazer assim:

* **inputReference.valid** = retorna true **se o input for valido**, no uso de um required por exemplo, ou um type="email"
* **inputReference.invalid** = retorna true **se o input for invalido**, no uso de um required por exemplo, ou um type="email"
* **inputReference.dirty** =  retorna true se **se o usuário já escreveu algo**
* **inputReference.touched** = retorna true se **se o usuário já clicou no input**

~~~html
<form #nomeDoSeuFormulario autocomplete="off">
		<input 
			type="text" required name="textInput"
			#textInput = "ngModel" [ngModel]="textInput.value" 
    >			
		
		<span *ngIf="textInput.invalid" > 
			!!! Ops, valor inválido !!! 
		</span>
</form>
~~~

### ngSubmit - Submit form

Podemos pegar o evento do submit com (ngSubmit) e passar o próprio formulário para a fn, assim podemos fazer um form.value e pegar o json de todos os dados

~~~html
<form #nomeDoSeuFormulario autocomplete="off" (ngSubmit)="someSubmitFn(form)" >
		<input 
			type="text" required name="textInput"
			#textInput = "ngModel" [ngModel]="textInput.value" 
    >			

		<button type="submit" [disabled]="nomeDoSeuFormulario.invalid" > 
			Submit 
		</button>
</form>
~~~

Importante: o type do form é :NgForm, quando for usar ele no ts

## Introdução ao reactive forms
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 11/Aula21.md ]

Reactive forms é uma forma de trabalhar com formulários reativamente, estavamos usando até agora a forma mais simples, o **template-driven-forms**, contudo, o **reactive forms** é mais rápido, expansível e melhor de usar

## Utilizando o formulário - Form builder
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 11/Aula21.md ]

Bom, antes de tudo, obviamente precisamos importar o reactiveForms para o module.ts, como visto em várias outras aulas, só muda o nome... E nesse exemplo, **usaremos as Routes do Angular, portanto adicionamos a segunda imagem no componente que vamos usar o ReactiveForms**:

![](Pasted%20image%2020230205175454.png)

![](Pasted%20image%2020230205145908.png)

E dentro de um componente, criaremos o form builder, que é justamente quem vai criar os formulários dinamicos e incríveis. Da mesma forma, vamos criar os FromGroups, grupos de itens do formulário.

~~~ts
import { Component } from '@angular/core';

// Angular dependencies
  import { FormBuilder, FormGroup } from '@angular/forms';
  
/* @Component({}) */

export class TestingReactiveFormsComponent {

  public formGroup :FormGroup = this.formBuilder.group({
    firstName: [''],
  })
 
  constructor( private formBuilder : FormBuilder ){}
  
}
~~~

Além disso, devemos dizer quais forms são do group formGroup

~~~html
<form [formGroup] = "cadastroFormGroup" >
    <input type="text" formControlName = 'firstName'>

	{{ formGroup.get('firstName')?.value }}
</form>
~~~

## Validação de formulários reactiveForms
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 11/Aula22.md ]

Validators são validações de input em formulários ReactiveForms que ajudam na segurança e nas validações dos formulários. Para usar os validators, precisamos importar eles do @angular/forms (*Não esquece de importar os reactiveForms do angular como visto na* [Aula21](JavascriptTypescript/Angular/v16/Section%2011/Aula21.md))

Podemos fazer um required pelo ts usando o Validators.required

~~~ts
import { Component } from '@angular/core';

// Angular dependencies
  import { FormBuilder, FormGroup, Validators } from '@angular/forms';
  
/* @Component({}) */

export class TestingReactiveFormsComponent {

  public formGroup :FormGroup = this.formBuilder.group({
    firstName: ['', Validators.required],
    lasteName: ['']
  })
 
  constructor( private formBuilder : FormBuilder ){}
  
}
~~~

A partir disso, podemos usar o touched, dirty e errors para fazer validações. Desse modo, saberemos quando o usuário já clicou no input, quando ele já sujou com algo errado e quando deu algum erro, como um campo ser required e ainda não ter sido preenchido:

~~~html
<form [formGroup] = "cadastroFormGroup" >
    <input type="text" formControlName = 'firstName'>
    <input type="text" formControlName = 'lastName'>

	{{ formGroup.get('firstName')?.errors | json }}
	{{ formGroup.get('firstName')?.touched | json }}
	{{ formGroup.get('firstName')?.dirty | json }}
</form>
~~~

## Valid e invalid
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 11/Aula22.md ]

Ele só exemplificou que têm como usar o valid e o invalid para mesclar os binds do que a gente já aprendeu e fazer muito mais coisa...