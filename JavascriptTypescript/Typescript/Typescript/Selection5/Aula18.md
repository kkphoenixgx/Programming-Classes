# Aula18
2022-10-20
tags: [[../Index of typescript]]

## - Mod 35 - Entendendo interfaces:

O extend de interfaces é bem simples de fazer e tem uma função bem lógica, extender a interface como num sistema de herança

~~~ts
interface IPerson {
	name: string
	adress: string
}

interface IClient extends IPerson{
	username: string
	password: string
	email: string
	id: number
}

const kkphoenix: ICLient{
	"username": "kkphoenix"
	"name": "Kauã Alves"
	"password": 1234567
	"email": "someEmail@mamaco.com"
	"adress": "some place"
	"id": 1
}

~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/24772618?start=6#overview

## Mapa Mental