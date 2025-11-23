# Módulos
2025-11-23
tags: [[index Angular]]
 
## Modules and submodule
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 6/Aula12.md ]
 
Um modulo nada mais é que um agrupamento de componentes, ele constituí uma encapsulação maior de uma série de componentes, exemplo, dentro do module Home eu tenho todos os componentes que vão fazer parte da minha home.
 
~~~ts
@NgModule({
  declarations: [], // declaração de componentes
  imports: [],      // importa funcionalidades de outros componentes 
  exports: [],      // exporta componentes
  providers: [],    // requisições ao back-end ou a alguma parte externa 
  bootstrap: []     // usado no componente principal, para falar que é o index dos outros modules
})
~~~
 
Sub-modules são módulos que não são os principais, os que são usados em imports
 
> ng generate module directoryName
> **ng g m directoryName**
 
Sendo directoryName geralmente **shared**, contendo esses shared components. Ao criar um componente que vai pertencer ao module, você deve definir como path
 
> **ng g c shared/componentName**
 
E esse shared.module que será criado, será um módulo da aplicação e seus componentes devem ser exportados em shared.module, assim como declarados no mesmo e importados em outros modulos.