# Vetores parte 2
[Index Java](../../JavaVanilla/Index%20Java.md)

Mod 90 -- **16/01/22**

Vetores referencia são collections, como conhecido no javascript, mas a nível java, as pequenas diferenças fazem muita diferença, em javascript também mas mais a nível de entendimento e desempenho que o java, já que é fortemente tipada, a vida fica muito mais complexa.

Em java, fazemos o processo em partes declarando primeiramente a quantidade de itens do vetor e adicionando os itens depois.

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

vetores tem um atributo chamado de legth que determina a quantidade de itens de um vetor.
