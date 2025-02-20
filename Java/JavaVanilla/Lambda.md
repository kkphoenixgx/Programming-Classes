# Lambda
2024-05-27
tags: [[☕ Index Java]]

Lambda, Lambda, Lambda, Lambda Nerds, eu tinha que fazer isso kkkkkkkkkk...
Bom, a Lambda no Java é uma expressão modelável de uma que possui uma variável abstrata que vai variar de acordo com o ambiente... Parece confuso mas é incrível, olha o exemplo de uma filtragem e não se assusta com o primeiro contato, é bem simples:

`List<String> secondList = primeList.stream().filter(x -> x.charAt(0) == 'A).collect(Collectors.toList());`

A lambda dessa expressão é o que tá dentro do `filter()` e é essa expressão que tá fazendo a lógica dessa sentença. E eu quis colocar essa expressão para falar que a Lambda foi colocada no java na edição 8, o que, então, criaria "Incompatibilidades" com as versões anteriores.
Dessa forma, a Oracle resolveu esse problema criando as `Streams` que vão permitir métodos antigos como o filter das Listas usarem essas Lambdas e não confunda o Objeto Global Stream com a função `stream()`, a função é um método do `Stream`. 
E , se estiver se perguntando, a `Collect()` é para transformar de volta em list e podermos colocar nessa `secondList` os itens do `filter()`.

## Stream

* `findFirst()` = Acha o primeiro elemento que apetece a condição
	```java
	String name = someList.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
	```

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/java-curso-completo/learn/lecture/10566124#overview