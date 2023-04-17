# NodeJs Single thread or multi-Thread?

Mod 16 -- **09/12/21**

Single Thread = faz todo o processamento dos scripts em ordem de execução, se você chamar um método 1 em cima do 2, o método 2 será depois do 1. Tudo assincronamente

Multi-Thread = Vai realizar tudo ao mesmo tempo. Tudo sincronicamente

Node.js é single thread mas pode mandar para uma fila sincrona que vão rodar outros processos simultaneamente, isso é possivel pela capacidade dos computadores atuais de rodar processos em núcleos diferentes

Thread-Pool = É o nome dado a capacidade do node de realizar e otimizar esses processos, pense em 4 núcleos e o node com uma biblioteca dele, chamada lib-uv,faz a melhor otimização possivel de threads pesadas em uma rota Multi-Thread, rodando esses processos assincronos da melhor forma possivel, dividindo-os em quatro núcleos.  
Ou seja, o node quando um processo demorar de mais para ser executado, em ultimo caso, a lib-uv vai mandar para o multi-thread essa task e 4 núcleos vão dividir essa tarefa para realiza-la da melhor e mais rápida forna possivel.
