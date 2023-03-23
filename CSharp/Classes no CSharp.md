# Classes
2023-03-22
tags: [-Index CSharp](-Index%20CSharp.md)

Um exemplo simples de uma classe com atributos e métodos, perceba que classes em c# possuem namespaces 

~~~cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace dotnet.model
{

	public class classExemple
	{
		public string stringVariable { get; set; }
		public int intVariable { get; set; }
		public bool boolVariable { get; set; }
		public Object objectVariable { get; set; }
	
		public void logFunction()
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

