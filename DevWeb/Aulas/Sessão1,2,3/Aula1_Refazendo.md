Tudo que eu escrever até o mod 24 é que eu tô reescrevendo 
aqui no notepad, então as datas vão estar em uma data antiga
porém a partir do mod 24 eu devo colocar as datas, estou 
começando a reescrever em 28/05/21

---------------------------------------------------------------------------------------------
mod 2                                                                                                    30/03/20

-Sobre a profissão de front end (cuida da imagem) X back end (que
cuida dos códigos) que antes eram os web masters e os web de-
signs e os responsivos que se adaptam em outros pelo celular
ou pelo computador
---------------------------------------------------------------------------------------------
mod 4 

-Arquivo modelo HTML5

Todo comando em html se chama tag, tem abertura e fechamen-
to com < > e </>
ex:
<html> </html>
---------------------------------------------------------------------------------------------
mod 5
-Html é pai de gêmeos

head->
-É o filho mais tímido que não aparece muito 
-Em html todo comando que é chamado de tag HEAD fica na 
frente do código e é onde as principais informações ficam 
para executar o príncipal como o estilo do programa (CSS),
o utf-8 e etc...

Body->

-É o filho que mais aparece e geralmente fala bastante, 
-É onde fica todo o conteúdo do site e o que o usuário tem que 
interagir.
--------------------------------------------------------------------------------------------
mod 6 

Endentação HTML 

A tag script fica no final do body, ela serve para você associar o
arquivo de back end do site e fica melhor também para carregar 
o site no final, que os arquivos mais pesados ficam no final.
--------------------------------------------------------------------------------------------
mod 8                                                                                                   31/03/21 

-Introdução a css

    Header é o seletor para colocar as informações do css, as pessoas 
geralmente só colocam na tag e o css mas isso fica feio e pesado,
para um clean code melhor, é bom criar um código mais limpo 
visivelmente e fica melhor com o tempo para você organizar o 
código.

    Dentro do css tem alguém "atributos" não me lembro o nome 
agora, mas basicamente você pode determinar valores a esses 
atributos que eles vão moldar a tag do jeito que você quiser.
    Exemplos bons disso são os simples height e width, que 
determinam altura e largura em px. 
    Outro bem usado é o background que determina uma cor em 
RGB
header {
	width: 100%;
	height: 200px;
	background: #ccc;
}

Falando em RGB, vai uma pequena explicação:

R: red (vermelho)
G: green (verde)
B: Blue (Azul)

cada um tem duas casas decimais e para ficar mais fácil abreviam 
eles com 3 caracteres ex: #000, essas cores vão de branco que é
F  a preto 0.
---------------------------------------------------------------------------------------------
mod 9                                                                                                   10/04/20

-Introdução ao Js 

alert("x") é uma função pré definida que dá um alerta na tela do 
computador, uma cachinha que fica no meio  da tela e o confirm
é um alert, mas ele pode retornar algo.
var declara variáveis em java script.
na utilização de métodos em classes já pré definidas, se utiliza 
o . igual no java, então fica bem simples assimile entender 
um console.log(), nós estamos chamando o método log do objeto
console do navegador, onde provávelmente você vai debugar 
códigos.

// e /**/ comenta normal em js 
operadores também normal

chama função com function x(){Bloco de código;} normal

e pode criar function em escopo global, sem precisar de classes.

---------------------------------------------------------------------------------------------
mod 10                            27/05/20 mas eu refiz e escrevi em 28/05/21
-JavaScript com formulário

Duvidas sobre Tags em Estudando_A_Fundo1.txt


   Utilizamos const para constantes, só declarar que a variável é
uma constante, bem rápido.
const a = 10;

   Os eventos do javascript são bem conhecidos e realmente mágicos,
o js escuta tudo que tá acontecendo por padrão se colocarmos a 
função event no código e esse event se cria com um simples 

document.querySelector()

    Ou seja, ele tá chamando o método querySelector() do objeto 
document que é uma classe padrão do js

  Esse querySelector serve para você selecionar algo na tela por 
um atributo id da tag, sem o #, e o add.EventListener() é uma 
função do js para escutar que eu comentei.

   No js tem uma forma muito lógica de chamar essas duas funções

que é somente falar:
document.querySelector(#id).addEventListener("x", e o que vc 
quer executar.);

   O que vc quer executar pode ser até uma função dentro dessas 
duas funções.
   Isso aí é um call back, ou seja, uma função anonima.
   O x da função nada mais é do que a ação que vc quer escutar e 
