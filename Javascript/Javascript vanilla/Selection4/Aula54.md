mod 72 <br>
**12/10/21**

<h2>Listando usuários do banco NeDB</h2>

// mudei tudo e agr estou usando arquivos .md <br><br>


Mindblowing, a definição disso se torna algo tão
facilmente explicavel quando se analisa a bosta quadrada
que eu tava pensando sobre o que é o get, get já diz o
pegar, get n é o metodo para enviar, embora seja usado 
como padrão para isso.
<br>
><img src="https://c.tenor.com/bD9vHNiR1rQAAAAM/boom-mind-blown.gif" alt="mindblowing">
<br>
Muito bem, então dentro de um servidor com conexão para
o banco de dados temos que ter um método de enviar dados
e pegar dados do banco de dados, outro para gerenciar 
paths e etc.
Como fizemos isso até agora? com o express moldamos
um método que envia dados para o banco usando x.post, sendo 
x a variável que contém o express, comumente usada app
e agora aprenderemos a pegar dados do banco cusando método get com db.find do NeDB<br><br>

obs: Veja o <a href="https://github.com/kkphoenixgx/Nodejs-Course/blob/master/Aulas/dicionario.txt">dicionário
</a> node.js na parte express, tá tudo organizadinho lá.

então com tudo bem organizado poderemos adicionar novos 
métodos ao dicionário e organizar as coisas na cabeça. 

>db.find()

Lembrando que esse db é uma instância do NeDB que foi chamado com um método require, então sabendo disso e usando o NeDB fica bem simples, segue uma formula:

> db.find( x )

sendo x o que você tá buscando e o método usado nesse tipo de estrutura para procurar o dado: 

> db.find( x ).sort( y ).exec( fn );

sendo x o que você ta buscando, sort para organizar o que você ta buscando, então o y fica sendo a ordem que você quer detalhada numa função: você coloca o primeiro item que você quer como primeiro atributo json da lista e define se você quer +1 = ordem crescente ou -1 = ordem decrescente, e depois disso executa com o exec() passando uma função, normalmente uma arrow function que lida com o erro e com as informações, exemplo real:

~~~javascript
app.get('/users', (req, res)=>{

    /* 
    quando usamos no método find um array vazio estamos
     dizendo que queremos que liste todos os usuários, ou 
    seja não estamos buscando ninguém.
    */

    db.find({}).sort({name: 1}).exec((err, user)=> {

        if(err){
            console.log(`error: ${err}`);
            res.setCode(300).json({error: err});
        }else{
            res.setCode = 200
            res.setHeader('content-type', 'application/json');
            res.json({
                users: [{
                    name: 'x',
                    email: 'x',
                    id: 1,
                }]
            });
        }

    });

}) 
~~~