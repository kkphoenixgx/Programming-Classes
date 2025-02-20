# Aula1
2023-01-23
tags: [[../index-bootcamp-devops-de-elite]]

Devops = desenvolvimento e operações

Solução para acabar com o distânciamento entre a equipe de desenvolvimento e a equipe de infraestrutura. Uma cultura colaborativa que engloba práticas, ferramentas e filosofias com o objetivo de padronizar e melhorar como a infraestrutura funciona, muito comum em walterfall.

## Calls Model


![[../img/Pasted image 20230123093113.png]]

**Cultura** = Mudança de pensamento e comportamento das empresas sobre as equipes. Dando empoderamento as equipes. Assim, todos os proficionais trabalham para ter um produto final melhor.

**Automação** = typeline com automação de processos repetitivos que tiram tempo dos devs. Em projetos de walterfall, levam semanas para fazer testes, a realease e executar um deploy em todos os hambientes, com Devops, isso se executa em minutos

**Lean** = Gestão Ágil nas produções para reduzir o tempo de entrega e melhorar os tempos de produção

**Métricas** =  O que não é medido não pode ser testado, é importante que as métricas utilzadas na automação sejam precisas.

## Containers

Containers são uniformes, a estrutura é uniforme e o que tá dentro dos cointainers é invisivel a não ser que abra-o. Um coiterner é um isolamento de processo. Qualquer coisa pode ser guardada em um container, uma aplicação .Net, Java, Node, Php... Qualuqer coisa e sem se preocupar com conflitos criados entre containers, sem erros de versões bootstrap ao usar .Net e Java e etc, não existe mais "Na minha maquina funciona".

![[../img/Pasted image 20230123095923.png]]

Usa-se somente a infraestrutura e um sistema operacional, diferentemente da virtualização... O docker vai executar os containers sem precisar mudar a maquina virtual

Dentro do docker, existem dois conceitos fundamentais: as imagens e os containers. Sendo as **imagens**, templates para executar algo, o que precisa para executar o container, a imagem é a classe e o container o objeto.

## O docker

### Arquitetura

![[../img/Pasted image 20230123100635.png]]

O docker existe três componentes: docker daemon, docker client e docker registery. Sendo docker deamon o que gerencia as imagens e os conteiners, o docker client o CLI do docker e o registery o repositório de imagens que distribui para os ambientes os containers. Diga oi a navegação da web.

### Mão na massa

#### CLI

Flags são acumulativas.
Você pode achar as portas na própria documentação do docker
DBeaver é uma ótima ferramenta para rodar qualquer banco...

* **Criando um container**

  > **docker container run image** (--name x) 
  > → sendo x o nome que você quer para o container e image a imagem que você quer para o container. 
  > Exemplo: **docker container run nginx** que roda a image do SQL. Contudo, se você rodar assim, vai entrar em hambiente de produção o CLI, fica melhor se rodar no backgroud com -d, então: **docker container run -d nginx**

  Esse comando cria um container: 
  *docker run* →
  DockerDaemon(verificaSeTem X) → Registery(cria X) → DockerHost(BaixaLocal X) → 
  *Cria container X*;

  * Container deletável:

   > **docker container run image -rm**

    -rm serve para deletar o container logo após executar

  * Cria um container interativo (usa o -it) , um container com terminal:
    > **docker container -it image  path**
    > → Sendo image a image que você quer, exemplo: *ubunto* e path o caminho para o terminal dessa image, exemplo do ubunto: */bin/bash*  

    Isso significa que temos uma máquina virtual que roda ubunto por exemplo sem subir maquina virtual, temos um terminal de linux que roda qualquer coisa

* Para sair do container: *exit*
* Para voltar a rodar um container bash:
    **docker container -it id path**. Sendo path o caminho do terminal (/bin/bash) e id o id
* Para parar a execução de um container em -d ( background ): 
	
	> **docker container stop id**
	→ Sendo id o id do container

* **Para mostrar os containers:**

  > **docker container ls** (-a)
  > → Mostra os containers em execução, -a para mostrar todos os containers

* **Para deletar container**:

  > **docker container rm (-f) (id) (name)**
  > → Sendo o id o id do container e name o nome do container, só podendo escolher um
     → Sendo o -f, um comando de deletar forçadamente
  
