# Factory Method
2024-02-01
tags: [[-Index design patterns]] #criacional

Lembrando que classes abstratas são classes que só podem ser herdadas e não instanciadas

## O problema

![[Pasted image 20240201112302.png]]

Bom, como descrito na imagem, usamos um Factory Method quando precisamos criar vários tipos de objetos que precisam ser padronizados e com uma boa manutenção, quando você precisa de alguém para controlar os objetos. [exemplo](https://github.com/kkphoenixgx/Estudos/blob/master/Conceitos/Software/Padr%C3%B5es%20de%20projeto.md). 

## Solucionando

![[Pasted image 20241030162138.png]]

Veja os arquivos para não se perder:

![[Pasted image 20241030164719.png]]

Agora vamos a implementação das classes:

* **Interface**: 

```ts
export default interface IVehicle{
	startRoute() :void;
	getCargo() :void;
}
```

* **Classe abstrata**

```ts
export default abstract class Transport{

	startTransport() :void{
		const vehicle = this.createTransport();
		vehicle.startRoute();
	}

	protected abstract createTransport() :IVehicle{}

}
```

* **Implementações**:

```ts
export default class Car implements IVehicle{
	startRoute() :void{
		this.getCargo();
		console.log("iniciando trajeto");
	}

	getCargo() :void{
		console.log("Passageiros pegos");
	}

}
```

```ts
export default class Motorcycle implements IVehicle{
	startRoute() :void{
		this.getCargo();
		console.log("iniciando entrega");
	}

	getCargo() :void{
		console.log("Comida pega");
	}

}
```

* **Implementações da herança**

```ts
export default class CarTransport extends Transport {

	protected createTransport() :Ivehicle{
		return new Car();
	}

}
```

```ts
export default class MotorcycleTransport extends Transport {

	protected createTransport() :Ivehicle{
		return new Motorcycle();
	}

}
```


Agora olha como implementamos isso na main:

![[Pasted image 20241030165323.png]]
