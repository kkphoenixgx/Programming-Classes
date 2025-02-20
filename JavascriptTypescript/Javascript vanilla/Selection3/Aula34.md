mod 45                                              06/09/21
[IndexJs](../IndexJs.md)

-trabalhando com métodos estáticos.

   O static na frente de um método significa que ele é 
independente da instancia do objeto. Então não é 
preciso instanciar o objeto para a função ser  utilizada
uma chamada de class = y function = x [y.x] funcionará.

Essa aula é a aula de 05/09/21 que não foi feita. a próxima
será a aula de fato de hoje. 

============================================================

mod 46

- Validando formulários:

  De primeira mão seria muito facil somente usar o required 
no formulário, porém a grande sacada é que quando é feito
algo assim, precisamos de duas camadas de proteção contra 
essa função.

  Uma coisa incrível apresentada nessa aula que já era um 
plano de estudo meu é como colocar classes css via js. Eles
utilizaram uma maneira bem simples de explicar, vamos dizer
que x seria um campo de um formulário, essencialmente usar 
o campoZ.classList.add(y) é colocar o 'y' citado no 
campoZ sendo y o nome da classe que você quer adicionar.
agora no exemplo, você não quer adicionar no campo, e sim
na div do campo, então você colocar 
campoZ.parentElement.classList.add(y), adicionando o 'y'
na div, ou seja, no seu pai.
