# Interfaces
2024-09-23
tags: [[☕ indexJava]]

- **Interface** = contrato de métodos que uma classe deve implementar.
- Não tem corpo nos métodos (só a assinatura).
- Classe usa `implements` para assumir esse contrato.

```java
interface DrawingTool {
    void draw(String shape);
}
```

```java
class Pencil implements DrawingTool {
    public void draw(String shape) {
        System.out.println("Desenhando " + shape + " com lápis");
    }
}
```

```java
class Brush implements DrawingTool {
    public void draw(String shape) {
        System.out.println("Pintando " + shape + " com pincel");
    }
}
```

Uso:

```java
DrawingTool tool = new Pencil();
tool.draw("círculo");
```

**Vários implements**: uma classe pode implementar várias interfaces:

```java
interface Fly { void fly(); }
interface Swim { void swim(); }

class Duck implements Fly, Swim {
    public void fly() { System.out.println("Pato voando"); }
    public void swim() { System.out.println("Pato nadando"); }
}
```

**Constantes em interface** (são sempre `public static final`):

```java
interface Config {
    int MAX_USERS = 100;
}
```

**Default methods** (com corpo):

```java
interface Tool {
    default void info() {
        System.out.println("Sou uma ferramenta");
    }
}
```


##  `Comparable`

A interface `Comparable` do java diz que um objeto é comparável a outro objeto por meio de um método chamado `compareTo(other)` sendo `<other>` um outro objeto da mesma classe. Para usar é só implementar o comparable e você mesmo fazer o critério de comparação no `compareTo(param)`.
