mod 44                                               03/09/21

-Trabalhando com datas, getters and setters


  Logo no começo doi vídeo eles tem uma ideia de impedir
que o usuario comece a spamar o botão de submit
então para parar isso, eles usaram um método chamado de 
reset() do formulário para resetar tudo, e para desabilitar
o botão, ele usou o atributo disable do botão para ele parar
de funcionar enquanto o botão estiver ligado.

em Date() do js, tem diferentes tipos dfe respostas para 
diferentes tipos de entradas, caso você utilize o objeto 
Date(), tem uma resposta citada para array, String, number
e caso use sem parametros, ele retorna o horario atual da
sua máquina.

* Forma padrão = "ano, mês, dia, horario"

[String] = Quando você usa uma String informando a data da 
forma padrão trocando as vírgulas para - ele retorna
o horário influenciado pelo fuso-horário da máquina
ou seja, se você passar um "2020-05-06" o js vai presumir 
então que é 00:00 e se seu fuso horario é no caso do brasil
3h do horário padrão, vai diminuir 3h de 00:00, então fica
"2020-05-05 22:00".

[number] = Quando você usa um number informando a data da 
forma padrão, sem "", você recebe o mês em array, então
janeiro no caso vai ser 0 na posição do array, então 
se você usar o mês 4, abril, vai ser mês 3 maio. Esse 
caso, desconsidera o valor do fuso horário, sendo o valor
padrão 00:00 sem considerar o fuso horario

[array] =  Quando você usa um array informando a data da 
forma padrão sem as "", o horário e o mês fica certinho

Tendo o Date() como um objeto já instanciado, é possivel
usar métodos par apegar só o mês, o ano, o dia, tem alguns
no dicionario.txt.
"../dicionário.txt"

Tem também o timeStamp do js (segundos contados des de
01/01/1970) e o x.getTime() retorna esse valor em 
milissegundos

Vendo essa aula, percebi que na realidade respeitar os 
métodos get e set de um objeto é bem importante, você
usa aquele conceito de privado para facilitar quando você
precisar colocar uma regra no seu código, então evitar 
trabalho é sempre muito bom, diminui e deixa o código mais 
inteligente.

============================================================
obs: descobri uma forma melhor de aprender, primeiro vê, 
depois programa copiando, depois entende, escreve sobre e 
reproduz.
