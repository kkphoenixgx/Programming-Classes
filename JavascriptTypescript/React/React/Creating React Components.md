# Criando Componentes React

* Componentes começam com letra maiúscula, faz sentido já que eles são executáveis de objetos html.
* Na realidade, os parenteses sempre são usados em js quando queremos retornar mais de uma linha.
* O que tá escrito fora de {} é executável como texto e o que tá dentro como js.
* só podemos retornar um elemento, um elemento root, que seria o elemento pai de todos, só podemos retornar um elemento root.
* caso você queira colocar mais de um elemento root, podemos usar uma tag sem nada do react:
  ~~~js
  import logo from './logo.svg';
  import './App.css';

  function App() {
    return (
        <>
        <div>Aqui vai funcionar</div>
        <div>E aqui também</div>
        </>
    );
  }

  export default App;
  ~~~

* essa div <></> não gera na página.

## Tipos de componente anteriormente

* Componentes de função *sem estado* "**stateless components**"
* Componentes de classe *com estado* "**stateful components**"

Usando hooks podemos, hoje em dia, criar componentes de qualquer forma, então essa diferenciação, mesmo que exista, hoje em dia, não faz tanta diferença assim.


## Statefull Components

* Existe um construtor no react, com classes stateful que recebem props
* Em desestruturação, em js puro, podemos encapsular em x uma variável x de um objeto y fazendo simplesmente let {x} = y, isso é a mesma coisa que x = y.x

No react, existem eventos sintéticos que facilitam muito a vida na hora de programar, exemplo, existe um event onClick que faz exatamente uma função que quando clicar nessa div em questão, faça essa função, isso faz as coisas serem tão mais simples, pois nem precisamos ir para o cliente com js, para criarmos um clint-side brilhantemente lindo
  
~~~jsx
<p onClick={ ()=>{console.log("click")} }>
    Hello, click on me
</p>
~~~

E como estamos citando um stateful component, estamos falando de um componente que tem classe, então o mais comum, é que você crie um método e chamar o método na classe.

* Tanto no js quanto no react, utilizamos super quando queremos nos referênciar as props do elemeno pai. Portanto, **o super(props) carrega os elementos do Component**

~~~jsx
class App extends Component{

    constructor(){
        this.logEvent = this.logEvent.bind(this)
        this.state = {
            h1Text: "Hey"
            justAnAddition: "this is like me, useless, haha :)"
        }
        
    }
    
    logEvent(){
        let justAnAddiction = this.state.justAnAddiction
        console.log(`uhu, mario time, send a massage ${justAnAddition}`)
    }

    main(){

        h1Text =  this.state.h1Text

        return (
            <h1 onClick={ this.logEvent() } > { h1Text } </h1>
        )
    }

}
~~~

Ok, então vamos entender isso, veja que o meu h1 possuí um onClick que vai fazer o logEvent() da minha classe e no meu construtor, tem o state da minha classe que é um objeto e para eu usar this no meu logEvent, eu precisei usar o método bind que existe no meu método nativo por padrão, então eu no meu construtor, adicionei o bind a minha classe.  
Mas vamos dizer que eu quero mudar o h1 na minha tela, mudar o Hey dele para *YOU CLICKED ON ME, YOU BOZO* aí nós não podemos simplesmente mudar no onClick o h1Text, para isso, temos que usar o método setState.

~~~jsx
class App extends component{

    constructor(){
        super(props)
        this.logEvent = this.logEvent.bind(this)
        this.state = {
            h1Text: "Hey"
            justAnAddition: "this is like me, useless, haha :)"
        }
        
    }
    
    logEvent(){
        let justAnAddiction = this.state.justAnAddiction
        console.log(`uhu, mario time, send a massage ${justAnAddition}`)
        this.state({ h1Text: "YOU CLICKED ON ME, YOU BOZO" });
    }

    main(){

        h1Text =  this.state.h1Text

        return (
            <div className="App">
              <h1 onClick={ this.logEvent() } > { h1Text } </h1>
            <div>
        )
    }

}
~~~

Isso vai mudar a tela e toda vez que fizermos uma mudança no state do site, o main vai ser renderizado novamente

Mas você não acha que quando criamos o bind puxando o this é uma inconveniência muito grande? Cara, para isso ão precisar acontecer, podemos usar uma arrow-function para não precisar fazer o bind, isso transformaria o código:

~~~jsx
class App extends Component{

    constructor(){
        super(props)
        this.state = { h1Text:'Hi' }
    }

    changeH1() = ()=>{
        this.state.h1Text = "YOU CLICKED ON ME, YOU BOZO"
    }

    render(){
        let {h1Text} = this.state

        return (
            <>
                <h1 onClick={this.changeH1}>
                    {h1Text}
                </h1>
            </>
        )
    }
}
~~~

E o interessante é eu podemos fazer com essa arrow function, coisas muito legais, exemplo, podemos passar o event no parâmetro e no método da stateful, podemos usar um event.preventDefault, como no js no lado do client

~~~jsx
class App extends Component{

    /* 
      Tem como simplesmente tirar o constructor 
      e esses fields vão automaticamente virar públicos,
      isso diminuiria o código, mas por fins didáticos,
      vou usar o constructor
    */
    constructor(){
        super(props);
        this.state = { h1Text:'Hi' }
    }

    changeH1() = (event)=>{
        // nisso eu estou prevenindo de ir ao index.html
        event.preventDefault();
        this.state.h1Text = "YOU CLICKED ON ME, YOU BOZO";
    }

    render(){
        let {h1Text} = this.state

        return (
            <>
              <a href= './index.html' onClick= {this.changeH1}> 
                  {h1Text}
              </a>
            </>
        )
    }
}
~~~

### State com arrays

O array no state se declara da mesma forma que uma array normal, mas algo interessante de se lembrar é que cada div precisa de uma diferença para carregar somente ela quando ela for atualizada, então lembre sempre de colocar keys em divs geradas: 
~~~jsx
<div key={post.id} > </div>
~~~

~~~jsx
import Components from 'react';

class App extends Component {
 
 constructor(){

     this.state = {
        posts = [
            post1 = { id:'1', text: 'Post 1', body: 'O corpo do elemento 1'}
            post2 = { id:'2', text: 'Post 2', body: 'O corpo do elemento 2' }
            post3 = { id:'3', text: 'Post 3', body: 'O corpo do elemento 3' }
        ]
     }

 }
    render(){
        const {posts} = this.state;

        return (
            <div className="App">
            {posts.map(  (post) => ( <h1 key={post.id}> {post.text} </h1> )  )}
            </div>
        )
    }
}
~~~

Renota do dia 05/10/22: 

Para usarmos qualquer coisa em jsx, precisamos de um elemento pai. Portanto, para retornar mais de um elemento naquele map da div App, precisamos de um elemento pai.

~~~jsx
render(){
	const {posts} = this.state;

	return (
			<div className="App">
				{posts.map(  (post) => ( 
				
					<div key={post.id}>
					
						<h1> {post.text} </h1>
						<p> {post.body} </p>
						
					<div/>
					
				)  )}
			</div>
	)
}
~~~

## Bibliografia

https://www.udemy.com/course/curso-de-reactjs-nextjs-completo-do-basico-ao-avancado/learn/lecture/24887494#overview

* Props
https://overreacted.io/pt-br/why-do-we-write-super-props/#:~:text=No%20JavaScript%2C%20o%20super%20refere,tenha%20chamado%20o%20construtor%20pai

