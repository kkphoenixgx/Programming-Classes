# Aula2
2023-01-19
tags: [[../Index NLW Bootcamp]]

* Variáveis no db são separadas_assim

## Server

para salvar tabelas no prisma:

> npx prisma migrate dev

Tabelas que possuem ligação precisam de uma terceira tabela e o prisma faz isso de maneira exemplar

* crie a tabela de ligação
* @realtion faz a relação, só colocar o nome da variável com o nome da model e salvar que o vscode automatiza, olha a config do vs code em passos abaixo
* salva

![[../-img/Pasted image 20230119195438.png]]

![[../-img/Pasted image 20230119195917.png]]

O vscode pode automaticamante completar os fields para você das relations se você habilitar essa config:

~~~json
"[prisma]": {
    "editor.formatOnSave": true,
    "editor.defaultFormatter": "Prisma.prisma"
  }
~~~

Quando salvar ele vai formatar mas ele pode criar variáveis se as variáveis estiverem com nomes diferentes, então basta trocar o nome

Para vizualizar de uma forma mais organizada, podemos usar um gerador de schemas:

> **npm i -D prisma-erd-generator @mermaid-js/mermaid-cli**

~~~prisma
generator erd {
  provider = "prisma-erd-generator"
}
~~~

E para rodar:

> **npx prisma generate**

![[../-img/Pasted image 20230119210739.png]]

Dessa forma temos um DB, contudo, precisamos colocar em prática isso, criar um meio, geralmente usa-se no prisma um arquivo seed com a seguinte estrutura:

~~~ts
import { PrismaClient } from "@prisma/client";
const prisma = new PrismaClient();

async function main() {
  await prisma.habit.deleteMany();

  await prisma.habit.create({
		//block
  });
}

main()

  .then(async () => {
    await prisma.$disconnect();
  })

  .catch(async (error) => {
    console.error(error);
    
    await prisma.$disconnect();
    process.exit(1);
  });
~~~

E para criar, um exemplo de semantica:

![[../-img/Pasted image 20230119212702.png]]

-----------------------------------------------
## Bibliografia

https://www.youtube.com/watch?v=t36X5R1Zs_U