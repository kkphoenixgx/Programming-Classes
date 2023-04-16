# Classes
Criado em: 2023-03-22
tags: [-Index CSharp](-Index%20CSharp.md)

Um exemplo simples de uma classe com atributos e métodos, perceba que classes em c# possuem namespaces 

~~~cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace dotnet.model
{

	public class ClassExemple
	{
		public string StringVariable { get; set; }
		public int IntVariable { get; set; }
		public bool BoolVariable { get; set; }
		public Object ObjectVariable { get; set; }
	
		public void LogFunction()
		{	
			Console.WriteLine("someText");
			Console.WriteLine($"someText with variables {stringVariable}, {intVariable}");
		}
	}
}
~~~

E para instânciar a classe, usamos new.

~~~cs
classExemple instance = new classExemple();
~~~

## Construtores

~~~cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace dotnet.model
{

	public class ClassExemple
	{
		public string StringVariable { get; set; }
		public int IntVariable { get; set; }

		// Construtor:
		public ClassExemple( string someString, int someInt ){
			StringVariable = someString;
			IntVariable = someInt;
		}
	}
}

// ------- Outro arquivo - other file -------

using dotnet.model

ClassExemple ClassInstance = new ClassExemple(
	someString: "Hello I am a string value",
	someInt: 1
)

// Você certamente poderia encapsular esses valores em variáveis
// You can surly just encapsulate those values in variables

~~~ 

A doidera do C#, é que só tem vários construtores, vários tipos de construtores

## Encapsuladores

O interessante do C# é que possuímos os campos e as propriedades, as propriedades, podemos chama-las, são públicas, já os campos são de fato os atributos privados.

* public: todos tem acesso
* private: somente a classe tem acesso
* readonly: Só possuirá um valor, só possuí get e não pode ser alterada

## Getters and Setters

Os atributos em c# são em PascalCase pois seus atributos privados seguem cammelCase e eles também seguem o padrão _ name (sem espaço) para atributos privados, lembrando o simples, atributos são variáveis associadas as classes e métodos suas funções...

~~~cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace dotnet.model
{
	public class ClassExemple
	{
	
		private string _stringVariable;
		public string StringVariable { 
			get{
				// Argument Exception to get prop
				return _stringVariable
			}
			set{
				// Argument Exception to set prop
				value = _stringVariable;
			} 
		}
		
	}
}
~~~

Entenda value como o valor que está sendo recebido ao mudar ou atribuir um valor ao seu atributo. 

Agora um simples exemplo de excessão:

~~~cs
set{
	if(value == ''){
		throw new ArgumentException("O nome não pode ser vazio");
	}
	value = _stringVariable;
}
~~~


Podemos também usar as [Body expressions](Operadores.md#Body%20expressions) para retornarmos os valores do get:

~~~cs
get => _stringVariable;
~~~

