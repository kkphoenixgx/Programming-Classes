# Lifecycle methods

Mod 16 -- **02/03/22**

Existem funções no js que são pré determinadas com uma função, assim como o state é uma variável que você gera, mas ela tem funções no react que são pré determinadas para a variável, então em suma, quando declaramos uma variável state, ela já tem uma função, o react só identifica qual é a variável state pelo nome dela, aparentemente, e tem funções que giram em torno dela. A mesma coisa vai acontecer com esses métodos, os lifecycle methods são métodos relacionados ao ciclo de vida de um componente, quando declaramos um método com esse nome pré determinado, ele vai ter uma função dele.

* **componentDidMount()** = faz algo quando o componente for renderizado.w
* **componentDidUpdate()** = faz algo quando o componente for atualizado.
* **componentWillUnmount()** = faz algo quando o componente for desfeito

* **clearTimeOut(timeOutFn)** = para de contar um time out.
