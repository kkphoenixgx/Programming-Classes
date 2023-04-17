# Dicionário java

## Métodos pré-determinados

* prints
  * print = Coloca na tela ai.
  * println = Coloca na tela ai mas pula a linha.
  * printf = para concatenar várias coias na mesma linha.

> prints: System.out.print("x");

* Math
  * A = Math.sqrt(x)   | Variável a recebe a raiz quadrada de x
  * A = Math.pow (x, y)| Variável A recebe o resultado de x elevado a y
  * A = Math.abs(x)    | Variável A recebe o valor absoluto de x

* NextLine() = para escutar novamente. Como se fosse uma quebra de linha, mas para escrita.

* getClass -  retorna o tipo do objeto;
* equals - compara se o objeto é igual o outro;
* hashCode - Retorna um código hash do objeto;
* toString - converte o objeto para uma string

## Arrays

* **Criando um array**

  ~~~java
  double[] NomeDoArray = new double[arrayLimit];
  ~~~

* **Collections(Arrays de tipo referencia)**

  ~~~java

  int n = sc.nextInt()
  Product[] vect = new Product[n] 

  for (int x; i<n; i++){

    sc.nextLine();
    String name = new sc.nextLine();
    double price  new sc.nextDouble();

    vect[i] = new Product(name, price);
  }

  sc.close
  ~~~

## Date

## Variáveis

> (Tipo) + nome = x

* tipos
  * int: inteiros
  * String: string
  * final: constantes  
  * float: numeros quebrados menores.
  * double: numeros quebrados muito grandes.

* Funções para conversão de variáveis

## Funções para Strings

* **Manipulando espaços em string** :

    o %n ou /n é usado junto para pular linha

    **%f** = marcador de variavel para *ponto flutuante* dentro de sting
    **%d** = marcador de variavel para *inteiro* dentro de sting
    **%s**  = marcador de variavel para *string* dentro de sting

    **%n** = quebra de linha
    **2%** = Para Para usar os marcadores, tem que separar com , no final da frase e colocar as variáveis

* **Formatar**

    **toLowerCase()** = "Transformar para Maiusculo";
    **toUpperCase()** =  "Para maiusculo";
    **trim()** = "Tirar os espaços";

* **Recortar**

  * **substring(inicio)**  "você seleciona o ponto de inicio e de fim que você quer que a string copie"

  * **substring(inicio, fim)** =  "Igual o de cima mas com um limite"

  * **str.Split("x")** = "Recortar uma string com base em um separador x e transforma elas em um vetor."

* **Substituir**

  **Replace(char, char)** "substitui caracteres"  
  **Replace(string, string)**  

* **Buscar**

  * **IndexOf**
  * **LastindexOf**

## Módulos nativos

* Scanner: (lê entrada no console):

    ~~~java
    import java.util.Scanner;
    Scanner sc = new Scannner(System.in);
    
    //para fechar a leitura
    sc.close();
    ~~~

  * **para ler somente um int** :

    x = sc.nextInt;

  * **ponto flutuante (números com casas decimais)**

    x = sc.nextDouble;

  * **ler somente um char**

    (Primeira caractere da string):  
    x= sc.next() .charAt(0);

## Funções

Esse é um assunto um pouco extenso e para quem não é acostumado com linguagens fortemente tipadas, como eu, talvez se perca, então segue o link do meu arquivo txt:

~~~java
public static functionName(){
  
}
~~~

## Classes

### Exemplo de classes em java

  ~~~java
  package Classes;
  public class Employee {

      public String name;
      public double grossSalary;
      public double tax;
      public double percentage;
      
      public double netSalary(){
          return grossSalary - tax;
      }

      public double IncrasseSalary(){
          double salarioComTaxa =  grossSalary - tax;
          return salarioComTaxa + (percentage * salarioComTaxa )/ 100;
      }
  }
  ~~~

### Modificadores de acesso

* **public** = todas as classes podem acessa-ló.
* **private** = só pode ser acessado na própria classe.
* **protected** = só pode ser usado no mesmo pacote.
* **(nada)** = o membro só pode ser acessado pelas classes no mesmo pacote.

### Constructor

Em java o construtor da classe x é uma function chamada x.

~~~java
public class Carros{

  public int QuantityInStock;
  public double price;

  // Dado pelo construtor (variáveis abstratas)
  public String nomeDoCarro;
  public int quantity;

  // Esse é o construtor
  public Carros(String nomeDoCarro, int quantity){
    nomeDoCarro = this.nomeDoCarro;
    quantity = this.quantity;
  }   

  // _métodos gerais_:
}
~~~

### Sobrecarga

Porém a sobrecarga em java é bem mais complicada para fazer, você precisa setar um construtor para cada tipo de variável opcional.

~~~java
class Product{

  public String name;
  private float price;
  private int quantity;

  public Product(String name, double price, int quantity){
      this.name = name;
      this.price = price;
      this.quantity = quantity;
  }
  public Product(double price, int quantity){
      this.name = name;
      this.price = price;
      //final quantity = 0;
  }
}
~~~

### Getters and Setters

* Getters:

~~~java
public y getX(return X){
   return X
} 
~~~

sendo X o nome do atributo e y o tipo do dado do atributo.  

* Setters:

~~~java
public void setX(y X){ 
  this.X = X 
} 
~~~

Sendo X o nome da variavel e y o tipo do dado.  
