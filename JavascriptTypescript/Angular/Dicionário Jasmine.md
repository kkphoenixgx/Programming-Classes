# Dicionário Jasmine
2023-04-27
tags:  [index Angular](index%20Angular.md)

* **Instalação no Angular**: 
	  ![Instalação](JavascriptTypescript/Angular/v16/section14/Aula29.md#Instalação)

## Sintaxe

### Classes nativas

* **TestBed**: O TestBed é uma classe que fornece um ambiente de teste para o código que está sendo testado, é possível criar e configurar módulos de teste, criar componentes e serviços, bem como criar instâncias do componente para serem testados. *Com isso podemos criar testes que simulam a interação do usuário com o aplicativo*, testar o fluxo de dados entre componentes e serviços e garantir que o aplicativo se comporte de forma previsível em diferentes situações. - **Um ambientador** -

### Métodos Nativos

* **describe(component, callBack)**: Os testes que ocorrerão no component por meio do callBack;

* **it('description', callback)**: Isso deveria < descrição >. Exemplo: it(O AppComponent) deveria ser criado(description) sendo o Call back os testes que serão feitos. É importante manter a lógica para ficar intuitivo no console;

* **expect(x)**: O expect diz que é esperado que x aconteça, ele é usado para verificar se uma determinada expressão é verdadeira ou falsa.

### Objetos Padronizados

* **fixure**: O fixure é usado para interagir com o componente criado e com seu template, para testar se o comportamento do componente está correto. Criamos um template, uma interface, do Componente para podermos fazer testes, ***Não é uma instância, é a interface do componente***, o app é a instância.
