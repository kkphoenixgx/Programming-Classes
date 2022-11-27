# Aula 16
23/02/22

## Mod 16: State com arrays

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