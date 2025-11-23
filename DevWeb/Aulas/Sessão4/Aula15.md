# jQuery Selectors
[index](DevWeb/index.md)

Mod 34 -- **10/08/21**

Bom, nessa aula teve uns pontos muito legais, como a mudança da cor e o transition, que foram simplesmente muito legais, pelo visto o $ é sim repetido, mas quando vou trabalhar com pontos do html, devo usar esses seletores com $(x), sendo x que você quer selecionar entre aspas usando seletor css mesmo.

E já trabalhando com o jQuery, aprendi métodos:

* **on("x" , f)** : x = nome do evento, f a função a ser adicionada
* **addClass("x")** : x = nome da classe a ser adicionada.
* **removeClass("x")** : x = nome da classe;

Uma coisa muito importante a ser notada é que para usar notada é que no css para só adicionar coisas quando o selecionado tiver uma classe é só colocar .x, sendo x o nome da classe e colocar sem espaço entre o selecionado e a class nova.

agora vamos a coisas que eu entendi melhor ou aprendi de vez no processo:

## atributos css

* **transition**: que basicamente faz as coisas demorarem ou acontecerem gradualmente durante um determinado tempo:   Ex: transition: 1s;

**transition-duration**: que é quanto tempo vai durar a transição.

**transition-time-function:** que é como a transição vai progredir no tempo. Aceita os valores **linear**, **ease-out**, **ease-in**, **ease** e uma função personalizada através da **cubic-bezier()**  
(essa propriedade também pode ser omitida e seu valor default é ease).

* evento js:
  * **blur:** é como o focus, mas para quando perde o focus, ou seja, quando o usuário não está focando o objeto.
