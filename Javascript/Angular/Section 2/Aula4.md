# Aula4
2022-12-06
tags: [[../index Angular]]]

## - Mod  14 - : Lifecycle: ngDoCheck

O ngDoCheck dispara sempre que as propriedades de entrada de um componente são verificadas. E este possuí subrotinas
	
* **ngAfterContentInit()** dispara quando o angular realiza qualquer projeção de conteúdo nas vizualizações, ou seja, logo antes de botar na tela e depois de começar o check;
* **ngAfterContentChecked()** acontece logo depois de verificar se tá tudo certo com o componente
* **ngAfterViewInit()** = Logo depois da view iniciar
* **ngAfterViewChecked()** = Se o componente mudar ou qualquer um dos componentes filhos, ele dispara

## - Mod  15 - : Lifecycle: ngOnDestroy

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569772#content
https://www.udemy.com/course/curso-de-angular/learn/lecture/25569780#content
