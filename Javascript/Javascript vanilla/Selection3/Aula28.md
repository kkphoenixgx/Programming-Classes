mod 38                                              29/08/21

-Programação Orientada a Objetos 

MVC = Separar a lógica, do visual, dos negócios

Uma correção muitos bom de pontuar é que quando você cria
uma tag como uma variável, tem que apagar do conteúdo
a própria tag que foi criada:

document.createElement("tr");
    tr.innerHTML = `<td><img src="dist/img/user1-128x128.jpg" alt="User Image" class="img-circle img-sm"></td>
                      <td>Fulano</td>
                      <td>fulano@hcode.com.br</td>
                      <td>Sim</td>
                      <td>02/04/2018</td>
                      <td>
                        <button type="button" class="btn btn-primary btn-xs btn-flat">Editar</button>
                        <button type="button" class="btn btn-danger btn-xs btn-flat">Excluir</button>
                      </td>`

Nessa aula eles explicaram o funcionamento de uma classe
se tiver dúvida alguma ainda, checa o dicionário e 
verifica a estrutura de classes e o construtor

lembrando que para instanciar é só criar uma variável
instanciando a classe: var x = new y();
sendo x o nome da variável e y o nome da classe.

============================================================

mod 39

-Programação Orientada a Objetos MVC Controller

MVC = Model view controller

com o dir() dá para você ver coisas como um objeto no
console;

* NOTA MUITO IMPORTANTE:

Quando uma função está sendo escrita o "this" está 
referênciando a função, então dentro de um método, 
para poder usar um this em um objeto especifico, você
tem que criar um this privado que é fora do escopo da função
do método usando *("_this")* usando o let do js fica
ainda melhor de renderizar tudo;
ex:
  onSubmit(){
        let _this = this;
        formEl.addEventListener("submit", function(event){
            event.preventDefault();
            _this.getValues();

        })
    }

Mas no js em especifico, o jeito certo e melhor de fazer isso
é usando uma arrow function [()=>] que permite você usar o 
this dentro da função se referênciando a classe;