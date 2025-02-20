# Aula8
2022-12-15
tags: [[index Angular]]

> *__[ngAtributeDirective]= " {x} "__*

sendo x uma variável dependendo da diretiva dessa aula

## - Mod 28 - Diretivas atributo : NgClass

O ngClass é uma diretiva bem interessante, ela serve para fazer validações usando diretamente as classes do css ou do sass. Ela usa essa sintax mais robusta e é feita em uma estrutura bem simples: 
**[ngClass]="{'className': tsConditionVariableBoolean, 'classNameTwo': 'tsOtherConditionVariableBoolean }"**

~~~html
<h2 [ngClass]="{'enable': blinkToggle, 'disable': !blinkToggle}" > Attribute Directives </h2>

// component.ts: public blinkToggle = true;
// css: enable{ color: blue; } -break line- disable: { color: red }
~~~

Nada complicado e bem útil

## - Mod 29 - Diretivas atributo : NgStyle

Já a diretiva do NgStyle é parecida com o ngClass mas ela vêm com a função de mudar uma propriedade css pelo ts facilmente:

~~~html
<p [ngStyle]="{'font-size': fontSize}" > ngStyle </p>
~~~

~~~ts
// Claro que isso tem que estar na classe
public fontSize :string = '2em'

ngOnInit(){

	setInterval(()=>{

		if (this.fontSize === '2em') this.fontSize = '1em'
		else this.fontSize = '2em'

	}, 2000 )
}
~~~

Algum tempo depois, descobri um jeito legal de fazer sem colocar um atributo na classe

![[cssStyleBindingAngular.png]]

### Curiosidade: Entendendo verdadeiramente a sintaxe

Outra coisa muito legal, é que poderiamos simplesmente não usar css ;-;

~~~html
<p [ngStyle]="css" > ngStyle </p>
~~~

~~~ts
class Component {
	this.fontSize :string = '2em'

	public css :object = {
		'color': 'green',
		'font-size': this.fontSize
	}
	
	setInterval(()=>{

		if (this.fontSize === '2em') this.fontSize = '1em'
		else this.fontSize = '2em'

	}, 2000 )
}
~~~

Então aquilo não um interpolation nem nada, é um objeto escrito na mão mesmo. Contudo, tem outras formas de pegar o valor do style e mudar usando o ts mesmo, então, **é só uma curiosidade, nada muito útil...** 
_*curiosity, but useless*

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569866#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569880#overview
