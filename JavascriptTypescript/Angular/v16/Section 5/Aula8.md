# Aula8
2022-12-13
tags: [[index Angular]]

## - Mod 26 - : * ngFor

O ngFor tem um sugar sintax e ele é usado exatamente como um for dentro do html

~~~html
<ul>
 <li *ngFor="let item of list" > {{ item.x }} </li>
</ul>
~~~

É exatamente como um for, coloca todos os itens de list em item. Sendo list um array no componente ts. Tem como também ver o index do item:

~~~html
<ul>
 <li *ngFor="let item of list; let i = index" > [ {{i}}] - {{ item.x }} </li>
</ul>
~~~

Desse modo podemos ter o i. E mais adiante, ao colocar o i, ele vira uma variável, ou seja, tem como passar esse i como uma parametro de função

~~~html
<ul>
 <li *ngFor = "let item of list" > {{ item.x }} (click)="someFn(i)" </li>
</ul>
~~~

Assim, podemos obter o index do item e até mesmo referenciar ele dentro do array se preciso.

## - Mod 25 - : * ngSwitch

O ngSwitch é realmente a estrutura de um switch:

~~~html
<div [ngSwitch]="variable" >
	<div *ngSwitchCase="caseCondition" > Aparece isso na tela se a condition for true </div>
</div>
~~~

Perceba então, que o Switch em si não usa sugar sintex, e sim o case do switch. Ao definir variable, novamente estamos falando de uma variável do componente.ts e lembre-se que o condition do switch não é qualquer condition que recebe um bool, é somente um valor. Desse modo, caseCondition deve ser um 2, 3, 'name' e não uma estrutura de condição como ( 1 > 3 ).

~~~html
<div [ngSwitch]="name" >
	<div *ngSwitchCase=" 'kkphoenix' " > creator </div>
	<div *ngSwitchDefault > client </div>
</div>
~~~



-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569854#overview

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569860#overview