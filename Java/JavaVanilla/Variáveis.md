# Variáveis
2023-05-20
tags: [☕ indexJava](☕%20indexJava.md)

Para definirmos uma variável em java, usamos essa estrutura abaixo. Onde `type` é o tipo da variável, `name` o nome dela e `value` o seu valor. 

> `type name = value`

Dá para criar várias variáveis separadas por vírgula vírgula também:

```java
double someDouble;
int x, y, z;
```

 Value lembrar que o double funciona com "**.**" ou "**,**" dependendo da localidade.
 
 As variáveis são alocadas num lugar chamado de **Stack** do disco, enquanto os objetos das classes são alocadas no **Heap** do disco em tempo de execução.

Então quando você declara variáveis em java, elas estarão em *Stack* e quando forem de fato instanciadas como objeto, essas variáveis vão guardar um endereço de memória para um objeto na memória *Heap*. Isso nós chamamos de **Alocação Dinamica de Memoria**.

## Tipos Primitivos

> Em java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros

![[JavaTypesVisible.jpg]]

![[javaDataTypes.jpg]]

Tem também o **null**, que define algo como nulo

## Constantes

Não existem constantes funcionais em java, apenas como encapsulamento de um atributo, veja em [[Classes]].

## Garbage Collector

É um processo que automatiza o gerenciamento de memoria de um programa em execução  
O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap), desalocando aqueles que não estão mais sendo utilizados

## Boxing e unboxing (Casting)

Boxing = É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível

Relembrando, quando instanciamos uma variável nós estamos fazendo uma referência a algum objeto da memória cheap, isso se chama Boxing

Já o unboxing é o processo inverso, nós colocamos numa variável o valor do objeto, é como colocar uma function em uma variável, ou um JSON em uma variável

então podemos fazer isso:

~~~java
import java.util.Scanner;

public class Aula37.md {

    public static void main(String[] args){

        int x = 20;
        Object obj = x

        int y = (int) obj

    }
}
~~~


## Wrapper classes

São classes equivalentes aos types primitivos

Object  
  -> Boolean  
  -> Character  
  -> Number  
    -> Integer  
    -> Double
    -> Float  
    -> Byte  
    -> Short
    -> Long

Então dando o mesmo exemplo, para não termos que fazer casting *(type)* podemos usar diretamente a classe referente ao type do objeto.

~~~java
import java.util.Scanner;

public class Aula37 {

    public static void main(String[] args){

        int x = 20;
        Integer obj = x

        int y = obj

    }
}
~~~

!!! É importante usarmos essas classes para que os valores na variável possam ser nulos

## `Enum`

![[NotacaoUml.png]]

```java
public enum OrderStatus{
	PENDING_PAYMENT,
	PROCESSING,
	SHIPED,
	DELIVERED;
}
```

```java
public class SomeClass{
	private OrderStatus status;

	public SomeClass(OrderStatus status){
		this.status = status;
	}
}
```

```java
public class index{

	public static void main(String[] args){
	
		SomeCLass someClass = new SomeClass(OrderStatus.shiped)
	}

}
```

### Transformando `String` para `enum`

para fazermos isso, usaremos o `valueOf(string)` que está disponível em qualquer `enum`:

```java
public class index{

	public static void main(String[] args){

		String input = "DELIVERED";

		OrderStatus productStatus = OrderStatus.valueOf(input);
	}

}
```




