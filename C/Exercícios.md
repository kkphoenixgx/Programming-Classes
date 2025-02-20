[[-IndexC]]

```c
#include <stdio.h>
#include <stdlib.h>

struct ObjetoNoCartesiano{
    float x;
    float y;
};

void calcularDistanciaMedia( struct ObjetoNoCartesiano a, struct ObjetoNoCartesiano b, struct ObjetoNoCartesiano *d){

    printf("Valores do array A: [%f, %f] \n", a.x, a.y);
    printf("Valores do array B: [%f, %f] \n", b.x, b.y);

    d->x = a.x + b.x / 2;
    d->y = a.y + b.y / 2;

}



void calcSomaRacionais(float numeradorA, float denominadorA, float numeradorB, float denominadorB, float *numeradorResultado, float *denominadorResultado){

    *numeradorResultado = (numeradorA * denominadorB) + (numeradorB * denominadorA);
    *denominadorResultado = (denominadorA * denominadorB);

}

void calcSubRacionais(float numeradorA, float denominadorA, float numeradorB, float denominadorB, float *numeradorResultado, float *denominadorResultado){
    *numeradorResultado = (numeradorA * denominadorB) - (numeradorB * denominadorA);
    *denominadorResultado = (denominadorA * denominadorB);

}

void calcMultRacionais(float numeradorA, float denominadorA, float numeradorB, float denominadorB, float *numeradorResultado, float *denominadorResultado){

    *numeradorResultado = (numeradorA * numeradorB);
    *denominadorResultado = (denominadorA * denominadorB);
}

void calcDivRacionais(float numeradorA, float denominadorA, float numeradorB, float denominadorB, float *numeradorResultado, float *denominadorResultado){

    *numeradorResultado = (numeradorA * denominadorB);
    *denominadorResultado = (denominadorA * denominadorB);
}


void calcDivRacionaisEmResultado(float numeradorA, float denominadorA, float numeradorB, float denominadorB, float *resultado){

    *resultado = (numeradorA * denominadorB) / (denominadorA * denominadorB);
}


int main()
{
    // Exercicio 1:
    struct ObjetoNoCartesiano a;
    struct ObjetoNoCartesiano b;
    struct ObjetoNoCartesiano distanciaMedia;

    // Exercicio 2 - N�o fiz com struct para treinar
    float numeradorA, denominadorA;
    float numeradorB, denominadorB;
    float numeradorResultado, denominadorResultado;
    float resultadoEmFloat;


    // ---------- Exercicio 1 ----------

    printf("Digite o valor de Ax \n");
    scanf("%f", &a.x);
    printf("Digite o valor de Ay \n");
    scanf("%f", &a.y);

    printf("Digite o valor de Bx \n");
    scanf("%f", &b.x);
    printf("Digite o valor de By \n");
    scanf("%f", &b.y);

    printf("Valores do array A: [%f, %f] \n", a.x, a.y);
    printf("Valores do array B: [%f, %f] \n", b.x, b.y);

    calcularDistanciaMedia(a, b, &distanciaMedia);

    printf("Seu ponto medio possui: x: %f, y: %f \n", distanciaMedia.x, distanciaMedia.y);

    //---------- Exercicio 2 ----------

    printf("Digite o valor do numerador de A: \n");
    scanf("%f", &numeradorA);

    printf("Digite o valor do denominador de A: \n");
    scanf("%f", &denominadorA);

    printf("Digite o valor do numerador de B: \n");
    scanf("%f", &numeradorB);

    printf("Digite o valor do denominador de B: \n");
    scanf("%f", &denominadorB);

    calcSomaRacionais(numeradorA, denominadorA, numeradorB, denominadorB, &numeradorResultado, &denominadorResultado);
    printf("resultado da soma dos racionais: %f / %f \n ", numeradorResultado, denominadorResultado);

    calcSubRacionais(numeradorA, denominadorA, numeradorB, denominadorB, &numeradorResultado, &denominadorResultado);
    printf("resultado da subtracao dos racionais: %f / %f \n ", numeradorResultado, denominadorResultado);

    calcMultRacionais(numeradorA, denominadorA, numeradorB, denominadorB, &numeradorResultado, &denominadorResultado);
    printf("resultado da multiplicacao dos racionais: %f / %f \n ", numeradorResultado, denominadorResultado);

    calcDivRacionais(numeradorA, denominadorA, numeradorB, denominadorB, &numeradorResultado, &denominadorResultado);
    printf("resultado da divisao dos racionais: %f / %f \n ", numeradorResultado, denominadorResultado);

    calcDivRacionaisEmResultado(numeradorA, denominadorA, numeradorB, denominadorB, &resultadoEmFloat);
    printf("E no caso de querer a divis�o em decimal: %f \n", resultadoEmFloat);


    return 0;
}

```

