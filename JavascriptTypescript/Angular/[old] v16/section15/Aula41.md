# Aula 41
2023-07-16
tags: [index Angular](index%20Angular.md)

## - Mod 125 - : `CanDeactivate` 2

Assim como o `CanActive`, o `canDeactivate` também tem seus parâmetros para serem usados, bem úteis, veja:
![](Pasted%20image%2020230717103336.png)

`currentRoute`:
![](Pasted%20image%2020230717103240.png)

`currentState`:
![](Pasted%20image%2020230717103532.png)

`nextState`:
![](Pasted%20image%2020230717103549.png)

## - Mod 126 - `CanLoad` :

Veja a definição do ChatGPT:
<p style="display:flex; justify-content: center; text-align: center" > 
<i> 
	No Angular, o canLoad é uma guarda de rota que é usada para controlar o carregamento de módulos de roteamento assincronamente. Ele é usado em conjunto com o Route e o RouterModule para proteger o carregamento de módulos com base em certas condições.<br> Normalmente, quando você usa o roteamento no Angular, os módulos são carregados de forma lazy, o que significa que são carregados sob demanda, apenas quando um usuário navega para uma rota específica. O canLoad permite que você defina uma lógica de verificação antes de permitir o carregamento do módulo associado a uma rota. <br> Ao usar o canLoad, você pode implementar regras de autenticação, autorização ou qualquer outra lógica personalizada para decidir se um módulo específico deve ser carregado. Ele é útil quando você deseja evitar que um módulo seja carregado se o usuário não cumprir determinadas condições, como não estar autenticado ou não ter permissões suficientes.<br> A função do canLoad é retornar um valor booleano ou uma Promise ou Observable que resolva para um valor booleano. Se o valor retornado for true, o módulo será carregado normalmente. Caso contrário, o carregamento do módulo será cancelado e o usuário será impedido de acessar a rota protegida.<br>~ChatGPT</i></p>
[- Mod 80 - Lazy Loading](../Section%2012/Aula25.md#-%20Mod%2080%20-%20Lazy%20Loading) 

No meu entendimento, ele é um guarda de módulos lazy loading, dessa forma, só será preciso carregar a página quando a guard permitir, de modo que o site fique mais leve, **só vai carregar o módulo lazy load quando a guard deixar**.

> `ng g module moduleName` **--routing**

O `--routing`  já cria a rota a partir do módulo, como uma [rota filha](JavascriptTypescript/Angular/v16/Section%2012/Aula25.md#-%20Mod%2079%20-%20Rotas%20filhas), nisso você só precisa adicionar ao componente root sua criancinha: (No exemplo do curso, criamos um módulo dentro da pasta core para encapsular o componente que o  `canLoad` vai ser o guarda e outro componente que vai ser usado também, contudo, por indexação de pontos principais, referencia-se apenas o primeiro como um modelo)
![](Pasted%20image%2020230717111033.png)

Ao criar o `canLoad` usando o `ng g guard`, esta é sua configuração:
![](Pasted%20image%2020230717111825.png)

Bem parecida mesmo a estrutura, contudo, não tem aqueles snapshots, não se usa esses retornos no `canLoad`.

## - Mod 127 -  `CanLoad` 2
<p style="display:flex; justify-content: end; text-align: right" > <i> 17/07/2023</i></p>
O log do `route`:
![](../../../Pasted%20image%2020230717113613.png)

O log do `UrlSegment`:
![](Pasted%20image%2020230717113813.png)

O mais interessante sem sombra de dúvidas é o `UrlSegment`, que retorna os caminhos fragmentados em um array.

O **`canLoad` só faz a validação uma vez, uma vez carregado o módulo, carregado estará** 

Então vamos criar uma lógica nisso bem legal:
![](Pasted%20image%2020230717114205.png)

Dessa forma, o só será possível carregar 'leads' quando a rota já tiver algo atrás dele... Então leads só será carregado bem depois.

## - Mod 128 - `CanActivateChild`

O `canActivateChild` segue a mesma lógica do `canActivate`, contudo, ele serve para rotas filhas, veja o exemplo:

![](Pasted%20image%2020230717161615.png)

Ele tem a estrutura bem parecida com o `canLoad` e de fato deve ser sempre usado com o `canLoad` já que o Lazy Load só faz sentido se usarmos ele numa rota filha

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/30852528#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/30852534#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/30852542#overview
