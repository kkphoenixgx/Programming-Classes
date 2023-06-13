# Aula 36
2023-06-13
tags: [index Angular](../index%20Angular.md)

## - Mod 115 - : Configurando teste do serviço

Você não pode testar diretamente o que vêm, testa somente o seu componente de serviço, muitas vezes o que vêm não é completamente previsível.

No Jasmine, temos os blocos de preparação, métodos como `beforeEach()`, `describe()`, que definem a estrutura antes de fazer de fato os testes, preparam o ambiente. Um importante incremento ao grupo é o `afterEach()` que será executado ao final de cada `it()`.

Falando agora de uma ferramenta imprescindível para lidar com testes, o `verify()`, que verifica se tá tudo certo com os request a um endereço que você tá pedindo.

Portanto, devemos adicionar o seguinte bloco ao nosso teste de serviço:

~~~ts
// tenha certeza de ter essa importação
import { HttpTestingController } from "@angular/common/http/testing"

// tenha certeza de ter essa variável
let httpTestingController :HttpTestingController;

afterEach(){
	httpTestingController.verify();
}
~~~

Dessa forma, teremos certeza que não haverá problemas com os nossos requests.

Não somente isso, mas o seu serviço também deve suportar quando o service cair. Então, faça um valor padrão.

## - Mod 116 - : Corrigindo erros

Toda criação ao software, terá precedência de erros que terão que ser resolvidos. É lógico que ao adicionar novas coisas, terão testes que não serão feitos. Portanto, programe pensando nas coisas que vão ser testadas e como você vai testar essas coisas, mesmo que não faça o trabalho de QI completo, é interessante pensar um pouco nisso para criar um programa full stack.

As importações nos imports do `configureTestingModule` **não passam as dependências automaticamente, os testes dos dependentes do componente que possuí a importação devem ter a importação também.**



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28649790#overview