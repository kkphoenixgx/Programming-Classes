# Aula20
2022-10-21
tags: [[../Index of typescript]]

## - Mod 38  - Criando métodos :

~~~ts
class Professor{

    name: string;
    idade :number;
    notas :number[];

    constructor(name: string, idade: number, notas :number[]){

        this.name = name;
        this.idade = idade;
        this. notas = notas;
    }

    toString() :string{
        return `Seu nome é ${this.name} e você tem ${this.idade}`;
    }

    calculateGrade() :number{

        let gradeSum :number = 0;
        this.notas.forEach(grade => {
            gradeSum = gradeSum + grade;
        });
  
    return gradeSum / this.notas.length;

    }
}

const kkphoenixgx = new Professor('Kauã', 17, [7,7,7,7]);
console.log(kkphoenixgx.calculateGrade());
~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-online-typescript/learn/lecture/25500310?start=15#overview