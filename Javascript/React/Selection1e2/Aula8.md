# Lifecycle methods parte 2

mod 17 - **15/03/22**

* Data fetching = pegar dados de outro lugar

* Tem um site muito interessante, que é o json placeholder que ele dá dados para você testar seus componentes sem as APIS

Então para fazermos um data fetching, nesse caso vamos usar a fath API do js mesmo e vamos fazer isso num método separado já que temos que manter clean code. Mas o mais importante de tirar desse esse exemplo, é que estamos usando o método de LifeCycle **ComponentDidMount()** que é quando o componente for renderizado, como explicado na última aula.

Então muito importante também é sacar a forma que ele fez isso, dentro do método que tava fazendo o data fetching, ele fez uma estrutura bem limpa respeitando os conceitos de async await, dê uma olhada em qão simples e bem feito isso é:

~~~jsx
import Components from 'react';

class App extends Component {
 
 constructor(){

     this.state = {
        posts = []
     }

 }

 componentDidMount(){
    this.loadPosts();
 }


loadPosts = async ()=> {

    const postResponse = fetch('http://jsonplaceholder.typicode.com/posts')
    const photosResponse = fetch('http://jsonplaceholder.typicode.com/photos')

    const [posts, photos] = await Promise.all([postResponse, photosResponse]);
    
    const postsJson = await posts.json();
    const photosJson = await photos.json();

    const postsAndPhotos = postsJson.map( (post, index)=> {
        return {...photos, cover: photosJson[index].url}
    })

    this.setState( { posts: postsAndPhotos } );
}

// ---- METHODS ----

    render(){
        const {posts} = this.state;

        return (


            <section className='container'>
                <div className='posts'>
                    {posts.map(  (post) => (
                        <img src={post.cover} alt={post.title}/>

                        <div key={post.id} className = 'post-content'>
                            <h1> {post.title} </h1> 
                            <p> {post.text} </p>
                        </div>
                    ))}
                </div>
            </section>

        )
    }

}
~~~

A simplicidade da qual é feita o fetch com o await me impressiona, é lindo ver esse código:

~~~js
    const postResponse = fetch('http://jsonplaceholder.typicode.com/posts')
    const photosResponse = fetch('http://jsonplaceholder.typicode.com/photos')

    const [posts, photos] = await Promise.all([postResponse, photosResponse]);
    
    const postsJson = await posts.json();
    const photosJson = await photos.json();

    const postsAndPhotos = postsJson.map( (post, index)=> {
        return {...photos, cover: photosJson[index].url}
    })

    this.setState( { posts: postsAndPhotos } );
~~~

E na parte do css ele encina coisas básicas do css e de certa forma, coisas bem legais:

~~~css
.container{
    min-height: 100vh;
    max-width: 1200px;
    margin: 0 auto;
    background: #eee;
    padding: 25px;
}

.posts{
    display: grid;
    
    /* 
        Isso vai fazer as colunas ficarem flexíveis, 
      sempre vai dar auto-fil e com o minmax, que inclusive
      é uma funcionalidade nova para mim vai ser sempre o 
      mínimo de 280px e o máximo de 1fr 
    */
    
    grid-template-columns: repeat(auto-fil, minmax(280px, 1fr));
    gap: 30px;
}

.post{
    background: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    transition: transform 100ms easy-in-out;
}
.post:hover{
    scale(1.05)
}

.post img{
    max-width: 100%;
}

.post-content{
    padding: 30px;
}

~~~
