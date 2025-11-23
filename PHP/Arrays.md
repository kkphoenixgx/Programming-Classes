# Arrays
2024-11-01
tags: [[🐘 indexPHP]]

```php
$array = array("1", '2', '3', 4, 5)
```

Um [array](https://www.php.net/manual/pt_BR/language.types.array.php) no PHP é na verdade um mapa ordenado. Um mapa é um tipo que relaciona _valores_ a _chaves_. Este tipo é otimizado para várias usos diferentes: ele pode ser tratado como um array, uma lista (vetor), hashtable (que é uma implementação de mapa), dicionário, coleção, pilha, fila e provavelmente mais. Assim como existe a possibilidade dos valores do [array](https://www.php.net/manual/pt_BR/language.types.array.php) serem outros [array](https://www.php.net/manual/pt_BR/language.types.array.php)s, árvores e [array](https://www.php.net/manual/pt_BR/language.types.array.php)s multidimensionais. No primeiro caso, se não tem uma key, ela será numérica começada com 0.


```php
<?php
$array = array(
    "foo" => "bar",
    "bar" => "foo",
);

// Utilizando a sintaxe curta
$array = [
    "foo" => "bar",
    "bar" => "foo",
];
?>
```

## Desconstruindo arrays [¶](https://www.php.net/manual/pt_BR/language.types.array.php#language.types.array.syntax.destructuring)

Arrays podem ser desconstruídos utilizando `[]` (a partir do PHP 7.1.0) ou [list()](https://www.php.net/manual/pt_BR/function.list.php). Esses constructos podem ser utilizados para desconstruir o array em variáveis distintas.

```php
<?php
$source_array = ['foo', 'bar', 'baz'];

[$foo, $bar, $baz] = $source_array;

echo $foo;    // imprime "foo"
echo $bar;    // imprime "bar"
echo $baz;    // imprime "baz"
?>
```

A desconstrução de arrays pode ser utilizada no [foreach](https://www.php.net/manual/pt_BR/control-structures.foreach.php) para desconstruir um array multidimensional enquanto o percorre.

```php
foreach ($source_array as [$id, $name]) {
	// Aqui $id e $name podem ser utilizados   
}
```

Elementos de arrays serão ignorados se a variável não for providenciada. Desconstrução de arrays sempre iniciam no índice `0`.

```php
<?php
$source_array = ['foo', 'bar', 'baz'];

// Atribui o elemento de índice 2 na variável $baz
[, , $baz] = $source_array;

echo $baz;    // imprime "baz"
?>
```

## Métodos

* `unset(array[index])` tira o valor index do array





