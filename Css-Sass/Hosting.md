# Hosting
2024-08-19
tags: [[-Index Css-Sass]]

Você pode fazer a relação "`parent child{}`" do css por escopos:

Relativo do CSS:  
```css
parent{
	display: flex;
}

parent chhild{
	display:grid;
}
```

SCSS:  
```scss
parent{
	display: flex;
	
	child{
		display:grid;
	}

}
```

Você também pode usar o operador `&` que vai repetir o query até o escopo atual, para que você consiga usar pseudo-classes, que não tem o espaço entre os parentes.

```scss
parent{
	display: flex;
	
	child{
		display:grid;

		&:last-child{
			display: block;
		}
	}

}
```
