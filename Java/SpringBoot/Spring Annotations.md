# Annotations
2025-10-06
tags: [[- 🌱 indexSpringBoot]]

## Stereotype Annotations

São as anotações mais fundamentais. Elas marcam uma classe para que o Spring a reconheça e gerencie seu ciclo de vida (ou seja, a transforme em um "Bean").

### `@Component`

`@Component`:  Diz ao Spring: "Ei, gerencie esta classe!".

### `@Service`

`@Service`: Uma especialização do `@Component`. Usada para marcar classes da camada de serviço (onde fica as regras de negócio).

### `@Repository`

`@Repository`: Especialização usada para classes da **camada de acesso a dados** (DAO - Data Access Object). Ela também habilita a tradução de exceções específicas do banco de dados para exceções do Spring.
### `@Controller`

`@Controller`: Especialização usada para classes que manipulam requisições web na arquitetura MVC tradicional, geralmente retornando o nome de uma view (como uma página HTML).
### `@RestController`

`@RestController` : Uma combinação de `@Controller` e `@ResponseBody`. Usada para criar APIs REST, onde os métodos retornam dados (como JSON) diretamente no corpo da resposta.

## Spring Boot "Core" Annotations

O Spring Boot adiciona suas próprias anotações para simplificar drasticamente a configuração.

### `@SpringBootApplication`

`@SpringBootApplication` é o coração de qualquer aplicação Spring Boot combinando a descoberta de componentes, a autoconfiguração e a configuração baseada em Java em uma única anotação.

### `@EnableScheduling`

- `@EnableScheduling`: Permite executar métodos `@Scheduled` de tempos em tempos. Essa Annotation é feita no seu `app.java`.

### `@Scheduled`

- `@Scheduled`: Diz que o método com a annotation é um método que ocorrerá de tempos em tempos de acordo com um tempo definido.

> **SPRING BOOT DOC:** 
> Annotation that marks a method to be scheduled. For periodic tasks, exactly one of the [`cron()`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/annotation/Scheduled.html#cron\(\)), [`fixedDelay()`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/annotation/Scheduled.html#fixedDelay\(\)), or [`fixedRate()`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/annotation/Scheduled.html#fixedRate\(\)) attributes must be specified, and additionally an optional [`initialDelay()`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/annotation/Scheduled.html#initialDelay\(\)). For a one-time task, it is sufficient to just specify an [`initialDelay()`](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/scheduling/annotation/Scheduled.html#initialDelay\(\)).

## Dependency Injection Annotations

Essas anotações são usadas para "conectar" os beans uns aos outros e para configurar o contêiner do Spring.

### `@Autowired`

`@Autowired`: Pede ao Spring para injetar uma instância de um bean em um campo, construtor ou método - Automaticamente conectado.

### `@Value`

- Enquanto `@Autowired` injeta _objetos_ (outros beans), `@Value` injeta _valores simples_ (Strings, números, booleanos, etc.).

```java
// Injeta o valor da propriedade 'app.static.location' do application.properties
@Value(<x>) // <x> = Caminho que estrega o valor, ex: "${app.static.location}"
private String staticLocation;
```

## WEB MVC Injection Annotations

Essenciais para construir a camada web e APIs REST.

### `@RequestMapping`

`@RequestMapping`: A anotação principal para mapear URLs de requisições a métodos específicos em um `@Controller` ou `@RestController`.

### `@<x>Mappings`

`@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`: Atalhos para o `@RequestMapping` para os respectivos verbos HTTP.

### `@PathVariable`

`@PathVariable`: Extrai um valor da URL (ex: o `id` em `/users/{id}`).

### `@RequestParam`

`@RequestParam`: Extrai um parâmetro da query string da URL (ex: `?name=kkphoenix`).

### `@RequestBody`


`@RequestBody`: Converte o corpo (body) de uma requisição HTTP (geralmente um JSON) em um objeto Java.

## Aspects and Transactions Annotations

Para lidar com preocupações transversais (cross-cutting concerns).
