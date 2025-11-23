# Injeção De Dependencia
2025-05-17
tags: [[O .NET]]

Vamos falar então de Injeção de dependência e vamos falar aqui usando códigos C#...

## O problema: 

Digamos que temos uma classe chamada de Pergunta e outra chamada Opção, vamos pensar numa estrutura simples de prova com perguntas e várias opções de resposta.

Quando criamos uma Pergunta, devemos ter opções para aquela pergunta. Dessa forma, podemos pensar no seguinte código: 

```c#
namespace exemplo.Quiz {

	public class Pergunta{
	   Opcao option = new Option("Pete");
	   Opcao optionTwo = new Option("Repete");
	}
}
```

O grande problema aqui é que Pergunta está diretamente dependente de Opcao... Pergunta depende de saber como se cria uma Opcao. Desse modo, alterando a forma de criação de opcao, seja mudar ela para receber um json ou algo do gênero, devemos também alterar a classe Pergunta.

## A solução apresentada

```c#
interface IOption{
   List<Option> getOptions();
}
```

```c#
public class Option : IOption {
	List<Option> options;

		public List<Option> getOptions(){
			return this.
			options;
		}
	}
```

```c#
namespace exemplo.Quiz {
	public class Pergunta{

		IOption option;

		public Pergunta(IOpcao option){
			this.option = option;
		}

		public List<Option> getOptions(){
			return this.option.listOptions();
		}
	}
}
```

Passando a responsabilidade a abstração,  As classes não querem saber umas das outras, apenas ligam para as interfaces.