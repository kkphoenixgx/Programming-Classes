# Aula32
2023-05-10
tags: [index Angular](../index%20Angular.md)

## - Mod 108 - : Testando unidade do componente

* **beforeEach** = antes de todas specs, execute isso
* **fixture.detectChanges** = detecta as mudanças da fixure
* **x.toBeTruthy** = espera que x seja true

vale salientar que o fixture.detectChanges pode dar problema quando iniciado dentro de um beforeEach, qualquer coisa só colocar em um it. Além disso, existe uma convenção para como as messages do it devem ser criadas, o U será como Under Test (em teste) e definirá a fn ou o callback que está sendo testado:

<p style="display:flex; justify-content: end; text-al" > <i> The (U) stands for "under test", and it's just a way to indicate that the function being passed in is the one being tested. This convention can help make it clearer which functions are being tested in a given test suite, especially when there are multiple functions being tested in the same file. ~ChatGPT </i></p>


Exemplo: 
![](../img/Pasted%20image%2020230516135350.png)

### Dos Testes Unitários

Estrutura: 



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28241284#overview
