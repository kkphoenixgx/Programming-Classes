# Princípios Solid

Mod 6 -- **14/03/22**

Princípio SOLID, Criado pelo Martin, que criou o clean code

Mod 7 --

## S = Single responsibility principle

> "Nunca deve ter mais de um motivo para uma classe mudar"

As suas classes devem ter responsabilidades únicas. Uma classe não pode ser uma classe para mandar as coisas para o banco de dados e ao mesmo tempo controlar o client do site, não faz sentido, temos que fazer uma relação de ingeção de dependência.

Exemplo: Vamos criar uma classe Client que pode criar um upload, fazer um delete, um read e mandar um email para a empresa.

~~~ts
export interface IClient {
    name :string;
    email :string;
    password :string;
}

export default class User{

    constructor(private userData :IClient){
    }

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

    // side methods
    update() :void{
        // ...
    }

    // getters and setters

    getEmail() :string{
        return this.userData.email
    }
}
~~~

Opa, se você não sentiu que sendEmail está desalocada, significa que você não conhece o SRP, mandar um email, não é de função do cliente, o client deve ser um CRUD.
Embora o client possa mandar um email, sendEmail(), deve ser mandada para uma classe de fora, como por exemplo uma classe notify que tem o interesse de notificar o cliente. 
Você percebe a sutil diferença? A classe client não tem mais a responsabilidade primária, o User é para os métodos básicos do user, não para notificar ele, fica mais adequado existir um método de notify que tem a função de notificar. O client tem a função de representar o cliente, já o notify tem a função de notificar, os client nao pode notificar e representar o cliente...

~~~ts 
import Client from './Client'

export default class Notify {

    constructor(private client :Client){
    }

    sendEmail() :boolean {
      try console.log(this.getClient().getEmail()); return true
      } catch(error) console.error(error); return false
    }

   // getters and setters

    getClient(){
      return this.client
    }
  }
~~~ 

Main File has to be like:

~~~ts
import{  default as Client, IClient } from './Client'
import Notify from './Notify'

const userName :string = document.queryselector('data-user-name')
const userEmail :string = document.queryselector('data-user-Email')
const userPassword :string = document.queryselector('data-user-password')

let userData :IClient = {

  "name": userName,

  "email": userEmail,

  "password": userPassword

}

const client = new Client(userData)
const notification = new Notify(client)

notification.sendEmail();~~~
