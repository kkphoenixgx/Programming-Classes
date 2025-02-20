# Aula 43
2023-10-22
tags: [[index Angular]]

A section 18 é sobre as novidades das novas versões do angular

## - Mod 145 - : Simplificado com o Standalone Components

O Standalone no angular é uma forma de não precisar do `app.module.ts` e deixar os componentes livres, sem precisar da parte mais burocrática de organizações e isso pode ser bom mas no geral não é, então tenha certeza do que está fazendo. Para criar um standalone, vamos precisar mudar nosso `app.compoenent.ts` para ter `standalone: true`, e vamos ter que adicionar `imports: [CommonModule, RouterModule]` para conseguirmos usa-los já que não temos a estrutura normal do angular. O resto conforme a gente faz lá no model... Eu criei um model-standalone para darem uma olhada lá nos projetos.

Dessa forma, temos que adicionar mudanças no main.ts

## Mdódulos faltando

Devido a um erro na hora da publicação, perdi arquivos importantes e quando tiver a atualização de mais conteúdos no curso, vou adicionar o que falta.

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/33837658?start=0#overview

