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

| Aula                             | Recurso(s)                                                       | Assunto(s) |
| -------------------------------- | ---------------------------------------------------------------- | ---------- |
| [Aula20](Section%2010/Aula20.md) | input ngModel, select ngModel, Erros com NgForms e Submit NgForm | NgForm          |
| [Aula21](Section%2011/Aula21.md) | `formGroup :FormGroup`; `formBuilder : FormBuilder`; `[formGroup] = "cadastroFormGroup"` | Criando um ReactiveFroms |
