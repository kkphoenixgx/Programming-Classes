# Excluindo um usuário do NeEDB usando db.remove

mod 76 --**25/10/21**

Antes de você deletar coisas do banco de dados você deve saber que exitem métodos assim como get e post que são usados para formulários que chamam essas rotas da sua aplicação, são até agora 3 e com o delete 4 (**get, post, put, delete**), então entendendo isso, o db.remove, sendo db a variável de banco com o nome sobre uma convenção, fica fácil de entender.

> db.remove(x, y, z)

sendo x um objeto json passando o registro que você está querendo remover, y sendo um parametro de opções passando multi se quiser vários registros de uma vez ou um por vez e z sendo uma variável que irá conter o erro caso for feito algum.

~~~javascript
//nesse caso eu estou usando consign, então a rota é routes

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