```c
#include <stdio.h>
#include <stdlib.h>

void include(char c, int tamanhoArray, char array[], char * mensagem, char array2[], int tamanhoArray2){

    if(sizeof(array2[tamanhoArray2]) != 0 && tamanhoArray2 != 0){

        int primeiroFor = 0;
        int segundoFor = 0;

        for(int i = 0; i < tamanhoArray; i++){
            if(array[i] == c ){
                primeiroFor = 1;
            }
        }
        for(int i = 0; i < tamanhoArray2; i++){
            if(array2[i] == c ){
                segundoFor = 1;
            }
        }

        if(primeiroFor == 1 || segundoFor == 1){
            printf("%s \n", mensagem);
        }

    }
    else{

        for(int i = 0; i < tamanhoArray; i++){
            if(array[i] == c){
                printf("%s \n", mensagem);
            }
        }

    }

}

int valorAbsoluto(int number){
    int result;
    if(number > 0){
        result = number;
    }
    else if(number < 0){
        result = number * -1;
    }

    return result;
}

void isDivisivel(int a, int b){


    if(a % b == 0){
        isParOuImpar(a, b);
    }
    else{
        printf("Os numeros devem ser divisiveis \n");
    }


}
void isParOuImpar(int a, int b){

    if(a % 2 == 0){
        printf("%d e par \n", a);
    }
    else{
        printf("%d e impar \n", a);
    }
    if(b % 2 == 0){
        printf("%d e par \n", b);
    }
    else{
        printf("%d e impar \n", b);
    }


}

int main()
{
    char someCharacter;
    int someNumber;
    int result;

    int exercise3NumberA;
    int exercise3NumberB;

    // -------- Exercicio 1 --------


    char vectorVogal[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    char * mensagemVogal;
    mensagemVogal =(char*)malloc(sizeof(char));
    mensagemVogal = "E uma vogal";
    int tamanhoVogal = sizeof(vectorVogal) / sizeof(vectorVogal[0]);

    char vectorMinuscula[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char * mensagemMinuscula;
    mensagemMinuscula =(char*)malloc(sizeof(char));
    mensagemMinuscula = "E uma letra minuscula";
    int tamanhoVectorMinuscula = sizeof(vectorMinuscula) / sizeof(vectorMinuscula[0]);

    char vectorMaiuscula[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    char * mensagemMaiuscula;
    mensagemMaiuscula =(char*)malloc(sizeof(char));
    mensagemMaiuscula = "E uma letra maiuscula";
    int tamanhoVectorMaiuscula = sizeof(vectorMaiuscula) / sizeof(vectorMaiuscula[0]);

    char vectorConsoante[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    char * mensagemConsoante;
    mensagemConsoante =(char*)malloc(sizeof(char));
    mensagemConsoante = "E uma consoante";
    int tamanhovectorConsoante = sizeof(vectorConsoante) / sizeof(vectorConsoante[0]);

    char vectorAlgarismo[] = {'0','1','2','3','4','5','6','7','8','9',};
    char * mensagemAlgarismo;
    mensagemAlgarismo =(char*)malloc(sizeof(char));
    mensagemAlgarismo = "E um algarismo";
    int tamanhoVectorAlgarismo = sizeof(vectorAlgarismo) / sizeof(vectorAlgarismo[0]);


    printf("Digite seu caractere \n");
    someCharacter = getchar();

    include(someCharacter, tamanhoVogal, vectorVogal, mensagemVogal, 0, 0);
    include(someCharacter, tamanhoVectorMinuscula, vectorMinuscula, mensagemMinuscula, 0, 0);
    include(someCharacter, tamanhoVectorMaiuscula, vectorMaiuscula, mensagemMaiuscula, 0, 0);
    include(someCharacter, tamanhoVectorMinuscula, vectorMinuscula, "E uma letra", vectorMaiuscula, tamanhoVectorMaiuscula);
    include(someCharacter, tamanhovectorConsoante, vectorConsoante, mensagemConsoante, 0, 0);
    include(someCharacter, tamanhoVectorAlgarismo, vectorAlgarismo, mensagemAlgarismo,0, 0);


    // -------- Exercicio 2 --------

    printf("digite seu numero \n");
    scanf("%d", &someNumber);

    result = valorAbsoluto(someNumber);
    printf("valor absoluto = %d \n", result);

    // -------- Exercicio 3 --------

    printf("Digite numeros divisiveis\n");
    scanf("%d", &exercise3NumberA);
    scanf("%d", &exercise3NumberB);

    isDivisivel(exercise3NumberA, exercise3NumberB);


    return 0;
}

```


```c
#include <stdio.h>
#include <stdlib.h>

void exerciseOne(char* string){

    printf("Write your text \n");

    scanf("%s", string);

    printf("That was your text: %s", string);
}

char* exerciseTwo(char* employeeName, int employeyBirthDay, int employeyBirthMonth, int employeyBirthYear, int sallary, char isBoss){

    char* finalText;
    finalText = (char*)malloc(sizeof(char));


    printf("Now, give me informations about your employee \n First of all, It's name \n");
    scanf("%s", employeeName);

    printf("Now, it's birthday date separatly: \n first, the day: \n");
    scanf("%d", &employeyBirthDay);
    printf("the month");
    scanf("%d", &employeyBirthMonth);
    printf("the year");
    scanf("%d", &employeyBirthYear);

    printf("Ok, now, it's salary");
    scanf("%d", &sallary);

    printf("Btw, this employee, It's a boss of the company?");

    scanf("\n");
    isBoss = getchar();


    sprintf(finalText, "\n Nome: %s \n Date: %d/%d/%d \n Sallary: %d \n Boss? %c", employeeName, employeyBirthDay, employeyBirthMonth, employeyBirthYear, sallary, isBoss);

    return finalText;

    free(finalText);
}

void exerciseThree(char* name, char* lastName){

    printf("Type your name: \n")

    scanf("\n %s", name);

    printf("\n Now, type your last name")

    scanf("\n %s", lastName);

    printf("\n Hello %s %s", lastName, name);

}


int main(){
    char* userTextForExerciseOne;
    userTextForExerciseOne = (char*)malloc(sizeof(char));
    char* employeeName;
    employeeName = (char*)malloc(sizeof(char));

    char* finalText;
    finalText = (char*)malloc(sizeof(char));

    int employeyBirthDay, employeyBirthMonth, employeyBirthYear, sallary;
    char isBoss;

    exerciseOne(userTextForExerciseOne);

    finalText = exerciseTwo(employeeName, employeyBirthDay, employeyBirthMonth, employeyBirthYear, sallary, isBoss);

    printf("%s", finalText);

    free(employeeName);
    free(userTextForExerciseOne);
    free(finalText);
}

```