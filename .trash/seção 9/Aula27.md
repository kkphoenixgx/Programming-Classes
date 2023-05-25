# Explicação
[☕ Index Java](../☕%20Index%20Java.md)

Dei um tempo com o java para fazer javaScript para focar no mercado de trabalho, mas a real é que eu tenho muito tempo para melhorar em todas as áreas de ensino e me formar um dev completo e por via de dúvida, eu tô usando o Visual Studio Code para escrever os textos também, então meu modo de escrita deve mudar.  

----

mod 76  
**Java 25/08/21**  [[../☕ Index Java]]

## Construtores

Construtor é uma operação especial da classe que se faz no
momento da instanciação do objeto.

para usar um construtor em java, deve-se escrever uma função
publica com o nome da classe:

~~~java
    public class Carros{

        public int QuantityInStock;
        public double price;

        public String nomeDoCarro;
        public int quantity;

        /*Esse é o construtor*/

        public Carros(String nomeDoCarro, int quantity){

            nomeDoCarro = this.nomeDoCarro;
            quantity = this.quantity;

        }   

        // _métodos gerais_
    }
~~~
