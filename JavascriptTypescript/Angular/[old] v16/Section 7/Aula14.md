# Aula14
2022-12-26
tags: [[index Angular]]

Bom, essa aula está mais que nunca ligada com o conteúdo anterior, principalemnte de um ponto de vista de arquitetura. Então, leia a [[JavascriptTypescript/Angular/v16/Section 7/Aula13]]

## - Mod  -38 : @Output()

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

## - Mod  - 39 : @Output() parte 2

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

Na minha opinião, essa é uma forma válida de resolver o problema na prática, de somente pegar os dados de uma maneira eficiente. Contudo, não acho que essa seja a melhor prática, criar um componente que manda dados para o seu pai é sempre perigoso, usar uma interface com uma factory é mais viável, mais rápido e menos custoso, além de não criar um gafo de dependencia. Portanto, isso é bem útil e deve ser usado, mas refatorar esse código para uma linguagem mais industrial, dependendo do projeto, é melhor.

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569936?start=15#overview
https://www.udemy.com/course/curso-de-angular/learn/lecture/25569938#overview