# Módulos 21 e 22

## Programação Assíncrona com promises

Mod 21 -- **20/01/22**

Ele explicou o que é uma promise. Vou até fazer mais uma aula

~~~js
function Somar(value1, value2){
    return new Promise( (resolve, reject) => {
        if(typeof value1 =! 'number' && typeof value2 =! 'number') return
        
        try{
            setTimeout(function(){
                resolve(value1 + value2)
            },3000)
        }
        catch(error){ reject(error) }
    })
}

somar(10+20).then( result=>{
    console.log(`That is the result of your count Sir: ${result}`)
});
~~~

## Entendendo Async and Await

Mod 22 -- **20/01/22**

O async e o await só são usados quando possuímos mais de uma coisa em andamento, pois o intuito deles é não escrever tanto código quando em uma promise padrão se escrevermos vários then e catch, usamos ele para fugir do famoso inferno de promessas.

~~~js
function Somar(value1, value2){

    if(typeof value1 != 'number' && typeof value2 != 'number') return
    
    return new Promise( (resolve, reject) => {
        
        try{
            setTimeout(function(){
                resolve(value1 + value2)
            },3000)
        }
        catch(error){ reject(error) }
    })

}

function Multiplicar(value1, value2){

    if(typeof value1 != 'number' && typeof value2 != 'number') return

    return new Promise( (resolve, reject) => {
        
        try{
            setTimeout(function(){
                resolve(value1 * value2)
            },3000)
        }
        catch(error){ reject(error) }
    })
}

function Divisão(value1, value2){
    
    if(typeof value1 != 'number' && typeof value2 != 'number') return

    return new Promise( (resolve, reject) => {
        try{
            setTimeout(function(){
                resolve(value1 / value2)
            },3000)
        }
        catch(error){ reject(error) }
    })
}

async function main(value1, value2){

    try{ 
        console.log(`O resultado da sua soma é ${await Somar(value1, value2)} O resultado da sua multiplicação é ${await Multiplicar(value1,value2)} e o da sua divisão é ${await Divisão(value1, value2) }`);
    }catch(error){
        console.log(error)
    }
}

main(3, 10)
~~~

> **O resultado desse código foi:**  
O resultado da sua soma é 13 O resultado da sua multiplicação é 30 e o da sua divisão é 0.3

Isso mostra o quão poderoso é esse processo.
