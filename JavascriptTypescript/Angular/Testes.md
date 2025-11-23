# Testes
2025-11-23
tags: [[index Angular]]

## Introdução ao Jasmine, Estrutura base
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula29.md ]

Um teste unitário é diferente de um teste de fluxo. Um teste de fluxo verifica as saídas e os envios de página. Em contrapartida, os testes unitários verificam uma unidade da aplicação como um todo. Para realizar os testes unitários, utilizamos o Karma para node e o Jasmine para o angular.

### Estrutura base

~~~ts
import { TestBed } from '@angular/core/testing';
import { ComponentName } from './ComponentName';

describe('ComponentName', () => { 

    let component :ComponentName;
    let fixture :ComponentFixture<ComponentName>

    // ----- Estrutura do tipo de teste -----
    // Block

    // ----- Teste primário -----
    beforeEach( ()=>{
        fixture = TestBed.createComponent(ComponentName);
        component = fixture.componentInstance;

        fixture.detectChanges();
    })

    // ----- its -------

});
~~~

Via de regra, se segue essa estrutura adicionando partes de acordo com o que você precisa testar. Nas seções "Dos Testes x", poderemos ver essas estruturas.

### Entendendo a sintaxe

* **`describe(component, callBack)`**: Os testes que ocorrerão no component por meio do callBack;
* **`it('description', callback)`**: Isso deveria <descrição>. Exemplo: `it('O AppComponent deveria ser criado', ...)`
* **`TestBed`**: Uma classe que fornece um ambiente de teste para o código que está sendo testado.
* **`fixture`**: Usado para interagir com o componente criado e com seu template. Não é uma instância, é a interface do componente.

## Manipulando testes fluentemente
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula30.md ]

* **`expect(x)`**: Diz que é esperado que x aconteça.
* **`x.toEqual(y)`**: Espera que x seja igual a y.
* **`x.not.y`**: Transforma a asserção y em negativa. Ex: `expect(sum).not.toEqual(3)` vai dar erro quando o resultado for 3.

## Melhorando a cobertura de testes
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula31.md ]

> **ng test --code-coverage**

Faz a cobertura do código para ver se todos os ifs, as funções e outros foram testados.

## Under Test; Estrutura para U
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula32.md ]

* **`beforeEach`**: antes de todas as specs (testes `it`), execute isso.
* **`fixture.detectChanges`**: detecta as mudanças da fixture.
* **`x.toBeTruthy`**: espera que x seja true.

Existe uma convenção para como as mensagens do `it` devem ser criadas, o (U) será como Under Test (em teste) e definirá a função ou o callback que está sendo testado.

### Dos Testes Unitários (U)

Na estrutura dos testes unitários, adicione em `// block` a estrutura para definir os componentes:

~~~ts
beforeEach(async () => {
	await TestBed.configureTestingModule({
		declarations: [Component1, Component2]
	}).compileComponents();
})
~~~ 

## Testando interfaces; Estrutura de teste para I
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula33.md ]
 
U -> Under Test;
I -> Interface's test
 
~~~ts
fixture.debugElement.nativeElement.querySelector('cssSelector')
~~~
 
Isso permite você ter um elemento. Contudo, quando você definir elementos, executar funções, todos os estados dos objetos não vão ser atualizados como quer. Dessa forma, você deve detectar mudanças com `fixture.detectChanges`.
 
## Estrutura describe para U; Manipulação de testes
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula34.md ]
 
* **`x.trim()`**: Retira os espaços vazios da frente e de trás do conteúdo de uma string para testes de elementos html.
* **`x.toContain(y)`**: Verifica se existe em x o y. Exemplo: `"SomeText" = x`, `x.toContain("Text")` → true.
* **`x.toEqual(y)`**: Verifica se x é y. Exemplo: `"SomeText" = x`, `x.toEqual("Text")` → false; `x.toEqual("SomeText")` → true.
 
## Mock; Estrutura de teste de um service
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula35.md ]
 
Mockar algo significa substituir ou simular um objeto real ou uma função durante os testes. Para isso, usamos o `HttpClientTestingModule` e o `HttpTestingController`.
 
O `HttpClientTestingModule` deve ser importado no `configureTestingModule`.
 
## Testando o serviço - Incremento na estrutura dos testes de service; Arquitetura dos Testes
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula36.md ]
 
No Jasmine, temos os blocos de preparação, como `beforeEach()` e `describe()`. Um importante incremento ao grupo é o `afterEach()` que será executado ao final de cada `it()`.
 
O método `verify()` do `httpTestingController` verifica se está tudo certo com os requests a um endereço.
 
~~~ts
afterEach(() => {
	httpTestingController.verify();
});
~~~
 
As importações nos `imports` do `configureTestingModule` não passam as dependências automaticamente, os testes dos dependentes do componente que possui a importação devem ter a importação também.
 
## Teste com mock no serviço
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula37.md ]
 
*   **`of(x)` (RxJS)**: retorna o valor de x, como se fosse um `await <method>`.
*   **`done` do `it`**: O `done` é um parâmetro do callback do `it` → `it(description, callback(done))`. Ele encerra um `it` abruptamente, útil para testes assíncronos.
*   **`httpTestingController.expectOne(URL)`**: Recebe a response da URL que você proporcionar e pode ser usada para testes.
*   **`req.flush(defaultValue)`**: Muda a response do request.
*   **`spyOn(service, 'methodName').and.returnValue(of(mockData))`**: Espiona um método de um serviço e retorna um valor mockado. É interessante não depender do serviço real para testar.
 
~~~ts
// sendo defaultValue o mesmo do exemplo anterior e service o service em questão
spyOn(service, 'serviceMethodName').and.returnValue(of(defaultValue))
 
component.ngOnInit();
fixture.detectChanges();
~~~ 
 
Uma boa prática nessa estrutura é usar o `expect(service.serviceMethod).toHaveBeenCalledWith()` para ter certeza que o `spyOn`, o `ngOnInit` e o `detectChanges` estão funcionando junto com o componente.
 
## Teste de Interface com mock no componente 2
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/section14/Aula38.md ]
 
A mesma coisa que você faz com o `spyOn()` para o teste unitário, deve ser feito nos testes de interface, para coletar continuamente os dados e verificar a interface.
 
~~~ts
it('should list data', (done)=>{
	spyOn(service, 'serviceListMethod').and.returnValue(of(defaultValue));
 
	component.ngOnInit();
	fixture.detectChanges();
 
	expect(service.list).toHaveBeenCalledWith();
 
	// expects da data...
})
~~~