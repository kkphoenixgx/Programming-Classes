# Arquivos
2024-06-04
tags: [[🦖 index C]]

## Armazenamento em binário

~~~c
#include <stdio.h>
#include <stdlib.h>

struct DATA {
	int cod;
	char caractere;
};

struct DATA ascii;

FILE * firstFile;
int registeryQuantity = 256; // abstract quantity

char * filePath;
filepath = (char *)malloc(sizeof(char));
printf("Digite o caminho do arquivo");
scanf("%s", filePath);

firstFile = fopen(filePath, "wb+");

if (firstFile == NULL) {
	printf("Erro ao abrir o arquivo"); 
	free(filePath); 
	exit(1);
}

for(int i = 0; i < registeryQuantity; i++){
	ascii.cod = i-1;
	ascii.caractete = (char)(i-1);

	fwrite( &ascii, sizeof(struct DATA) ,1, firstFile)
}

~~~

## Armazenamento em Arquivos de texto

~~~c
#include <stdio.h>
#include <stdlib.h>

struct DATA{
	int cod;
	char character;
}

struct DATA data;

FILE * arquivo;
int registerQuantity = 256;

char * filePath;
filePath = (char *)malloc(sizeof(char));
printf("Digite o caminho do arquivo");
scanf("%s", filePath);

arquivo = fopen(filePath, "w+");

if(arquivo == NULL){
	printf("Erro ao abrir o aquivo");
	free(filePath);
	exit(1);
}

for(int i = 0; i < registerQuantity; i++){
	data.cod = i+1;
	data.character = (char)(i+1);
	fwrite(&data, sizeof(struct DATA), 1, arquivo);
}

fclose(arquivo);
free(filePath);
~~~

