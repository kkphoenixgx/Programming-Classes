# Atualizando a view com informações de progresso

Mod 94 -- **14/12/21**

O método que foi usado para isso foi um método bem simples e fácil pelo controller mesmo, sem nenhum plugin só pelo formidable para ler os arquivos do backside e o ajax.

O ajax tem um método bem interessante chamado de ajax.onprogress que serve para o progresso de um upload feito, comumente usado no escopo de arquivos passando uma arrowfunction com o que deve ser feito:

~~~js
/* 
outra coisa interessante a se notar
é que o upload se refere ao upload 
que está ocorrendo no ajax e por isso
ele sabe qual upload é.
*/
ajax.upload.onprogress = event => {
    this.uploadFunctionMethod(event, file);
}
~~~
