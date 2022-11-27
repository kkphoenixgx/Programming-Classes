# Lifecycle methods
02/03/22

* Tudo que tiver entre ~ é por que, na correção de 7 meses depois, descobri que estava completamente errado. Eu deixei para verem que não é por esse caminho que se pensa

## Mod 17 -- Lifecycle methods

Existem funções no js que **são pré determinadas** com uma função, assim como o state é uma variável que você gera (Correção: Ela é uma propriedade do React que puxamos com super() ., Contudo, ela tem funções no react que são pré determinadas para a variável. Então, em suma, ~quando declaramos uma variável state, ela já tem uma função~ o react só identifica qual é a variável state pelo nome dela, aparentemente... e tem funções que giram em torno dela. 
A mesma coisa vai acontecer com esses métodos, os lifecycle methods **são métodos relacionados ao ciclo de vida de um componente**, ~quando declaramos um método com esse nome pré determinado, ele vai ter uma função dele.~

* **componentDidMount()** = faz algo quando o componente for renderizado. (Antes de aparecer na tela)
* **componentDidUpdate()** = faz algo quando o componente for atualizado.
* **componentWillUnmount()** = faz algo quando o componente for desfeito

* **clearTimeOut(timeOutFn)** = para de contar um time out.

## Notes 06/10/22:

Importante dizer que, geralmente, usamos o ComponentDidMount para requisitar API.


