# Bibliotecas Nativas

Criado em: 2023-03-23
tags: [🖲️ IndexCSharp](🖲️%20IndexCSharp.md)

## Array

* **Array.Resize(ref arrayToResize, int newSize)**  = Altera o tamanho do array
	* Podemos até fazer um arrayToResize.length +1 toda vez que for dar um push
*  **Array.Copy(arrayCopy, arrayPaste, int breakIndex )** = Copia para outro array (arrayPaste), os valores de um array (arrayCopy) até o index definido (breakIndex), muitas vezes só utilizado como o length do próprio array

## Bibliotecas dos types

Todas as blibliotecas type vão ter um método de conversão: Temos o int.Parse("x") sendo, x = algum número, ele irá converter para int o "x"

* **int.MaxValue**
* **int.TryParse(variable, out otherVariable )**, isso permite que possamos tentar passar algo para int, no caso a variável *variable*, e se der erro, podemos passar como default a otherVariable.
	* Podemos declarar essa variável dentro do método: <br> *int.TryParse(variable, out int value = 10 )*
	~~~cs
	string reservedDays = "3";
	int defaultValue = 0;
	var convertedReservedDays = int.TryParse(reservedDays, out defaultValue);
	
	Console.WriteLine(defaultValue);
	~~~

## Console

* Console.WriteLine(value) = Exibe no console value.
* Console.ReadLine = Lê um valor no console.
* Console.Clear() = limpa o console
* Console.Error.WriteLine = Uma forma mais verbosa e mais auto-intuitiva para encapsular uma mensagem de erro

## Convert

No c#, temos a classe **Convert** que pode converter valores, essa classe possuí metodos que seguem a mesma estrutura *Convert.Method(ourVariable)*.

~~~cs
int a = Convert.ToInt32("5");
~~~

## CultureInfo

Essa biblioteca transmite os valores padrão do sistema para realização de tarefas que depende da regionalidade, exemplo, definição de moeda em valores monetários:

~~~cs
using System.Globalization;

// Essa seria a variável com o tipo de cultura escolhida
string culture = "en-US";

CultureInfo.DefaultThreadCurrentCulture = new CultureInfo(culture)
decimal money = 10000M;

// A saída será em dolares
Console.WriteLine($"money = {money:C}");
~~~

(Lembre-se que isso será aplicado para todo o sistema)

## DateTime

É uma biblioteca nativa que define tempo, lida com tempo, ex:

~~~cs
// Exibe o horário da máquina
DateTime data = DateTime.Now;
Console.WriteLine( data.ToString("dd/MM/yyyy") );

//O Add adiciona data a mais... 
DateTime data = DateTime.Now.AddDays(5);
~~~

Assim como podemos usar no nosso type DateTime o método **ToShortDateString()** que retorna dd/MM/yyyy sem horas, sem precisar converter... Ou usar um **ToShortTimeString()** que retorna somente a hora

Podemos também converter a saída com toString:

~~~cs
DateTime data = DateTime.Now;
Console.WriteLine("dd/MM/yy"); //
~~~

* dd = dia
* MM = mês
* yy(yy ano inteiro com 4) = ano
* mm = minutos
* HH = hora
* hh = hora em formato de 12 horas

### DateTime.Parse()

~~~cs
string someStringData = "17/042022 18:00";
DateTime data = DateTime.Parse(someStringData);
~~~ 

### DateTime.TryParseExact

DateTime.TryParseExact(dataString, format, CultureInfo, DateTimeStyle.None, out data)

![](-img/Pasted%20image%2020230331183507.png)

Quando dá erro, executa um valor padrão

## Dictionary

Um dictionary é um conjunto de valores que possuí valor único, não podem ter dois valores iguais em um Dictionary, dessa forma, só podemos retirar um valor de um dictionary se falarmos qual é esse valor

~~~cs
/* 
Dictionary<keyType, valueType> dictionary new Dictionary<keyType, valueType>();
*/

