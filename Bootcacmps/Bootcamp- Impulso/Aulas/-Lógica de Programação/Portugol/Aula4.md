# Mods 6 a 10 - 01/04/22

## Aprendendo a usar uma estrutura de repetição

* **Estrutura de repetição** = é uma estrutura que permite você realizar as mesmas linhas de código, de acordo com uma condição e um contador

![fluxograma estrutura de repetição](./../../img/Estrutura%20de%20repetição.png)

## Portugol (pseudocódigo)

Linguagem de baixo nível são linguagens que se aproximam mais da linguagem da máquina e de alto nível, que se aproximam mais das linguagens humanas

E as linguagens de programação, também podem ser compiladas e interpretadas, como o ts que é interpretado e o js que é compilado

em portugol, para criarmos uma função, fica simplesmente função

> funcao () { ... }

o escreva(x) é o comando para escrever no console
para definirmos variáveis, usamos *type nome = valor*

> real nota1, nota2, nota3, nota4, media

| type     | significado        |
| -------- | ------------------ |
| real     | número             |
| inteiro  | número sem vírgula |
| caracter | somente uma letra  |
| cadeia   | várias letras      |

Para lermos uma informação, usamos leia(x)

> leia(variable)

~~~Portugol
cadeia name;
real month1, month2, month3, month4, media;

escreva)("DIGITE SEU NOME, POR FAVOR, SENHOR")
leia(name);

escreva("DIGITE O GANHO DO MÊS 1");
leia(month1)
escreva("DIGITE O GANHO DO MÊS 2");
leia(month2)
escreva("DIGITE O GANHO DO MÊS 3");
leia(month3)
escreva("DIGITE O GANHO DO MÊS 4");
leia(month4)

escreva("SUA MÉDIA NOS 4 MESES, " + name + "FOI DE" + (month1 + month2 + month3 + month4)/4 )
~~~

## Desvios de condicionais e comentários no portugol

obs: para quebra de linha, assim como no jk, usamos \n

* se(condição) é um if(condição), se a condição for verdadeira, vai executar um bloco de comando

~~~portugol
se(media >= 7){
    escreva("\n Você foi aprovado");
}
~~~

* senão{} = else{}, se o se não der certo, faça o senao

~~~portugol
se(media >= 7){
    escreva("Você foi aprovado");
} senao{
    escreva("/n infelizmente, você foi reprovado")
}
~~~

* para comentar no portugol, por padrão , //

* escolha(x): caso 'y' {...} caso contrario é o switch do portugol

~~~portugol
inteiro x
leia(x)

escolha(x){
    caso: 1:
      escreva("VOCÊ ESCOLHEU 1")
    caso: 2:
      escreva("VOCÊ ESCOLHEU 2")
    caso: 3:
      escreva("VOCÊ ESCOLHEU 3")
    
    caso contrario: 
      escreva("VALOR INVÁLIDO")
}
~~~

## Trabalhando laços de repetição no portugol

esse seria o do while:

~~~portugol
inteiro contador, limite, resultado

contador = 0
limite = 10

faca{

    resultado = 9* contador
    escreva( "9X" + contador + "=" + resultado + "\n" );
    contador++

}enquanto(contador <= limite)
~~~

exercício:  

~~~portugol
inteiro contador, limite, resultado, tabuada

contador = 0

escreva("SUA TABUADA CALCULARÁ ATÉ QUAL NÚMERO")
leia(limite)

escreva("DIGITE A TABUADA DE SUA PREFERÊNCIA")
leia(tabuada)

faca{

    resultado = tabuada * contador
    escreva( tabuada + "X" + contador + "=" + resultado + "\n" );
    contador++

}enquanto(contador <= limite)
~~~

## Matrizes e vetores

Matriz = coleção de variáveis  
Vetor = matriz de uma dimensão  

podemos definir uma matriz como uma tabela e o vetor como um arranjo

em portugol, definimos uma arranjo com a palavra cadeia

~~~Portugol
cadeia frutas[4];

fruta[0] = maça
fruta[1] = pera
fruta[2] = uva
fruta[3] = jaca
~~~

Enquanto o vetor só tem a quantidade de itens em uma linha, podemos definir na nossa matriz, a quantidade de coluna, se usarmos como referência, o js, seria uma collection, um array de objetos, lembrando que podemos deixar em branco para a quantidade ser variável.

~~~Portugol
cadeia cesta[2][1] = { { "Maça", "100" }, { "Pera", "100" }, { "uva", "100" } }

//ou
cadeia cesta[][] = { { "Maça", "100" }, { "Pera", "100" }, { "uva", "100" } }
~~~

Exercício:

~~~Portugol
contador = 0

cadeia users[3][3] = { { "João", "São Paulo", "(11) 9999-5241" }, { "Maria", "Ribeirão Preto", "(16) 9999-8596" }, { "Ana", "Manaus", "(92) 9999-8574" } }

faca {

    escreva( user[contador][0], user[contador][1], user[contador][2] )
    contador ++

} enquanto( contador <= 3 )
~~~
