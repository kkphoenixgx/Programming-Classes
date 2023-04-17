# Pasta node_Modules e git

Mod 11 -- **10/11/21**

Node_Modules é uma pasta que contém todos os módulos dependentes que você instala via npm ou yarn e esses módulos são muito pesados, então obviamente se deve ignora-lós antes de manda-lós para o diretório do github. Para isso usamos o .gitignore e para usar o .gitignore que ignora os arquivos desnecessários, basta colocar o path do arquivo ou pasta:

~~~.gitignore
# Levando em conta que a pasta está na mesma pasta que o .gitignore 
/node_modules/
# poderiamos usar também = ./.gitignore/
~~~

podemos também selecionar um tipo específico de arquivo simplesmente colocando um *.tipoDeArquivo, exemplo:  

> *.zip

Usando **git status** no console podemos ver os arquivos que estão faltando no nosso repositório e usando o git add *.* podemos colocar os arquivos faltando todos de uma vez, poupando tempo.
