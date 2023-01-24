# Aula1 - Criando o ambiente
2023-01-18
tags: [[../Index NLW Bootcamp]]

Já começamos a aula com informações valiosas e coisas que eu devo lembrar

> **npx tsc --init**

Automaticamente cria o tsconfig, nada de novo, contudo, o target quando você vai usar node com ts, pode ser ES2020 pois o node já entende normalmente o ES2020... 

> npm instal tsx -d

É o compilador ts para o node, e usando:

> **npx tsx pathDoArquivo**

Podemos rodar node com ts...

## Web App

### Back-end

#### Fastify

Nesse projeto vamos usar o fastify que é bem parecido com o express, mas ele é mais performatico e com mais suporte

para usar o fastify você importa e guarda ele como se fosse um express mesmo

~~~ts
import Fastify from fastify;

const app = Fastify()

app.get('/', ()=>{
	return 'HelloWorld'
})

app.listen({
	port: 3333,
})
~~~

#### Prisma

Vamos usar também no projeto uma ferramenta orm chamada prisma que automatiza grande parte das chamadas para o banco de dados, a melhor ferramenta para node e ts é o **prisma** e para usar o prisma, usamos:

> **npm i prisma -D**
> **npm i @prisma/client**

Sendo o prisma/client o client do prisma para conversar com o DB e para configurar o ambiente, usando o SQLite, uma versão de banco de dados mais simples só para esse projeto

> **npx prisma init --datasource-provider SQLite**

E o prisma é incrível para APIS, faz tudo ser pluguin, qualquer tabela que você for criar ele usa a palavra **model**

~~~prisma
// cria uma tabela Habit
model Habit{

	// vai ter uma coluna chamada id que é uma string
	// o valor do @id vem por default uuid() → gera um id único universal
  id String @id @default(uuid())

}
~~~

~~~prisma
model Habit{

  id         String @id @default( uuid() )

	// cria um campo tipo String e um campo tipo DateTime
  title      String
  created_at DateTime

	// para sempre criar a tabela com esse nome
  @@map("habbits")
}
~~~

> **npx prisma migrate dev**

Isso faz uma migration, um tipo de versionamento de um banco de dados. Simplesmente coloca o nome do "commit" para versionamento e voalá, tabela criada com prisma

Dessa forma, o arquivo guardará o banco de dados no dev.db e criará o sql file com o que você fez :)

![[../-img/Pasted image 20230118185845.png]]

E com:

> **npx prisma studio**

temos uma ferramenta para visualizar o db em localhost:5555

podemos simplesmente clicar em record e adicionar coisas no DB editando manualmente :)

![[../-img/Pasted image 20230118202633.png]]
//  *Entendendo o código*: Então quando tiver um metodo get em "/", realiza o block. Espera o findmany antes de colocar em habits e o findMany vai procurar na minha tabela valores que o título começa em "Beber"...

Dessa forma, entendemos que o findmany filtra e tem diversos campos que podemos colocar nesse parametro-objeto que ele possuí, um deles é o próprio where que procura onde, mas tem diversos outros, assim como se não colocar nada, ele vai achar todos, logo retorna todos. 

E o legal do prisma é que ele nunca vai rodar se você colocar campos que não existem, torna o DB mais seguro

#### Cors

Cors é um mecanismo de segurança que diz quais aplicações vão usar os dados, dessa forma fica mais seguro...

> **npm i @fastify/cors**

e para usar é bem simples:

~~~ts
import cors from "@fastify/cors";

// sendo app o app do fastify
app.register(cors);
~~~

Claro que poderia usar também mais parametros em register, em aplicações maiores, o certo seria definir um {} com todas as rotas que podem consumir dados



### Front-end

#### Vite

O vite é uma ótima ferramenta para desenvolvimento, vê qualquer vídeo aí, muito famoso para ficar explicando e para gerar o projeto:

> **npm create vite@latest**

Com isso vira só configuração react mesmo, deleta tudo deixando só o main e o app, limpa o app e cria a pasta components...

#### tailwindcss

Para instalar o postcss, um pluguin do postcss, o tailwindcss, que é uma bliblioteca de estilização muito famosa também e o autoprefixer que adiciona os webkit da vida no projeto

> **npm install -D tailwindcss postcss autoprefixer**

depois disso podemos começar o tailwind com:

> **npx tailwindcss init -p**

E isso gera dois arquivos de config o tailwind e o postcss 

No config do tailwind, podemos colocar que todos os arquivos que estiverem no src, dentro de qualquer pasta e tiverem a extensão tsx, vão poder usar tailwind, além do index.html

~~~ts
module.exports = {

  content: ["./src/**/*/*.tsx", "./index.html"],

  theme: {
    extend: {},
  },

  plugins: [],
};
~~~

Dessa forma configuramos o tailwind e ele funciona tipo um bootstrap 9000 vezes melhor, você coloca classes e elas estilizam automático, vou ir citando aqui propriedades:

x é sempre o valor em px dividido por quatro.

w-x = width: x
h- x = height: x
bg-color = background-color: color
text-color = color: color
rounded = border-radius: 0.25rem
text-center = text-align: center
m-x = margin: x
flex = display: flex

#### React-ts

Nada de outro mundo usar react com ts por enquanto, só passar nos paraqmetros os types e codar com ts



## Mobile App

Vai rolar tanto para o android quanto para o IOS

O react Native faz um bundle para o sistema em target, se for um android ele usa as APIs do android e se for do IOS ele usa as APIS do IOS

* Expo = É como vamos executar nossa aplicação, quem gerencia esse bundle do react para converter para mobile
* Expo app na google play
* **create-expo-app mobile --tecd nomeDaPasta** para criar o setup do react native app
* expo start 

No react native, existem também semelhanças com a web:

div → view
Text → algo como um p

Usam-se tags e a Statusbar define como vai ser a aparência da status bar na hora de rodar o app. Outra coisa parecida é que a estilização é parecida, usamos uma API chamada Stylesheet para definir classes na constante styles e atributos em camelCase para definir os styles

![[../../../Pasted image 20230119022838.png]]

![[../-img/Pasted image 20230119023209.png]]

O flexbox já vem ativo por padrão