essa ação deve ser uma string entre "".
    Inclusive, o querySelector pode ser usado até como o valor de 
uma variável que ainda vai existir dentro do contexto do site
    
Uma função global incrível, realmente assim que chega dá água
na boca é o parseInt(x) que transforma a variável x em inteiro 

NOOOOOOSSA, olha isso men, chega da um sentimento bom 
assim, nossa

NOOOOOOOOOOOOOOOOOOOssa meu, olha isso meu 
para vc selecionar o  valor que tá no formulário é só 
botar uim .value
AIII que delicia, minha nossa nossa nossa.


O if é normal.... 

---------------------------------------------------------------------------------------------
mod 11                                                                                                03/09/20

Introdução ao Bootstrap

   As pastas .min. são pastas compactadas sem espaços nem
comentários e são mais leves para se aplicar em um site.
   Você só vai usar o outro arquivo normal se você for editar coisas
do bootstrap.

   O atributo class é colocado como um atributo de uma tag. E o
bootstrap como eles mesmo falaram funciona como um lego, você
coloca a classe que você quer e ele altera a forma.

---------------------------------------------------------------------------------------------
mod 12                                                                                                03/09/20

- Entendendo a documentação do Bootstrap 

link: https://getbootstrap.com/css

     Espaços no atributo class é como se tivesse adicionando outra 
classe na tag 

O atributo required do bootstrap serve para você fazer um campo
de um formulário um requisito

A classe padrão para as divs são form-group

A classe padrão do bootstrap para o objeto ser formulado como 
um item do bootstrap é a classe form-control.
---------------------------------------------------------------------------------------------
mod 12                                                                                                09/10/20
Exemplo de até onde vai o final da linha                                                 *

Formulários HTML -

A tag <label></label> é para dizer para o navegador que o que tá 
dentro dessa tela, é enviado junto com ela. Ou seja, falar que é 
um formulário preenchível  

alguns atributos utilizáveis comumente são:

required serve para algo que é obrigatório no bootstrap, dá para
fazer um campo ser obrigatório para enviar o formulário indepen-
dente do método. Ele é geralmente posto no final de todos
os atributos da tag.

    Placeholder serve para colocar um texto sugestivo dentro do 
input.

input é uma tag para partes do formulários onde o usuário é 
capaz de colocar partes responsivas.

a tag label, permite você colocar uma descrição para aquele
campo, podendo ser qualquer string

    O type é sempre muito utilizado para definir o type da tag
em um input ou uma label e entre esses types tem: email, nome,
 senha, data...
    Uma coisa muito legal com o type data é que essa propriedade 
vem com a capacidade de colocar um calendário no input que 
antes só dava com um plugin e ele com um min = "x" e um
max = "x" ele determina qual os limites. 

    Uma dúvida muito decorrente quando vai se programar, é que 
o type do botão para ele conseguir enviar um formulário, deve ser 
um type submit.
     Num formulário, o ideal é ter um method na label com o méto-
do que você vai fazer para enviar arquivos nesse formulário e 
action é para qual arquivo vai.
    O maus usado nesse quesito é usar o Post.

Vou testar TODAS as funcionalidades do bootstrap. Então devo ficar
com essa ideia aí sem fazer por um tempo.
----------------------------------------------------------------
mod 13                                                  17/09/20

Formulário parte 2-

Depois desse módulo, decidir escrever tudo pelo vs code mesmo
pois tem umas extensões muito úteis.

Ainda em formulários usando bootstrap

  O type radio faz um botão redondo de seleção como um checkbox
porém com um uma borda arredondada e uma informação muito 
valiosa para esse tipo de assunto, names iguais, pelo menos 
de radio, só pode existir uma selecionada, isso acontece 
por que você não pode enviar duas mensagens para um booleano
em php por exemplo, se tivesse um retorno true ou false lá,
não iria conseguir fazer nada e iria dar um erro. 
  Usando a classe form-control, esse rádio de fato fica gigante
então se tirar fica pequeno.

Então um input de type radio dentro de uma div com a classe 
form-group para identificar como um item do bootstrap fica
redondinha. E duas dessas com o mesmo name ficam com somente 
uma podendo ser preenchida.

