# Aula20
2023-02-03
tags: [index Angular](../index%20Angular.md)

Como já dito em aulas anteriores, para usar o FromsModule, o módulo de formulários do Angular, precisamos colocar nos imports e nas importações o FormsModule no module.ts.

## - Mod 61 - : ngForm + input text

Podemos usa-lo, definindo que # (sem esse espaço)nomeDoSeuFormulario é = ngForm:

~~~html
<form #nomeDoSeuFormulario>
	<input type="text" name:"name" ngModel >
</form>

<!-- transfomando com pipe o value do form para json e colocando na tela -->
{{ nomeDoSeuFormulario.value | json }}
~~~

* Insight de conexão:
  Vale a conexão que podemos armazenar esses dados em uma variável e colocar eles para o banco de dados como vimos na section anterior, além disso, podemos até mesmo transformar esses dados que vêm em json pelo pipe para qualquer outro dado com http header, portanto, podemos definir que na nossa aplicação usaremos json para tratar dados, embora isso deva ser encapsulado no código, não no html...

## - Mod 62 - : ngForm + Input rádio

Basicamente a aula é sobre input type radio com o ngForms:

~~~html
<form #nomeDoSeuFormulario autocomplete="off">
		<p>--- Defina seu sexo ---</p>
		Masculino: <input type="radio" name:"sexo" value="Masculino" ngModel >
		Femonino: <input type="radio" name:"sexo" value="Feminino" ngModel >
		Outros: <input type="radio" name:"sexo" value="Outros" ngModel >
</form>

{{ nomeDoSeuFormulario.value | json }}
~~~

* Dica de html:
	Ao colocar os names iguais, só pode ter um radio checked.

## - Mod 63 - : ngForm + Input checkbox

~~~ html
<form #nomeDoSeuFormulario autocomplete="off">
		<p>--- Defina seus frameworks ---</p>
		Angular: <input type="checkbox" name:"angular" ngModel >
		React:   <input type="checkbox" name:"react" ngModel >
		Vue:     <input type="checkbox" name:"vue" ngModel >
</form>
~~~

## - Mod 64 - : ngForm + Select

Esse seria uma forma hard coded de usar o select
![](../img/Pasted%20image%2020230203224955.png)

Uma forma mais expansível e de melhor manipulamento

~~~ html
<select name="comidas">
	<option value="">Selecione uma comida</option>
	<option *ngFor="let item of someArrayList" [value]="item.name" > {{item.name}} </option>
</select>
~~~

Detalhe no propety binding do value para poder receber uma variável em seu valor.

## - Mod 65 - : ngForm +  Errors

Basicamente, para tratarmos erros no angular de uma maneira bem simples, podemos fazer uso das validações com uma dupla de atributos que permite relacionar o próprio input e seu valor, falando que o # (sem o espaço do lado)textInput = ngModel e que o ngModel = o value do input, percebemos que o textInput recebe sempre o value:

~~~html
<input type="text" #textInput="ngModel" [ngModel]="textInput.value" >
~~~

Dessa forma, podemos relacionar um span com o valor. Usando os atributos do input pelo angular, recebemos alguns atributos de brinde por fazer assim:

* **inputReference.valid** = retorna true **se o input for valido**, no uso de um required por exemplo, ou um type="email"
* **inputReference.invalid** = retorna true **se o input for invalido**, no uso de um required por exemplo, ou um type="email"
* **inputReference.dirty** =  retorna true se **se o usuário já escreveu algo**
* **inputReference.touched** = retorna true se **se o usuário já clicou no input**

Pelo menos esses foram os que foram usados no vídeo

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

## - Mod 66 - :  ngSubmit - Submit form

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

-----------------------------------------------
* Nota: decidi não usar labels para ficar mais fácil de ver e enxuto os códigos :)

## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570530#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570540#overview