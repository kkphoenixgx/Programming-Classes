# Entrada e saída de dados via CLI
2024-06-05
tags: [[☕ indexJava]]

## Print

> *Print* =  `System.out.print("x");`// utilizado para logs

* **print** = Coloca na tela ai.
* **println** = Coloca na tela ai mas pula a linha.
* **printf** = Coloca na tela com variáveis

Para usar a variável no printf tem que colocar ela após o printf, como no c

~~~java
public class example {

	public static void main(String[] args) {
		int x = 3; 
		System.out.printf("%d", x)
	}
}
~~~

Para controlar quantas casas se usa .2 antes da variável com casas após a vírgula (`%.2f`) :

~~~java
public class example {

	public static void main(String[] args) {
	  float x = 10.123456;
	  System.out.printf("%.2f%n" , x );
	}
}
~~~

A saída será 10.12, justamente por que é ".123". Então, como é menos que 5, arredonda para 12

| Separador de linha | significado            |
| ------------------ | ---------------------- |
| %n ou /n           | para pular linha       |
| %f                 | para *ponto flutuante* |
| %d                 | para *inteiro*         |
| %s                 | para *string*          |
| %2f                | para *doubles*         |
| %c                 | para *char*            |
| %b                 | para *boolean*         |


Concatenar é com +...

## Scanner

No java tem uma variável chamada `scaner` que  escuta dados, tipo o `eventListener` do js. Veja:

~~~java
Scanner sc = new Scannner(System.in);
~~~

Para usarmos o leitor de texto, temos que importar:

> `import java.util.Scanner;`

Para encerrar o recurso, deve-se ter um **`sc.close()`** para parar a escuta de dados.

- **`int x = sc.nextInt`** = para ler somente um **int** :
- **`double x = sc.nextDouble;`** = **ponto flutuante** (números com casas decimais)
- **`char x = sc.next().charAt(0);`**= ler somente um **char** (Primeira caractere da string)
- **`String x = sc.nextLine()`** =para escutar strings

Uma coisa **muito importante** a ser dita é que os scanners que usamos, tirando o `nextLine()`, não consomem o enter do teclado, já que eles não são do tipo String. Dessa forma, vale lembrar que o comando pular linha, em qualquer linguagem de programação, é **"`\n`"**,  portanto, é, nitidamente, uma String.  
Então, quando usamos um scanner que não seja um de String, o enter do teclado fica "pendente" e é absorvido pelo primeiro scanner de String que tiver no caminho, veja primeiro o erro, entenda e depois veja o acerto:

❌**FORMA ERRADA**

~~~java
Scanner sc = new Scannner(System.in);

System.out.println("Digite um inteiro");
int someInt = sc.nextInt();
System.out.println("Digite uma String");
String someString = sc.nextLine();

System.out.println("-------------");
System.out.printf("Inteiro: %d\n", someInt);
System.out.printf("String: %s\n", someString);

// CLI:
// Digite um inteiro
//← 2
// Digite uma String
//← Uma string
// -------------
// Inteiro: 2
// String: 
~~~

✔***FORMA CERTA***

~~~java
Scanner sc = new Scannner(System.in);

System.out.println("Digite um inteiro");
int someInt = sc.nextInt();
System.out.println("Digite uma String");
sc.nextLine();
String someString = sc.nextLine();

System.out.println("-------------");
System.out.printf("Inteiro: %d\n", someInt);
System.out.printf("String: %s\n", someString);

// CLI:
// Digite um inteiro
//← 2
// Digite uma String
//← Uma string
// -------------
// Inteiro: 2
// String: Uma string
~~~

