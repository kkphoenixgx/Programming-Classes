# Aula 34
2023-06-04
tags: [index Angular](../index%20Angular.md)

## - Mod 111 - : Criando component investments

![](../img/Pasted%20image%2020230604130822.png)

Lembra sempre de lidar com os testes unitários depois ou antes de criar um componente, verifique se está declarado, sempre aparece uma mensagem parecida com essa:

![](../img/Pasted%20image%2020230604130937.png)

Precisamos sempre fazer essa estrutura, claro, isso é um exemplo do curso mas perceba a estrutura do `describe`, depois os dois `beforEach` e só depois os its

![](../img/Pasted%20image%2020230604131350.png)

## - Mod 112 - : Testando o component

* **x.trim()** = Retira os espaços vazios da frente e de trás do conteúdo de uma string para testes de elementos html
* **x.toContain(y)** =  Verifica se existe em x o y. Exemplo: "SomeText" = x, x.toContain("Text") // → true
* **x.toEqual(y)*** = Verifica se x é y. Exemplo: "SomeText" = x, x.toEqual("Text") //→false; x.toEqual("Some Text") //→true


-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28649672#overview