# Manipulação de variáveis
2024-06-05
tags: [[☕ Index Java]]

## Strings

- **Formatar**
	- `trim()` = "Tirar os espaços";
	- `toLowerCase()` = "Transformar para Maiusculo";
	- `toUpperCase()` = "Para maiusculo";
	```java
	String originalString =  "Tudo minúsculo";
	
	originalString = originalString.toUpperCase(); 
	// TUDO MINÚSCULO
	originalString = originalString.toLowerCase();
	//tudo minúsculo
	originalString = originalString.trim(" ");
	//tudominúsculo
	```

- **Recortar**:
	- `substring(int inicio, int fim = <tamanhoString>)` =  Vai recortar uma parte da string, que vai ser definida pela posição de inicio e fim tendo em relação a posição como o tamanho da string. Ex: "Oi", "O" = 1; "i" = 2;
	```java
	String s = "Let's Get This Bread";
	String subString = s.substring(6, 9); // Get
	```

- **Substituir**:
	- `Replace(string, string)`  = substitui stings
	```java
	String s1="o oooo ooooooo";  
	String replaceString=s1.replace("o","i")
	// i iiii iiiiiii
	```

- **Buscar**: 
	- `str.Split("x")` Recortar uma string com base em um separador x e transforma elas em um vetor:
	```java
	print("I love Java".split(" "));
	// [eu, amo, Java]
	```

### String Builder

Quando temos uma composição de string que é muito grande, até poderíamos fazer uma simples concatenação e ok. Mas, quando temos que fazer em diferentes partes do código, ou temos muitas variáveis, uma boa prática para melhor manipulação de espaço, é usar o string builder:

```java
StringBuilder sb = new StringBuilder();
sb.append("Adicione uma linha à string \n");
sb.append("Adicione outra linha à string \n");
sb.append("Adicione variáveis ou o que quiser \n");
```

![[StringBuilderExample.png]]

## Double

A função String.format(formato, variável);
pode servir muito para você criar um tipo de formatação para um 
valor de um double sem mudar o double dele com os comandos 
de %, xf citados nas primeiras aulas.  
