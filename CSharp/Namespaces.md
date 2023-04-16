# Namespaces
Criado em: 2023-03-23
tags: [-Index CSharp](-Index%20CSharp.md)

Para usarmos namespaces e assim importar e exportar classes, etc, devemos definir o namespace. Para definirmos o namespace, basta colocar *namespace (namespaceName)*, exemplo:

~~~cs
namespace Foldername.models
{
	// block
}
~~~

E assim podemos usar o using em outro arquivo para podemos utilizar algo desse namespace:

~~~cs
using Foldername.models;
~~~

Uma curiosidade de quando estamos entendendo namespaces, é que podemos utilizar sem o using:

~~~cs
namespace Foldername.models
{
	public class classExemple
	{		
		public string? name { get; set; }
		public int idade { get; set; }
		
		public void Apresentar()				
		{
			Console.WriteLine("someText");		
			Console.WriteLine($"someText with variables {name}, {idade}");			
		}
	
	}
}
~~~

~~~cs
Foldername.models.classExemple objectExemple = new Foldername.models.classExemple;
~~~

Apenas uma curiosidade, o clean code iria te pegar a noite caso fizesse algo assim.
