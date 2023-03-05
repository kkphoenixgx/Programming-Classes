# Dicionário de Node, NPM, firebase, github e todos os frameworks que eu estudo

## -NodeJs-

### Eventos do Node.js

os eventos no node é bem simples de entender, temos uma biblioteca nativa chamada events que possuí uma classe que gerencia esses eventos, podemos instanciar m filho dessa classe required('events') e com essa classe podemos usar o **eventsInstance.on('event', 'callback')** para criar um evento e podemos usar o **emit('event')** para emitir esse evento

~~~js
const EventEmmiter = require('event')

class EventHandler extends EventEmiter{}
const event = new EventHandler()


event.on('prossesEnded', event=>{
	console.log('ended')
})

event.emit('processEnded')
~~~

### --Módulos e dependentes:--

Caso não tenha emoji algum, significa que é nativo do js
(🔸) = Tópico
(👓) = framework (que vai requirir da pasta node_modules)
(⌛) = depende do express

~~~javascript
    const X = require("X")
~~~

* 🔸**fs** = file system = ele pode ler manipular pastas e arquivos
  
  * **fs.readFile(Sync)(arquivo, (callBack))**:
    Ele lê um arquivo e se você quiser, lembrando que pode ser Sync ou não Sync, por isso o parenteses e o parenteses no callBack, porque se for Sync precisa do call back dizendo o que fazer enquanto está rodando esse carinha, coloca numa variável, por exemplo, se você dizer que a var = essaFn. *O buffer(tamanho limite) desse read é de 2gb*.
  
  * **fs.readdir[ Sync ](dir, [ fn(err, data) ])**:
    lê para você o diretório e quando é sync, o método é blocking

  * **fs.mkdir('dirPathOrJustName', ( OptionalJsonSettings ) ,fn(err) )**:
    Isso cria uma pasta no caminho que você mencionou e executa a function logo depois e caso temos algumas configurações possíveis nesse método lindo, vou citar somente as mais utilizadas na minha opinião :

    * **recursive: (true/false)** = todas as pastas que não tiverem ele vai criar automaticamente
* 🔸**crypto** = é um método de criptografia
  
  * cripto.pbdkdf2(Sync)( "senha","salto",[quantas vezes quer que rode isso em number],[quantos bytes é para alocar na criptografia em number], "padrão" (callBack) ) e isso vai encriptar a senha.
