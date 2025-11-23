# Arrays
2024-03-26
tags: [[🦖 index C]]


```c
#include <stdio.h>

// Função que recebe um array como parâmetro
void dobrarElementos(int array[], int tamanho) {
    for (int i = 0; i < tamanho; i++) {
        array[i] *= 2; // Dobrando cada elemento do array
    }
}

int main() {
    int numeros[] = {1, 2, 3, 4, 5};
    int tamanho = sizeof(numeros) / sizeof(numeros[0]); // Calcula o tamanho do array

    printf("Array original: ");
    for (int i = 0; i < tamanho; i++) {
        printf("%d ", numeros[i]);
    }
    printf("\n");

    dobrarElementos(numeros, tamanho); // Chama a função para dobrar os elementos do array

    printf("Array depois de dobrar: ");
    for (int i = 0; i < tamanho; i++) {
        printf("%d ", numeros[i]);
    }
    printf("\n");

    return 0;
}
```

ChatGPT

You said:
Chat gpt, reescreve isso para mim 

Muitas vezes um pequeno artifício pode contribuir para a melhoria do processo.  
Modifique o algoritmo acima de tal modo que ele inclua o valor a ser buscado na 

posição imediatamente posterior à do último elemento previamente inserido na lista. 

Isso pode significar a alocação de um novo índice na lista. Dessa forma, o algoritmo 

sempre encontra um índice na tabela com as condições desejadas, evitando o fim de 

tabela.
ChatGPT said:
ChatGPT
Frequentemente, um simples ajuste pode melhorar o processo. Modifique o algoritmo acima para que ele inclua o valor a ser buscado na posição imediatamente após o último elemento inserido na lista. Isso pode exigir a criação de um novo índice na lista. Dessa forma, o algoritmo sempre encontrará um índice na tabela com as condições ideais, evitando alcançar o final da tabela.

You said:
Ainda não entendi o que é para fazer 
ChatGPT said:
ChatGPT
A ideia é modificar o algoritmo para que ele não pare de procurar um índice disponível, mesmo se chegar ao final da lista. Em vez de simplesmente terminar a busca ao chegar ao fim, o algoritmo deverá adicionar o valor na posição seguinte à do último elemento da lista. Isso pode envolver a criação de uma nova posição na lista.

Imagine que a lista tem uma sequência de valores e você quer inserir um novo valor. Em vez de apenas buscar espaço até o fim da lista e encerrar se não encontrar, o algoritmo deve expandir a lista se necessário, colocando o novo valor logo após o último item. Isso garante que sempre haverá uma posição adequada para o novo elemento.

## Array dinâmico usando ponteiro

Para criar um array com tamanho definido em tempo de execução, use alocação dinâmica de memória com malloc:

```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int tamanho;

    printf("Informe o tamanho do array: ");
    scanf("%d", &tamanho);

    int *numeros = (int *)malloc(tamanho * sizeof(int)); // Aloca espaço para o array

    // Inicializando e acessando o array
    for (int i = 0; i < tamanho; i++) {
        numeros[i] = (i + 1) * 10;
        printf("numeros[%d] = %d\n", i, numeros[i]);
    }

    // Libera a memória alocada
    free(numeros);

    return 0;
}
```


