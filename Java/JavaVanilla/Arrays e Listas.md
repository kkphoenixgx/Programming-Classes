# Arrays e Listas
2024-05-27
tags: [[☕ Index Java]]

## Arrays

* **Criando um array**
	~~~java
	double[] NomeDoArray = new double[arrayLimit];
	~~~

* **Collections(Arrays de tipo referencia)**
	~~~java
	int n = sc.nextInt();
	Product[] vect = new Product[n];
	
	for (int x; i<n; i++){
		
		sc.nextLine();
		String name = new sc.nextLine();
		double price  new sc.nextDouble();
		
		vect[i] = new Product(name, price);
	}
	
	sc.close();
	~~~

~~~java
ClassName[maxArray] array = new ClassName();

array[0] = new ClassName();

// print array[0].someAtribute
~~~


## Listas

Uma lista é um array que ela começa vazia e você pode adicionar dinamicamente. Lembra que `<T>` é um tipo genérico e que `last` vai ser o último item da lista.

|    comando <br>(`list.<comando>`)    |                                    descrição                                    |
|:------------------------------------:|:-------------------------------------------------------------------------------:|
| `add(int position = last, <T> item)` |                            Adiciona `item` na lista                             |
|         `indexOf(<T> item)`          | Retorna o index quando um dos itens == item e *quando não encontra, retorna -1* |
|         ` remove(<T> item)`          |                  remove quando  um dos itens  == item da lista                  |
|        `remove(int position)`        |                 Tira um item da lista de acordo com `position`                  |
|      `removeIf(bool condition)`      |                       remove itens que apetece a condição                       |
|               `size()`               |                           Retorna o tamanho da lista                            |

```java
import java.util.List;
import java.util.ArayList;

public static void main(String[] args) throws Exception{

  List<type> list = new ArrayList<type>();
  list.add(x)

}
```

## Collections

Vetores referencia são collections, como conhecido no javascript, mas a nível java, as pequenas diferenças fazem muita diferença, em javascript também mas mais a nível de entendimento e desempenho que o java, já que é fortemente tipada, a vida fica muito mais complexa.

Em java, fazemos o processo em partes declarando primeiramente a quantidade de itens do vetor e adicionando os itens depois.

  ~~~java
  int n = sc.nextInt()
  Product[] vect = new Product[n] 

  for (int x; i<n; i++){

    sc.nextLine();
    String name = new sc.nextLine();
    double price  new sc.nextDouble();

    vect[i] = new Product(name, price);
  }

  sc.close()
  ~~~

vetores tem um atributo chamado de legth que determina a quantidade de itens de um vetor.




-----------------------------------------------
## Bibliografia

Listas - https://www.udemy.com/course/java-curso-completo/learn/lecture/10566122#overview, https://www.udemy.com/course/java-curso-completo/learn/lecture/10566124#overview