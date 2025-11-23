# CLI
2024-08-19
tags: [[index Angular]]

## instalando o Angular
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 3/Aula1.md ]

1. Npm básico de cria;
2. npm install -g @angular/cli ← Baixar o cli do Angular]
3. ng new folder-app → Seleciona y para o routing → Seleciona scss se quiser usar o sass
4. ng s ← começa o projeto no localhosting.

## como dar build no angular e como gerar componentes
[ fonte: /home/kkphoenix/Documents/Programação/JavascriptTypescript/Angular/v16/Section 3/Aula2.md ]

> **ng build** ou *ng b* → Dá build nos arquivos, faz a aplicação...

Para setar variáveis de ambiente com o build, mais especificamente, para dar deploy para um ambiente, simplesmente se usa uma flag com o nome do ambiente: **ng b --nomeDoAmbiente**. Contudo, não se usa variáveis de ambiente constantemente, usa-se em casos especificos, como uma alteração especifica para uma homolagação¹*.

> O angular já compila o ts automaticamente na produção.

No angular, podemos criar componentes ou outros via **ng generate x** sendo x o que você quer gerar; Exemplo ng generate component ou **ng g c componentName** sendo componentName também o nome da pasta do componente, me lembra um pouco os packages do java
