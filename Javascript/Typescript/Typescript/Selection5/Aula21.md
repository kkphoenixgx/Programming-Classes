# Aula21
2022-10-22
tags: [[../Index of typescript]]

## - Mod  - 39 : Herança

* Quando chamamos o super(), na realidade, chamamos o construtor da classe pai

~~~ts
class Human{

    name: string;
    age: number;

    constructor(name :string, age: number){
        this.name = name
        this.age = age
    }
    toString() :string{
        return `Seu nome é ${this.name} e você tem ${this.age}`
    }

}


class Professor2 extends Human{

    notas :number[]
    
    constructor(name :string, age :number, notas :number[]){

        super(name, age);
        this.notas = notas
    }

    calculateGrade() :number{

        let gradeSum :number = 0
        this.notas.forEach(grade => {
            gradeSum = gradeSum + grade
        })

		    return gradeSum / this.notas.length

    }

  

}

const professor = new Professor('Kauã', 17, [7,7,7,7])
console.log(professor.toString());
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500324?start=15#overview