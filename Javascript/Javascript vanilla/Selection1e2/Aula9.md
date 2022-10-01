mod 15                                             24/06/21

Adicionando operações - isNaN e Array.length-

Usando o length do array, dá para fazer coisas realmente
bem legais, para guiar mais ou menos o tanto de coisa
que dá para fazer com isso, vou dar só uma ideia:

dá para você selecionar o ultimo item do array com o 
length, simplesmente selecionando com a.[] e seleciona
o ultimo com a.[length-1], aí você tá tirando o número
0 e escolhendo o ultimo item do array. Então dá para
brincar bastante com array fazendo expressões numéricas

ex
    getLastOperation(){
            return this._operation[this._operation.length -1]
        }

a classe window possui uma função muito interessante que é 
a validação se é um número ou não, você então pode validar
se é um número ou não fazendo um window.isNaN(x) retornando 
um true ou false e ele valida se é um número ou não mesmo se
for uma string.

log:
    fiz os números concatenarem, não somarem sem o operador;
    criei os seguintes métodos{
        getLastOperation();
        modificações no addOperation() para não somar;
        isOperator() para saber se é um operador;
    } 