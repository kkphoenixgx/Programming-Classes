# Aula19
2023-02-01
tags:  [index Angular](../index%20Angular.md)

## - Mod 59 - : Observable + http-put e delete

Bem parecido com o get e o post, o **put** é para **editar informações**, usamos ele no fake-server apenas com o */id* do campo editado e o que vamos mudar do objeto

~~~ts
// Edit

menthodEdit(id :number, data :string) :Observable<{name :string}>{
		return this.http.put< {name: string} >(`${this._url}serverResponse/${id}`,{ name: data }).pipe(
			response => response,
			error    => error
		)
}

// Delete
menthodEdit(id :number, data :string) :Observable<{name :string}>{
		return this.http.delete< {name: string} >(`${this._url}serverResponse/${id}`).pipe(
			response => response,
			error    => error
		)
}
	
~~~

## - Mod 60 - : Http custom header

![](../img/Pasted%20image%2020230201224704.png)

Para criar um header, podemos usar o código acima e chama-lo na hora de fazer a requisição por método:

![](../img/Pasted%20image%2020230201225309.png)



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570482#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25570486#overview