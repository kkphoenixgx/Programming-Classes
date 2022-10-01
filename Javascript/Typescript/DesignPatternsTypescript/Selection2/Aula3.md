# Princípios Solid

Mod 6 -- **14/03/22**

Princípio SOLID, Criado pelo Martin, que criou o clean code

Mod 7 --

## S = Single responsibility principle

> "Nunca deve ter mais de um motivo para uma classe mudar"

As suas classes devem ter responsabilidades únicas. Uma classe não pode ser uma classe para mandar as coisas para o banco de dados e ao mesmo tempo controlar o client do site, não faz sentido, temos que fazer uma relação de ingeção de dependência.

Exemplo: Vamos criar uma classe Client que pode criar um upload, fazer um delete, um read e mandar um email para a empresa.

~~~ts
export default class User{

    // main methods

    create() :void{
        // ...
    }
    read() :void{
        // ...
    }
    delete() :void{
        // ...
    }

    sendEmail(){
        // ...
    }

    // side methods
    update() :void{
        // ...
    }

}
~~~

Opa, se você não sentiu que sendEmail está desalocada, significa que você não conhece o SRP, mandar um email, não é de função do cliente, embora o client possa mandar um email, sendEmail(), deve ser mandada para uma classe de fora, como por exemplo uma classe notify que tem o interesse de notificar o cliente você percebe a sutil diferença? A classe client não tem mais a responsabilidade primária, o User é para os métodos básicos do user, não para notificar ele, fica mais adequado existir um método de notify
