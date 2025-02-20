# Native Libraries


## React DOM

* `render()`
	Além disso, o jeito de inicializar o react é bem interessante, eles usam um método que recebe tags de jsx (que parece html mas não é)
	```js
	ReactDOM.render(
	  <React.StrictMode>
		<App />
	  </React.StrictMode>,
	  document.getElementById('root')
	);
	```

Quando executamos o método render do ReactDom, aparentemente ele possui dois parâmetros, perceba a vírgula separando os parâmetros da função, o primeiro parâmetro é um componente react e um elemento do dom para renderizar o elemento. E quando você renderiza o html, você tá criando aqueles elementos jsx em html quando rodar o site. E quando você vai ver o javscript do app, você retorna uma function que tem html dentro do return, isso é muito louco.


