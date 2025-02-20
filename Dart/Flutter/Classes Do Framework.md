# Classes Do Framework
2023-06-11
tags: [indexFlutter](indexFlutter.md)

* **Canvas** 
	> `package:flutter/material.dart`
	
	É uma Classe que vai lidar com o canvas do app. Nas coisas que vão acontecer no app
	
	* **drawPaint(Paint  color)** : Pode pintar o canvas com uma cor definida pela classe Paint.
* **Paint**: 
	> `package:flutter/material.dart`
	
	Ao usar o Flutter, você geralmente instancia um objeto `Paint()` e configura suas propriedades, como cor, estilo de preenchimento, estilo de traçado, espessura do traçado, entre outros. Em seguida, você utiliza esse objeto `Paint` para desenhar no `Canvas`, aplicando-o a operações de desenho, como desenho de formas geométricas ou texto.
	~~~dart
	Paint paint = Paint()
		..color = Colors.blue
		..strokeWidth = 2.0
		..style = PaintingStyle.fill;
	
	// Usando o objeto Paint para desenhar um círculo
	canvas.drawCircle(Offset(size.width/2, size.height/2), 50, paint);
	~~~
	