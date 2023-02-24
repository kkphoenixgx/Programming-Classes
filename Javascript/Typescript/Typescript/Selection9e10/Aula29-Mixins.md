# Aula29
2023-02-05
tags: [Index of typescript](../Index%20of%20typescript.md)

## - Mod 56 - : Criando um mixin

Um mixin é uma junção de classes que serão herdadas por uma unica classe. O typescript não permite realizar o extends de multiplas classes, para isso, usamos a técnica dos mixins. Bom, entraremos em tal conceito:

~~~ts
interface ISomeInterface extends classX, classY{}
~~~

Dessa forma, concorda comigo que na classe só haverá um extends? Isso irá enibir o erro de só poder herdar uma classe... Vendo que os developers acharam essa solução, o typescript atendeu as necessidades e implementaram o applyMixins que tá inclusive na documentação do typescript!

~~~ts
export function applyMixins(derivedCtor: any, constructors: any[]) {
	constructors.forEach( (baseCtor) => {    
		Object.getOwnPropertyNames(baseCtor.prototype).forEach( (name) => {      
			 Object.defineProperty(  
					derivedCtor.prototype, 
					name,        
					Object.getOwnPropertyDescriptor(baseCtor.prototype, name) || Object.create(null)      
			 );    
		});  
	});
}
~~~

Dessa forma, devemos usar:

~~~ts
import { applyMixins } from './somePath.ts'

class SomeCLass { constructor( public name: string ){} }
class AnotherClass { constructor( public lastName: string ){} }

class IJustDoNotKnowAnyOtherNames extends IJustDoNotKnowAnyOtherNames { 

	constructor(){
		super();
	}
}

interface IJustDoNotKnowAnyOtherNames extends SomeCLass, AnotherClass {}
applyMixins(IJustDoNotKnowAnyOtherNames, [SomeCLass, AnotherClass])
~~~


-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25831360#overview
https://www.typescriptlang.org/docs/handbook/mixins.html

