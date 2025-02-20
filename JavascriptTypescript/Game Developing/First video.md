# Aula 1

```js
// Animation loop
  const game = new Game(canvas.width, canvas.heigth);
  
  function animate(){

    ctx.clearRect(0, 0, canvas.width, canvas.heigth);

    game.update();
    game.draw(ctx);

    requestAnimationFrame(animate);
  }

  animate();
```