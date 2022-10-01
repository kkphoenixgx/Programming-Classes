mod 71 <br>
**11/10/21**

<h2>Persistência de dados com o NeDB</h2>

  NeDB é um banco de dados  muito leve que tem um arquivo
para cada tipo de informações. para instalar:

>npm install neDB 

  Para utilizar o neDB, você pede o require dele
no próprio arquivo de path. Exemplo: quer salvar um 
usuário no banco de dados de usuários, você pede o 
require('nedb') e instancia ela numa variável passando
as configurações do seu banco num objeto JSON. 

```
require('nedb');
let db = new NeDB({
    filename: (required com o fileExtension(.exe, .db))
    autoload: (false);
})
```

  Com isso você pode usar essa variável como seu banco.

  <h5>inserindo dados com db.insert</h5><br>
  Exemplo: caso queira inserir algo no banco de dados você utiliza **db.insert**:

```
db.insert((o json que você quer inserir),
(function(error, idGerado){
    (geralmente nesse bloco de código tratamos o erro);
    (e se tudo rolou bem);
}))
```