* **Fazendo bind de portas:**

	>docker container run -p portaLocal:portaDaImage  
	→ **docker run -d 8080:80 -p nginx**

* **Criando um container com um DB**
    Contudo, para bancos de dados e etc, precisamos de outras chaves, configs, para rodar, que serão separas por -e: 
    > SQL server com postgress image:  
    > **docker container run -d -p local:server (-e key=value) image**
    >→ Sendo -e key=value repetidas vezes, uma key para cada chave e value para os valores criados 
    > →Exemplo:  
    > **docker container run -d -p 5432:5432 -e POSTGRESS_PASSWORD=senha -e POSTGRESS_USER=user -e POSTGRESS_DB=dbName postgress** 
    >→ Sendo senha, user e dbName variáveis criadas...

#### Into dockerfile, building uma image

nome do arquivo: **dockerfile**, sem extensão mesmo e ele serve para criar nossa própria image
* **!!!WARN: SEMPRE DÊ PREFERÊNCIA AO COPY AO INVÉS DO ADD**

* **FROM  IMAGE**: É que toda image deve ser criada em cima de outra image, então temos que começar escolhendo uma image, exemplo: FROM: ubunto...
* **RUN cmdCommand:** sendo cmd command qualquer comando de terminal :)

* Para criar a imagem a partir do dockerfile:

	> **docker build -t buildName (-f path)  directory**
	>→ O buildName tem um padrão descrito na parte de distribuição:(namespace(usuário)/repositório:TAG)
  	→ Sendo path o caminho do arquivo dockerfile, porém, ele já vai por padrão se tiver no diretório e o directory onde vai estar rodando a build

    **!!! WARN:**
    Lembrando que o cache é mantido, então fica mais rápido dependendo do que você já tiver instalado com essa image. Dessa forma, a ordem importa e é perigosa pois você pode acabar tendo que baixar várias vezes o pacote por você ter mudado a ordem, ou pior, se mudar a versão, nem instalar porque já possui uma versão anterior. Portanto, **coisas que possuem sentido serem instaladas juntas, continuam juntas** em uma linha somente
* Para ver as imagens: **docker image ls**
* Para deletar imagens que não possuem referência: **docker image prune**
* Para deletar imagens em execução ou específica: 
      Para isso, precisaremos deletar o container, caso tenha:
    > **docker container rm id**
    > **docker image rm id** ou **docker image prune**

![[../img/Pasted image 20230123204847.png]]

#### Distribuição de imagens do Docker 

* Docker regist = um github de containers, exemplo **hub.docker.com**

> **Padrão: namespace(usuário)/repositório:TAG**

sendo latest sempre a última versão da imagem. Portando, sempre se usa esse padrão no buildName.

* **NO USO DIÁRIO**:
	* docker login
	    *   usuário e senha
	* (docker tag image:version) *se tiver com latest*
	* docker push image
	* docker tag image:latest
	* docker push image
	* *Executando*: docker container run -d -p localport:serverPort image
* **TAGs**: **docker tag imageAntiga novaImage:latest** 
    Sempre deve ser assim, você sempre vai ter uma latest e uma versão antiga, você trabalha na latest, salva ela com tag diferente, exemplo :v1 e sobe junto uma nova com tag latest. Sempre vai executar o comando duas vezes

##### Convertendo uma aplicação em um container

* Cria um clone
* Create dockerfile no src do projeto
	* Você vai precisar de uma imagem, vou usar o do node, mas basicamente você deve procurar node no dockerHub
	    ~~~dockerfile
	    FROM node:(coloca a version)
	    WORKDIR /server
	    // *coment¹
	    COPY package*.json ./
	    RUN npm install
	    COPY . .
	    EXPOSE 8080 // Essa é a porta do server do node
	    // *coment²
	    CMD ["node", "index.js"]
		    ~~~~ 
* Entra no path do clone
* docker build -t buildName(:v1) .

*coment¹* = todas as config estão no package.json e no package-lock.json, portanto, vou ter que ter esses arquivos no meu container:
*coment²* = Executa para mim com o node, o arquivo index.js

-----------------------------------------------
## Bibliografia

-- O vídeo é não listado e deve ser tirado do ar --
https://youtu.be/EO5YouNnCCo