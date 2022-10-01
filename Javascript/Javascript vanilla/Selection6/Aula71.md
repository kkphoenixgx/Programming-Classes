# Módulos 103 e 104

Mod 103 e 104 -- **12/01/22** até **15/01/22**

NA MORAL QUE DOR DE CABEÇA FAZER ESSAS AULAS EM, NOSSA MANO, 3 DIAS PARA FAZER UMA CONEXÃO COM O FIRESTORE E DELETAR O HASH DO DIRETÓRIO, que bagulho maneiro, mas muito trabalhoso, uma dica para todos as desenvolvedores de plantão, as vezes, lidando com api, a melhor coisa é finalizar o job no console, fechar o chrome e tentar de novo se a promise fizer sentido mas está pendente para sempre.

Tudo bem, vamos aos principais pontos, tive que refatorar a parte de upload, e dar função, tanto ao rename, quanto para o delete, então vamos ao que aprendi por partes:

## Editando arquivos no firebase firestore

Para editar arquivos no firebase, usamos uma função chamada de updateDoc, que pode ser importada pelo cdn padrão:

~~~js
import { getFirestore, collection, doc, updateDoc,} from "https://www.gstatic.com/firebasejs/9.6.1/firebase-firestore.js";
~~~

Para executar essa função vamos precisar do método doc também do cdn para podermos referenciar o arquivo e vamos precisar do arquivo json que vamos mandar para o db, então vamos simplificar dessa maneira:

~~~js
import { getFirestore, collection, doc, updateDoc} from "https://www.gstatic.com/firebasejs/9.6.1/firebase-firestore.js";

// firebase config sendo a constante que já vem com os dados do seu firebase
const app = initializeApp(firebaseConfig);
const DB = getFirestore(app);

let reference = 'nome da sua collection'
let id = 'id do arquivo'

let FileReference = doc(DB, reference, id);

// a método update doc retorna uma promise
updateDoc(FileReference, itemChanged)
  .then(() =>{
      console.log('Document updated')
  })
  .catch(err => {console.error});
~~~

## Criando campos a mais no firebase firestore

Muito bem, enquanto estava criando funcionalidade para o btn rename, tive um problema um tanto quanto chato para lidar, eu queria guardar o campo originalFilename do db e renomear o arquivo para aparecer na tela o nome renomeado, no inicio dos bugs, eu pensei que renomear o campo não era possível pois estava criando uma pasta de item changed, mas na realidade, o que tava acontecendo é que eu tava colocando meu json dentro de { } e isso tava criando uma 'pasta' nos itens, já que eu tava colocando o campo renomeado dentro de um campo novo, então eu estava tentando criar uma nova propriedade para aparecer o nome já renomeado no meu clone do Dropbox.
Então para criar uma propriedade nova, eu fiz a minha função que estava consumindo a rota da api retornar a promise com o objeto então eu **peguei o objeto e adicionei a propriedade antes de enviar para o banco**, que estava usando o addToFirestoreDB(), que eu expliquei na [Aula66](./Aula66.md) então eu só mandei para o banco depois o objeto.

~~~js
//na rota padrão

functionDaApI()
.then( fileJson => {
    fileJson.files['input-file'].name = fileJson.files['input-file'].originalFilename;
    resolve(fileJson)
})
.catch(  err => { reject(err); }  );

// depois: 
uploadFiles(event.target.files)
.then(responses => {
    if(!responses) return
    responses.forEach( response => {
        // let file = JSON.stringify(response.files['input-file'])
        let file = response.files['input-file']
        addToFirestoreDB(file, FilesRef)
        .then(console.log('Added to Firestore'))
        .catch(error => { 
            this.UploadFinished();
            console.error(error);
        });
    });
// no meu app eu fiz o catch mas eu não vejo necessidade de mostrar
~~~

## Deletando arquivos do firebase firestore

Para deletar itens do firebase firestore, vamos usar uma function importada também do cdn padrão chamada de deleteDoc() e ela recebe uma referencia de arquivo, que para conseguirmos, vamos precisar usar o doc() que é um método que também conseguimos do cdn padrão, então ficaria assim:

~~~js
import { getFirestore, collection, doc, deleteDoc} from "https://www.gstatic.com/firebasejs/9.6.1/firebase-firestore.js";

// firebase config sendo a constante que já vem com os dados do seu firebase
const app = initializeApp(firebaseConfig);
const DB = getFirestore(app);

let reference = 'nome da sua collection'
let id = 'id do arquivo'

let FileReference = doc(DB, reference, id);

// a método deleteDoc doc retorna uma promise
deleteDoc(FileReference)
  .then(() =>{
      console.log('Document deleted')
  })
  .catch(err => {console.error});
~~~
