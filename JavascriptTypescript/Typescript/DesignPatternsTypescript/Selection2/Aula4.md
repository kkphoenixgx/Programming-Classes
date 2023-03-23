# Aula 4
2023-03-06
tags: [Index design patterns](../Index%20design%20patterns.md)

## - Mod 8 - : O - Open closed principle

> Aberto para a extensão e fechado para modificação

![](../img/OCP-ImageCLass.png)

Alterar a classe A faz a B e a C quebrarem ou precisarem de muidanças;
Implementar sem danificar a estrutura base de A, faz B e C terem mais novas possíveis funcionalidades e não serem danificadas.

É interessante que, caso exijam uda implementação que mude a classe A, crie uma classe D que receba essa funcionalidade, uma nova regra de negócio talvez que encapsule essa nova funcionalidade, como uma API.

No caso de precisar criar "subcategorias", é sempre melhor ter derivados de abstrações, é sempre melhor ter uma classe que deriva várias outras... No caso de um veículo, você cria a abstração veiculo, diz as regras de negócio que todos os veículos vão seguir e cria os veículos. Dessa forma, fica mais fácil para a extensão de novos veículos.

## - Mod 9 - : LSP - Liskov Substitution Principle

> "Uma classe derivada pode ser substituível pela sua classe base"
> Não faça heranças sem sentido

![LSP- class](../img/LSP-%20class.md)

Dois pontos a ser discutido nessa arquitetura:
* Percebe que o IPayment é mais abstrato e mais correta para as regras de negócio? 
	As duas possuem um problema... IPayment deveria ser pai de ICard... Até pela ingeção de dependências, uma mudança em como se paga pelo crédito não pode afetar o Reward, além disso, todo cartão de crédito vai precisar fazer uma consulta na API que pode ser colocada já na interface e entre outras funcionalidades...
* Percebe que faz sentido criar uma abstração? Todos os filhos sabem chamar os métodos do pai, com suas próprias funcionalidades, contudo, sabem. Dessa forma, podemos chamar o mesmo método pela mesma declaração de objeto, mas dependendo do fluxo pode ser chamada como uma instância de uma classe diferente:

~~~ts
// Digamos que já temos nossas classes

function verifyCard() :string{
	/* 
		aqui fazemos a verificação de qual 
		método de pagamento será usado
	*/
}

const card :unknow

switch(verifyCard()){
	case 'credit':
		card = new Card()
		break
	case 'debit':
		card = new Debit()
		break
	case 'reward':
		card = new RewardPayment()
		break
	default :
		throw new Error('Function not implemented')
		break
}

card.verifyPayment()
card.collectPayment()
~~~

Não importa a forma que você vá pagar, como todos os métodos de pagamentos são derivados de um único lugar, todos eles podem fazer o que o pai faz, todos eles têm os métodos: verifyPayment() e collectPayment()

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-design-patterns-typescript/learn/lecture/25114164?start=0#overview