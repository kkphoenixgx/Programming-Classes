# Estruturas condicionais e de repetição
2024-05-27
tags: [[☕ indexJava]]

## If

~~~java
if(condition){
  //bloco1
}
else if (condition) {
  //bloco2
}
else {
  //bloco4
}
~~~

## Ternário

~~~java
int preco = sc.nextInt();
double desconto = preco * 0.3;
double precoComDesconto = (preco > 200)? preco - desconto : preco;

System.out.printf("Preco: %2f", precoComDesconto);
~~~

## Switch

~~~java
int x = sc.nextInt();

switch(x) {
	case 1:
		System.out.println("x = 1");
		break;
	case 2:
	   System.out.println("x = 2");
	   break;
	default: 
	    System.out.println("x != 1 && x != 2");
} 
~~~

## While

~~~java
while(condição){
     //bloco
}
~~~

Vai fazer enquanto a condição for true

## For 
```java
for (int i = 0; i < 6; i++){
	// bloco
}
```

## Do While

``` java
do {
	// bloco
} while (condição);
```

## For Each

O for each no java é bem interessante, ele é feito no for e é uma sintaxe mais simplificada para percorrer coleções

~~~java
for (type <item> : <collection>){
	// code
	System.out.println(item)
}
~~~

-----------------------------------------------
## Bibliografia

* for each - https://www.udemy.com/course/java-curso-completo/learn/lecture/10566118#overview