# Operadores
2023-06-11
tags: [indexDart](indexDart.md)


Em Dart, o operador `..` é conhecido como o operador de cascata (cascade operator). Ele permite que você encadeie várias chamadas de métodos ou acessos a propriedades em um objeto sem repetir o nome do objeto a cada vez.

Usando o operador de cascata, você pode chamar métodos e acessar propriedades em um objeto sequencialmente, separando cada chamada por `..`. Veja um exemplo:

dart

`class Person {   String name;   int age;    void printInfo() {     print('Name: $name');     print('Age: $age');   } }  void main() {   var person = Person()     ..name = 'John'     ..age = 30;    person.printInfo(); }`

No exemplo acima, o operador `..` permite que você defina o nome e a idade da pessoa sem repetir o nome do objeto `person`. Em vez disso, você encadeia as chamadas de método `..name = 'John'` e `..age = 30`. Isso torna o código mais conciso e legível.

O operador de cascata é frequentemente usado em construções de objetos para definir várias propriedades em um único bloco, mas também pode ser usado em qualquer lugar onde você queira encadear chamadas de métodos ou acessos a propriedades em um objeto.