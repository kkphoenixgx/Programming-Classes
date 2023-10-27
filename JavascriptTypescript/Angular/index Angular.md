# Index Angular
[Index of typescript](../Typescript/Typescript/Index%20of%20typescript.md)

~ = mesma coisa que a outra coluna
. - = hífen é quando não tem valor

## Introdutório

| Aula                            | Recurso(s)                                                                                           | Assunto(s)                                                                               |
| ------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| [Aula1](Section%203/Aula1.md)   | -                                                                                                    | instalando o Angular                                                                     |
| [Aula2](Section%203/Aula2.md)   | **ng b --nomeDoAmbiente**, **ng g c componentName**                                                  | como dar build no angular e como gerar componentes                                       |
| [Aula3](Section%203/Aula3.md)   | onInit(); onChange(); decorators                                                                     | Organizando componentes e o **lifecycle** no angular                                     |
| [Aula4](Section%203/Aula4.md)   | ngDoCheck() e ngOnDestroy()                                                                          | O que é  ngDoCheck e suas subrotinas, além do ngOnDestroy                                |
| [Aula5](Section%204/Aula5.md)   | @input                                                                                               | **Data bindigs** e two-way binding                                                       |
| [Aula6](Section%204/Aula6.md)   | {{}},  [htmlAtribute]='variable', (event)="fn()"                                                     | interpolation,  Property Binding e event binding                                         |
| [Aula7](Section%205/Aula7.md)   | *sugarSintex*: ngIf="condition"                                                                      | **Diretivas** e ngIf                                                                     |
| [Aula8](Section%205/Aula8.md)   | `ngFor ="let item of arrayList(; let i = index)"`; [ngSwitch]='variable'; `ngSwitchCase="condition"` | ngFor e ngSwitch                                                                         |
| [Aula9](Section%205/Aula9.md)   | [ngClass]="{ 'className': variable(, 'classNameX': variableX) }", [ngStyle]="cssObject"              | **diretivas atributo**, ngClass e ngStyle                                                |
| [Aula10](Section%205/Aula10.md) | [ (ngModel) ] ="variable", '<'ng-template></ng-template>                                             | ngModel em two-way databinding e ng-template                                             |
| [Aula11](Section%205/Aula11.md) | '<'ng-content select='element' ></ng-content> {{ x 'pipe' transformProp }}                           | Organizando os elementos de pai para filho com ng-content e transformando dados com pipe |

Menção honrosa a aula 31 que dá uma dica incrível sobre selecionar dinamicamente uma div: [- Mod 106 - Criando componente para teste](section14/Aula31.md#-%20Mod%20106%20-%20Criando%20componente%20para%20teste)

## Arquitetura e Services

| Aula                            | Recurso(s)                                                                   | Assunto(s)                                                             |
| ------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| [Aula12](Section%206/Aula12.md) | @NgModules, **ng g m [submodule]/directoreName**                             | Modules and submodule                                                  |
| [Aula13](Section%207/Aula13.md) | @Input, arquiteture problems                                                 | Comunicação entre componentes                                          |
| [Aula14](Section%207/Aula14.md) | @Output(), arquitetura                                                       | Comunicação entre componentes baseada em eventos                       |
| [Aula15](Section%208/Aula15.md) | Arquitetura e afins do projeto                                               | Projeto TaskBar                                                        |
| [Aula16](Section%208/Aula16.md) | Organizando Componentes, identificando herança, scss selectors               | Projeto taskBar                                                        |
| [Aula17](Section%209/Aula17.md) | **ng g s (path)**, @Ingectable, subscribe(),                                 | Insight eventBinding, SERVICES, Comunicação e arquitetura com services |
| [Aula18](Section%209/Aula18.md) | `http :HttpClient`; `http.get`; `http.post`; `:Observable<{variable :type}>` | Consumindo dados de um SERVICE e Observadores no Angular               |
| [Aula19](Section%209/Aula19.md) | `http.put`; `http.delete`, headers(IResponses)                               | Deletando, atualizando dados de uma API e criando headers              |

## NgForm, ReactiveForms

| Aula                             | Recurso(s)                                                                               | Assunto(s)                             |
| -------------------------------- | ---------------------------------------------------------------------------------------- | -------------------------------------- |
| [Aula20](Section%2010/Aula20.md) | input ngModel, select ngModel, Erros com NgForms e Submit NgForm                         | NgForm                                 |
| [Aula21](Section%2011/Aula21.md) | `formGroup :FormGroup`; `formBuilder : FormBuilder`; `[formGroup] = "cadastroFormGroup"` | Criando um ReactiveFroms               |
| [Aula22](Section%2011/Aula22.md) | Validators                                                                               | Validação de formulários reactiveForms |
|                                  |                                                                                          |                                        |

## Routes

| Aula                             | Recurso(s)                                                                                | Assunto(s)                           |
| -------------------------------- | ----------------------------------------------------------------------------------------- | ------------------------------------ |
| [Aula23](Section%2012/Aula23.md) | routerLink, redirectTo                                                                    | Navegação entre rotas, routes.module |
| [Aula24](Section%2012/Aula24.md) | `[routerLinkActive] = "['class']"`; `[routerLinkActiveOptions]="{exact: true}"`; `:param` | Active Routes, parâmetro nas rotas   |
| [Aula25](Section%2012/Aula25.md) | `router :Router`; `this.router.navigate`; `this.router.navigateByUrl`, `forChildren()`                    | Redirecionamento, Rotas filhas, Lazy Load, `useHash` nas rotas          |

## Rxjs e APIs externas

| Aula                          | Recurso(s)           | Assunto(s)       |
| ----------------------------- | -------------------- | ---------------- |
| [Aula27](Section13/Aula27.md) | http: HttpClient     | httpClientModule em APIs externas |
| [Aula28](Section13/Aula28.md) | pipe(); tap(); map() | Rxjs             |

## Jasmine

| Aula                                                   | Recurso(s)                                                                                                                                                          | Assunto(s)                      |
| ------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------- |
| [Aula29](section14/Aula29.md) | **npm install jasmine**; **npm install karma karma-jasmine jasmine-core karma-chrome-launcher**, karma.config, **ngTest** --- `describe()`; `it()`; TestBed; fixure | Introdução ao Jasmine, Estrutura base |
| [Aula30](section14/Aula30.md) | `expect()`; `x.toEqual(y)`; `x.not.y`;                                                                                                                              | Manipulando testes fluentemente |
| [Aula31](section14/Aula31.md) | **ng test --code-coverage** | melhorando a cobertura de testes |
| [Aula32](section14/Aula32.md) | `beforeEach`; `x.toBeTruthy()`; (U) | Under Test; **Estrutura para U** |
| [Aula33](section14/Aula33.md) | `fixure.debugeElement.nativeElement`; `fixure.detectChanges`; (I) | Testando interfaces; **Estrutura de teste para I** |
| [Aula34](section14/Aula34.md) | describe; `x.trim()`; `x.toContain(y)`; `x.toEqual(y)`  | Estrutura describe para U; Manipulação de testes|
| [Aula35](section14/Aula35.md) | HttpClientTestingModule; HttpTestingController; | Mock; **Estrutura de teste de um service** |
| [Aula36](section14/Aula36.md) | `HttpTestingController.verify()` | **Testando o serviço - Incremento na estrutura dos testes de service**; Arquitetura dos Testes - O problema da dependência em corrente  |

## Projetos

| Aula                           | Assunto(s)       |
| -----------------------------  | ---------------- |
| [Aula26](Section13/Aula26.md) | Pokédex App |


