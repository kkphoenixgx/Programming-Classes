# Arrays
Criado em? 2022-12-16
tags: [-Index CSharp](-Index%20CSharp.md)

* Um array posuí tamanho fixo
* Quando declaramos um array com os seus valores pré setados, não precisamos definir seu tamanho, pois seu valor é fixo.

~~~cs
int[] numbers = new int[2];
string[] names = new string[] { "Kauã", "Alves" };
~~~

O índicie podemos usar de uma maneira muito standart:

~~~cs
int[] numbers = new int[] { 1,2,3,4 } 
Console.WriteLine( numbers[0] ) // retorna o 1
~~~

Podemos acessar a capacidade máxima do array com array.Length

## Mudando o tamanho de um array

![Array](Bibliotecas%20Nativas.md#Bibliotecas%20Nativas#Array)

## Listas (list)

Arrays que não possuem limites de tamanho, no ts falamos que os arrays normais do C# são tuples e as listas do C# são arrays... Porantanto listas são simplesmente arrays que não possuem limite de tamanho, que não são tuples.

~~~cs
List<type> arrayName = new List<type>(sizeOptional);
~~~

Como pode ver, podemos, inclusive, criar um tamanho opcional definindo o tamanho em *sizeOptional*, tornando a lista bem flexível e talvez substituindo, a primorde, o array normal.

Podemos também selecionar da list um item usando list[index]...
~~~cs
List<string> someStringList = new List<string>();

someStringList.Add("Name");
Console.WriteLine(someString[0]); // Exit: Name
~~~

![List](Bibliotecas%20Nativas.md#Bibliotecas%20Nativas#List)






