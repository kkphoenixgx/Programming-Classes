# Adicionando firebase database realtime a aplicações web

Mod 96 -- **16/12/21**

Firebase é um banco de dados e uma série de aplicações online que tem a benção do google, que é de fato muito bom e muito fácil de implementar mas difícil de entender pela primeira vez todo o processo confuso, então vamos por partes, primeiro precisamos criar uma conta, depois instalar o firestore, depois criar um app no firestore aplicar o collections no cdn do projeto para podermos realizar as operações básicas desse banco.

## Falando mais sobre o firebase e processo de criar conta

O firebase tem uma série de planos, até uma certa quantidade de dados ele não te cobra nada com o plano base e é ótimo para entender e estudar todo o firebase, não tenha medo de criar a conta do firebase, só gasta grana quando você usar de fato, mas é a conta do firebase, toma cuidado para não criar conta no cloud, eu não sei o que acontece se criar, mas ficou com cara de empresa incrível que é boa mas quer arrancar meu dinheiro também, aí eu sai '-', então por vias das dúvidas não cometa esse possível erro.

Para a criação de projeto, já no painel de [console do firebase](https://console.firebase.google.com/), adicionado a conta google, você deve fazer o que todo mortal já pesquisou no yt, clicar para inicializar com o database um projeto (Lado direito), colocar o nome, voltar para a tela inicial, clicar no ícone **</>** da tela inicial para adicionar o projeto e se deparar com três opções, uma que ninguém sabe o que é. a ultima, se você sabe me pergunto o que você tá fazendo lendo meu repositório por diversão, a do meio para adicionar no script, o que se você for fazer, é o mais simples e o mais fácil, mas coloca como método e inicializa ele dentro do js. n faz isso com uma tar script PELO AMOR DE SANTO DEUX, se você não acredita, troca para .... sla, destino, n sei porquê tô escrevendo sobre isso. Agora se você é doente de npm igual a mim e quer fazer com essa ferramenta linda porque já tá usando, prepara a bunda e senta que lá vem história.

![senta](../img/senta-que.gif)

## Instalando o firebase

Voce pode entrar em firebase.google.com, ou clica [aquiSenhorNissoAquiEscritoEmCamelCase](https://firebase.google.com/) e clicar em ir para console, nisso você pode configurar um novo projeto. E na página principal, ir em develop -> database -> firestore database

modo bloqueado = banco de dados privado  
modo de teste = banco de dados público

Mas vamos lá, por que pelo menos para descobrir como faz isso com o npm, eu demorei anos, se você entende ingles, tem um tutorial deep das interweb que eu encontrei [aqui](https://www.youtube.com/watch?v=qbxj_36UkWs) para preparar o ambiente, porém esse procedimento acontece somente quando já possuímos o **firebase-tools** e logamos nele, para baixar o firebase tools é só escrever **npm install -g firebase-tolls** e para baixar o firebase **npm install firebase** e loga com a sua conta do google usando **firebase login no console**, após isso podemos seguir a ordem do vídeo que fica tudo certo. Você faz um firebase init e seguir a inicialização base, isso vai gerar para você um .json com um objeto json. e você cola também o do cdn, porque o setup com npm dá muito erro 👍 e eu não consegui fazer, vocês podem até tentar, eu sei que tem um vídeo da própria google explicando como cria, mas eu sinceramente nem vi o vídeo, pois com cdn é mais fácil. Essa é a instalação do firebase

### Projeto com cdn

É bom entender que precisamos em um projeto real, criar uma ingeção de dependência em nossos projetos, então do módulo que você criou do firebase uma função que só vai ter um trabalho, inicializar o firebase, isso vai ajudar MUITO.

~~~js
// Import the functions you need from the SDKs you need
import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.1/firebase-app.js";
import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.6.1/firebase-analytics.js";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
export function firebaseStart(){
    // Coloca aqui suas informações
    const firebaseApp = initializeApp({
        apiKey: '### FIREBASE API KEY ###',
        authDomain: '### FIREBASE AUTH DOMAIN ###',
        projectId: '### CLOUD FIRESTORE PROJECT ID ###'
    });
    // Initialize Firebase
    const app = initializeApp(firebaseConfig);
}
export const analytics = getAnalytics(app);
~~~

## Diferença entre o realtime database e o firestore database e iniciando o firestore como database

[Aula em que descobri as mudanças](https://www.youtube.com/watch?v=CeRn50r0mTw)
O realtime database é o mais antigo e mais simples, quanto o firestore database é mais novo e mais organizado. Então não tem muito sentido usar o realtime mais.

## Adicionando o firestore database

Assim como o analytics, precisamos importar o firebase firestore e inicializar ele com essa função importada usando o método do cdn. E até ai tudo bem, da para fazer isso simplesmente importando, mas como vamos ter a referencia do banco? tem dentro desse cdn do firebase-firestore uma referencia assim como o firestore, uma chamada de collections e com ela podemos fazer todas as funções do banco.

~~~js
import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.1/firebase-app.js";
import { getFirestore, collections } from "https://www.gstatic.com/firebasejs/9.6.1/firebase-firestore.js";

const firebaseApp = initializeApp({
  apiKey: '### FIREBASE API KEY ###',
  authDomain: '### FIREBASE AUTH DOMAIN ###',
  projectId: '### CLOUD FIRESTORE PROJECT ID ###'
});

const app = initializeApp();
const db = getFirestore();
~~~

## Executando ações pelo firestore

Para enviar dados, precisamos primeiramente da referencia, ou seja, para onde raios vamos enviar os dados, então usaremos a ref do collections para fazer isso:

### Pegando referencia

Para pegar a referência do banco podemos usar o collection(db, 'x'), sendo x o nome da collection, ou seja, a primeira linha daquele console do firestore no seu app, existe também uma função importável chamada de **setDoc** que você pode setar o ID da chave do banco de dados na mão mesmo, mas isso pode cusar erros, vamos usar o **addDoc** que gera automaticamente o id no servidor
