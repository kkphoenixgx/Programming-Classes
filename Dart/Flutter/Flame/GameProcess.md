# Game Process
2023-06-10
tags: [indexFlame](indexFlame.md)

## Game Loop

The game loop is the heart of the app, is where things get live. In na nutshell, is a infinite loop which continuously runs through simple steps, update the game state and create more game states, to flame engine, you run 30 to 60 fps

![](-img/Pasted%20image%2020230610153156.png)


## Game Instantiation 

That is the path to run your code:

![](-img/Pasted%20image%2020230610153633.png)

## Game Lifecycle

The game Loop will re-render every 𝚫t, so if you have a 𝚫t = 6, the game will re-render every 6s with a precisely of microseconds.

![](-img/Pasted%20image%2020230610154409.png)

When we override some functions that are essencial to run the app, exemple:

~~~dart
import 'package:flutter/material.dart';

class someClass extends FlameGame{
	@override
	Future<void>? onLoad(){
		print("<gameLoop> onLoad() called");
		return super.onLoad();
	}

	@override
	void update(double dt){
		super.update(dt);
		print('<gameLoop> update method called');
	}

	void render(Canvas canvas){
		super.render(canvas);
	
		print('<gameLoop> render method called');
	}

}
~~~


