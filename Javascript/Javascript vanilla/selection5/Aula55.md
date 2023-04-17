# Consumindo Rotas, POST PUT e DELETE com restify

Mod 84 -- **16/11/21**

Até o momento se formos ver de fato, só usamos até agora na rota users do nosso site o método get e ele precisa ter novos methods para rodar normalmente

**Lembre que**: :x no oath significa que estamos falando da variável x ex: **/users/:id**, estamos falando do users com um id, o id é uma variável mutável, mas por exemplo, em um método que estamos passando uma url de um id abstrato, deveriamos usar uma template string por exemplo, requirindo a variável id.

> req.params.id

Outra coisa para se lembrar é que o delete assim como os outros métodos, ele só tem 3 digitos, ao invés de delete, fica del.
