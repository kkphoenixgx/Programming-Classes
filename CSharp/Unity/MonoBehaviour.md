# MonoBehaviour
2023-05-11
tags: [-index Unity](-index%20Unity.md)

O MonoBehavior é uma classe base fornecida pela Unity para scripts que controlam o comportamento dos objetos no jogo. Adiciona muitas funcionalidades e gerencia coisas que não iriam funcionar simplesmente por estarem no código, exemplo, Console.WriteLine()... Não tem console, usamos o **print()**

~~~cs
public class Game :MonoBehaviour {

	public Game()
	{
		Method();
	}

	public void Method()
	{
		print("Hello Unity World");
	}
}
~~~


## Métodos

* **print** = Coloca na tela do console Unity.
* **WaitForSeconds**= O "WaitForSeconds" é uma classe da Unity que herda de "CustomYieldInstruction" e é usada em corrotinas que são executadas por meio de componentes "MonoBehaviour" ~ *ChatGPT*. Basicamente espera 
