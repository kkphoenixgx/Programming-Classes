# Aula 7
2022-12-12
tags: [[../index Angular]]

## - Mod 22 - Diretivas :

As diretivas säo classes que adicionam comportamentos adicionais aos elementos em aplicativos Angular. Com as diretivas integradas do Angular, vocé pode gerenciar formulårios, listas, estilos e o que os usuårios veem. Dessa forma, temos dois tipos de diretivas, as **diretivas de atributo** e as **diretivas estruturais**.

* **Diretivas de atributo**: Aquelas que *alteram aparencia ou comportamento* de um elemento
	* **ngClass** = adiciona ou remove classes
	* **ngStyle** = adiciona our emove um conjunto de estilo css
	* **ngModel** = adiciona vinculação de dados de um formulário (Quando o usuário digita uma variável já pega esse texto digitado)
* **Diretivas estruturais**: Que moldam a estrutura do dom
	* **NgIf**: Condicionalmente cria ou modifica algo
	* **NgFor**: Repete algo para cada item de uma lista
	* **NgSwitch**:: Conjunto de diretivas que alteram entre visões alternativas

## - Mod 23 - * nglf :

O ngIf tem uma sintax sugar, assim:

~~~html
<p *ngIf="condition" ></p>
~~~

Essa condition nada mais é que uma variável do ts, mas o ngIf, na realidade, recebe um bool como valor e é possível também fazer um else

~~~html
<p *ngIf="condition; else condition2" ></p>
~~~~ 

Nesse caso, " ; " indica a ação caso o if estiver correto e o else indica que, o que está depois é caso esteja incorreto. Para mostrar como realizar ações mais complexas quer isso, veremos o conseito de template, que ao meu ver, olhando rapidamente o código de exemplo, é uma div que só vai funcrionar quando algo acontece.

~~~html
<!--- Caso esteja correto, coloque ok, ao contrário, execute condition2 ---> 
<p *ngIf="condition; else condition2" >ok</p>

<ng-template #condition2>
	<p>not ok</p>
</ng-template>
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569832#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569848#overview

## Mapa Mental