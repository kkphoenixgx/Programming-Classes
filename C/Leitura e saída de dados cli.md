# Leitura e saída de dados
2024-02-29
tags: [[-IndexC]]

## Saída de dados

usamos o `printf("text")` para escrever no console. Para colocarmos dados, vamos ter que usar keys para variáveis, exemplo:

```c
#include <stdio.h>
#include <stdlib.h>

int main(){
	int someInt = 4;
	printf("%d", someInt);

    return 0;
}
```

Se você tentar usar `printf(someInt)`, não vai funcionar, o retorno será nulo. O `%d` do texto informa ao `printf()` que ali terá uma variável do tipo inteiro, aqui está a tabela dessas "keys", os specifiers:

| specifier | type               |
| --------- | ------------------ |
| **%d**    | ints               |
| **%f**    | floatings          |
| **%c**    | characters         |
| **%s**    | strings            |
| **%p**    | memory addresses   |
| **%x**    | hexadecimal values |


## Leitura de dados

No c, a leitura de dados pelo terminal tem algumas variações, o primário é o `gets(variable)`, que vai captar o teclado. Contudo, precisamos toda hora armazenar ele em uma variável e ele só vai retornar chars. Dessa forma teremos o `scanf("%<typePreset>", &<variable>)`

* **`scanf("%<typePreset>", &<variable>)`** = o `%<typePreset>` vai variar de acordo com o tipo da variável que você vai definir no `<variable>`, vai um exemplo e em seguida a tabela de presets, que é a tabela de specifiers:

```c
#include <stdio.h>
#include <stdlib.h>

int main(){
	int someNumber;
	scanf("%d", &someNumber);
	return 0;
}
```

| specifier | type               |
| --------- | ------------------ |
| **%d**    | ints               |
| **%f**    | floatings          |
| **%c**    | characters         |
| **%s**    | strings            |
| **%p**    | memory addresses   |
| **%x**    | hexadecimal values |

Para strings, não usamos & antes da variável:

```c
#include <stdio.h>
#include <stdlib.h>

int main(){
	char* someString;
	someString = (char*)malloc(sizeof(char));
	
	scanf("%s", someString);
    
    free(someString);
    return 0;
}
```

Outro problema, é que o `scanf("%c", &charVariable)` não funciona, precisaremos usar o `getchar()` e guardar na variável. 

E temos também alguns métodos que vão nos ajudar no recebimento de dados da cli:

* `getch()` = O `getch()` causa um pausa que o usuário vai ter que apertar enter para continuar. Para usar ele, vamos usar a biblioteca nativa `<conio.h>`

