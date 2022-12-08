# Aula 4
2022-12-07
tags: [[../index Angular]]

## - Mod 17 - : O que são data binding

O data binding nada mais é que uma forma de tratar dados. Formas de incorporar valores dinamicos nos modelos html

* **O interpolation**: é o **{{  }}** para colocar na tela em html
* **Propety binding**: É quando usamos [propety], colchetes em um elemnto html, dessa forma, podemos falar para o angular que o valor dessa propriedade é uma variável em html  ele entende ao compilar
* **eventBind**: É quando rodamos uma function ao acontecer um evento - **(event) = "fn"** sendo event o nome do evento e fn a função, método... que vai rodar
* **two-way bind**: Para fazermos um two-way binding, precisamos de duas formas de mudar uma variável, o código e mais uma, um input por exemplo, com [ (ngModel) ]  que diz que esse input pode mudar uma variável. Dessa forma, podemos fazer o valor da variável mudar

## - Mod 21 - : two-way bind
Não me aguentei, tive que ver isso e o motivo de ter dado erro no meu código. Acontece que para fazer o databind corretamente com o two-way é que você precisa adicionar o FormsModule nos imports e detalhe, precisa adicionar a importação

~~~ts
// Arquivo: app.module.ts
// ... Outras importações
import { FormsModule } from '@angular/forms';

@NgModule({

  declarations: [
    AppComponent,
    TextingInputComponent
  ],

    // Atenção no FormsModule
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],

  providers: [],
  bootstrap: [AppComponent]

})
~~~

## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569784#overview
