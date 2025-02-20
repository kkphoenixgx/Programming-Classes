# Dedução de tipo em ts

Mod 12 -- **17/02/22**

Dedução de tipo (Type inference) = como o Ts deduz os dados que enviamos  

* Lembre-se que você vai rodar os arquivos primeiro com compilador tsc e para testar, você pode usar node.
* O ts consegue deduzir o tipo do dado de acordo com a primeira instanciação de um conteúdo a uma variável, ou seja, no momento que uma variável que não foi definido o tipo, recebe um tipo, ela vai se moldar e virar daquele tipo, mesmo sem mostrar isso

~~~ts
// não atribuí um type a ela:
const lang;

//agora ela é do tipo string
const lang = 'language'

// isso geraria um ERRO, pois ela é do type String
if(lang == 'language') lang == 12  
~~~

Então digamos que eu diga que lang = 1, ele vai virar do tipo int e se eu dizer que:

~~~js
const lang = 1

if(lang != 'language') lang = 12;
~~~

Ele vai aceitar, mas se eu disser que ele não recebe 12 e sim 'language' vai virar um erro.

* No ts, temos métodos inerentes a types, então se eu tenho um int 12, eu posso usar o método .toFixed() nessa variável, assim como existe o por exemplo toLowerCase() que é inerente de uma string

* O array do ts pode guardar qualquer tipo de informação

~~~js
let number - 1
// vai retornar 
number.toFixed()
~~~
