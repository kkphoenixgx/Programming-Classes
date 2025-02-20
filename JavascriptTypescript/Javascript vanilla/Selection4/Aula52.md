mod 70 <br>[IndexJs](../IndexJs.md)

**10/10/21**

<h2>Recebendo dados via POST e instalando o Postman</h2>

  Com percebemos anteriormente, até agora só usamos 
métodos get nps apps, porém não é por que é mais facil 
que é o mais seguro a se fazer, o método post é um método 
mais seguro, o método que estavamos usado antes, o get, 
deixa todas as informações do usuário na url do site
tornando tudo muito facilmente hackeado e desprotegido,
agora já o post é o método mais utilizado pela comunidade
para fazer as coisas mais encriptadas, o método post 
esconde todas as informações do usuário.
  Um ótimo aplicativo para lidar com esse problema é o
postman que auxilia a usar vários métodos de envio de 
dados via http.
  Para usar um método post é só utilizar o método post
quando for chamar a rota pelo app.
  Porem caso esteja usando o express, o express não roda
o post, para isso, deve ter um complemento do express, o 
body-parser.
  Então com o express e o body-parser, o express pode usar
o express no código, porém como o express tá sendo 
representado como uma variável, como um padrão usado, o nome
app para a variável, então tendo o bodyParser como uma 
variável requirida pelo método require('body-parser') e 
então podemos usar o método desse require dentro do meu app,
ou seja dentro do express.

* <h5>app.use(bodyParser.json());</h5><br>
    E falando para o software que queremos usar o método 
  json desse body-parser, estamos pedindo que os dados 
  enviados sejam transformados em um json.<br>
  
  ~~~javascript
    app.use(bodyParser.json());
  ~~~

* <h5>app.use(bodyParser.urlencoded( {extend: false} ));</h5><br>

    Quando usamos o método post a url como dizemos antes, 
  fica encriptada, então para o seu código entender essa
  url encriptada com diferentes tipos de criptografia,
  o body-parser tem um método para entender essas 
  criptografias, chamado de .urlencoded 

  ~~~javascript
    app.use(bodyParser.urlencoded( {extend: false} ));
  ~~~
