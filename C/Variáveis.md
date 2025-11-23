# Variáveis
2024-02-29
tags: [[🦖 index C]]

Para variáveis:

> **`<type> <variableName>`**

Para constantes:

> **`const <type> <variableName>`**

## Types

| type                   | significado                                                           |
| ---------------------- | --------------------------------------------------------------------- |
| **char**               | 8 bits, guarda um caractere                                           |
| **short int**          | guarda um número entre -322767 a 32767                                |
| **unsigned short int** | 0 a 65535                                                             |
| **int**                | guarda um número entre -2147483647 a 2147483647                       |
| **unsigned long int**  | 0 a 4294967295                                                        |
| **float**              | seis dogitos de precisão, suporta numeros depois da vírgula - 32 bits |
| **double**             | dez digitos de precisão, suporta numeros depois da vírgula - 64 bits  |
| **long double**        | dez digitos de precisão, suporta numeros depois da vírgula - 96 bits  |


char deve ser colocado em aspas simples. Já as variáveis char* devem ser colocadas em aspas duplas

Inteiros recebecebendo caracteres vão retornar o valor ASCII do inteiro. No contrário, vai receber o valor ASCII do caractere.

Inteiro recebendo float vai ignorar os números depois da vírgula. Já um float recebendo Inteiro, vai retornar o valor com zeros depois da virgula


## Criando uma string

```c
#include <stdio.h>
#include <stdlib.h>

int main(){
	// meio que cria um tipo
	char* someText;

	// aloca o espaço desse tipo (malloc)
	someText = (char*)malloc(sizeof(char));
	/*
	  Usamos o sizeof para determinar o tamanho, que será
	  moldável 
	*/

	free(someText)
	return 0;
}
```

Vale lembrar que para alocar texto na variável, vamos precisar alocar depois:

```c
int main(){
	char* someText;
    someText = (char*)malloc(sizeof(char));

    someText = "sometext";

    printf(someText);

	free(someText)
    return 0;
}

```
