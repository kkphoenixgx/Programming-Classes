# Scanner
Mod 26- Java 11/04/21

No java tem uma variável chamada scaner que  escuta dados, tipo o eventListener do js(Tipo) y = x   é a forma de qualquer variável e essa variável scaner segue o mesmo padrão mas com o y pré definido. 
$$Scanner sc = new Scannner(System.in);$$

## Desenvolvimento


Somente eu lendo já entendo que ele está colocando em uma classe pré definida chamada scanner que é própria do Java e que provavelmente lê a entrada e indica  entrada. Portanto essa classe deve ser importada para o código com 

> import java.util.Scanner;

Para encerrar o recurso, deve-se ter um **sc.close()** e ela é fundamental. 

para declarar que um dado é um sc, tem que declarar uma variável e falar que a variável é uma sc e com isso a variável vai pegar a informação na tela;

**x = sc.nextInt** = para ler somente um int :
**x = sc.nextDouble;** = ponto flutuante (números com casas decimais)
**x= sc.next() .charAt(0);** ler somente um char (Primeira caractere da string)

mas o double só funciona com . ou , da localidade

* Para ler vários dados em uma linha é só colocar  para ler várias coisas. **É só colocar vários sc**
