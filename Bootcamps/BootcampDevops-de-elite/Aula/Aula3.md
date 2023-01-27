# Aula3
2023-01-25
tags: [index-bootcamp-devops-de-elite](../index-bootcamp-devops-de-elite.md)

1° erro- aprender tudo de uma vez, entender as categorias de solução. Aprende os conceitos, as principais ferramentas de cada fase do ciclo e ao que elas se destinam
2° erro- Não exercite processos separadamente. Aprenda como as ferramentas se conectam
3° erro- Não se preocupe só com hard skill
4° erro- A carreira é sua, você precisa decidir e aprender sozinho

Devops são agentes de transformação, organizando, melhorando e entregando performace da operação além da difusão de melhoria

## Terraform

### Infraestrutura

![](../img/Pasted%20image%2020230125203556.png)

O terraform serve basicamente para automatizar processos de cli web, ele cria uma estrutura muito mais estável e escalável do que usar cli cloud provider. O terraform que se preocupa com tudo e o terraform é multicloud

Da para criar vários hambientes de cloud no mesmo projeto, inclusive

![](../img/Pasted%20image%2020230125204225.png)

O terraformcria a infra e o Ancible configura a infra

![](../img/Pasted%20image%2020230125204435.png)

Exemplos: 

* Recursos:

	![](../img/Pasted%20image%2020230125204659.png)
	No caso do resource, estamos usando: (tipo de recurso) (nome do bloco), além dos parametros necessários para cada block label, no caso do digitalocean_droplet, estamos usando no exemplo um máquina virtual... 
* Data Sources = recursos já existentes
	![](../img/Pasted%20image%2020230125204811.png)
	São recursos já existentes, como uma rede, uma chave ssh que será vinculada a um ssh
* Providers: O provedor usado
	![](../img/Pasted%20image%2020230125205413.png)
	São declarações de uso de plugins do terraform
* Terraform settings:
	![](../../../Pasted%20image%2020230125205631.png)
	São configurações para usar o terraform usado
* Variables:
	![](../img/Pasted%20image%2020230125205852.png)
	São variáveis do projeto, coisas que podem ser reaproveitadas
* Outputs
	![](../img/Pasted%20image%2020230125205920.png)
	Usamos os outputs para definir para onde vai parar o que a infra ta carregando

### Mão na massa

Bom, tem diferentes formas de você criar uma infra acessando a núvem, uma delas é criando pela cli do próprio cloud, um exemplo seria o digitalocean

![](../img/Pasted%20image%2020230126002440.png)

O terraform possuí o arquivo .tf sendo uma boa prática usar o **main.tf** para começar. O terraform possuí o **registery.terraform.io** que é um site para ter os providers para o terraform e apartir do código inicial dos sites que vamos criar a aplicação em terraform

![](../img/Pasted%20image%2020230126005458.png)

No caso o token é o token do provider. E ao fazer a configuração do provider, podemos usar **terraform init** para fazer a instalação do provider

droplet = máquina virtual.
![](../img/Pasted%20image%2020230126013058.png)

E usando o **terraform apply** mandamos para o server provider o projeto. Quando fazmos isso, criamos um tfstate, que é um json com todo o estado da sua infra no cloud provider e tem sempre o planejamento quando utiliza-se o apply, pois precisamos ver oq ue está sendo alterado, principalmente quando estamos usando um servidor que pode cair, não é um kubernets da vida instalado e etc... Portando, teremos um downtime ao dar um replace ou uma alteração mau planejada

Para pegar a ssh key:
![](../img/Pasted%20image%2020230126015536.png)

Para vincular: Sendo a ssh_keys trocada, claramente, e todas as informações da mesma forma
![](../img/Pasted%20image%2020230126015803.png)

E claro que isso é usando o digitalocean... Não é usando outros providers, precisa-se ir na documentação do provider que está sendo usado no terraform e ver o que é necessário para pegar o provider... Além disso, vale lembrar onde estamos no processo de devops, estamos criando o hambiente de deploy usando terraform, checa o mapa da [Aula2](Aula2.md) para ficar bem por dentro, portanto, agora iremos fazer dentro da maquina virtual da núvem do provider, um cluster e dessa vez, utilizaremos o terraform :) O que acaba quase que ocmpletamente com  a aula 2 kakkakakkakak

![](../img/Pasted%20image%2020230126020601.png)

Olha que legal...

![](../img/Pasted%20image%2020230126020748.png)

Enfim, aprendemos como os homens das cavernas fazem... De qualquer forma é importante

Além disso, temos dois comandos interessantes: **terraform fmt** que formata bonitinho o teu main e o **terraform plan** que mostra o plano e assim você pode saber o plan antes de dar o apply... É, pode ser útil se quiser ser mais rápido e não processar dados no bkg e ao criar um cluster, a gente cria um arquivo tfstate para backup...

Além disso, depois de criar os dados e, principalmente, usar dados sensíveis, temos que parametrizar os dados em variáveis para dar uma melhorada no código..., para isso vamos usar as variáveis:

![](../img/Pasted%20image%2020230126021950.png)

E para chamar a variável, usamos **var.x**, sendo x o nome da variable. Coontudo, precisamos setar as variables, então precisamos seta-las em: **terraform.tfvars**:

![](../img/Pasted%20image%2020230126022246.png)

E é bom que isso deixa as vars em um lugar só  
De qualquer forma, ainda precisamos pegar o ip e para isso podemos pegar o atributo dado pelo server name para retornar o ip caso necessário em outro recurso, padrão ouro e muito necessário fazer isso, além do arquivo kube.config.yaml para editar os deploy e os crlh...

![](../img/Pasted%20image%2020230126022854.png)

![](../img/Pasted%20image%2020230126023603.png)

E se liga tmbm que nessa de usar outro provider para pegar o arquivo, precisa dar um **terraform init para baixar o provider**, daí só meter um apply

![](../../../Pasted%20image%2020230126023929.png)

E não esquece de meter um copy para os seus configs.

PARA NÃO FICAR RODANDO: **terraform destroy**

E para deixar as coisas top, você precisa usar o jenquins para automatizar o processo

-----------------------------------------------
## Bibliografia

https://www.youtube.com/watch?v=jg1O9l4WpZI