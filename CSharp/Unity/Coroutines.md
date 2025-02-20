# Coroutines
2023-05-11
tags: [-index Unity](-index%20Unity.md)

As corrotinas (coroutines, em inglês) são uma funcionalidade do Unity que permite que você execute um código de maneira assíncrona... É um jeito não nativo de executar um async, fazendo um paralelo com javascript, para quem nunca viu algo do tipo, é como se você executasse um bloco de código de maneira não concomitante, ao mesmo tempo, com outros códigos, como executar algo após ter terminado um download para um usuário.... 

![](img/Pasted%20image%2020230511111524.png)

Como podemos ver na imagem acima, para fazer uma coroutine precisamos de um contexto, nesse caso, usamos o método **StartCoroutine()** para justamente ativar esse ambiente assíncrono e executar **IEnumerators**, tarefas com a  interface para execução de coisas assíncronas...

* **yield** = Espere, é uma forma de dizer que o que vêm a seguir é assíncrono, Parte do contexto para a execução.


