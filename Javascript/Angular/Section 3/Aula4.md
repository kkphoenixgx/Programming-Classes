# Aula4
2022-12-06
tags: [[../index Angular]]

seguinte:

-   **ngOnInit:** é executado uma vez quando o componente é inicializado;
-   **ngOnChanges:** executado também uma vez na criação do componente e toda vez que ele sofrer alguma mudança;
-   **ngDoCheck:** executado a cada mudança que o **ngOnChange** não detecta;
-   **ngOnDestroy:** executado na destruição do componente.

Além desses existem outros quatros **_hooks_** dentro do **ngDoCheck**:

-   **ngAfterContentInit:** sempre que um conteúdo vindo de uma fonte externa do componente é inserido;
-   **ngAfterContentChecked:** quando o conteúdo externo é verificado;
-   **ngAfterViewInit:** executado logo após os dados dos filhos e do próprio componente ser inicializado;
-   **ngAfterViewChecked:** sempre que é detectado uma alteração do conteúdo é chamado esse cara.

**Imports:**
DoCheck,  
AfterContentInit,  
AfterContentChecked,  
AfterViewInit,  
AfterViewChecked  

## - Mod  16 - : Lifecycle: ngDoCheck

O ngDoCheck dispara sempre que as propriedades de entrada de um componente são verificadas. E este possuí subrotinas
	
* **ngAfterContentInit()** dispara quando o angular realiza qualquer projeção de conteúdo nas vizualizações, ou seja, logo antes de botar na tela e depois de começar o check;
* **ngAfterContentChecked()** acontece logo depois de verificar se tá tudo certo com o componente
* **ngAfterViewInit()** = Logo depois da view iniciar
* **ngAfterViewChecked()** = Se o componente mudar ou qualquer um dos componentes filhos, ele dispara

## - Mod  17 - : Lifecycle: ngOnDestroy

* ngIf como propriedade do html serve para ocultar ou aparecer um componente se uma condição for true, só colocar como propriedade de um elemento '(asterístico)ngIf=''variable', se a variable for true ele deixa aparecendo e false deixa ocultado 

* ngOnDestroy =  detecta quando um componente é destruído.

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/25569772#content
https://www.udemy.com/course/curso-de-angular/learn/lecture/25569780#content
