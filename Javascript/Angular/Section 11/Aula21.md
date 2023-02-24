# Aula21
2023-02-05
tags: 

## - Mod 67 - : Introdução ao reactive forms


Reactive forms é uma forma de trabalhar com formulários reativamente, estavamso usando até agora a forma mais simples, o **template-driven-forms**, contudo, o **reactive forms** é mais rápido, expansível e melhor de usar


## - Mod 68 - : Utilizando o formulário - Form builder

Bom, antes de tudo, obviamente precisamos importar o reactiveForms para o module.ts, como visto em várias ourtras aulas, só muda o nome... E nesse exemplo, **usaremos as Routes do Angular na **:

![](../img/Pasted%20image%2020230205175454.png)

![](../img/Pasted%20image%2020230205145908.png)

E dentro de um componente, criaremos o form builder, que é justamente quem vai criar os formulários dinamicos e incredibles（づ￣3￣）づ╭❤～. Da mesma forma, vamos criar os FromGroups

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



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/27353374#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/27353500#overview
