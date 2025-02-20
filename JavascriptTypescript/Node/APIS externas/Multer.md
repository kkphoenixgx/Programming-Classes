# Multer
2024-04-10
tags: [[-APIS EXTERNAS]]

O multer é uma API para gerenciarmos de `multipart/form-data`s com node.js, principalmente usado para upload de arquivos. Podemos instala-lo usando:

> `npm install multer --save`

A documentação é muito bem feita e direto ao ponto, então, qualquer dúvida, não fica acanhado. Nela eu achei uma informação bem importante e básica sobre o Multer que não usamos na aula, que é uma forma de dizermos hardcoded o local onde vamos armazenar esses arquivos, na aula, não usamos essa opção, fizemos de outra forma, mas observa que é bem legal:

![[Pasted image 20240410025858.png]]

Além disso, temos diversas funcionalidades:

## Methods

### `diskStorage()`

É o comando que usamos para criar nosso db. Portando, podemos configurar nosso db por meio de diversas funcionalidades

![[Pasted image 20240410025724.png]]

Veja um uso:

```node
const path = require("path");

const storage = multer.diskStorage({
  destination: (req, file, cb)=> {
	  cb(null, "uploads/") // pasta criada na mão no dir
  },
  filename: (req, file, cb)=>{
	  cb(null, file.fieldname+"-"+Date.now()+path.extname(file.originalname))
  }
})
```

Em **destination**, vamos tratar para onde vai os arquivos, podemos perceber os parâmetros: `req`, `file` e `cbfn`, onde `req` é a requisição, `file` é o arquivo que recebemos e `cbfn` é uma função de callback que será executada no middleware.  
falando sobre essa `cbfn`, ela vai receber dois *parâmetros*: *error*  e *destination*, onde error é para quando formos *tratar o erro* da criação desse storage e destination sendo *para onde vai ser mandado esse arquivo*. 

Já em **filename**, vamos tratar o nome do arquivo, para não ter conflitos e dizermos a lógica em que vai acontecer a nomeação. Dessa forma, vamos usar os mesmos parâmetros que em destination, porém, o **segundo parâmetro da nossa função de callback vai ser o nome do arquivo**.

### Criando o Multer

```node
// storage vai ser o nosso disk storage
const update = multer({storage})
```

## Bibliografia

Docs: https://github.com/expressjs/multer/blob/master/doc/README-pt-br.md

https://www.udemy.com/course/nodejs-curso-completo/learn/lecture/18015005#questions
