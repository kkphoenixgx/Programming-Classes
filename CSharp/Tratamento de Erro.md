# Tratamento de Erro
Criado em: 2023-04-02
tags: [🖲️ IndexCSharp](🖲️%20IndexCSharp.md)

## try catch finally

~~~cs
try{
	// tente executar esse bloco de código
}
catch(FileNotFoundExeption error){
	// caso não consiga executar o bloco de código
	// execute esse bloco após encapsular o erro na variável error
}
catch(Exeption error){
	// caso não consiga encapsular o catch acima
	// execute esse bloco após encapsular o erro na variável error
}
finally{
	// Após a execução dos acima
	// execute esse bloco
}
~~~

## throw

Simplesmente retorna um x que pode se5r encapsulado se necessário em um erro, é como se fizesse um fluxo de informação que carrega a mensagem enviada pelo throw