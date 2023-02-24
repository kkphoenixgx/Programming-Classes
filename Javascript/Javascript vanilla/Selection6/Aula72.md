# Criando uma pasta no firebase e adicionando uma pasta no Dropbox

Mod 105 -- **17/01/22**

Ok, vamos lá, para começar, pastas não são realmente pastas, elas são collections, então vamos estruturar dois cenários do firestore, um em que minha coleção primária, não é um cadastro de um cliente, e outro que a minha coleção primária é sim uma para identificar um cliente.

* **Tendo somente os arquivos em um projeto simples**  
Nesse caso tudo vai ficar mais fácil, podemos criar uma collection primaria que se chama de pastas e colocar as pastas lá com os itens dde cada pasta.

* **Tendo dados dos clientes**
Então a sacada para criar uma pasta é que podemos criar uma collection que vai ser chamada de home screen e as outras de - pasta 1, pasta 2... e colocar o nome dessas pastas sendo o nome que o cliente colocar, então vamos ter uma coleção primária com o nome Client -> todos os clientes, os nomes dele -> dados do cliente { collection com a home screen, collection com os itens da pasta x e os itens da pasta x }
