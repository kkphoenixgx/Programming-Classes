# Aula2
2023-01-24
tags: [[../index-bootcamp-devops-de-elite]]

Devops cycle:
**Planejamento** ( organiza ) →
**codificação** ( mão na massa ) →
**construção** ( build - docker, npm, na própria maquina do dev, criando containers ) →
**teste** ( testes... ) →
**empacotamento** ( release → *imagem docker* para dar deploy ) →
**deploy**  ( serviço de nuvem, aws, buildando com o *terraform* )→
**operação**( executada no hambiente *kubernets* ) →
**monitoramento**( prometeus... ) → Começa de novo

## O kubernetes

O kubernets é perfeito para resolver os problemas de escalabilidade e resiliência que o docker não resolve... A aplicação não cai e ele faz balanceamento de cargas, restarta containers dependendo se o container está saudável ou não e tem mlhores estratégias de atualização. Você usa bastante o **kubernets para aplicações que não podem cair, minutos fora do ar = milhões de reais perdidos...** O kubernets não trabalha com monolitos, contudo, por suas vantagens e gerenciamento de pacotes, até os monolitos querem utiliza-lo

### ⚙ Arquitetura do kubernetes

![[../img/Pasted image 20230124161753.png]]

Kubernetes control plane é o maestro e os nodes a arquestra. O timão controla onde os containers estão alocados no navio baleia

Kuber server API =  o gerenciador da cli
ETCD = banco de dados kubernetes
Kuber Scheduler  = gerencia onde cada container será executado
kuber controller manager = executa e gerencia os controladores

Sendo controladores uma IA que verifica constantemente se tudo ta certinho, tem vários...

E dentro dos nodes:
Kube proxy: gerencia as comunicações de rede 
Kubelet = garante as execuções dos containers - Containerd...

Tá, o kubernetes não suporta containers docker, mas usamos mesmo assim os do docker separadamente

### ⚒ Mão na massa

3 formas de criar Clusters kubernetes

* Estratégia 1
	 Utilizar um ambiente on-Premisse, para rodar na própria maquina; Geralmente usando kubeadm. Só que ai tudo vai ser problema seu. O cluster inteiro vai ser problema seu
* Estratégia 2
	 Usando kubernetes como serviço, usando um aws... qualquer coisa... Mas a parada é que dessa forma tudo vai ser resolvido pelo deploy e valeu. Você só gerencia os worker nodes
* Estratégia 3
	 Rodando localmente na máquina, usando K3D, Kind.. Kind e K3d usa containers docker, infomração importante, sendo K3D usando o K3S

#### Criando cluster kubernetes usando K3D

* Comando de criação básico  (K3D):
  > **k3d cluster create (name=k3d-default)** (--no-lb)  (--servers) (--agents)
    →  cria um container, configura o kubectl para ele se comunicar com o cluster   
    → Cria 3 containers docker: **default-tools**, **default-serverlb**, **default-server-0** (docker container ls) sendo o default-servelb o nó, um balanceamento que geralmente usamos para comunicar e ficar mais robusto, contudo, as vezes não precisamos de algo tão forte  
  ------ Flags ------  
    *--no-lb* = tira o nó (default-serverlb)
    *--servers x* = define quantos servers tem
    *--agents x*  = define quantos agents tem

Comando para deletar o cluster (K3D):
  > **k3d cluster delete (name)** 

Comando de listagem  (kubernetes - kubectl) (K3D):
> **kubectl get nodes**
> **kubectl get all**
> **k3d cluster list**

#### Dando deploy

##### Elementos do cluster cubernets:

**POD** → O menor elemento, ele executa os containers e o POD cria uma camada para a execução dos containers onde o IP e o Filesystem são os mesmos, mesmo que não tão parecido, é como se fosse uma maquian virtual que roda os containers com um ip e um filesystem dentro dos containers. Não coloca tudo num pod, separa para ficar escalável, ao contrário, vai ter em cada versão uma réplica de POD e aí meu parceiro kakakkakakka tchau servidor, tchau pc. Então é um POD para cada parte, um pod para o back, um para o front e um para o Db da aplicação
	Essa pattern é muito usada para colocar dentro de cada conteiner um serviço de logs ou qualquer coisa para monitorar, melhorar para mandar para um grafaqna pu algo assim... Gerenciamento de tráfego de rede e etc...

**ReplicaSet** → Para gerenciar os pods com escalabilidade e resiliência. Ele verifica quantas replicas você quer de pods e cria quantos você pediu, sendo que se algum pod cair ele recria o pod que caiu

**Service** → Eles fazem a comunicação entre pods. Ele possuí três variações de tipo: ClusterIP, NodePort e LoadBalancer

##### Criando objetos no cluster kubernets

E para fazer isso precisamos criar um manifesto, um arquivo yml com metadados, patern: Exemplo de um pod.yaml

~~~yaml
apiVersion: v1 (version)
kind: Pod  (o grupo de APIs)
metadata:
	name: umNome
spec:
	containers:
	- name:
	  image: imagemDoContainer
	  ports:
	  - containerPort: 80 (port)
---
(proximo pod)
~~~

para saber o grupo de API, você roda o **kubectl api-resources**

* depois disso você faz um: **kubectl apply -f  pathWithFile** ou **kubectl create -f pathWithFile**
O create só cria e o apply cria ou atualiza

* para ver os pods: **kubectl get pods (-l label)** ou kubectl describe pods podName
	 **-l nomeDaLabel = x** = para selecionar os que possuem uma label = x
