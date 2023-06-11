# Aula 35
2023-06-11
tags: [index Angular](../index%20Angular.md)

## - Mod 113 - : Criando um serviço investments

 Nada de novo, ele só fez um service simples usando um server que ele criou.


## - Mod 114 - : Testando services

Bom, logo antes de começar a falar dos services, existe o conceito de mokar algo, que é basicamente fazer o teste sobre um objeto, componente... Veja uma descrição do chatGPT:
<p style="display:flex; justify-content: end" > <i> No contexto do Jasmine, uma estrutura de teste para JavaScript, "mockar" algo significa substituir ou simular um objeto real ou uma função durante os testes. O objetivo é isolar a unidade de código sendo testada e garantir que o teste seja executado de forma independente, sem depender de outros componentes externos. ~ChatGPT </i></p>
Bom, nesses mocks, existem dois atores principais que vão nos ajudar, o `HttpClientTestingModule` e o `HttpTestingController`, ambos estarão no `@angular/common/http/testing`

Uma especificação importante de notar ao usar o `HttpClientTestingModule`, é que ele deve ser importado no `configureTestingModule`:

![](../img/Pasted%20image%2020230611102821.png)

Somente assim poderemos utiliza-lo. Diferentemente, o `HttpTestingController` pode ser utilizado ao ser tipado em uma variável.


-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28649714#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/28649776#announcements/8179882/
