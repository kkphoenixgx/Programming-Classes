# Operadores
Criado em: 2023-03-24
tags: [-Index CSharp](-Index%20CSharp.md)

Utilize y= 3 e  z= 2 para os exemplos e x como uma variável sem valor.

* Importante dizer que o c# obedece a ordem matemática de operações, primeiro parenteses, depois multiplicação da esquerda para a direita e depois soma e subtração da mesma forma, da esquerda para a direita. Nota: não tem { } nem [ ] já que os mesmos possuem funções diferentes.

| operador | função                                                        |
| -------- | ------------------------------------------------------------- |
| =        | atribui y para x → x = 3                                      |
| +        | realiza uma soma de y e z → x = y + z → x = 5                 |
| -        | realiza uma subtração de y e z → x = y -z → x  = 1            |
| *        | multiplica y por z -> 3 * 2 = 6                               |
| /        | divide y por z -> 3/2 = 1.5                                   |
| %        | reorna o módulo de uma divisão, a sobre de y por z -> 3/2 = 1 |
| ++       | acrescenta 1 -> y++ = 4                                       |
| --       | diminuí 1 -> y-- = 2                                          |

| operador | função                                                                       |
| -------- | ---------------------------------------------------------------------------- |
| +=       | soma a y: y + algum valor; y += z → y = 5 -> Mesma coisa que <br> ( y = y + z )   |
| -=       | subtrai a y: y - algum valor; y-= z → y = 1 -> Mesma coisa que <br> ( y = y - z ) |

## Body expressions

| operador | função               |
| -------- | -------------------- |
| =>       | retorna em uma linha |
