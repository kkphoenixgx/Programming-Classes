mod 42                                             01/09/21
[IndexJs](../IndexJs.md)

-Trabalhando com promise no javaScript

Existem dois tipos de processamentos de dados:

"Síncrono" e "Assíncrono". 
O processamento "Síncrono" é quando ele tem uma sincronia
com o botão e o usuário, o usuário gera uma rotina.
Quando o processamento é "Assíncrono", não precisa de um
usuário para uma rotina acontecer.

Com isso em mente, tenha o conceito de [promise:]
"Promise" é o nome dado a um processamento Assíncrono que
tem duas ou mais vertentes, quando algo dá errado eu faço
x e quando dá certo eu faço y em um processamento
"Assíncrono".

Como funciona uma [promise] na prática, ela é um objeto 
que possuí dois callbacks como parâmetros e que se o 
return de uma função for uma instância desse objeto
Promise, ela deve passar dois parâmetros callbacks. 
A promise basicamente retorna o que tiver dentro 
do callback 1 ou 2. Se você falar que o result(variávelX = 2)
e resolve(variávelX = 1) ele vai retornar essa variável
como um ou dois caso for 2 faz um bloco	de código.
Usando o métodos .then do resultado que é uma promise ainda, 
tem como fazer um bloco de código e com o método .catch caso
ocorra um erro, pega esse erro.

