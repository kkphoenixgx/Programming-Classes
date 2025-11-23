# Data Binding
2025-11-23
tags: [[index Angular]]

## Data bindigs e two-way binding
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 4/Aula5.md ]

O data binding nada mais é que uma forma de tratar dados. Formas de incorporar valores dinamicos nos modelos html

* **O interpolation**: é o **{{  }}** para colocar na tela em html
* **Propety binding**: É quando usamos [propety], colchetes em um elemnto html, dessa forma, podemos falar para o angular que o valor dessa propriedade é uma variável em html  ele entende ao compilar
* **eventBind**: É quando rodamos uma function ao acontecer um evento - **(event) = "fn"** sendo event o nome do evento e fn a função, método... que vai rodar
* **two-way bind**: Para fazermos um two-way binding, precisamos de duas formas de mudar uma variável, o código e mais uma, um input por exemplo, com [ (ngModel) ] ="variable" que diz que esse input pode mudar uma variável. Dessa forma, podemos fazer o valor da variável mudar

Não me aguentei, tive que ver isso e o motivo de ter dado erro no meu código. Acontece que para fazer o databind corretamente com o two-way é que você precisa adicionar o FormsModule nos imports e detalhe, precisa adicionar a importação

~~~html
<input [(ngModel)]="inputValue" > {{inputValue}} <br>
~~~

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

## interpolation, Property Binding e event binding
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 4/Aula6.md ]

O interpolation é denominado como "{{  }}" e dentro dele podemos fazer ternários e operações matemáticas, incluindo operações que resultam em true e false

propety binding nada mais é que uma propriedade de um elemento html em colchetes que pode receber uma variável.

O event binding nada mais é que qualquer evento em () que ativa uma função. Você pode fazer (onchange) = "fn" onChange podendo ser onclick ou qualquer outro evento