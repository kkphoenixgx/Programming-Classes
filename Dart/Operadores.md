# Operadores
2023-06-11
tags: [indexDart](indexDart.md)

* **Operadores Aritméticos**

| Operador | Significado      |
| -------- | ---------------- |
| +        | Adição           |
| -        | Subtração        |
| *        | Multiplicação    |
| /        | Divisão          |
| %        | Resto da divisão |
| ~/       | Divisão inteira  |

* **Operadores de Atribuição**

| Operadores | Significado                   |
| ---------- | ----------------------------- |
| =          | atribuição simples            |
| -=         | subtração e atribuição        |
| `*=`       | multiplicação e atribuição    |
| /=         | divisão e atribuição          |
| %=         | resto da divisão e atribuição |
| ~/=        | divisão inteira e atribuição  |

* **Operadores de Comparação**

== (igual a)
`!=` (diferente de)
`>` (maior que)
`<` (menor que)
`>=` (maior ou igual a)
`<=` (menor ou igual a)

| Operadores | Significados      |
| ---------- | ----------------- |
| ==         | igual a algo      |
| !=         | diferente de algo |
| >          | maior que algo    |
| <          | menor que         |
| >=         | maior ou igual a  |
|            |                   |

Operadores Lógicos

`&&` (e lógico)
`||` (ou lógico)
`!` (negação lógica)

5. Operadores Bit a Bit:

`&` (AND bit a bit)
`|` (OR bit a bit)
`^` (XOR bit a bit)
`~` (NOT bit a bit)
`<<` (deslocamento para a esquerda)
`>>` (deslocamento para a direita)

6. Operadores de Nulabilidade:

`?` (nulo seguro, permite que um valor seja nulo)
`??` (operador de coalescência nula, retorna um valor padrão se o valor for nulo)
`?.` (operador de acesso condicional, acessa uma propriedade ou chama um método se o objeto não for nulo)

8. Outros Operadores:

- `[]` (acesso a um elemento de uma lista ou mapa)
- `()` (chamada de função)
- `?:` (operador ternário, retorna um valor com base em uma condição)

Esses são os operadores mais comumente utilizados em Dart. Eles permitem realizar operações aritméticas, atribuições, comparações, operações lógicas, operações bit a bit e muito mais.

## O Operador cascata

7. Operadores de Cascata:

`..` (operador de cascata, permite encadear chamadas de métodos em um objeto)


Em Dart, o operador `..` é conhecido como o operador de cascata (cascade operator). Ele permite que você encadeie várias chamadas de métodos ou acessos a propriedades em um objeto sem repetir o nome do objeto a cada vez.

Usando o operador de cascata, você pode chamar métodos e acessar propriedades em um objeto sequencialmente, separando cada chamada por `..`. Veja um exemplo:

dart

`class Person {   String name;   int age;    void printInfo() {     print('Name: $name');     print('Age: $age');   } }  void main() {   var person = Person()     ..name = 'John'     ..age = 30;    person.printInfo(); }`

No exemplo acima, o operador `..` permite que você defina o nome e a idade da pessoa sem repetir o nome do objeto `person`. Em vez disso, você encadeia as chamadas de método `..name = 'John'` e `..age = 30`. Isso torna o código mais conciso e legível.

O operador de cascata é frequentemente usado em construções de objetos para definir várias propriedades em um único bloco, mas também pode ser usado em qualquer lugar onde você queira encadear chamadas de métodos ou acessos a propriedades em um objeto.