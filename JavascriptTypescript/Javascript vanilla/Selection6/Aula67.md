# Listando dados do firebase (firestore)
[IndexJs](../IndexJs.md)

Mod 98 -- 04/01/22 feito em **07/01/22**

## Esclarecimentos pelo atraso

Eu fiquei doente :V

## Contextualização

Lembrando que eu estou utilizando no meu projeto, diferentemente do projeto do curso de js da udemy, o firestore do firebase, então vou continuar com as explicações referentes ao que eu fiz e ao que eu aprendi fazendo o projeto com firestore.

Então usando os módulos importados, com o CDN do firebase, como explicado na [Aula65.md](Aula65.md), podemos pegar os dados do firebase (firestore) de uma forma bem simples.

## Pegando dados do firestore

Usando o módulo importável getDocs(Reference), podemos pegar os de um um objeto em específico usando jsonObject.data(), porém o .data() é um método referente ao um dos objetos do da promise do firebase, então na documentação do firebase, diz que deveríamos fazer um foreach mas é porque em javascript um array nada mais é do que um objeto por baixo dos panos, então para mantermos a essência disso e mantermos o código mais flexível, podemos usar um método da promise do firestore para fazermos o mesmo mas com uma flexibilidade melhor:

    ~~~javascript
    getDocs(Reference)
    .then( snapshot =>{
        snapshot.docs.forEach(item => {
            let key =  item.id;
            let data = item.data();

            console.log("key: " + key);
            console.log(data);
        })
    })
    .catch(err => console.error(err))
    ~~~

Ao invés de fazermos para cada item da snapshot, vamos fazer para cada docs do objeto snapshot.
