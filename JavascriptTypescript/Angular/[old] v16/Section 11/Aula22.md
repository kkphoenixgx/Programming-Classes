# Aula22
2023-02-06
tags: [index Angular](index%20Angular.md)

## - Mod 69 - : Validators

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

## - Mod 70 - : Valid e invalid

Ele só exemplificou que têm como usar o valid e o invalid para mesclar os binds do que a gente já aprendeu e fazer muito mais coisa...

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/27353504?start=0#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/27353510#overview