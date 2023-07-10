# Aula 37
2023-07-10
tags: [index Angular](../index%20Angular.md)

## - Mod 117 - : Teste com mock no serviço

Agora entenderemos a fundo um pouco do `done`, que é um parâmetro do *callback* do it → `it( description, callback(done) )`. Desse modo, ele, basicamente, encerra abruptamente um it. No exemplo a seguir, estamos requirindo dados de um servidor e testando seus resultados:

~~~ts
it('(U) Should request corectly the server', (done) => {
	service.list().subscribe( (res :Array<AnswareInterface>) =>{
		expect(res[0].name).toEqual('Response1');
		done();
	});
});
~~~

Pense que service é o serviço que criamos e o list retorna os dados que precisamos do serviço;

Algo interessante do `subscribe()` é que ele escuta, e não para de escutar. Portanto, precisamos falar para ele quando parar, por isso usamos o `done()`.

## - Mod  - :



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28847540?start=0#overview
