# Import-Export files
2024-11-01
tags: [[-IndexPhp 🐘]]

## require

```php
<?php
 require('somefile.php');
?>
```

## include

```php
<?php

function foo()
{
    global $color;

    include 'vars.php';

    echo "A $color $fruit";
}

/* vars.php is in the scope of foo() so $fruit is NOT available outside of this scope.  $color is because we declared it as global.
*/

foo();  // A green apple
echo "A $color $fruit";  // A green

?>
```

## goto

O operador `goto` pode ser usado para pular para outra seção do programa. O ponto de destino é definido por um rótulo _sensível a maiúsculas e minúsculas_ seguido de dois pontos, e a instrução é usada como `goto` seguida do rótulo de destino desejado. O uso do `goto` não é completamente irrestrito. O rótulo de destino deve estar no mesmo arquivo e contexto, significando que não se pode pular para fora ou para dentro de uma função ou método. Também não pode-se saltar para dentro de um laço ou estrutura switch. Pode-se saltar para fora deles, e um uso comum é usar o `goto` no lugar de um `break` multi-nível.

```php
<?php

goto a;
echo 'Foo';

a:
echo 'Bar';
?>

// output: Bar
```


