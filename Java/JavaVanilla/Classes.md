# Classes
2024-06-05
tags: [[☕ indexJava]]

*Definimos uma classe como uma Interface para um objeto*. Uma *interface*, é um conjunto de normas que algo deve seguir, como por exemplo, `int x;`, `int` é uma interface para `x`, ou seja, estamos falando que essa variável `x` deve seguir as regras definidas em `int`. Dessa forma, `x` deve conter um numero dentro do range dos `int`s e deve também ter  [todo o kit](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html) de **atributos** e **métodos** que `int` possui, como o método `byteCount(x)`, que retorna o número de bits de `x`, ou o `size` que é um atributo que retorna o tamanho. Portanto, podemos entender que **métodos** são *processos* que acontecem em uma classe e **atributos** são *valores* que pertencem à uma classe.   
Desse modo, podemos entender boa parte dos recursos em java. E uma classe nada mais é do que uma interface que será aplicada a um *objeto*, que é uma implementação, uma **instanciação**, de uma interface.

Veja a nossa classe:

```java
public class SomeClass {
	public int someNumber = 3;

	public int soma(int a, int b){
		return a+b;
	}
}
```

Veja nosso objeto:

~~~java
SomeClass object = new SomeClass();
~~~

Dessa forma, meu objeto agora é uma instância da minha classe, ele pode usar os métodos e atributos da minha classe e minha classe pode ter vários objetos.

~~~java
System.out.printf("%d", object.someNumber) // 3
System.out.printf("%d", object.soma(1, 3)) // 4
~~~

## Programação Orientada a Objetos como paradigma

POO (Programação Orientada a Objetos), é um paradigma de programação na qual encapsulamos, organizamos, nosso código dentro de objetos, para que tenhamos mais manipulação e mais organização e melhor manutenção com nossos códigos. Tem um vídeo bem legal que explica sobre esse aspecto: https://youtu.be/QSgo8Yet-kc?si=g2T0lci4CuGxLFNd.

## Modificadores de acesso

os Modificadores de acesso controlam o que pode ser acessado e o que não pode, mantendo o objeto em um estado consistente.

- `public` = para ser usada ao público(outras classes).
- `private` = somente a própria classe pode usar esse atributo ou método.
- `protected` = O membro só pode ser acessado no mesmo pacote, bem como subclasses de pacotes diferentes.

Apenas para atributos:
- `final` = define o valor como constante, não pode mudar

Apenas para métodos:
- `static` = Um método que não depende de nada de nenhuma classe. Esse método pode ser usado sem uma instanciação.

## getters and setters

Define regras para pegar e atualizar atributos.

* Get:
~~~java
public y getX(return X){
   return X;
} 
~~~

* Set:
~~~java
public void setX(y X){ 
  this.X = X;
} 
~~~

## Construtores

Construtor é uma operação especial da classe que se faz no
momento da instanciação do objeto que vai reescrever atributos da classe especificamente para cada objeto.

Para usar um construtor em java, deve-se escrever uma função
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
}
~~~

~~~java
Carros uno = new Carros("Uno", 1);
~~~

### `this.`

O this é o objeto da classe, é como se estivéssemos falando do objeto dessa classe.

### Sobrecarga de construtores

Para criar uma sobrecarga de construtores, é só você colocar dois construtores com diferentes parâmetros, para um parâmetro ser opcional.

É possível também fazer um construtor padrão, definindo ele sem parâmetros.

~~~java
class Product{

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


## Herança

``` java
import java.util.Date;

public class Aluno extends Pessoa {
	public String matricula;
	
	public Aluno(String _nome, String _cpf, Date _data){
		super(_nome, _cpf, _data);
	}
}
public class Professor extends Pessoa {
	public double salario;
	public String disciplina;

	public Professor(String _nome, String _cpf, Date _data){
		super(_nome, _cpf, _data);
	}
	
}
public class Funcionario extends Pessoa {
	public double salario;
	public Date data_admissao;
	public String cargo;
	
	public Funcionario(String _nome, String _cpf, Date _data){
		super(_nome, _cpf, _data);
	}
}
```

## Indo mais fundo  ( ͡° ͜ʖ ͡°)

Toda classe do Java é uma subclasse da classe Object. Ou seja, a 
classe que você tá criando, tá dentro de uma classe que se chama Object, então métodos da classe Objeto podem ser acessados.

Existem alguns ou vários métodos da classe objeto e eles podem
ser substituídos ou melhorados conforme você queira, apenas 
colocando os métodos com a mesma função e os substituindo.

Alguns métodos muito úteis dessa classe object são:

- `Object.getClass(object)` -  retorna o tipo do objeto;
- `Object.equals(object)` - compara se o objeto é igual o outro;
- `Object.hashCode(object)` - Retorna um código hash do objeto;
- `Object.toString(object)` - converte o objeto para uma string

O `toString()` muda o objeto para uma string de fato, fazendo o objeto mostrar uma string e esse método vem com um padrão bem estranho e diferente para implementação. Então, simplesmente muda ela do jeito que você achar melhor na classe com um return que fica supimpa para mostrar as coisas na tela do seu jeito.

