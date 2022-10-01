# State com arrays

Mod 12 -- **23/02/22**

O array no state se declara da mesma forma que uma array normal, mas algo interessante de se lembrar é que cada div precisa de uma diferença para carregar somente ela quando ela for atualizada, então lembre sempre de colocar keys em divs geradas.

~~~jsx
import Components from 'react';

class App extends Component {
 
 constructor(){

     this.state = {
        posts = [
            post1 = { id:'1', text: 'Post 1' }
            post2 = { id:'2', text: 'Post 2' }
            post3 = { id:'3', text: 'Post 3' }
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
