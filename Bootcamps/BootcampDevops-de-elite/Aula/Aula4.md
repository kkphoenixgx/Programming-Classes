# Aula4
2023-01-26
tags: [index-bootcamp-devops-de-elite](../index-bootcamp-devops-de-elite.md)

Pipeline CI/CD nada mais é que uma aplicação que roda de forma continua sempre fazendo todo o processo de deploy depois da aplicação pronta. Uma pipeline é realmente um encanamento que conduz o fluxo para a direção correta, conduz o fluxo de tarefas... Sendo uma pipe line de integração contínua controlar um fluxo de entrega de uma realise

![](../img/Pasted%20image%2020230126171427.png)

Faz isso tudo manualmente é antigo parceiro, agora isso é tudo automático, e se algo der errado a pipeline avisa no commit e quando tá udo certo com a realise, entregamos

![](../img/Pasted%20image%2020230126171955.png)



## Jenkins

![](../img/Pasted%20image%2020230126172230.png)

Projeto:
![](../img/Pasted%20image%2020230126172320.png)

## Mão na massa

### Configurando ambiente

Entrando na máquina virtual do jenquins:
![](../img/Pasted%20image%2020230126172714.png)

Só seguir o tutuoras do jenquins caso for ubunto/debian **depois de instalar o jdk do java**:
![](../img/Pasted%20image%2020230126172915.png)

instala do docker, digita isso para deixar o hambiente legal
![](../img/Pasted%20image%2020230126173212.png)

Para restartar o jenkins:
![](../img/Pasted%20image%2020230126173331.png)

Para instalar o kubernets na máquina
![](../img/Pasted%20image%2020230126173357.png)
![](../img/Pasted%20image%2020230126173450.png)

Dá uma olhada no site para ter os links certinho, só ir no site do kubernets.io e procurar install and settup kubernets

E aí você tem que entrar no setup do jerquins virtualmente, você pega o IP da máquina virtual e faz: x:8080 para entrar no site, mete a chave e o site vai ficar lindu, aí você vai nas extensões

![](../img/Pasted%20image%2020230126173943.png)

E coloca: docker, docker pipeline, kubernets cli e instalar e reiniciar para ficar top, daí ele só limpou a folder e meteu bala...

### Jenquinsfile

O arquivo para config do jenkins é o jenkinsfile, tipo o dockerfile, sme extensão mesmo...

Dentro do jenkins, temos que definir a pipeline e o agente:  
No projeto, a maquina que tá rodando a pipeline é a mesma que tá rodando o agente, dessa forma, ele definiu como any  
Então toda pipeline do jenkins tem os stages, os steps e o que vai ser executado em cada step

Bom, só de olhar o código e imaginar o projeto, sabemos que vai dar problema na hora de subir para o dockerhub, até porque precisamos da credencial e isso quebra aspectos de segurança do projeto... Dessa forma, precisamos criar um arquivo de credencial no jenkins para chamar ele, portanto, precisamos ir no **jenkins pela web → gerenciar jenkins → credentials → system → global credentials → new credentials** e aí você cria a credencial tanto do dockerfile quanto o arquivo do kubernetes

~~~Jenkinsfile
pipeline{
	agent any

	stages{
		stage ('Build Docker Image'){
			
			steps{
				script{
					dockerapp = docker.build("kkphoenixvs/image:${env.BUILD_ID}", '-f ./src/Dockerfile ./src')
				}
			}
			
		}

		stage("Push docker image"){
			steps{
				script{
					docker.withRegistery('https://registery.hub.docker.com'){
						dockerapp.push('latest')
						dockerapp.push("env.${BUILD_ID}")
					}
				}
			}
		}

		stage("Deploy kubernetes"){
			environment{
				tag_version = "${env.BUILD_ID}"
			}

			steps{
				withKubeConfig([credentialsId: 'kubeconfig']){
					sh 'sed -i "s/{{TAG}}/$tag_version/g" "./k8s/deployment.yaml" '
					sh 'kubectl apply -f ./k8s/deployment.yaml'
				}
			}
		}

	}
}
~~~

![](../img/Pasted%20image%2020230127062050.png)

Lembre-se: steps 'Build Docker Image' e "Push docker image" são o CI, a integração continua, 


![](../img/Recording%2020230127062846.webm)
![](../img/Pasted%20image%2020230127063045.png)


-----------------------------------------------
## Bibliografia

https://www.youtube.com/watch?v=j2QDp2g86as&t=2s