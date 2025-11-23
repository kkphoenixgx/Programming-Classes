# Control Structures
2024-11-01
tags: [[🐘 indexPHP]]

Common if;
Common while;
Common do while;
Common switch;
## For

Common for, ex:
```php
<?php

for ($i = 1; $i <= 10; $i++) {
    echo $i;
}



for ($i = 1; ; $i++) {
    if ($i > 10) {
        break;
    }
    echo $i;
}


$i = 1;
for (; ; ) {
    if ($i > 10) {
        break;
    }
    echo $i;
    $i++;
}


for ($i = 1, $j = 0; $i <= 10; $j += $i, print $i, $i++);
?>
```

## Foreach

```php
<?php
$arr = array(1, 2, 3, 4);
foreach ($arr as &$valor) {
    $valor = $valor * 2;
}
// $arr is now array(2, 4, 6, 8)

// pop value
unset($valor); 
?>
```

## continue word


```php
<?php
$array = ['zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis'];
foreach ($array as $chave => $valor) {
    if (!($chave % 2)) { // pula membros com chaves pares
        continue;
    }
    echo $valor . "\n";
}
/* Output:
um
três
cinco
*/
?>
```

## Match

```php
<?php
$age = 18;

$output = match (true) {
    $age < 2 => "Bebê",
    $age < 13 => "Criança",
    $age <= 19 => "Adolescente",
    $age > 19 => "Adulto Jovem",
    $age >= 40 => "Adulto Meia-idade"
};

var_dump($output);
?>
```

