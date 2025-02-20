# Funções
2024-06-05
tags: [[☕ Index Java]], [[Classes]]

Funções só acontecem como métodos de classes, tirando a `main`, java não é funcional. Então vamos tratar aqui dos métodos.

- `main`  = fala para o java que essa é a função principal, que deve ser
lida em primeiro lugar, só existe uma função main e ela é a única que "Não vai ser definida em uma classe".
```java
public static void main(String[] args) {
	print("Hello World");
}
```

Agora veja um método:

> `acesso` `type` `functionName`(){ //bloco }

Não se preocupe com as opções de tipos e acesso, veremos isso mais para frente, apenas observe um exemplo:

```java
public void hello() {
	System.out.println("Hello World");
}
public static void hello() {
	System.out.println("Hello World");
}
```
## Tipos

Temos todos os tipos primitivos + void como tipos de retorno

- `void` = não deve retornar nada
- `String` = deve retornar um `int`.
- `int` = deve retornar um `int`.
- `double` = deve retornar um `double`.
- `float` = deve retornar um `float`.
- `char` = deve retornar um `char`.
- `long` = deve retornar um `long`.
- `short` = deve retornar um `short`.
- `byte` = deve retornar um `byte`.
- `boolean` = deve retornar um `boolean`.

## Modificadores de acesso

![[Classes#Modificadores de acesso]]
