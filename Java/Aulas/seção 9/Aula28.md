# Mods 77 e 78
[Index Java](../../JavaVanilla/Index%20Java.md)
## Palavra this

mod 77  
**10/09/21**

Ele explicou o que é a palavra this.

----

## Sobrecarga

mod 78

Para criar uma sobrecarga de construtores, é só você colocar dois construtores com diferentes parametros, para um parâmetro ser opcional.

É possível também fazer um construtor padrão, definindo ele sem parametros.

~~~java
class Product{

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(double price, int quantity){
        this.name = name;
        this.price = price;
        //final quantity = 0;
    }
}
~~~
