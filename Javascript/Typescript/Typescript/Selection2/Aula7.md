# Type number

Mod 13 -- **27/02/22**

Para não termos que ficar escrevendo tsc no terminal a todo momento, temos o *tsc --watch* que vai funcionar exatamente igual um nodemon, toda vez que você mudar o arquivo, vai rodar um tsc
> tsc --watch

Para criar uma variável tipo number é exatamente da mesma forma, só que com o number no lugar de string:

~~~ts
let number:number = 10;
~~~

Porém temos algumas funcionalidades com a classe number que nos ajudam em alguns casos, um recurso bem interessante de se usar trabalhando com numbers, é usar Number() como função. Usando number como função, podemos transformar algo que está vindo em string ou em outro valor em um :number

~~~ts
// Não sabemos o type da variável
let variable;

let number1:number = 10;
// Mas ela vai ser convertida em number, então não temos problemas
let number2:number = Number(variable);

console.log(number1 + number2);
~~~

Essa é a forma estendida de fazer esse código, na realidade o que você mais vai ver é pessoas usando o shortcut para isso, simplesmente colocando um + antes da variável, ou usando um parseInt() no valor, mas isso vai perder o . caso tenha, então o ideal é usar o parseFloat()

~~~ts
let variable;

let number1:number = 10;
let number2:number = +variable;

console.log(number1 + number2);
~~~

Então temos também o :bigInt que suporta números gigantescos, diferentemente do :number, mas ele só está disponível à partir do 2020 e podemos colocar n para ter uma quantidade absurda de casas
