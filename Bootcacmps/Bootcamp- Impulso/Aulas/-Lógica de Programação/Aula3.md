# Mods 4 e 5 -- **01/03/22**

## Tomadas de decisão e expressões - Mod 4

Metacognição = pensar como você pensa  
Abstração = Generalizar ao máximo um conceito

~~~js
let notes = [5, 7, 10, 3]
let notesSum = 0;

notes.forEach(element => {
    notesSum = notesSum + element
})

let media = notesSum / notes.length 
console.log(media)
~~~

## Como usar concatenação

**Concatenação** = junção de uma string com outra variável

~~~js
let nome = 'Kauã'
let sobrenome = 'Alves'
let NomeCompleto = nome + sobrenome

console.log(NomeCompleto)
~~~

Importante dizer que a concatenação muitas vezes pode ser feita não com +, que é o caso so js acima, algumas linguagens usa **&&** ou **.** para concatenar

~~~js
let notes = [5, 7, 10, 3]
let notesSum = 0;
let nome = Kauã

notes.forEach(element => {
    notesSum = notesSum + element
})

let media = notesSum / notes.length 
console.log('A média do aluno' + nome + 'é' + media)
~~~
