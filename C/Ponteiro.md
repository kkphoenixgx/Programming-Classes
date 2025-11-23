# Ponteiro
2024-03-05
tags: [[🦖 index C]]


Variável cujo o conteúdo é uma alocação na memória

Ponteiro é uma variável que aponta para uma outra variável 

> `<type> * variable;`

`&` = endereço 
`*` = conteúdo de uma posição na memória

Ex:  `(inteiro) * p`

![[20240305_190423.jpg]]

Digamos que temos assim: 

```c
int * p; // vai alocar um espaço aleatório para p
```

![[20240305_190759.jpg]]

## Malloc()

Malloc vai criar uma alocação na memória que vai ser especificamente para a aplicação. Se usarmos uma variável que é um ponteiro para uma variável do próprio programa, não vamos precisar de maloc, visto que ele vai criar justamente para um lugar da memória que conhecemos.

 Quando usamos `&<variable>`, significa que estamos querendo o conteúdo da posição da memória de `<variable>`

 ![[Pasted image 20240319184941.png]]