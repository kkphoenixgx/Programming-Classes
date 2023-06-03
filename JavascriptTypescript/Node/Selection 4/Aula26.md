# Aula 26
2023-06-03
tags: [Index node](../Index%20node.md)

## - Mod 35 - : Buffer - manipulando dados binários

Com essa API nativa do node, podemos manipular binários, podemos colocar binários nesse buffer e manipular a informação de forma que fica fácil utilizar binário, podemos por exemplo, converter um texto para binário e traduzir do binário para outras línguas.
E para o buffer, temos alguns métodos muito interessantes, podemos citar aqui o `Buffer.isBuffer(x)` para saber se x é um buffer ou não e têm vários outros métodos simples que ajudam nessa manipulação, o importante aqui é saber que existe esse módulo nativo para necessidades futuras.
<p style="display:flex; justify-content: end" > <i>Exemplos e descrições do ~chatgpt </i></p>
1. `Buffer.alloc(size[, fill[, encoding]])`: Cria um novo buffer de tamanho fixo, preenchido com zeros ou com o valor especificado em "fill".

Exemplo:

~~~javascript
const buf = Buffer.alloc(5); // Cria um buffer de 5 bytes preenchido com zeros 

console.log(buf); // <Buffer 00 00 00 00 00>
~~~

2. `Buffer.from(array)`: Cria um novo buffer a partir de um array de valores numéricos ou uma string.

É importante dizer que ao criar um novo buffer e colocar ele na tela, você vai receber uma tag com o binário em hexadecimal, não o binário completo e dá até para usar um buff.toString() e converter de volta, dá até para passar para caractere asiático passando o encoding deea (utf16le) como parâmetro

Exemplo:

~~~javascript
const buf = Buffer.from([0x62, 0x75, 0x66, 0x66, 0x65, 0x72]); // Cria um buffer a partir de um array de valores

console.log(buf); // <Buffer 62 75 66 66 65 72>
~~~

3. `Buffer.from(string[, encoding])`: Cria um novo buffer a partir de uma string.

Exemplo:

~~~javascript
const buf = Buffer.from('Olá, mundo!', 'utf8'); // Cria um buffer a partir de uma string usando a codificação UTF-8 

console.log(buf); // <Buffer 4f 6c c3 a1 2c 20 6d 75 6e 64 6f 21>
~~~

4. `Buffer.byteLength(string[, encoding])`: Retorna o número de bytes que a string ocuparia em uma codificação específica.

Exemplo:

~~~javascript
const len = Buffer.byteLength('Olá, mundo!', 'utf8'); // Retorna o número de bytes da string usando a codificação UTF-8 

console.log(len); // 13
~~~

5. `buf.toString([encoding[, start[, end]]])`: Converte o buffer em uma string.

Exemplo:

~~~javascript
const buf = Buffer.from([0x48, 0x65, 0x6c, 0x6c, 0x6f]); // Cria um buffer a partir de um array de valores 
const str = buf.toString('utf8'); // Converte o buffer em uma string usando a codificação UTF-8 

console.log(str); // 'Hello'`
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/nodejs-curso-completo/learn/lecture/16743096#questions