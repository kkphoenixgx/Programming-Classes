#include <stdio.h>
#include <stdlib.h>


typedef struct IPilha{
    char * vector;
    int currentSize;
    int maxSize;
} Pilha;

typedef struct IFila{
    char * vector;
    int currentSize;
    int maxSize;
} Fila;

// -------------- Pilha --------------

void createPile( Pilha * pile, int length){
        pile->vector = (char *)malloc(sizeof(char) * length);
        pile->maxSize = length;
        pile->currentSize = 0;
        printf("TEST: PILHA CRIADA \n");
}

void deletePile(Pilha * pile){
    free(pile->vector);
}

void addToPile(Pilha * pile, char value){
    pile->vector[pile->currentSize] = value;
    pile->currentSize++;
}

void popPile(Pilha * pile){
    pile->vector[pile->currentSize] = '\0';
    pile->currentSize--;
}

void printPile(Pilha * pile){


    for(int i = 0; i < pile->currentSize; i++){
        if(pile->vector[i] == '\0'){ return; };
        printf("%c", pile->vector[i]);
    }

}

// -------------- FILA --------------

void createLine( Fila * fila, int length){
        fila->vector = (char *)malloc(sizeof(char) * length);
        fila->maxSize = length;
        fila->currentSize = 0;
}

void deleteLine(Fila * fila){
    free(fila->vector);
}

void addToLine(Fila * fila, char value){
    fila->vector[fila->currentSize] = value;
    fila->currentSize++;
}

void popLine(Fila * fila){
    fila->vector[0] = fila->vector[1];

    for(int i = 1; i < fila->maxSize-1; i++){
        fila->vector[i] = fila->vector[i+1];
    }

    fila->vector[fila->currentSize] = '\0';
    fila->currentSize--;
}

void printLine(Fila * fila){

    if (! (fila->currentSize > 0) ) return;

    for(int i = 0; i < fila->currentSize -1; i++){
        if(fila->vector[i] == '\0'){ return; };
        fila->vector[i] = fila->vector[i + 1];
    }
    
    fila->currentSize--;
}

// -------------- PROBLEM --------------

void transformParentToPolonesaReversa(Pilha * entrada){
    Fila resultFila;
    createLine(&resultFila, 160);

    Pilha aux;
    createPile(&aux, 160);

    for(int i = 0; i < entrada->currentSize; i++){
        switch(entrada->vector[i]){

            case '+':
                printf("Encontramos %c \n", '+');
                addToPile(&aux, '+');
                break;
            case '-':
                printf("Encontramos %c \n", '-');
                addToPile(&aux, '-');
                break;
            case '*':
                printf("Encontramos %c \n", '*');
                addToPile(&aux, '*');
                break;
            case '/':
                printf("Encontramos %c \n", '/');
                addToPile(&aux, '/');
                break;
            case ')':
                addToLine(&resultFila, aux.vector[aux.currentSize]);
                popPile(&aux);
                break;
            default:
                if(    entrada->vector[i] >= 'a' && entrada->vector[i] <= 'z'
                    || entrada->vector[i] >= 'A' && entrada->vector[i] <= 'Z'
                ){
                    addToLine(&resultFila,  entrada->vector[i]);
                    popPile(&aux);
                }

                break;
        }
    }


    printLine(&resultFila);
}


int main()
{
    Pilha pile;
    int length;

    printf("Digite a quantidade de characters menor que 160 \n");
    scanf("%d", &length);


    createPile(&pile, length);
    pile.currentSize = length;

    printf("Digite a expressao matematica menor que 160 \n");

    getchar();
    gets(pile.vector);

    transformParentToPolonesaReversa(&pile);

    return 0;
}