O mesmo tipo de input pode ser aplicado porém com o type 
citado  e muda o input.

    text = cria quele preenchimento para nome e etc...

    checkbox = ele fica quadradinho como um checkbox mesmo.

    Range = cria um ajustador parecido com um de aumentar e 
    diminuir o volume.

    number =  um preenchimento para nome igual o text mas com 
    setinhas do lado para aumentar e diminuir.

    color = faz abrir com uma cor padrão e ao clicar abre a 
    seleção de cor do sistema operacional.

    meter = mostra para o usuário o valor padrão de uma caixa
    de loading, como um progress e um meter.

    Url = faz você digitar em um campo text uma url que deve
    ser valida.

    search =cria uma daquelas text área que tem varias opções 
    de busca conforme você digita 


O legal do css e do bootstrap é que vc percebe que os atributos
se repetem, como o checked que serve para já vir marcado
o campo. Então pense por lógica, faz sentido ele ter esse atri-
buto? Se sim, aplique e e teste.

checked = já deixa marcado
min = o limite minimo 
max = o limite máximo
value = é o valor padrão que o objeto vai iniciar.
step = faz pular de tanto em tanto.
selected = já deixa selecionado.

Uma tag bem interessante de se usar é o meter, que é tipo
uma bateria que pode por exemplo programável para aparecer 
a quantidade de bateria do usuário.
Ele tem um atributo bem interessante que pelo que sei até
agora, só ele pde usar que é o low, que você define o o quanto
seria considerável baixo para a bateria.

 <meter></meter>

progress que é uma barrinha de loading :

<progress min = "x" max = "x" value "x"></progress>

textarea = que é uma área que você pode escrever mais de uma 
linha

<textarea></textarea>

Select que é uma tag para a pessoa selecionar algo, por exemplo
um estado, país, bairro que deve ser acompanhada com uma tag 
option para determinar as opções do select.

<select>

<option value = "x">x</option>

</select>

---------------------------------------------------------------
mod 15                                                 20/09/20

Formulários 3                               refeito em 04/06/21

No módulo 14, tínhamos em mente que existe uma tag select
e uma tag option, para determinar uma seleção e suas opções,
mas e se você quiser agrupar essas seleções?

Simples, use uma optgroup e se quiser mostrar a divisão
com algo escrito usa o atributo label Ex:

<select>

    <optgroup label = "x">

        <option value = "x1">x1</option>
        <option value = "x2">x2</option>
        <option value = "x3">x3</option>

    </optgroup>
    <optgroup label = "y">

        <option value = "y1">y1</option>
        <option value = "y2">y2</option>
        <option value = "y3">y3</option>

    </optgroup>

</select>

Nessa aula aprendemos: os types: hidden, password, month, week,
time, <datalist>, autofocus, tabindex, disable e readonly

Então adiciona tudo dessa aula no dicionário =
    Tags:
        <div> = Divisão
        <select> =  Um lugar de seleção
        <options> = uma opção
        <optgroup> = Um agrupamento de opções
        <datalist></datalist> ele é um section que vai aceitar
        qualquer valor e enviar, mesmo que não exista no banco
        de dados.


    Atributos:
        type = O tipo da tag.

        checked = já deixa marcado

        min = o limite minimo 

        max = o limite máximo

        value = é o valor padrão que o objeto vai iniciar.

        step = faz pular de tanto em tanto.

        selected = já deixa selecionado.

        autofocus = quando entrar na página ou dar um f5
        seleciona o campo para escrever por exemplo.

        tabindex = ele basicamente faz quando você usar o tab
        ele vá para o proximo elemento do tabindex.

        disable = ele desabilita o campo, para não conseguir es-
        crever no campo.

        readonly = faz poder somente ver e copiar.


    types:
        text = cria quele preenchimento para nome e etc...

        checkbox = ele fica quadradinho como um checkbox mesmo.

        Range = cria um ajustador parecido com um de aumentar e 
        diminuir o volume.

        number =  um preenchimento para nome igual o text mas com 
        setinhas do lado para aumentar e diminuir.

        color = faz abrir com uma cor padrão e ao clicar abre a 
        seleção de cor do sistema operacional.

        meter = mostra para o usuário o valor padrão de uma caixa
        de loading, como um progress e um meter.

        Url = faz você digitar em um campo text uma url que deve
        ser valida.

        search =cria uma daquelas text área que tem varias opções 
        de busca conforme você digita 

        hidden = faz ele não aparecer para o usuário.
        
        pasword = ele faz um campo para senha, toma cuidado 
        para não colocar um value nesse type para não dar para
        ver pelo dev tools a senha.

        month = cria igual um calendário para para pegar o mês

        week = igual o month, mas como semana

        time = cria um input para escolher o tempo.