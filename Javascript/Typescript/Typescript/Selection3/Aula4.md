# Types em Typescript

Mod 11 -- **15/02/22**

Tipos de dados Typescript, o js como todos sabem, tem a capacidade de criar dados dinâmicos, então tudo fica muito simples sem declarar variáveis, porém em ts, temos que definir o tipo da variável. Uma categoria que possuí *, significa que é nativa do js

| **Tipo**                    | **significado**                                               |
| --------------------------- | ------------------------------------------------------------- |
| [[Types/Aula6]] - String    | Linha de texto = "String"                                     |
| [[Types/Aula7]] number      | número = 21                                                   |
| [[Types/Aula8]]  - boolean  | tem um valor de true or false                                 |
| [[Types/Aula8]] - array     | junção de várias variáveis do mesmo tipo = ["name", 21, true] |
| [[Types/Aula9]] - tuple     | Um array que possuí um número especifico de itens             |
| [[Types/Aula10]] - object * | um objeto = { x: "value" }                                    |
| [[Types/Aula11]] - enum     | Uma coleção de constantes com valores definidos               |
| - null *                    | Um dado que não possuí valor                                  |
| - undefined *               | valor indefinido                                              |
| - any                       | uma informação de tipo desconhecido                           |
| - unknown                   | uma informação de tipo desconhecido                           |
| - void                      | Informação vazia                                              |
| - never                     | Um valor que nunca existirá                                   |

-28/09/22 →

Além desses, existe o [[Types/Aula8#Union types]] (Union Type) que consiste em dois types em uma única variável, isso faz o código ser mais moldável.

Todas os types

~~~ts
// This is a simple file that contains all the variables that I know in ts
let number :number = 12
let string :string = "A string"
let bool :boolean = true
let array :string[] = ["String1", "String2", "string3"]
let object :object = {"x" : 1, "y" : 2}

let variable:null = null;

// This is a exemple of a any and a HTMLElement:
// let element :HTMLElement | null = document.querySelector("h1");

let amyVariable :any;

let tuple :[string, number, number] = ["aString", 1, 2]

enum groupOfConst {
    const1,
    const2,
    const3
}

let someFunction :void = console.log('Hello')

let result :unknown
function error (error :string) :never throw new Error(error)

function sum( x :  number | string, y: number | string ) :void {

    if(typeof x == "string" || typeof y == "string" ) error("Erro")

    result = `${x}` + y;

    console.log(result)

}

// sum(1, '3')~~~
~~~

