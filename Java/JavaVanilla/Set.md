# Set
2025-09-03
tags: [[☕ indexJava]]

O set é um conjunto... Isso mesmo, do conjunto lá do mano Vain, de matemática discreta, matemática básica, algebra linear... Um conjunto... Mas esse conjunto não admite repetições, não tem posição fixa e todos os Sets tem alguns métodos:

* `add(obj)` - adiciona ao set.
* `addAll(set)` = *união* de dois sets.

* `remove(obj)` - remove do set.
* `removeIf(predicate)` - remove o que atender ao predicado
* `removeAll(set)` - remove tudo que tem no set. Mantém somente a *diferença*.
* `clear()` = limpa o set

* `contains(obj)` - verifica se há no set *usando `hashcode` e `equals` ([[Objetos Globais#`equals`]], [[Objetos Globais#`hashCode`]])*. Portanto `hashCode` e `equals` devem estar implementados para esse método funcionar corretamente, se não tiver implementado, ele vai comparar o ponteiro, o que não funciona.
* `size()` - retorna o tamanho

 * `retainAll(set)`-  remove tudo que não está no conjunto set. Mantém a *interseção* dos dois conjuntos.  



Dessa forma, temos três tipos de Set: 

### `HashSet`

É o mais rápido, já que é um set de hashes e converte de volta para você quando retorna, mas justamente por ser um conjunto de hashes, ele não garante a ordem que vai retornar os elementos

```java
Set<String> set = new HashSet<>();

set.add("Mamão");
set.add("Banana");
set.add("Papaia");

for (String element : set){
	System.out.println(element);
} 
// Não vai necessariamente retornar Mamão, Banana e Papaia
```

### `TreeSet`


O `ThreeSet` mantém a ordem dos dados em ordem alfabética ou numérica, uma árvore rubro-negra, portanto, uma árvore binária, por isso os valores estão organizados.

```java
Set<String> set = new ThreeSet<>();

set.add("Mamão");
set.add("Banana");
set.add("Papaia");

for (String element : set){
	System.out.println(element);
} 
// Vai Retornar  Banana, Mamão e Papaia
```

Logicamente, um objeto não primitivo tem mais de um valor e para ser colocado dentro de uma árvore binária, terá que ser comparado, logo, implementamos [[Interfaces#`Comparable`]] para podermos usar o `compareTo(obj)` por de baixo dos panos. 

### `LinkedHashSet`

Mantém a ordem de inserção dos elementos.

```java
Set<String> set = new HashSet<>();

set.add("Mamão");
set.add("Banana");
set.add("Papaia");

for (String element : set){
	System.out.println(element);
} 
// Vai necessariamente retornar Mamão, Banana e Papaia
```
