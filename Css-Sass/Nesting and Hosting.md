# Hosting
2024-08-19
tags: [[🎨 -indexSaasCss]]

You can use "`parent child{}`" relation of css too. However, SCSS has it own way of writing relations, with nesting, take a look:

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

## `&` Operator

The `&` operator allow us to call the entire relation to the point of the scope:

```scss
parent{
	display: flex;
	
	child{
		display:grid;
		
		// equivalent to parent child:last-child
		&:last-child{
			display: block;
		}
	}

}
```
