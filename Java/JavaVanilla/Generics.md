# Generics
2025-06-24
tags: [[☕ indexJava]]

A motivação da criação do Generics é basicamente a distribuição de responsabilidades e reuso. 
Elaborando, imagine a classe `PrintService` que coloca na tela coisas, é uma classe com o nível de abstração bem alto e a instabilidade baixa, visto que muitos vão usar essa classe. Desse modo, proponho um cenário em que precisamos colocar na tela diretamente números, por n motivos, essa classe, que antes estava implementada com string, não tem uma lógica simples como um `println()`. Ela expõe dados retornando eles para outros lugares, mexer nessa classe significaria  precisar corrigir seu sistema inteiro com a possibilidade de ter um inteiro no lugar de uma String e criar uma classe somente para isso é um problema de reuso visto que estamos copiando a mesma lógica e atribuindo uma função a uma classe que é a função de outra classe, colocar coisas na tela é responsabilidade da `PrintService`.
E, de fato você poderia criar outro método para strings na `PrintService`, contudo, isso é repetir lógica e também é um problema de reuso, mas a nível dos métodos. Um bom programador sente essa pulga atrás da orelha quando faz essas coisas, sente que tem algo estranho, pois reusar a lógica diz que tem algo ineficiente lá no fundo das nossas almas.
Um jeito bem eficiente de corrigir isso é usando Generics, permite seus métodos receberem tanto *int* quando *String*. Assim, suas funcionalidades que antes seriam usadas para receber e retornar strings, agora podem também retornar inteiro e nada será quebrado.

## Implementação e convenção `<T>`

T é basicamente qualquer tipo. Mas quando passa um tipo se transforma naquele tipo, *como o unknown do Typescript* mas com type safety. Com isso, olhe o exemplo:

### Exemplo 1

```java
public class PrintService<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }
}
```

```java
PrintService<String> stringPrinter = new PrintService<>();
stringPrinter.setValue("Olá, mundo!");
stringPrinter.print(); // "Olá, mundo!"

PrintService<Integer> intPrinter = new PrintService<>();
intPrinter.setValue(42);
intPrinter.print(); // 42
```

### Generic nos métodos e controle de métodos 

Não necessariamente você precisa usar o generic na classe, você pode usar num método e pode também delimitar com herança / Polimorfismo o que é T e o que ele pode fazer

#### Exemplo 1

```java
public interface Operavel {
    void operar();
}

public class Robô implements Operavel {
    @Override
    public void operar() {
        System.out.println("Robô operando!");
    }
}

public class Computador implements Operavel {
    @Override
    public void operar() {
        System.out.println("Computador operando!");
    }
}

public class Executor {
    public <T extends Operavel> void executarOperacao(T item) {
        item.operar(); // É operável
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();

        Robô robo = new Robô();
        Computador pc = new Computador();

        executor.executarOperacao(robo); //Robô operando!
        executor.executarOperacao(pc);   //Computador operando!
    }
}
```

#### Exemplo 2

![[Pasted image 20250624113402.png]]

## Supertipo Genérico e Wildcards

Generics não são invariantes, ou seja, `List<Object>` não é um supertipo de  `List<Integer>` ou se qualquer classe que derive de `Object`, por isso, você não pode colocar dentro de um `List<Object>` um `List<Integer>`.  E isso vale para qualquer relação de pai/filho ou classe e interface...

Para fazermos um supertipo genérico, simulando um `List<Object>`, **usamos o `List<?>`**, pois esse `?` significa um tipo coringa. E vale dizer que se é um tipo coringa, as relações com esse tipo são abstratas, não podemos adicionar um valor a esse tipo coringa, já que não sabemos de fato o tipo dele.

Portanto, se temos uma interface chamada *shape* e duas classes chamadas *circle* e *rectangle*, não podemos passar uma *lista de circles* para uma *lista de shapes*, para fazermos isso, precisaremos de uma *lista de ?* ou transformar a lista de circles em uma lista de shapes, mas isso é sem graça, usa ? e seja badass...

Quer ser mais badass? Usa `? extends shape` que aí a responsabilidade de definir o que o método aceita fica no método.

### Princípio get/put

O princípio get/put aborda a ideia de como usar wildcards corretamente para resolver problemas de casting bem comuns.

#### A covariância

```java
List<Integer> integers = new ArrayList<Integer>();
integers.add(10);
integers.add(20);

// Precisamos subir um nível de abstração da lista
List<? extends Number> numberList = integers;

// Podemos acessar valores
Number getNumber = numberList.get(0);

// Mas não podemos adicionar valores nesse nível de abstração
numberList.add(10) //❌: Erro compilação 💀!
```

Nesse caso, como `Number` é pai de `Integer`, permitimos qualquer valor abaixo de Number entrar na Lista, usando o wildcard  `<? extends Number>`, ou seja, permitimos um array subir de abstração.
Nesse caso, não podemos adicionar coisas a number já que não temos certeza que estamos colocando. Não sabemos qual o subtipo que está sendo aumentado de abstração, logo, podendo ser qualquer subtipo, não podemos adicionar.

#### A contravariância 

Já na contravariância, permitiremos qualquer valor acima de Number entrar na lista, ou seja, permitiremos qualquer lista diminuir a abstração dela usando a wildcard `<? super Number>`, permitimos qualquer lista acima de Number.

```java
List<Object> objects = new ArrayList<Object>();
objects.add("String é um objeto");
objects.add("Óbvio");

// Permitimos objetos agora serem numbers
List<? super Number> numbers = objects;

// Agora podemos adicionar valores
numbers.add(10);
numbers.add(20.1);

// Mas não podemos ler
Number someNumber = numbers.get(0); //❌: Erro compilação 💀!
```

Isso ocorre pois não podemos ter certeza que estamos colocando um number dentro de number... já que a list pode ter coisas maiores que number.

Para podemos acessar o valor, temos que fazer um cast de volta para a abstração pai, se for uma linguagem que permite múltiplos pais, seria o "root" , aí poderemos ler o valor.