# Structs
2024-03-19
tags: [[-IndexC]]

Exemplo de struct:

```c
struct ObjetoNoCartesiano {
    float x;
    float y;
};

// main
```

~~~c
 typedef struct TPilha{
    int * vector;
    int pointer;
    int lastValue;
}  Pilha;
~~~

Para definirmos uma variável como uma struct:

```c
struct ObjetoNoCartesiano a;
```

Para acessar: `a.x` ou `a.y`, mesma coisa para modificar só que com um igual

## Para receber como parâmetro:

```c
void calcularDistanciaMedia(struct ObjetoNoCartesiano a){
}
```

## Ponteiros com structs

Para a gente selecionar um valor da memória de um espaço de memória de um ponteiro, usamos `->`, exemplo:

```c
void calcularDistanciaMedia(struct ObjetoNoCartesiano a, struct ObjetoNoCartesiano b, struct ObjetoNoCartesiano *d){

    printf("Valores do array A: [%f, %f] \n", a.x, a.y);
    printf("Valores do array B: [%f, %f] \n", b.x, b.y);

    d->x = (a.x + b.x) / 2;
    d->y = (a.y + b.y) / 2;

    printf("Valores do array D: [%f, %f] \n", d->x, d->y);
}

int main{
	//cria as variáveis
	
	calcularDistanciaMedia(a, b, &distanciaMedia);
	return 0
}
```

Perceba que passamos o valor do espaço de memória de `distanciaMedia` e que depois pegamos o valor do espaço de memória do `d` para podermos atualizar as variáveis assim que elas são modificadas, além da forma que acessamos o valor da memória de um espaço da memória que aponta para um outro espaço de memória.
