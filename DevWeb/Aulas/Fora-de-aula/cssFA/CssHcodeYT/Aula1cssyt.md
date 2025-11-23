Video 2                                              09/06/21
[index](DevWeb/index.md)

Propriedade: height 

Ela define a altura dos elementos. O que não inclui as 
margens, bordas e espaçamento.
Permite herança explicita, uma vez definida a altura do
elemento pai, é possível herdar para o elemento filho.

obs: as Propriedades max-height e min height quando pre-
sentes, sobrescrevem a propriedade height.

-----------------------------dicas---------------------------

Quando você não define a altura ou largura ou uma proprieda-
de no elemento pai, o elemento filho não tem nenhuma referên-
cia para calcular a porcentagem.

O % é a porcentagem do elemento pai, agora o vh é o tamanho
da view port, ou seja, da tela toda.
 Quando o formato do doctype não for mencionado, o 
navegador vai procurar a melhor forma de abrir o seu
arquivo, e a melhor forma de fazer isso é definindo o
body como 100% de altura.