* Para fazer o bind das portas e rodar: **kubectl  port-forward pod/yourPod 8080:port**
* Deletando pods: **kubectl delete pod meupod** 

O pod só executa o container, para gerenciar os pods com escalabilidade e resiliência, precisamos do *replicaSet

* e para isso devemos entender:

* **Labels**: São elementos chave-valor para marcar um objeto
* **Selectors**: Seleciona baseado nesses valores 

E para isso definimos em metadata: 

~~~
metadata:
	name: umNome
	labels:
	  nomeDaLabel: valorParaSuaLabel
~~~



##### Criando um replicaSet

~~~yaml
apiVersion: apps/v1
kind: ReplicaSet
metadata:
	name: someReplicaSetName
spec:
	selector:
		matchLabels:
			someLabel: someValueLabel
	template
		metadata:
			labels:
				sameLabel: sameValueLabel
		spec:
			containers:
			- name:
				image: imagemDoContainer
			  ports:
		  - containerPort: 80 (port)
---
~~~

para ver usamos: **kubectl get replicaset**
para ver os pods no replicaset: **kubectl describle replicaset someReplicaSetName**

Agora para escalar, usamos *replicas: x* para definirmos as replicas, sendo x a quantidade de replicas:
~~~
spec:
	replicas: x
~~~

ele cria um -nomeRandomico para cada pod e se vc deletar algum pod, ele cria outro

##### De fato dando deploy

* listando replicasets: *kubectl get replicaset*

Atualiza com o apply mesmo mas quando você dá apply, o replicaset n atualiza dinamicamente os pods dele.  
Você precisa deletar os pods para que eles atualizem, para fazermos isso melhor, usamos o **deployment**. O deployment gerencia as versões do replicaSet, ele cria uma nova versão do replicaSet e mantém a anterior mas deletando os pods anteriores, até porque com o replicaSet podemos refazer os pods que estavam com o template...

Para criar um deployment, copiamos o arquivo do replicaset, mudamos o nome para deployment e mudando o kind para **kind: deployment** junto com o **replica: 1**

* kubectl apply -f deploymentFilePath.yaml
* para voltar o deployment: **kubectl rollout undo deploymentName**

##### Service - comunicação entre os pods e balanceamento

Você cria Services no deployment. Após o gerenciamento de replicaSet e faz sentido ser no deployment já que são estruturas que gerenciam estabilidade e escalabilidade, para criar um Service:

![serviceCode](../img/Pasted%20image%2020230125165247.png)

* **Pegando um service**:
    > **kubctl get svc**

* **Service do tipo Cluster IP**: para comunicação entre pods internos

    ![service](../img/Pasted%20image%2020230125162042.png)
	..
* **Service do tipo nodePort**, Comunicação entre APIS externas

     ![](../img/Pasted%20image%2020230125162216.png)
   Ele cria portas de 30000 até 30777. Além disso, é importante que ele elege uma dessas portas e não dá para fazer facilmente um port bind nelas
	Dessa forma, você deve criar **um cluster que atua com load balancer**:
	> **k3d cluster create clusterName -p "80:30000@loadbalancer"**
	> Aí você pode dar o apply com o deployment.yaml e forçadamente fazer o portBind dando um nodePort: 3000
	
	 ![serviceNodePortForced](../img/Pasted%20image%2020230125172503.png)
	...
* **Service do tipo Load Balancer**: Cria um i
* 
* p público para os outros consumirem
     ![](../img/Pasted%20image%2020230125162303.png)
	..


## Aplicando

* clone repo
* create dockerfile image
* docker build -t yourname/project:version context(.)
* (docker login)docker pushyourname/project:version
* docker tag yourname/project:latest
* docker push yourname/project:latest
* k8s/
* create deployment.yaml, se a aplicação tiver um banco de dados, cria um deployment para o banco tmbm... Exemplo ao final:
* entra em k8s/
* kubectl apply -f ./deployment.yaml
* kubectl port-forward  service(service/postree) 5432:5432
* cria o service da web 
* kubectl apply -f ./deployment.yaml

~~~yaml
apiVersion: apps/v1

kind: Deployment

metadata:

  name: postgre

spec:

  selector:

    matchLabels:

      app: postgre

  template:

    metadata:

      labels:

        app: postgre

    spec:

      containers:

        - name: postgre

          image: postgres:15.0

          ports:

          - containerPort: 5432

          env:

          - name: POSTGRES_DB

            value: "kubenews"

          - name: POSTGRES_USER

            value: "kubenews"

          - name: POSTGRES_PASSWORD

            value: "Pg#123"

---

apiVersion: v1

kind: Service

metadata:

  name: postgre

spec:

  selector:

    app: postgre

  ports:

  - port: 5432

  type: ClusterIP

---

apiVersion: apps/v1

kind: Deployment

metadata:

  name: web

spec:

  selector:

    matchLabels:

      app: web

  template:

    metadata:

      labels:

        app: web

    spec:

      containers:

        - name: web

          image: kkphoenixvs/kubeNews:v1

          ports:

          - containerPort: 8080

          env:

          - name: DB_DATABASE

            value: "kubenews"

          - name: DB_USERNAME

            value: "kubenews"

          - name: DB_PASSWORD

            value: "Pg#123"

          - name: DB_HOST

            value: "postgre"

---

---

apiVersion: v1

kind: Service

metadata:

  name: web

spec:

  selector:

    app: web

  ports:

  - port: 80

    targetPort: 8080

    NodePort: 30000

  type: NodePort

---
~~~


---------------------------------------------
## Bibliografia

https://youtu.be/opRwVHMAanQ