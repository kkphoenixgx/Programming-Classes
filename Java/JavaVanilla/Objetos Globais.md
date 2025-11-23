# Objetos Globais
2023-05-20
tags: [☕ indexJava](☕%20indexJava.md)

## System

### System.out

Basicamente o que vai sair do sistema, e podemos usar os métodos:

* **print(x)** = Imprime na tela x, sendo x um valor;
	~~~java
	public class exercicio1 {
	
		public static void main(String[] args) {
				 System.out.println(x)
		}
	
	}
	~~~
* **println(x)** = Imprime na tela x e depois disso pula uma linha;
* **printf("staticY",x)** = Uma forma de impressão na tela que pode receber concatenações;
	* Podemos usar alguns argumentos por string no método printf para definirmos como x vai ser apresentado. No exemplo abaixo, a saída é 10.12   pois é 10.123, menos que 5, e pedimos duas casas decimais em "%.2f%n", então, arredondamos para 10.12
		Desse modo, existe uma lógica por trás desse *staticY*:
		* **%n** ou **/n** = usado junto para pular linha 
		* **%f** = marcador de variavel para *ponto flutuante* dentro de sting
		* **%d** = marcador de variavel para *inteiro* dentro de string
		* **%s**  = marcador de variavel para *string* dentro de sting
	 ~~~java
		public class exercicio1 {

			public static void main(String[] args) {
			 double x = 10.123456;
			 System.out.printf("%.2f%n" , x );
			}
			
		}
	  ~~~

![](img/Pasted%20image%2020230520172135.png)

## Locale

**Locale.setDefault(Locale.ourLocale)** = Para adicionar formatação por localidade.






## Math

| **Uso**                   | **descrição**                                  |
| ------------------------- | ---------------------------------------------- |
| `int a = Math.sqrt(x)`    | Variável a recebe a raiz quadrada de x         |
| `int a = Math.pow (x, y)` | Variável A recebe o resultado de x elevado a y |
| `int a = Math.abs(x)`     | Variável A recebe o valor absoluto de x        |

## Object

Tudo em java é um objeto e essa é a classe pai de quase todas as outras, com exceção de tipos primitivos. Não existe mais um um pai, essa é a classe root por definição de herança e toda classe, até mesmo as criadas por você que não estendem de nada, automaticamente são filhos de Object.
### `equals`

Verifica se um objeto é idêntico a outro mas isso é bem custoso. Esse método existe pois quando você compara objetos que não são primitivos (`(String a = "variável primitiva")` ) os valores das variáveis são na realidade os ponteiros para seus objetos e o que é comparado é o valor dos seus ponteiros, logo:

```java
String a = new String("Sou uma String");
String b = new String("Sou uma String");

System.out.println( a == b ); // false
System.out.println(a.equals(b)); // true
```

### `hashCode`

É usado para comparação de objetos, mas não é 100% eficaz.

```java
String a = "uma string";
String b = "Outra String";

System.out.println(a.hashCode()); // → hash
System.out.println(b.hashCode()); // → hash
```

Cada objeto gera um hash diferente, esse hash é um int então teoricamente podemos ter objetos diferentes com o mesmo hash, embora seja muito difícil.

A estratégia para usar `hashCode` e ter 100% de eficiência é em casos de muitas comparações fazer as inúmeras comparações com hash e depois confirmar com o `equals`.

