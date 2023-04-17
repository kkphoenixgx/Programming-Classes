mod 47                                             07/09/21

- Atualizando estatísticas usando dataSet 

* O nome usado para quando se transfere um objeto para string
é [serialização]. Isso é muito usado para não perder dados
e manipular dados.

Em dataSet isso é muito utilizado, até por que o data- só
guarda strings no html, uma forma de fazer isso é usando
a api do json JSON.stringify(x), sendo x o objeto para se
transformar em string e para transformar a string do objeto
em objeto de volta é o JSON.parse(x), sendo x a string 
serializada

Assim como na ultima aula usamos o parentElement, que é um 
atributo da tag html, nessa usamos o children, que é um 
elemento que vê os elementos filhos do selecionado e entrega 
em uma coleção. 
