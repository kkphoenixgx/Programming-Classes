# Aula 6
2022-12-08
tags: [[../index Angular]]

## - Mod 20 - : Interpolation

O interpolation é denominado como "{{  }}" e dentro dele podemos fazer ternários e operações matemáticas, incluindo operações que resultam em true e false

~~~html
{{ (title === 'olá' )? 'mama' : false  }}
{{ 1+1 }}
{{ 1>0 }}
~~~

## - Mod 21 - :  Property Binding

propety binding nada mais é que uma propriedade de um elemento html em colchetes que pode receber uma variável. Exemplo:

~~~ts
// file:  app.component.ts
export class AppComponent implements OnInit {
	public btnToogle :boolean = false
}
~~~
~~~html
<!-- sem -->
<button disabled='false' > OK </button>

<!-- com -->
<button [disabled]='btnToogle' > OK </button>
~~~

Desse modo, se eu definir a o btnToogle como true, ele vai habilitar novamente o botão. Importante diser que isso é possível com todas as propriedades html. Além disso, sem os colchetes, vira uma propriedade completamente normal e não identifica como variável o que tá em aspas

## - Mod 22 - :  Event Binding

O event binding nada mais é que qualquer evento em () que ativa uma função. Você pode fazer (onchange) = "fn" onChange podendo ser onclick ou qualquer outro evento


-----------------------------------------------
Lembrando que o módulo 23 foi feito na aula passada por que eu não em aguentei

## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569798#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569804#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569808?start=0#content
