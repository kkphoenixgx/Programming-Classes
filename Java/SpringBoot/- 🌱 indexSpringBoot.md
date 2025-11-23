# Spring Boot
2025-10-06
tags: [[☕ indexJava]]

## Arquivos padrão

Em um projeto Spring, um arquivo como `AppConfig.java` ou `WebConfig.java` serve como um centro de comando para as configurações da sua aplicação, usando código Java em vez de arquivos XML. É aqui que você "ensina" o Spring a se comportar de maneiras específicas ou a conhecer e gerenciar certos objetos (que chamamos de "[[#Beans]]").

## Beans

Um "Bean" é simplesmente um objeto que o Spring cria e gerencia para você. Em vez de você mesmo criar uma instância com `new MyObject()`, você pede ao Spring para fazer isso, e ele pode "injetá-la" em outras partes do seu código. A classe de configuração é o lugar ideal para definir como esses beans devem ser criados.****

## Tirando e colocando banco de dados

Se você não vai usar banco de dados, você deve tirar
`starter-jdbc`, o banco de dados de teste `H2` e o "espião" de SQL `log4jdbc` do **pom**. 
Além de tirar as configurações de banco dados e `DataSourceSpy` nas configurações do app em `AppConfig.java`.
Limpar os testes do Controller padrão `HelloContainer` e limpar os testes também.

Obviamente, se você quer colocar o banco de dados, deve fazer o inverso.