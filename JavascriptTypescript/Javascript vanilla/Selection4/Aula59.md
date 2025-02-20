# Validando os dados via post (express-validator)
[IndexJs](../IndexJs.md)

Mod 77 -- **29/10/21**

## Instalação e utilização do express validator

A validação de dados não é feita pelo banco, como estamos usando NEDB, a validação não é feita pelo próprio, ela será feita com um módulo do express chamado de **express-validator** que valida dados antes de utiliza-lós no banco de dados.

* ### Instalando

Sua instalação pode ser feita em seu site ou via npm:

> node install express-validator (--save)

* ### Usando

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

## O que o express validator adiciona nas validações?

O express-validator adiciona novos métodos nos requests, requirindo algumas delas, como o assert("x", "y") sendo x o campo que deve ser válido e y a mensagem caso seja inválido, e para determinar o que é inválido ele adiciona outros novos métodos, como o notEmpty() que verifica se está vazio e somente se estiver ele responderá com a mensagem.

~~~javascript
req.assert('nome', 'Você tem que colocar um nome cabaço')
~~~

entre outros como o isEmail(), que valida se o campo preenchido foi escrito como um email.

~~~javascript
req.assert('email', 'o campo deve ser em formato de email')
~~~

O ideal é que essa não seja sua ultima linha de defesa contra bugs ou hacks, então o ideal é utilizar uma validação de erros usando o req.validationErrors();

~~~javascript
let errors = req.validationErrors()
if(errors) app.utils.error.send(errors, req, res) return 
~~~

obs: A forma na qual eu estou tratando esse erro é de um modulo externo que trata erros, porém o que vale é entender a ideia, você faz o método que você achar melhor para validar.
