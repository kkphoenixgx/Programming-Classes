# Aula32
2023-05-10
tags: [index Angular](index%20Angular.md)

## - Mod 108 - : Testando unidade do componente

* **beforeEach** = antes de todas specs, execute isso
* **fixture.detectChanges** = detecta as mudanças da fixure
* **x.toBeTruthy** = espera que x seja true

Vale salientar que o `fixture.detectChanges` pode dar problema quando iniciado dentro de um `beforeEach()`, qualquer coisa só colocar em um it. Além disso, existe uma convenção para como as messages do it devem ser criadas, o U será como Under Test (em teste) e definirá a fn ou o callback que está sendo testado:

<p style="display:flex; justify-content: end; text-align: right" > <i> The (U) stands for "under test", and it's just a way to indicate that the function being passed in is the one being tested. This convention can help make it clearer which functions are being tested in a given test suite, especially when there are multiple functions being tested in the same file. ~ChatGPT </i></p>


Exemplo: 
![](Pasted%20image%2020230516135350.png)

### Dos Testes Unitários

Na estrutura dos testes unitários , adicione em `// block`, a estrutura para definir os componentes

~~~ts
beforeEach(async () => {
	await TestBed.configureTestingModule({
		declaratiosn: [Component1, Component2]
	}).compileComponents();
})
~~~ 

Sendo `Component1`  e `Component2` componentes que devem ser importados e inicializados de forma separada. Depois disso, vai colocando os its do jeito que você melhor se propuser, seguindo a ordem descrita no mod 108.

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28241284#overview
