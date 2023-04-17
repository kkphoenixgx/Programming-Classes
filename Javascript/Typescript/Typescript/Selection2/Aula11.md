# Type Enum

Enum é um type que a gente cria, posso definir que meu enum é empresas, por exemplo, e vou poder criar várias variáveis do type empresa

~~~ts
enum Permission ={ ADMIN, READONLY, USER }

/* 
  teste:  Quando não determinamos um valor, 
  a ordem será o valor, então quando rodarmos
  o código com um console.log(Permission.ADMIN) 
  vai retornar 1
*/
~~~

~~~ts
// E podemos adicionar valor simplesmente dando um = x

enum Permission ={ ADMIN = 5, READONLY, USER }

/* 
    Ao adicionar um valor a um, os subjacentes serão a 
  continuação. Então o READONLY será o 2 e o USER o 3
  e se definirmos que o READONLY vai ser o 5, o Admin 
  será o 4.
    Porém se definirmos que Admin é 5 e READONLY é 8, 
    User será 9
*/
~~~

Podemos também definir valores em string, porém quando definirmos um valor em string, os subjacentes dever ser com string também, segue a mesma lógica caso seja quebrado o fluxo novamente com um boolean ou qualquer outro type.
O enum criado também pode ser referenciada pela sintaxe dos arrays tranquilamente

~~~ts
enum Permission ={ ADMIN, READONLY, USER }

Permission[0]
// -> enum
~~~
