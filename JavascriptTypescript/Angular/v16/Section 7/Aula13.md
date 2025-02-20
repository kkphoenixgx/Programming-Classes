
# Comunicação entre componentes - Aula13
2022-12-23
tags: [[index Angular]]

## - Mod 36 - : Introdução a comunicação entre componentes

É bem simples como funciona a **comunicação de pai para filho**, deve-se criar um input. Contudo, vamos falar especificamente entre os probles da comunicação....

![[Pasted image 20221223122713.png]]

Vamos dizer que você precisa fazer uma **comunicação filho-pai** com essa estrutura, se você simplesmente comunicar, será um gafo ([Referência ao livro de arquitetura de software](https://github.com/kkphoenixgx/Estudos/blob/master/Conceitos/Linguagens/Literatura/Arquitetura%20Limpa.md)), o que fará com que a arquitetura fique complexa e errada de um ponto de vista infraestrutural, dessa forma, deve-se criar uma interface abstrata para que não cause esses problemas, então é um assunto mais complexo que deve-se tomar **cuidado** ao simplesmente fazer comunicações e ao usar o **output**, nos comunicamos por eventos, o que pode ser melhor mas ainda pode causar confusão e criar um site mais lento com um *inferno de eventos*...

![[Comunicação entre componentes- Pai para filho.png]]

Além disso, tome **cuidado** ao criar muitos componentes em **comunicações pai-filho**, pois pode se tornar um inferno ler o sistema com tantas comunicações


## - Mod 37 - : @Input - Comunicação do pai para filho

~~~ts
import {Input} from '@angular/core'

export class someComponent{
	@Input() public variable :number = 0
}
~~~

Quando usamos o @Input(), defiinimos que este valor pode ser recebido de outro lugar, e podemos receber pelo pai usando [variavelDoFilho] = 'variavelDoPai' no selector do filho no pai

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

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569926#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569930#overview