# Aula2
1/01/22

## Mod 7 --

Ele deu umas simples dicas de npm, como que existem alguns script dp package.json que podem ser feitos só com npm e o nome do script mas nno geral vamos usar **npm run nomeDoScript** para rodar aqueles scripts já prontos

Já de cara percebo algo muito interessante do react, eles importam com react o arquivo css e no main, temos que importar os arquivos React e as dependências instaladas. Além disso, o jeito de inicializar o react é bem interessante, eles usam um método que recebe tags de jsx (que parece html mas não é):

~~~js
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
~~~

Quando executamos o método render do ReactDom, aparentemente ele possui dois parâmetros, perceba a vírgula separando os parâmetros da função, o primeiro parâmetro é um componente react e um elemento do dom para renderizar o elemento. E quando você renderiza o html, você tá criando aqueles elementos jsx em html quando rodar o site. E quando você vai ver o javscript do app, você retorna uma function que tem html dentro do return, isso é muito louco.

~~~js
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
~~~

Então acompanha comigo, temos um index que puxa e roda via jsx a function do arquivo js e a function do arquivo js, na função, retorna um (); com html, ou seja, em js pelo que eu sei, o (); que faz executar algo, então faz sentido sintático rodar qualquer coisa, então creio que seja por isso os (), então executa pelo () um html, cara isso é no mínimo genial.

![Mindblowing](https://c.tenor.com/tvFWFDXRrmMAAAAd/blow-mind-mind-blown.gif)

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
