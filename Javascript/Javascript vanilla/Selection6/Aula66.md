# Guardando dados do firebase database

Mod 98 **26/12/21** feito **03/12/21** refeito 08/01/22

## Esclarecimentos pelo atraso

    Tive alguns problemas com bugs no projeto e fui passar o ano novo longe de casa. Então só pude refatorar agora
    Mudou a forma de usar o database, logo tenho que mudar todos os arquivos. E fiquei doente

## Contextualização

Lembrando que eu estou utilizando no meu projeto, diferentemente do projeto do curso de js da udemy, o firestore do firebase, então vou continuar com as explicações referentes ao que eu fiz e ao que eu aprendi fazendo o projeto com firestore.

Então usando os módulos importados, com o CDN do firebase, como explicado na [Aula65.md](./Aula65.md), podemos guardar dados no firebase de forma bem simples

## Guardando dados no firebase

Podemos importar o módulo **collection('collectionName', app)** para referenciar ao db e a coluna, então depois podemos importar o **addDoc(collection, jsonFile)** sendo collection uma variável contendo o resultado da função collection e o jsonFile o arquivo json que você quer mandar para o banco de dados.

    ~~~javascript
    // Isso serve para inicializar o app
    import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.1/firebase-app.js";
    // Isso serve para importar o Banco de dados em si pelo getFirestore
    // Para poder referenciar uma collection com o collection
    // para adicionar um documento ao firebase com o addDoc
    import { getFirestore, collection, addDoc} from "https://www.gstatic.com/firebasejs/9.6.1/firebase-firestore.js";

    const firebaseconfig = "Aqui você passa o seu json de configuração"
    const app = initializeApp(firebaseConfig);
    const db = getFirestore(app);

    const FilesRef = collection(db, 'O nome da coluna do firebase');

    // no caso aqui eu criei uma function que eu vou exportar
    export function addToFirestoreDB(fileJson, Reference){
        addDoc(Reference, fileJson);
    }

    // mas por via das dúvidas, você chamaria a função normalmente assim
    addDoc(collection(filesRef, "seu arquivo .json")
    ~~~
