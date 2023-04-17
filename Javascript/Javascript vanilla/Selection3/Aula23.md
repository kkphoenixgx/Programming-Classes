mod 32                                              22/08/21

-Variáveis e seletores

Informação muito interessante sobre seletores css que
eu tinha lido sobre mas nunca vi aplicando:

Dá para selecionar um campo rádio ou algo pelo name dele
também. Você deve selecionar o formulário e usar uma [] para
selecionar algo dele e colocar o ["name = x"] que você
quer selecionar, porém o problema disso é que assim
vai aparecer para você só um se você usar o querySelector,
então, use o querySelctorAll("x") para vir os dois com o 
nome, mas aí você fala, senhor, senhor, mas eu não quero 
isso, então usa um pseudoSeletor, se você não sabe o que é 
um pseudoSeletor, bom, não se preocupe, nem eu sei, vale
uma aula extra ae... Mas nesse casp ele diz no exemplo
abaixo, que quer somente o que tá checked, funciona como
um filtro:

ex:
    var uGender = document.querySelectorAll(
        "#form-user-create[name=gender]:checked"
        );

obs: No caso tá aberto por que não cabe.

