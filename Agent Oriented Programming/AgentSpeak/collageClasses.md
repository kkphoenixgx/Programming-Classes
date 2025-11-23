# Agent Speak

## Aula 3

Alice:

```AgentSpeak
!apresentacao.

+!apresentacao <-
	.my_name(MeuNome);
	.print("Meu nome é ", MeuNome);
	.broadcast(tell, name(MeuNome));
	?numeroDaSorte(NumeroDaSorte);
	.broadcast(tell, numeroDaSorteDaAlice(NumeroDaSorte));
	.broadcast(tell, wellcomeToSystemFrom).


+wellcomeToSystemFrom[source(Agente)] <-
	.print("Bem vindo ao sistema, ", Agente);
	.send(Agente, tell, senha(12345678));
	.wait(5000);
	.send(Agente, untell, senha(_)).

+?numeroDaSorte(NumeroDaSorte) <-
	.random(NumeroDaSorte);
	-+numeroDaSorte(NumeroDaSorte).
```

bob:

```AgentSpeak
numeroDaSorte(2345678).

!apresentacao.
!queroLoop.

+!apresentacao <-
	.my_name(MeuNome);
	.print("Meu nome é ", MeuNome);
	.broadcast(tell, name(MeuNome));
	?numeroDaSorte(NumeroDaSorte);
	.broadcast(tell, numeroDaSorteDoBob(NumeroDaSorte));
	.broadcast(tell, wellcomeToSystemFrom).


+wellcomeToSystemFrom[source(Agente)] <-
	.print("Bem vindo ao sistema, ", Agente).


+?numeroDaSorte(NumeroDaSorte) <-
	.random(NumeroDaSorte);
	-+numeroDaSorte(NumeroDaSorte).	


+?senha(Senha) <- 
	.print("Senha recebida", Senha).
```

Eva:

```AgentSpeak
numeroDaSorte(2345678).
isLoop(0).

!apresentacao.

+!apresentacao <-
	.my_name(MeuNome);
	.print("Meu nome é ", MeuNome);
	.broadcast(tell, name(MeuNome));
	?numeroDaSorte(NumeroDaSorte);
	.broadcast(tell, numeroDaSorteDaEva(NumeroDaSorte));
	.broadcast(tell, wellcomeToSystemFrom).

+!executeLoop <- 
	.time(H, M, S);
	.print("Estou executando o loop em: ", H, ":", M, ":", S);
	.wait(2000);
	!executeLoop.


+wellcomeToSystemFrom[source(Agente)] <-
	.print("Bem vindo ao sistema, ", Agente).


+?numeroDaSorte(NumeroDaSorte) <-
	.random(NumeroDaSorte);
	-+numeroDaSorte(NumeroDaSorte).	

+?senha(Senha) <- 
	.print("Senha recebida", Senha).
```

adao:

```AgentSpeak
executeLoopFromAdao(" +!executeLoopFromAdao <- .time(H, M, S); .print( \"Estou executando o loop em: \" , H, \" : \", M, \" : \", S); .wait(2000);!executeLoopFromAdao.").

!start.
!executeLoopAlice.


+!start <- 
	.broadcast(achieve, executeLoop);
	.wait(10000);
	.print("Pode parar aí ✋");
	.broadcast(unachieve, executeLoop);
	.broadcast(unachieve, executeLoopFromAdao).

+!executeLoopAlice <- 
	.print("Alice, execute ppr favor o loopAlice!");
	?executeLoopFromAdao(Func);
	.send(alice, tellHow, Func);
	.wait(1000);
	.send(alice, achieve, executeLoopFromAdao).
```

## Aula 4

