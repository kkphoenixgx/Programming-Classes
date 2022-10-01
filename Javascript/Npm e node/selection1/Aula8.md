# Blocking vs non blocking

Mod 12 -- **18/11/21**

Single treat = É quando uma linguagem trabalha numa rota Única, como o javascript, compilando o código de cima para baixo, tendo uma relação.

Porém o node tem um método bem útil que é o event loop que faz várias coisas ao mesmo tempo e isso entra em um conceito chamado "conexão bloqueante" ou blocking

---
> **blocking** = gera uma fila.  
---  
> **non blocking** = aproveita uma fila para fazer tudo e ele pode usar libs nativas para fazer essas operações.
---

Usando a palavra chave sync no nodejs rodamos o conceito com o conceito blocking e quando não fizermos isso, poderemos rodar o segundo arquivo.

**Nota simples**: relação síncrona e assíncrona não fala sobre as treats, ele fala sobre requisição, quando o user require ou não algo, então um comando pode ser assincrono(ou sincrono) e blocking(ou non blocking);

---

## Notas de conceitos usados nas aulas

Requirindo a biblioteca fs do node com um require podemos usar essa biblioteca para manipulações de arquivos, isso não foi muito bem explicado nessa aula, porém podemos usar os métodos dessa biblioteca:

* **fs.readingFileSync("caminho de um arquivo")** = esse método do fs lê um arquivo

## Comandos de terminal

E para criarmos um arquivo para ler o professor usou outro conceito bem simples do console mas parece muito legal, para criar um arquivo no console:

O **echo** é um comando para escrever dentro do arquivo algo.
e usando ">" queremos colocar dentro de algo algo e se não temos um arquivo, vamos criar ele. Então:

> echo "a simple haha" > haha.txt

Vai criar um arquivo txt escrito haha.

veja o arquivo [fs-sync.js](https://github.com/kkphoenixgx/Nodejs-Course/blob/master/Projetos/arquivosSoltos/fs-sync.js) para entender o uso de non blocking e blocking na prática e aqui vai um guia para entender os métodos tirados do meu [dicionário (～￣▽￣)～](https://github.com/kkphoenixgx/Nodejs-Course/blob/master/Aulas/dicionario.md):

* **fs** = file system = ele pode ler manipular pastas e arquivos.
  * fs.readFile(Sync)(arquivo, (callBack)) = Ele lê um arquivo e se você quiser, lembrando que pode ser Sync ou não Sync, por isso o parenteses e o parenteses no callBack, porque se for Sync precisa do call back dizendo o que fazer enquanto está rodando esse carinha, coloca numa variável, por exemplo, se você dizer que a var = essaFn. *O buffer(tamanho limite) desse read é de 2gb*.

* **process.hrtime()[0]**:  
Isso pega o horario em milissegundos.
