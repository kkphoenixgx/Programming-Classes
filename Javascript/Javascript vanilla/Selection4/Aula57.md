mod 75 <br>
**14/10/21**

<h2>Editando dados do banco com Nedb</h2>

Existem métodos bem conhecidos que lidam com pegar e enviar documentos para o banco, como vimos antes, o get e o post fazem isso muito bem e são bem conhecidos por isso, principalmente pela comunidade de html, mas tem um que é para editar que não é tão conhecido, justamente por não ser usado em html, que é o amigo **put**.

>x.put

Ele é feito para editar informações, ele recebe o cara que queremos mudar e o que queremos mudar. então com o método put podemos mudar informações do banco, editar informações direto do banco, estarei usando aqui o NeDb, então já terei como pré suposto que ele já foi requirido e colocado numa variável qye vai ser chamada de **db**. <br>

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
            dados do body juntando com o params do id que tá
            tudo certo
            */

            res.status(200).json(Object.assign(req.params,req.body));
        }
    });
});
~~~
