mod 69 <br>
**08/10/21**

<h2>Carregando Rotas com Cosign</h2>

  Ainda nesse assunto de separação de rotas, usar vários
requires em uma aplicação ainda é algo muito ruim, pois
imagine um site por exemplo da netflix que você precisa
em uma temporada ter 24 episodios e ter 12 temporadas
mas isso é só em uma série, cara, esse site vai ficar 
imensamente gigantesco.
  Então para esse problema, temos o Consign, que assim
como o express é um módulo adicional do nodejs, para instalar
como você já sabe é só usar o npm.

  Outro comando interessante a lembrar é o "--save", qeu 
salva o pacote instalado no package.json

  Agora vamos para a parte mais de escrita, o consign é 
invocado com um require também, mas como você invoca um
require como uma variável, é necessário usar essa variável
como uma variável executada, como eu gosto de chamar, que é
essencialmente uma variável com parametros x(), já que os ()
que invocam uma variável, podemos falar que uma variável é 
uma function e executa-la com (). 
   E assalariável inicializada, aparentemente funciona como 
se fosse um objeto pois dá para chamar um método dela com 
um ".".

<h5>include e export do Consign</h5>
  O método include do Consign basicamente inclui uma pasta
de rotas .into("alguma coisa"), então o método utilizado
para lidar com o problema de rotas é incluir uma pasta de 
rotas no app do nodejs, permitindo chamar o app nos 
arquivos separados na pasta dedicada.
Usando isso a estrutura no arquivo muda um pouco, ao invés
de exportar uma variável por exemplo com o routes, você deve
retornar uma função na qual retornara todo o bloco de código
do arquivo.<br><br>

importando:
~~~javascript
consign().include(x).into(y)
~~~
Sendo x o que você quer dentro de y, exemplo, importar uma pasta dentro do express x = 'Paths' y = app<br><br> 
exportando:
> module.exports {<br> - função para exportar(geralmente uma arrow function) <br>}
