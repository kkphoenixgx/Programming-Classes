# Variáveis
Criado em: 2023-03-22
tags: [-Index CSharp](-Index%20CSharp.md)

> string teste = "entendo";

![](-img/Pasted%20image%2020230323120215.png)

| type names | types   |
| ---------- | ------- |
| string     | string  |
| boolean    | bool    |
| Object     | Object  |
| integer    | int     |
| double     | double  |
| decimal    | decimal |

## Casting (Mudança de type)

* toString() → Tem como formatar int para string nessa brincadeira colocando como parâmetro o formato → *someInt.ToString("0.00")*

![Convert](Bibliotecas%20Nativas.md#Convert)
![Bibliotecas dos types](Bibliotecas%20Nativas.md#Bibliotecas%20dos%20types)

E a principal diferença entre os dois é que o Convert converte nulos apra 0

### Implicit casting

O implicit casting é quando podemos converter implicitamente, sem método de conversão, nativo do c#, exemplo:

~~~cs
int someInt = 10;
double someDouble = someInt;
~~~~ 

Os dois são numéricos, logo a saida do someDouble será 10.00. Contudo, entenda que nem todo int pode ser um long e nem todo long pode ser um int, dessa forma, não podemos converte-lo como implicit casting

### Explicit Casting

Podemos também fazer um casting explicito em métodos math, por exemplo: 

~~~cs
public int Power(int x, int y)
{
	return (int)Math.Pow(x, y);
}
~~~

## Manipulando strings

### Strings

Podemos usar uma interpolação de strings com o c#:

~~~cs
int someIntName = 3

string someVariableName = $"hmmmm {someIntName} vezes"
~~~

\ n (sem espaço) pula linha 

Podemos também converter uma string para um DateTime com o Parse

#### ToString

* x.ToString() = converte x para uma string, aceita diversos parâmetros
	* "Cx" = Para definir que a formatação será em formato de dinheiro com R$ ou $ ou o que seja referente a moeda; Podendo definir x como o número de casas decimais
	* "Nx" = Para definir que a formatação será em número, formatado apropriadamente; Podendo definir x como o número de casas decimais
	* "P" = Define o formato para porcentagem

Podemos definir também a formatação com aspas e # como dígito: 
~~~cs
int number = 100000000;
Console.WriteLine(number.ToString("##.##") ); // → 10.00
~~~

### Numbers

#### Formatando valores monetários
Podemos formatar valores monetários usando :C na nossa sobreposição de strigs: $" valor: {valueVariable:C }" e esse padrão segue o valor de cultura do sistema, que podemos modificar usando a biblioteca nativa [CultureInfo](Bibliotecas%20Nativas.md#Bibliotecas%20Nativas#CultureInfo)

Podemos também definir como vai ser a formatação em uma saída em específico com CreateSpecificCulture(culture) e ToString

~~~cs
decimal money = 10000M;

Console.WriteLine( money.ToString("C", CultureInfo.CreateSpecificCulture(culture) ) );
~~~

Então o ToString aceita também essa formatação.