//como se fosse um json em ts { key keyType : valueType }
Dictionary<int, string> dictionary new Dictionary<int, string>();
dictionary.Add(1, "kkphoenix")
dictionary.Add(2, "kkphoenixvs")
// É como se criasse um json: { 1: "kkphoenix", 2: "kkphoenixvs" }

dictionary[0] = "Kauã" // edita o kkphoenix para Kauã
// { 1: "Kauã", 2: "kkphoenixvs" }

// se a chave 1 existir
if( dictionary.ContainsKey(1) )
{
	dictionary.Remove(1) // remove Kauã
}
// { 2: "kkphoenixvs" }
~~~ 

## Enviroment

A biblioteca Enviroment serve para manipular processos...

* **Enviroment.Exit(code)**, sendo code o código de saída, sendo 0 simplesmente sair...

## Exeption

Uma exeption é como se fosse um erro do js...

~~~cs
try{
	// block
}
catch(Exeption error){
	Console.Error.WriteLine(error.Message);
}
catch(FileNotFoundException error){
	Console.Error.WriteLine(error.Message);
}
~~~

Existem no total, 9 exeptions que são bem auto explicativas, sendo a própria Exeption, a genêrica:

* Exceptions:
	* ArgumentException
	* ArgumentNullException
	* PathTooLongException
	* DirectoryNotFoundException
	* IOException
	* UnauthorizedAccessException
	* FileNotFoundException
	* NotSupportedException
	* System.Security.SecurityException

## File

A biblioteca file é feita para ler arquivos

* **File.ReadAllLines(path)** = Lê cada linha de um arquivo retornando um array de linhas do arquivo, em string.

## List
[Listas (list)](CSharp/Arrays.md#Listas%20(list))

* **List.Add(iten)** = Adiciona em sua list um item.
* **List.Remove(index)** = Remove da lista o item que estiver no index.
* **List.Capacity** = Retorna a capacidade da lista.

## Math

* **Math.Power(double x, double y)** = para fazermos uma potência
* **Math.Sqrt(int x)** = calcula a raiz quadrada de x
* **Math.Round(variable, numberOfPlacesAfterComma)**  = arredonda variables para numberOfPlacesAfterComma casas após a vírgula

* **Math.PI** = retorna o valor de PI
* **Math.Sin(double angulo)** = realiza o calcula de um seno com o angulo em radiano
* **Math.Cos(double angulo)** = realiza o calcula de um coseno com o angulo em radiano
* **Math.Tan(double angulo)** = realiza o calcula de uma tangente com o angulo em radiano

Uma estrutura simples para obter anhulo em radiano:

~~~cs
// Sendo angulo realmente uma variável que depende da ocasião
double angulo;
double radiano = angulo * Math.PI / 180;
~~~

## Queue

É um tipo de collection que ordena, como se fosse um array, variáveis, funções, objetos em uma fila, uma bliblioteca nativa muito simples que tem o diferencial de sempre retirar o último item dessa fila, o primeiro a entrar é sempre o primeiro a sair:
~~~cs
// Queue<type> fila new Queue<type>();

Queue<int> fila new Queue<int>();
// adicionando à fila:
fila.Enqueue(1); // [1]
fila.Enqueue(2); // [1, 2]
fila.Enqueue(3); // [1, 2, 3]

//tirando da fila
fila.Dequeue(); // retira o 1 -> [2, 3]
fila.Dequeue(); // retira o 2 -> [3]
fila.Dequeue(); // retira o 3 -> []
~~~

## Stack

Uma stack é uma pilha de coisas, uma pilha de valores, é um tipo de collection que tem o diferencial de sempre tirar o último da lista, por isso uma  pilha, se tirar o primeiro ao invés do último, tudo cai;

~~~
// Stack<type> pilha = new Stack<type>();

Stack<int> pilha = new Stack<int>();

pilha.Push(1); // [1]
pilha.Push(2); // [2, 1]
pilha.Push(3); // [3, 2, 1]

pilha.Pop(); // tira o 3 -> [2, 1]
~~~