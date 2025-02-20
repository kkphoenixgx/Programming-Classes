# Comunicação entre componentes no react

Eu já fiz essa nota no curso de react three fiber, lê aí e se precisar traduzir traduz.

![[Components Communication in React]]

## Organização dos componentes

Componente = é uma **classe com um render()** que retorna jsx ou uma função que retorna jsx

Componentizar = criar componentes para dividir tarefas

* Um padrão muito conhecido é criar uma pasta de componentes, qualquer componente react que retorna jsx, vamos criar o arquivo com a extensão .jsx

* Quando temos um index numa pasta, e usamos um import, não precisamos definir o nome do arquivo, somente a pasta já o chama.

* props = propriedades que passam na tag, todas as propriedades e podemos definir propriedades:

  ~~~js
  <Component prop1 = {something.prop1} title = { something.title } >
  ~~~
  
  Pois na hora que recebemos isso, vamos receber somente 1 prop e podemos acessar essa prop coom props.prop, sendo esse prop o que definimos ali, exemplo, o title:

  ~~~jsx
  /* 
    podemos fazer destructuring logo de cara
      > export const Post = ( {title, prop1} ) =>{
    e assim poderíamos usar diretamente o title
  */
  export const Post = (props) => {
    return (
        <div className="Post">
            <h1> {props.title} </h1>
        </div>
    );
  }

  // devemos entender que podemos retornar o jsx sem o return

  export const Post = (props) => (
    <div className="Post">
        <h1> {props.title} </h1>
    </div>
  );
  ~~~

