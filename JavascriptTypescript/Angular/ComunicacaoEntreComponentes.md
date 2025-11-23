# Comunicação entre Componentes
2025-11-23
tags: [[index Angular]]
 
## Introdução a comunicação entre componentes
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 7/Aula13.md ]
 
É bem simples como funciona a **comunicação de pai para filho**, deve-se criar um input. Contudo, vamos falar especificamente entre os problemas da comunicação....
 
Vamos dizer que você precisa fazer uma **comunicação filho-pai** com essa estrutura, se você simplesmente comunicar, será um gafo ([Referência ao livro de arquitetura de software](https://github.com/kkphoenixgx/Estudos/blob/master/Conceitos/Linguagens/Literatura/Arquitetura%20Limpa.md)), o que fará com que a arquitetura fique complexa e errada de um ponto de vista infraestrutural, dessa forma, deve-se criar uma interface abstrata para que não cause esses problemas, então é um assunto mais complexo que deve-se tomar **cuidado** ao simplesmente fazer comunicações e ao usar o **output**, nos comunicamos por eventos, o que pode ser melhor mas ainda pode causar confusão e criar um site mais lento com um *inferno de eventos*...
 
Além disso, tome **cuidado** ao criar muitos componentes em **comunicações pai-filho**, pois pode se tornar um inferno ler o sistema com tantas comunicações
 
## @Input - Comunicação do pai para filho
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 7/Aula13.md ]
 
~~~ts
import {Input} from '@angular/core'
 
export class someComponent{
	@Input() public variable :number = 0
}
~~~
 
Quando usamos o @Input(), definimos que este valor pode ser recebido de outro lugar, e podemos receber pelo pai usando [variavelDoFilho] = 'variavelDoPai' no selector do filho no pai
 
~~~ts
import {Component } from '@angular/core'
 
@Component({
 
  selector: 'app-root',
  styleUrls: ['./style.css'],
  template: `
		
		<some-component [variable] = "someDadVariable"></some-component>
    <router-outlet></router-outlet>
  `
})
 
export class appRootCOmponent{
	public someDadVariable :number = 0
}
~~~
 
## @Output()
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 7/Aula14.md ]
 
Basicamente, teremos uma instância do EventEmitter que vai, com o método emit. emitir dados para quem quiser escutar e um @Output que vai enviar dados em forma de evento, para quem quiser escutar, quando escutar que foi emitido um evento.
 
~~~ts
import {Output, EventEmitter} from "@angular/core"
 
export class someComponent{
	@Output() public sendDataObject = new EventEmitter()
 
	// Seta o type para o data que você tiver
	getData(data :any) :void{
		this.sendDataObject.emit(data)
	}
}
~~~
 
## @Output() parte 2
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 7/Aula14.md ]
 
Agora na nossa classe pai, vamos ter uma forma de receber esse dado e colocar na tela somente quando ele estiver ativo, diferentemente do @Input, este só vai existir caso aconteça o trigger do event no filho. Dessa forma, devemos criar uma regra de negócio para quando esse valor deve acontecer:
 
~~~ts
@Component({
 
  selector: 'app-root',
  styleUrls: ['./style.css'],
  template: `
	 <!-- Colocando na tela  -->
		<ng-template [ngIf] = "someDadVariable" >
			{{someDadVariable}}
		</ng-template>
 
	 <!-- Recebendo  -->
		<someComponent [getData] = "setData($event)" ></someComponent>
    
    <router-outlet></router-outlet>
  `
})
 
export class appRootCOmponent{
 
	// Seta o type para o data que você tiver
	public someDadVariable :any | undefined = undefined
 
	public setData(event :any){
		if(typeof event === 'undefined') return 
		
		this.someDadVariable = event
	}
}
~~~ 
* Obs: Eu dei uma melhorada, no curso é um pouco mais direto
 
Enquanto event for undefined, o ng-template nem vai carregar, o que não deixa essa variável ficar atualizando infinitamente na sua aplicação, toda vez que a aplicação for carregada ele vai pegar esse valor de event e colocar no *someDadVariable* pelo método setData e com o ng-template, vai acontecer o que foi dito, só vai colcoar na tela se não for undefined.
 
Na minha opinião, essa é uma forma válida de resolver o problema na prática, de somente pegar os dados de uma maneira eficiente. Contudo, não acho que essa seja a melhor prática, criar um componente que manda dados para o seu pai é sempre perigoso, usar uma interface com uma factory é mais viável, mais rápido e menos custoso, além de não criar um gafo de dependência. Portanto, isso é bem útil e deve ser usado, mas refatorar esse código para uma linguagem mais industrial, dependendo do projeto, é melhor.
 
## Insights de Arquitetura
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 8/Aula16.md ]
 
Quando os componentes fazem comunicação diretamente e frequentemente, provavelmente significa que eles são pai e filho...

~~~html
<!-- Pai: app.component.html -->
<some-component [variable]="someDadVariable"></some-component>
~~~

~~~ts
// Pai: app.component.ts
export class appRootComponent{
	public someDadVariable :number = 0
}
~~~

## @Output() - Comunicação do Filho para o Pai
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 7/Aula14.md ]

Basicamente, teremos uma instância do `EventEmitter` que vai, com o método `emit()`, emitir dados para quem quiser escutar. O `@Output` envia esses dados em forma de evento.

~~~ts
// Filho: some.component.ts
import {Output, EventEmitter} from "@angular/core"

export class someComponent{
	@Output() public sendDataObject = new EventEmitter()

	// Seta o type para o data que você tiver
	public getData(data :any) :void{
		this.sendDataObject.emit(data)
	}
}
~~~

Agora, na nossa classe pai, vamos ter uma forma de receber esse dado. Diferentemente do `@Input`, este só vai existir caso aconteça o *trigger* do evento no filho.

~~~html
<!-- Pai: app.component.html -->

<!-- (sendDataObject) é o nome do Output, e setData($event) é o método que recebe o dado -->
<some-component (getData)="setData($event)"></some-component>

<!-- Colocando na tela -->
<ng-template [ngIf]="someDadVariable">
	{{someDadVariable}}
</ng-template>
~~~

~~~ts
// Pai: app.component.ts
export class appRootComponent{
	public someDadVariable :any | undefined = undefined

	public setData(event :any){
		if(typeof event === 'undefined') return 
		
		this.someDadVariable = event
	}
}
~~~

**Insight de arquitetura:**
Criar um componente que manda dados para o seu pai é sempre perigoso. Usar uma interface com uma *factory* ou um serviço compartilhado é mais viável, mais rápido e menos custoso, além de não criar um "gafo" de dependência.