```AgentSpeak
/* Initial beliefs */
skill(chef,"af467a22-eafc-4e87-9f57-882740ab0710").
myIoTAddress("80d9c5b3-5327-4836-b722-7481061affe6").
foodStock(0).
energy(2).

/* Initial goals */
!goToParty.

/* Plans */
+!goToParty: energy(E) & E>1 <- !info("Party!"); -+energy(E-1); !goToParty.
+!goToParty: energy(E) & E<=1 <- !info("Without energy..."); !lunch.

+!lunch: energy(E) & E>9 <- !info("Satisfied"); !goToParty.
+!lunch: foodStock(C) & C>0 & energy(E) & E<=9 <-
    -+foodStock(C-1); -+energy(E+1); !info("Eating"); !lunch.
-!lunch <- !info("I need food!");  !orderFood.

+!orderFood: not status(conn(S),attempt(A)) <- !iotNet(on); !orderFood.
+!orderFood: status(conn(S),attempt(A)) & A>=3<- !iotNet(off); !orderFood.
+!orderFood: status(conn(S),attempt(A)) & not menu(List) <-
    ?skill(chef,ChefUUID); -+status(conn(S),attempt(A+1));
    .sendOut(ChefUUID,askOne,menu(List));
    !info("Requesting menu.....");
    !orderFood.
+!orderFood: status(conn(S),attempt(A)) & menu(List) <-
    .random(List,Choice); .random(N); R=(N*10); Qtd=((R-(R mod 1))+1);
    -+status(conn(S),attempt(A+1)); ?skill(chef,ChefUUID);
    .sendOut(ChefUUID,achieve,order(Choice,Qtd));
    !info("Ordering food....."); !orderFood.
-!orderFood <- !info("I need food!"); !orderFood.

+!iotNet(off) <- .print("Disconnecting IoT Network!!"); .disconnectCN; -status(conn(_),attempt(_)).
+!iotNet(on): myIoTAddress(UUID) <-
    .print("Connecting IoT Network!!");
	.connectCN("skynet.chon.group",5500,UUID);
	-+status(conn(true),attempt(0)).

+!info(Msg): foodStock(F) & energy(E) <-
    .print("[stock=",F,"] [energy=",E,"] ",Msg); .random(R); .wait(5000*R).

/* Belief's Plans */
+foodArrived(Order,Product,Qtd)[source(Vendor)] <-
	?foodStock(X); -+foodStock(X+Qtd); .drop_intention(orderFood);
	.print("Food arrived: ",Qtd," ",Product); !iotNet(off); !lunch.


tualism, Agt).-!try(D,Agt) <- .print("OFFLINE, waiting connection...").
 
 +!migrate(D,Agt) <- !!try(D,Agt); .wait(10000); !isStillHere(Agt,D).
 +!isStillHere(Agt,D): .all_names(L) & .member(Agt,L) <- !migrate(D,Agt).-!isStillHere(Agt,D).
```

 Thegiacomoagentneedstoknowaboutyourlocationandproceedasdesired,
 as in lines 43-48; when at home, it will execute the plans to rest (lines 12-14);
 whenat hellsKitchen, it will execute the plans to order food (lines 16-22); finally
 when at luxNightClub, it will execute the plans to enjoy the party (lines 6-10).
 Another important plan is to request migration (lines 30-35). Initially, the
 agent doesn’t know which agent is capable of migrating in the MAS, so Giacamo
 sends a broadcast asking which agent can migrate him (line 31). Once an
 agent replies (line 32), it requests the migration (line 35). Figure 1.4 shows the
 execution of the scenario.
 The remainder agents of the scenario (gordon and giacomo), are Jason stan
dard agents. The gordon agent in this scenario is the same agent presented at
 Code 1.3 (Section 1.3.2.1). The giacomo agent, in your turn, has the reasoning
 presented in Code 1.10, with two initial beliefs about your energy and health
 (lines 2-3). It hasn’t initial goals. When using a Communicator agent in an Open
 MASscenario, the main characteristic is that it always informs all system agents
 about their location.
 The other plans deal with the migration agent. The main plan must be
 requested by an agent who wants to leave the MAS(line 21). Whenanagentinto
 the MASrequests it, a plan to migrate the agent starts the migration protocol and
 monitors the successful migration in parallel (line 23). The migration is treated
 by a plan (lines 27-29), and another deals with monitoring (lines 24-25).
 Code 1.9: Communicator agents reasoning in AgentSpeak(L).

```AgentSpeak
 +!keepAlive(Limit) <--+timeout(Limit); !hangUp.
+!hangUp: timeout(T) & T >0 <--+timeout(T-5); .wait(5000); !hangUp.
 +!hangUp: timeout(T) & T <=0 <--on; .disconnectCN; .wait(3000); !connect.

 /* Plans */
+!connect: .my_name(WhoAmI) & address(MAS,WhoAmI,UUID) <
.connectCN("skynet.chon.group", 5500, UUID);
.print("Connected in IoT network: address=", UUID); +on; !keepAlive(45).-!connect <- !keepAlive(5).

/* Initial goals */
 !connect.
 +!callUber(D)[source(A)]: address(MAS,_,UUID) & MAS=D <- !migrate(UUID,A).
enableCallUber(true).
 /* Initial beliefs and rules */
address(home,gioconda,"ec98ca85-2d03-885a-303b-5da61a04b8f8").
address(hellsKitchen,monferrato,"ba10322a-7fed-f079-a99a-550264742c48").
address(luxNightClub,mazikeen,"ca8325ba-5bbc-4301-c0a3-96e30c9940a7").
```
