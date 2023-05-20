# Objetos Globais
2023-05-20
tags: [Index Java](Index%20Java.md)

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