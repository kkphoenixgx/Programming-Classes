# Compilando typescript para Versões diferentes do EcmaScript

Mod 9 -- **10/01/22**

Numa classe temos muitos conceitos que vamos aprender rapidamente, é realmente uma explosão de pequenas mudanças aparentemente, ent~´ao vamos separar bem os pontos que eu achar interessante

## Variáveis

Para declarar variáveis em typescript vamos fazer a mesma coisa que no js, mas vamos usar : type para declarar o tipo antes de declarar o valor dela, exemplo

~~~ts
var nome:string = "Kauã"
var number:number = 10;
~~~

## Notas

Existe o arquivo **tsconfig.json** que podemos fazer todas as configurações do meu projeto que é todo escrito em json

Usamos tsc --init para criar um arquivo base de configurações
