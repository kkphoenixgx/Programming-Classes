# Spring Interfaces
2025-10-10
tags: [[- 🌱 indexSpringBoot]]

O Spring é construído sobre o princípio de **programação orientada a interfaces**. Isso significa que você o acopla código à contratos (interfaces), e o Spring se encarrega de fornecer a implementação correta em tempo de execução.

Essas categorias não são originais do spring mas é uma forma muito boa de estudar o conteúdo e agrupar ele em conhecimentos. 

1. Interfaces de Estratégia (Strategy Interfaces)
2. Interfaces de Callback (Lifecycle & Aware)
3. Interfaces de Configuração (Configuration Interfaces)
4. Interfaces de Template (Template Method Patterns)

## Strategy Interfaces

Esta é a categoria mais importante e fundamental. São interfaces que definem um contrato para uma operação, permitindo que diferentes implementações (estratégias) sejam trocadas sem alterar o código que as utiliza. Isso é a aplicação direta do padrão de projeto _Strategy_.

## Lifecycle & Aware

São interfaces que permitem que seus beans "reajam" a eventos no ciclo de vida do contêiner Spring ou se tornem "cientes" (_Aware_) de seu ambiente. O Spring "chama de volta" (_calls back_) métodos definidos nessas interfaces em momentos específicos.

## Configuration Interfaces

São interfaces que você implementa para personalizar o comportamento do Spring Framework. Em vez de o Spring chamar seu código para reagir a um evento, é o seu código que informa ao Spring como ele deve se comportar.

## Interfaces de Template

Embora muitas vezes sejam classes abstratas e não interfaces puras, elas seguem o mesmo princípio. Elas fornecem um "template" para uma operação que lida com toda a lógica repetitiva e de baixo nível (como abrir/fechar conexões, tratar exceções), deixando você se concentrar apenas na parte importante do trabalho.