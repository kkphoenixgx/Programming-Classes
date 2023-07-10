# Aula 37
2023-07-10
tags: [index Angular](../index%20Angular.md)

## - Mod 117 - : Teste com mock no serviço

### done do it

Agora entenderemos a fundo um pouco do `done`, que é um parâmetro do *callback* do it → `it( description, callback(done) )`. Desse modo, ele, basicamente, encerra abruptamente um it. No exemplo a seguir, estamos requirindo dados de um servidor e testando seus resultados:

~~~ts
it('(U) Should request corectly the server', (done) => {
	service.list().subscribe( (res :Array<AnswerInterface>) =>{
		expect(res[0].name).toEqual('Response1');
		done();
	});
});
~~~

Pense que service é o serviço que criamos e o list retorna os dados que precisamos do serviço;

Algo interessante do `subscribe()` é que ele escuta, e não para de escutar. Portanto, precisamos falar para ele quando parar, por isso usamos o `done()`.

### `httpTestingController.expectOne()`

Outro recurso muito interessante de se usar, principalmente falando de mock de serviços, é usar o `expectOne()` do `httpTestingController` → `httpTestingController.expectOne(URL)`. Ele vai receber, da URL que você proporcionar, a response e pode ser usada para armazenar dados, testar esse controller, mas um jeito muito interessante de usa-lo é fazer um teste na response, mudar a response:

~~~ts
const URL :string = 'http://algumaurl.com/request'

let defaultValue : Array<{ name :string, id :number, email :string }> = [ 
	{ 
		name: 'juaozinho', 
		id:23456, 
		email: 'juaozinhodograudolindo@gmail.com' 
	},
	{ 
		name: 'mariazinha', 
		id:23457, 
		email: 'mariazinhabundadetanajura@gmail.com' 
	} 
];

const res= httpTestingController.expectOne(URL);

// Mudando a response
req.flush(defaultValue);

// Verificando se o método tá certinho
expect(req.request.method).toEqual('GET');
~~~

## - Mod  - : Teste de unidade com mock no component



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28847540?start=0#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/28847806#overview
