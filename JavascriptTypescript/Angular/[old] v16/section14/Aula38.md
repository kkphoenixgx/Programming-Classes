# Aula 38
2023-07-11
tags: [index Angular](index%20Angular.md)

## - Mod 119 - : Teste de Interface com mock no componente 2

A mesma coisa que você faz com o `spyOn()` para o teste unitário ([Aula 37 - `spyOn()`](JavascriptTypescript/Angular/v16/section14/Aula37.md#`spyOn()`)), deve ser feito nos testes de interface, para coletar continuamente os dados e verificar continuamente a interface que está colocando os dados do service na tela...

~~~ts
it('should list data', (done)=>{
	spyOn(service, 'serviceListMethod')and.returnValue(of(defaultValue));

	component.ngOnInit();
	fixute.detectChanges();

	expect(service.list).toHaveBeenCalledWith();

	// exprects da data...
})
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/28848128#overview

