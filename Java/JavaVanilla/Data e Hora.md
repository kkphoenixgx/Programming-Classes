# Data e Hora
2024-06-06
tags: [[☕ indexJava]]

Em java, a data-hora será dividida em local e global, você vai usar a local quando não for precisar de conversão para mostrar para outros usuários e global quando for necessário o mesmo. Lembrando que isso vai se fazer mais necessário quando você tiver lidando com hora...

## Concept

![[Pasted image 20240606080515.png]]

![[Pasted image 20240606080539.png]]


### Time zones e Padrões

![[Pasted image 20240606081616.png]]

![[Pasted image 20240606081747.png]]

## Types e `Date.now()`

* **Types**: 

![[Pasted image 20241030150300.png]]

### `LocalDate` e `LocalDateTime`

~~~java
public class Example{

	public static void main(String[] args){
		LocalDate dateLocal = LocalDate.now(); // println: yyyy-MM-dd
		LocalDateTime dateLocalWithTime = LocalDateTime.now(); // println: yyyy-MM-ddTHH:mm:ss
	
	}

}
~~~

### Instant e padrão ISO 8601

* **Instant** → padrão GNT

~~~java
public class Example{

	public static void main(String[] args){
		LocalDateTime dateLocalWithTime = LocalDateTime.now(); // da máquina

		// ex: 2024-10-30T15:15:00.000000
		Instant instant = Instant.now(); //date and time com padrão GNT, de londres
	
	}

}
~~~

* **ISO 8601** → É o formato do java com o T

~~~java
public class Example{

	public static void main(String[] args){
		LocalDate date = LocalDate.parse("2022-07-20");
		LocalDateTime dateTime = LocalDateTime.parse("2022-07-20T01:20:26");
	
	}

}
~~~

Tem como fazer operação dentro do parse também, exemplo, eu tenho um horário de sp e quero que ele se vire e armazene como o GMT:

```java
String fuso = "03:00"
Instant data = Instant.parse("2024-10-30T15:15:00-"+fuso);
```

Já vai resultar o horário em GMT, é só colocar um **-** com o fuso do lugar, como de sp é -3, ele já faz o calculo.

Dá para você fazer com valores separados também, usando o método `.of()`:

```java
LocalDate date = LocalDate.of(2022, 07, 20);
		LocalDateTime dateTime = LocalDateTime.of(2022, 07, 20, 1, 30);
```

## `DateTimeFormatter` 

Para fazermos datas personalizadas, como a que a gente tá acostumado aqui no brasil → `"dd/mm/yy"`, podemos usar o `DateTimeFormatter` do java com diversos padrões.

Tem várias patterns para você definir data em java, essas podem ser encontradas nas docs:

https://docs.oracle.com/javase/8/docs/api/index.html?java/time/format/DateTimeFormatter.html

Vamos implementar o formato de data europeu:

```java
String europeanDatePattern = "dd.MM.yyyy";
DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
System.out.println(europeanDateFormatter.format(LocalDate.of(2016, 7, 31)));
```

Usamos o `DateTimeFormatter.ofPattern(<pattern>)` para criarmos datas personalizadas.

### `.parse` com pattern

~~~java
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy")

LocalDate localDate = LocalDate.parse("30/11/2024", format)
~~~

### De date para texto

Bem simples, veja:

~~~java
DateTimeFormatter format = DateTimeFormatter().ofPattern("dd/MM/yyyy");
DateTIme date = DateTime.now();

System.out.println("date: " + date.format(format));
~~~

Vai sair a data formatada no formato `dd/MM/yyyy` que definimos, podemos chamar do próprio format que também funciona: `format.format(date)`. Para fazer isso com a hora, é a mesma coisa, só definir um formato com a hora.

Agora, para formatar a partir de um `Instant`, vamos precisar usar o  `withZone(<ZoneId>)` para definir em qual formato vamos usar o `Instant`  

~~~java
DateTimeFormatter format = DateTimeFormatter().ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
// Formata para o tempo local.

Instant date = Instant.now();

// precisa chamar do formatter
System.out.println("date: " + format.format(date));
~~~

Vale falar que se é instant, precisa definir formato do tempo.

## Resumo até `DateTimeFormatter`

~~~java
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2022, 07, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}
}
~~~

~~~java
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));

		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
	}
}
~~~



## Conversão para data-hora global

Para podermos converter de uma data hora para outra data hora, vamos precisar do `zoneId` para qual queremos converter. Para isso, é muito simples:
~~~java
Instant instant = Instant.parse("2022-07-20T01:30:26Z");
ZoneId zoneId = ZoneId.systemDefault();

LocalDate localDate = LocalDate.ofInstant(instant, zoneId.);
~~~

Com isso, `localDate` será a data do instante no tempo global. Para podermos pegar as datas e formatar, seria bem simples:
~~~java
int day = localDate.getDay(); 
int month = localDate.getMonth(); 
int year = localDate.getYear(); 

int hour = localDateTime.getHour(); 
int minute = localDateTime.getMinute(); 
~~~

Qualquer um dos objetos citados, como `Instant` ou `LocalDateTime` tem esses métodos, sendo time exclusivo dos que possuem tempo.

## Cálculos com Data-Hora 

É importante dizer que os objetos Data-Hora são imutáveis, então você precisa criar outra data-hora.

Para fazer cálculos, é só usar os "métodos matemáticos" que já existem das classes filhas de `Date` (`LocalDate`, `LocalDateTime`, `Instant`): 

~~~java
LocalDate date = LocalDate.now();
LocalDate pastWeekLocal = date.minusDays(7);
LocalDate pastWeekLocal = date.plusDays(7);
~~~

Essa variável `date` também pode ser substituída por qualquer um dos "filhos de Date" que citei e no caso de `LocalDateTime`, também tem `(minus|plus)(Hour|Minute|Second|NanoSecond)`

Para fazer de uma forma mais genérica, que é "mais simples", tem como usar somente `minus()` ou `plus()` passando o valor em inteiro e um `ChronoUnit.<unidadeDeTempo>` sendo `unidadeDeTempo` podendo ser, DAYS, YEAR... Dá uma olhada lá em todas as unidades de tempo se quiser.

~~~java
LocalDate date = LocalDate.now();
Instant lastWeek = date.minus(7, ChronoUnit.DAYS)
Instant nextWeek = date.plus(7, ChronoUnit.DAYS)
~~~

Agora, digamos que precisamos calcular intervalos de tempo, quando tem entre uma hora e outra hora, para isso, calculamos a duração do intervalo, usamos a classe `Duration`:

### `Duration`

~~~java
Instant instant = Instant.now();
Instant lastWeek = instant.minus(7, ChronoUnit.DAYS);
Instant nextWeek = instant.plus(7, ChronoUnit.DAYS);

// Duration:
Duration t1 = Duration.between(lastWeek, nextWeek);
~~~

É muito importante dizer que não tem como fazer duração de `LocalDate`, você tem que converter um type que tenha unidade de tempo, para fazer isso, usamos o método `atStartOfDay()` ou  `atTime()` do `LocalDate`:

~~~java
LocalDate localDate = LocalDate.now();
LocalDate lastWeek = localDate.minus(7, ChronoUnit.DAYS);
LocalDate nextWeek = localDate.plus(7, ChronoUnit.DAYS);

// Duration:
Duration t1 = Duration.between(lastWeek.atStartOfDay(), nextWeek.atStartOfDay());
~~~

Legal dizer também que duration tem métodos de conversão, então você pode fazer um `t1.toDays` para imprimir o dia. 
