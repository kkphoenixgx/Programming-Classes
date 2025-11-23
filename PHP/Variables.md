# PHP Variables
2024-11-01
tags: [[🐘 indexPHP]]

To create a variable, just use `$<variableName>`. Php is not case sensitive and is dynamic, as javascript, so types are on run.

```php
<?php
$a_bool = true; // um valor boleano  
$a_str = "foo"; // um texto   
$a_str2 = 'foo'; // um texto   
$an_int = 12; // um inteiro      

echo get_debug_type($a_bool), "\n";
echo get_debug_type($a_str), "\n";   

// Se essa variável conter um inteiro, aumento o número por quatro

if (is_int($an_int)) {   
	$an_int += 4;   
}   

var_dump($an_int);      

// Se $a_bool for um texto, imprima
if (is_string($a_bool)) {
	echo "String: $a_bool";   
}   
?>
```

## enum

```php
<?php
enum Suit
{
    case Hearts;
    case Diamonds;
    case Clubs;
    case Spades;
}

function do_stuff(Suit $s)
{
    // ...
}

do_stuff(Suit::Spades);
?>
```


