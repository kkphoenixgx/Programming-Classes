# Variantes em Java
2021-04-08 // Mod 24
[☕ Index Java](../☕%20Index%20Java.md)

* Variante = (Tipo) + nome = x

* Import é uma classe de aderimento de funções pré 
selecionadas.

## Desenvolvimento

> *Print* =  System.out.print("x"); // utilizado para logs

**print** = Coloca na tela ai.
**println** = Coloca na tela ai mas pula a linha.
**printf** = para concatenar várias coias na mesma linha

> Para usar a váriavel no print tem que colocar (Variavel) depois do print.

~~~java
public class exercicio1 {

	public static void main(String[] args) {
		 System.out.println("x")
	}
}
~~~

Para controlar quantas casas se usa %.2f na função printf

~~~java
public class exercicio1 {

	public static void main(String[] args) {
	  double x = 10.123456;
	  System.out.printf("%.2f%n" , x );
	}
}
~~~

A saida será 10.1, justamente por que é ".123". Então, como é menos que 5, arredonda para 12

| Separador de linha | significado                                                      |
| ------------------ | ---------------------------------------------------------------- |
| %n ou /n           | o %n ou /n é usado junto para pular linha                        |
| %f                 | %f = marcador de variavel para *ponto flutuante* dentro de sting |
| %d                 | %d = marcador de variavel para *inteiro* dentro de sting         |
| %s                 | %s  = marcador de variavel para *string* dentro de sting         |
| 2%                 | 2% = Para usar os marcadores, tem que separar com , no final da frase e colocar as variáveis                                                                 |


Concatenar é com +;
Exercício 1: [[../../../curso-java/Exercicios/Exercicios6/IndexExercicio1.java]]