* 🔸**formidable** = gerencia e cria arquivos

  * setup formidable:
    mais informações para o que é o fomidable em: [Aula62](https://github.com/kkphoenixgx/JavascriptCourse/blob/master/Aulas/Selection6/Aula62.md). A execução do formidable está sendo feita dentro do Router.post  

    ~~~js
    //Express e Router (Não são dependentes para o processo)
    var express = require('express');
    var Router = express.Router();

    // formidable (não depende do express)
    var formidable = require('formidable')

    /*
    Nesse exemplo eu vou criar uma parte de uma api
    isso não está completo, é só o método post usando router do express
    */
    var app = express();
    router.post('/YourPathUpload', function(req, res){

    let form = new formidable.IncomingForm({
        uploadDir : './uploads',
        keepExtensionsFiles: true
    });

    form.parse(FormReq, (error, fields, files) =>{
            res.json({
            files
            });
    });
    });
    ~~~

* **👓 colors** = cores no terminal

	Existem dois setups para você colocar cores no terminal, existe a maneira simples e normal e a maneira mais longa nas que possui uma aparência de melhor entendimento para os que não conhecem o framework;
	
	* Forma simples:
	
	    ~~~js
	    const colors = require('./node_modules/colors/lib/index.js');
	
	    // Isso gera um degrade de arco-íris no terminal
	    console.log('Server started'.rainbow)
	    ~~~
	
	* forma safe:
	
	    ~~~js
	    const colors = require('./node_modules/colors/safe.js');
	    console.log(  colors.rainbow('Server started')  );
	    ~~~
	
	Existem muitas possíveis cores, então para escolher uma, dá uma olhada em todas as cores e funções [no site deles](https://www.npmjs.com/package/colors)
* **👓 chalk** = é um framework para mudar dos logs no console
  
  O chalk só funciona usando os imports nos modules, então tem que dar no seu package.json um 'type': 'module' para ele funcionar e usar os imports em em todos os requires.

  ~~~js
  console.log(chalk.blue('x'))
  ~~~

  * **👓 chalkAnimation** = é um sistema de animação para logs do console

    ~~~js
    import chalkAnimation from 'chalk-animation'

    chalkAnimation.rainbow('Server started').start();
    ~~~
* **👓 inquirer** = serve para coletar dados com um painel e fazer aqueles clãs de escolha
	~~~js
	import inquirer from 'inquirer';

	async function Questions(){
	
		const folder_name = await inquirer.prompt({
		
		  name: 'folder_name',
		
		  type: 'input', // can be list too
		
		  message: 'the message you want',
		
		  default() { return 'the default answare' }
		
		});
		const PROJECT_FOLDER_NAME = folder_name.folder_name;
	
		// with list
	
	    const architecture = await inquirer.prompt({
	
	        name: 'architecture',
	        type: 'list',
	        message: 'Now select the architecture\n',
	        choices: ['1', '2', '3', '4'],
	
	    });
	
	     const ARCHITECTURE = architecture.architecture;
	
	}
	
	// that usually comes with a sleep function
	
	const sleep = (ms = 2000) => new Promise( (resolve) => setTimeout(resolve, ms) )
	~~~
* 👓 **nanospinner** = Cria um spinner de loading no terminal
	~~~js
	import { createSpinner } from 'nanospinner';

	let toogleSuccess // define a variable to identify if the spinner will be sucefull or will be a glich

	const spinner = createSpinner('message').start();

	// generally used with a sleep function:
	const sleep = (ms = 2000) => new Promise( (resolve) => setTimeout(resolve, ms))

	// and stop the spinner with this sintex:
	if( toggleSuccess == true ) spinner.success({text : 'Content created'});

	if( toggleSuccess == false ) spinner.error({ text : chalkAnimation.glitch('THAT IS A ERROR').start() })
	~~~

#### 🔸 Express

  O express funciona de uma maneira bem simples, ele vai carregar tudo para você, você só precisa requisitar ele
  e criar uma variável x, que é o express em si, comumente
  chamada de app:

  ~~~javascript
  const express = require('express');

  var app = express();
  ~~~

##### Express router (⌛)

  O router do express é basicamente um método separador de rotas nativo do express que separa rotas em arquivos de uma maneira incrivelmente contra producente mas melhor que o método padrão.  

  Usando uses() e requires() podemos usar e requirir no nosso arquivo. Os paths separados, no caso fica interessante fazer uma pasta só de paths e separar essas paths em arquivos. Com um require chamamos o arquivo pelo path do arquivo ex:

  ~~~javascript
  const routesIndex = require('./routes/pathIndex')
  ~~~

  E podemos chamar essa constante no use() exemplo :

  ~~~javascript
  app.use(routesIndex);
  ~~~

  Aí já dentro do arquivo path a configuração é bem simples, você chama o express, o routes do express e vai chamar a rota não mais com o express e sim com o routes:

  ~~~javascript
  const express = require('express')
  const routes = express.Router()

  routes.get('/users', (req, res) => {

      res.statusCode = 200;
      res.setHeader('content-type', 'application/json')
      res.json({
          users:[{
              user: "Kauã Alves",
              email : "macacodeoculos123@gmail.com",
              id: 1
          }]
      });

  });
  ~~~
##### Express-validator - 6v (⌛)

O express validator é o método indicado pelo express para validar campos html e fazer um filtro antes de entrar no db de um site. A forma de instalação pelo npm é bem simples:

> node install express-validator (--save)

O express-validator adiciona novos métodos nos requests, requirindo algumas delas, como o **check("x", "y")** sendo x o campo que deve ser válido e y a mensagem caso seja inválido, e para determinar o que é inválido ele adiciona outros novos métodos, como o notEmpty() que verifica se está vazio e somente se estiver ele responderá com a mensagem.  
Nas novas versões do express-validator a importação via app.use( expressValidator( ) ) do mesmo ficou deprecada, nas novas versões do produto o novo método de utilização fica nos arquivos de path, usando o require( ) do mesmo.

~~~javascript
const { check, validationResult } = require("express-validator");
~~~

E sua nova sintaxe deu o que falar, você usa agora a validação antes mesmo da resposta diferentemente do que se fazia anteriormente, agora sua fórmula de sintaxe fica assim:

~~~javascript
app.post([validações], requestResponse)
~~~

Um exemplo mais real:

~~~javascript
route.post(
[
check("name", "O nome é obrigatório.").notEmpty(),
check("email", "Email inválido.").notEmpty().isEmail(),
], (req, res) => {

db.insert(req.body, (error, user)=>{
if(err){
app.Utils.error.send(err, req, res);
}else{
res.status(200).json(user);
}
});

}
);
~~~

* **notEmpty()**

	~~~javascript
	check('nome', 'Você deve colocar um nome').notEmpty()
	~~~
* **isEmail()**
	
	O isEmail() valida se o campo preenchido foi escrito como um email.	
	~~~javascript
	check('email', 'o campo deve ser em formato de email').motEmpty().isEmail()
	~~~

##### Body Parser (⌛)

* setup bodyParser:
	> npm install body-parser

	Mais informações sobre o que é o body parser em: [Aula62](https://github.com/kkphoenixgx/JavascriptCourse/blob/master/Aulas/Selection6/Aula62.md)  
	O body parser tem um jeito de trabalhar usando o app.use do express, sendo app o express instanciado:
	~~~javascript
	var express = require('express');
	var bodyParser = require('body-parser');
	
	/* 
	**bodyParser.json**
	no caso estou usando o formato json para o padrão
	de leitura de arquivos do formulário, mas o formato
	é moldável a sua escolha.
	*/
	/*
	**Url encoded:**
	Já o método encoded para a url é um método para
	encriptar a url de forma segura, então é necessário usar este
	*/
	app.use(bodyParser.json());
	app.use(bodyParser.url.encoded({extended: false}));
	~~~
* **req.body** → 
	A partir do momento que o bodyParser for devidamente colocado em seu script, ele funcionará de uma forma simples e muito útil, defina req.body e você poderá receber na forma que você escolheu, os dados do seu form.

 #### 🔸 NeDB

  O NeDB é um banco de dados todo feito em javascript e é um banco de dados bem simples de trabalhar, trazendo para os usuários de nodeJs uma simples forma de gerir um servidor na linguagem que a gente ama.

  * **db.insert**

    Exemplo: caso queira inserir algo no banco de dados você utiliza **db.insert**:

    ~~~javascript
        db.insert("o json que você quer inserir",
        "function(error, idGerado) =>" "{"
            "geralmente nesse bloco de código tratamos o erro",
            "e se tudo rolou bem"
        "}");
    ~~~

  * **db.find()**

    formula:

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

  * **findOne(x)**

    O método findOne(x), sendo x um json com o(s) atributos de um json que você quer encontrar, por exemplo, eu quero encontrar um usuário com um determinado id, eu vou pedir do json, o _id: e passar um req.params.x, sendo x o parametro colocado na url

    formula:
      > db.findOne( { _x : req.params.x }).exec( fn )

    Sendo x o parametro que você quer encontrar no banco, vamos um exemplo de que eu quero achar um id em especifico mas de uma maneira abstrata, claro para qualquer id que passar no form:  

    ~~~javascript
    const routeId = app.routes('/users/:id');
    
    routeId.get((req, res) => {
        db.findOne({_id: req.params.id}).exec((err, user)=> {
            if(err){
                console.log(`error: ${err}`);
                res.statusCode(300).json({
                    error: err
                });
            }else{
                res.status(200).json(user);
            }
        }); 
    });
    ~~~

  * **update(x)**

    Então usando o método do NeDb chamado de update( ) do NeDb, podemos fazer alterações do banco.

    > x.update({_y : req.params.y}, z, fn)

    sendo x o banco, passar um update com um objeto json passando o parametro que você quer mudar num json que requisita o y e os dados necessários, no caso z, que pode ser por exemplo um **req.Body, ou seja uma requisição dos dados que estão no formulário naquele momento**, depois você executa a função sendo fn uma function para tratar o erro e as informações caso dê tudo certo. agora um exemplo prático:

    ~~~javascript
    /* 
    lembrando que aqui eu já to dentro de um arquivo para tratar 
    dados de usuários e já defini meu app como express no meu 
    index, isso que eu tô fazendo já é tratando minha rota.
    */

    const routeId = app.routes('/users/:id');

    routeId.put((req, res) => {
        db.update({_id: req.params.id}, req.body, err =>{
            if(err){
                console.log(`error: ${err}`);
                res.statusCode(300).json({
                    error: err
                });
            }else{
                /*
                então como não temos o user podemos retornar os
                dados do body que tá tudo certo.
                */
                res.status(200).json(Object.assign(req.params,req.body));
            }
        });
    });
    ~~~

  * **remove(x, y, z)**

    > db.remove(x, y, z)

    sendo x um objeto json passando o registro que você está querendo remover, y sendo um parametro de opções passando multi se quiser vários registros de uma vez ou um por vez e z sendo uma variável que irá conter o erro caso for feito algum.

  ~~~javascript
  // nesse caso eu estou usando consign, então a rota é routes

  routes.delete((req, res) =>{
      db.remove({_id: req.params.id}, {}, err=>{
          if(err){
              //bloco de código para caso ter um erro
          }else{
              //bloco de código para caso não tenha.
          }
      })
  })
  ~~~

### ---Methods nodeJs---
	
* **require(x):**  
	    O método require(x) que trás um módulo de dentro de um outro arquivo.
	    Então por exemplo, me traga o módulo http: require("http).  
	
	Isso é muito usado para definir uma constante com o módulo que vai ser usado no código.
	
	* **exec(fn)** :  
	  Basicamente você executa a função fn, mas com o node
	fica bem legal, pois você pode passar o erro e o a informação propriamente dita.
	
  ~~~javascript
	    x.exec((err, user){
	        bloco de código 
	    })
	~~~
	
	* **req.url( )**:  
	Retorna a url do site, exemplo:  
	
	~~~javascript
	    x.createServer(req, res){
	        const url = req.url();
	        // isso vai retornar a url dentro da const url
	    }
	~~~
	
	* **process.hrtime()[0]**:  
	Isso pega o horario em milissegundos.
	
	* **setTimeout(fn, x)**
	Essa função determina um tempo até que algo seja executado, no caso **x** sendo o tempo em milissegundos e executa a função após isso
	
	#### Server Methods
	
	* **x.createServer(req, res);**
	
	    CreateServer basicamente cria um servidor usando um módulo, que pode ser chamado por um require por exemplo, os parametros  
	    req e res são respectivamente request e response, isso é um termo usado muito em nodejs, sendo request o que foi requisitado  
	    pelo cliente e response o que foi respondido pelo server
	
	    **statusCode** é o status do servidor, sendo  
	    200 = tudo certo.  
	    400 = erro  
	
	* **req.setHeader()**
	
	    Informa a forma que você vai responder o request:  
	
	    **formula:**  
    > 	res.setHeader('Content-Type', 'y')
    > 		sendo y como você vai responder:
						"text/plain" = formato de texto.  
	
"text/html" = formata para entender strings em html.  
"application/json" = faz poder retornar um json.  
	
* **x.listen(porta, ip, fn)**
	
	    No caso do listen, vamos passar a porta e o ip para o servidor rodar e o que fazer enquanto o servidor  estiver rodando, sendo x = o próprio server.
	
	    ~~~javascript
	    ex:
	        server.listen(3000, 127.0.0.1, ()=>{
	
	        /*  bloco de código para o que fazer enquanto o server 
	        está rodando. */
	    })
	    ~~~
	
#### -----Portas e Ips :----

* ports:  
3000 = porta local.
* Ips:  
"127.0.0.1" = IP local da maquina.
	
-----------------------------------

## --NPM--

* ### Comandos de terminal

  * **npm ini**t = ele ajuda você a criar um package json.

  * **npm install** x = instala um modulo externo.
    --save = se colocar isso após o nome do pacote (x)
    ele vai salvar também no package.json as informações
    do módulo como uma dependencia  

## Frameworks e outros

### ---Nodeschool---

* **learnyounode** = inicializa o Nodeschool.

* **learnyounode** verify x = testa o código

### -Firebase-

Aqui vou sitar todos as libs importáveis do firestore principalmente já que é o que eu estou usando, mas adicionárei tudo o que eu for aprendendo aqui:

* **collection(dataBase, title)** = permite referenciar a um title do firebase

* **addDoc(reference, JsonFile)** = adiciona o json descrito na referencia e isso retorna uma promisse.

* **serverTimeStamp()** =  pega o timestamp quando entrar no servidor, diminui o processamento para o usuário

### Github

* **git init**  
    para inicializar o repositório github
    Lembrando que ele vai entrar na branch master como padrão

* **git add**  
  para mandar para a stage area do repositório.
  * git add *.* adiciona todos os arquivos que foram mudados ou estão faltando ou que você fez mudanças.

* **git commit -m "x"**  
    sendo x a mensagem do commit que você quer fazer.
    e ele basicamente vai mandar para a stage area.

* **git clone x**  
    clona um repositório x, sendo x o link do repositório

* **git fash remote ""name""**  
    faz download das mudanças do repositório.

* **git remote**  
    Verifica se tem algum diretório remoto ligado a pasta.

* **git remote add origin y**  
    sendo y o link do seu repositório no github.

* **git status**  
mostra todos os arquivos que estão faltando ou que você fez mudanças.

* **git pull origin master --allow-unrelated-histories**  
    Vai baixar os arquivos existentes no repositório

* **git push origin "branch"**  
    Vai dar um push nos arquivos na stage area.
