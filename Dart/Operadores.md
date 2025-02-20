# Operadores
tags: [indexDart](indexDart.md)

Note:   **pipe = |**

## Operadores 

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

| Operadores | Significados          |
| ---------- | --------------------- |
| ==         | igual a algo          |
| !=         | diferente de algo     |
| >          | maior que algo        |
| <          | menor que algo        |
| >=         | maior ou igual a algo |
| <=         | menor ou igual a algo |

* **Operadores Lógicos**

| Operadores | Significados   |
| ---------- | -------------- |
| &&         | E lógico       |
| pipe pipe  | Ou lógico      |
| !          | negação lógica |

* **Operadores Bit a Bit**

| Operadores | Significados                 |
| ---------- | ---------------------------- |
| &          | && do bit a bit              |
| pipe       | pipe pipe do bit a bit       |
| ^          | XOR do bit a bit             |
| ~          | Not do bit a bit             |
| <<         | Deslocamento para a esquerda |
| >>         | Deslocamento para a direita  |

* **Operadores de Nulabilidade:**

| Operadores | Significados                                                                                       |
| ---------- | -------------------------------------------------------------------------------------------------- |
| ?          | nulo seguro, permite que um valor seja nulo                                                        |
| ??         | operador de coalescência nula, retorna um valor padrão se o valor for nulo                         |
| ?.         | operador de acesso condicional, acessa uma propriedade ou chama um método se o objeto não for nulo |

* **Outros Operadores**

| Operadores | Significados                              |
| ---------- | ----------------------------------------- |
| []         | acesso a um elemento de uma lista ou mapa |
| ()         | chamada de função                         |
| ?:         | Operador ternário                         |


## O Operador cascata

> Operador de cascata, permite encadear chamadas de métodos em um objeto

Em Dart, o operador `..` é conhecido como o operador de cascata (cascade operator). Ele permite que você encadeie várias chamadas de métodos ou acessos a propriedades em um objeto sem repetir o nome do objeto a cada vez.

Usando o operador de cascata, você pode chamar métodos e acessar propriedades em um objeto sequencialmente, separando cada chamada por `..`. 

~~~dart
class Person {

	String name;
  int age;

  void printInfo() {
    print('Name: $name');
    print('Age: $age');
  }

}

void main() {
  var person = Person()
	  ..name = 'John'
    ..age = 30;

  person.printInfo();
}
~~~

No exemplo acima, o operador `..` permite que você defina o nome e a idade da pessoa sem repetir o nome do objeto `person`. Em vez disso, você encadeia as chamadas de método `..name = 'John'` e `..age = 30`. Isso torna o código mais conciso e legível.

O operador de cascata é frequentemente usado em construções de objetos para definir várias propriedades em um único bloco, mas também pode ser usado em qualquer lugar onde você queira encadear chamadas de métodos ou acessos a propriedades em um objeto.

-----------------

## Bibliografia

Boa parte das informações desse material foram baseadas em respostas do ChatGPT
