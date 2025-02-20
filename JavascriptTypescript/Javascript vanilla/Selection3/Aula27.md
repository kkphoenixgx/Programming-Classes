mod 37                                              26/08/21
[IndexJs](../IndexJs.md)

-funções no JavaScript

* Funções são funções, vc já conhece
* E subRotinas são funções que passam parâmetros

funções anonimas não tem nome. 
    function(){ 
    }

Para criar um elemento html, você pode primeiro criar uma
variável tr com um elemento criado, para isso podemnos usar
o document.createElement("x"); sendo x o elemento

E para realemente fazer esse elemento, utiliza-se o 
inner html, colocando dentro do elemento criado, uma
template string, com o que você quer criar daquilo.

exemplo:
    var tr = document.createElement("tr");
    tr.innerHTML = `<tr>
                      <td><img src="dist/img/user1-128x128.jpg" alt="User Image" class="img-circle img-sm"></td>
                      <td>Fulano</td>
                      <td>fulano@hcode.com.br</td>
                      <td>Sim</td>
                      <td>02/04/2018</td>
                      <td>
                        <button type="button" class="btn btn-primary btn-xs btn-flat">Editar</button>
                        <button type="button" class="btn btn-danger btn-xs btn-flat">Excluir</button>
                      </td>
                    </tr>`
                