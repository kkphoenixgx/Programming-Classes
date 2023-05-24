# Tipo referência vs tipo valor
[Index Java](../../JavaVanilla/Index%20Java.md)

Mod 87 -- **08/12/21**

> "Em java, classes não devem ser entendidas como locais no sistema, e sim "tentaculos" (ponteiros) para caixas."

As variáveis são alocadas num lugar chamado de **Stack** do disco, enquanto os objetos das classes são alocadas no **Heap** do disco em tempo de execução.

Então quando você declara variáveis em java, elas estarão em *Stack* e quando forem de fato instanciadas como objeto, essas variáveis vão guardar um endereço de memória para um objeto na memória *Heap*. Isso nós chamamos de **Alocação Dinamica de Memoria**.

* **Valor null**

Tipos referência aceitam o valor null, que diz que a variável não aponta para ninguem.

* **Tipos primitivos**

> Em java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros

Tipos primitivos são variáveis de tipo comum, como String, double, float, int...

Quando declaramos x = y, isso com variáveis primitivas, estamos dizendo que x recebe uma cópia de y e não um endereço de memória.

EM JAVA, VARIÁVEIS NÃO PODEM SER TERMINADAS SEM SEREM DADAS UM VALOR, NÃO É IGUAL AO JAVASCRIPT QUE RETORNA NULL

* **Valores padrão**

Quando alocamos qualquer **tipo estruturado** (como array ou uma classe) são atribuidos valores padrão a esse elemento

|tipo estruturado| valor |
|----------------|-------|
|     number     |   0   |
|    boolean     | false |
|      char      | C.C.0 |
|     object     |  null |

Sendo C.C.0 é o caracter code 0
