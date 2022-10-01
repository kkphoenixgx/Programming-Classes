mod 34                                              25/08/21

-If e Else

Explicação básica do que é um if e operadores de condição
do js.
O  comentário do js.

Toda vez que você perguntar se algo é igual a true
você não precisa perguntar se é === true, por padrão
se algo for true, ela existe, então basta perguntar se
o x. ou seja:

ex:
    EstouEstudando = true;

    if(EstouEstudando){
        console.log("Estou Estudando");
    }
Nesse exemplo, vai aparecer no console que eu estou
estudando.

Caso seu if seja só de uma linha, você pode usar a 
instrução sem o {} do if, mas toma cuidado com isso
para não gerar um erro, então uma boa prática de 
programção é que se for usar isso, coloca tudo na
mesma linha.

Outra coisa interessante que eu notei, é que dá para
mostrar outra coisa com , ao em vez de concatenar.

----------------------------------------------------
mod 35 

-Trabalhanbdo com Json


Json = JavaScript Object Notation

O Json é básicamente um padrão de escrita que todas
as linguens podem entender, ele básicamente
pode pegar e passar informações para outras
linguagens.

Para anotação de Json o padrçao é usar chaves:

var data= 
{name:"Hcode", email:"hcode@hcode.com.br, year: 2018"}

é um padrão de objeto literal.

Pode usar um typeof se quiser, é um objeto o data.

Sempre tenta fazer um código dinamico. Quando tiver a opção
de criar algo que se mudar ainda vai funcionar, crie.

para definidir que algo é um objeto json, pode definir 
como uma variável que vira um objeto:

ex: user = {}

e isso vira um objeto json. E para adicionar algo para esse
objeto, é só colocar: user[x] = y. Sendo x o nome
do atributo e y o valor dele.