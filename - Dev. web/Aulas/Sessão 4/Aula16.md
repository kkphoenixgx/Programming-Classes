# Usando plugin OwlCarrousel2 do Jquery

Mod 35 -- **19/08/21**

No Oc, como eu carinhosamente apelidei o plugin, precisamos aparentemente de uma div nas imagens para ele trabalhar e tem outras duas classes são necessárias para ele funcionar, que são:

owl-carousel = plugin na div
owl-Theme = essa pode setar o tema

Refatorando hoje - **07/01/22**

## Balela de informação nada relevante para quem tá lendo isso fora do tempo

Opa, bom, quanto tempo, o que aconteceu aqui foi bem simples mas bem chato, eu nunca mexi com plugins na vida e não consegui continuar seguindo, então o que aconteceu, eu só dropei e nas minhas férias eu descobri como usa o owl.carousel2, e na real não é que eu não sabia antes, eu não sabia no momento do curso usar node, então o que acontece, vamos refatorar

> npm i carousel2

Vai instalar o carousel2 e fique atento com os seguintes detalhes:

* Seu jquery deve ser a primeira importação, independente se você ta usando o defer do ES6 ou não, então só vai, obviamente depois você deve importar o bootstrap e depois disso tudo o carousel2, logo depois de importar o main file do carousel2, você deve importar os temas que você vai usar.

segue o trecho das minhas importações usando ES6:

~~~html
<link rel="stylesheet" href="./view/css/orlando.css">

<!-- dependencies -->

<!-- jquery -->
<script src="node_modules/jquery/dist/jquery.min.js"></script>

<!-- owl corousel 2 -->

<link rel="stylesheet" href="node_modules/owl.carousel2/dist/assets/owl.carousel.min.css">
<link rel="stylesheet" href="node_modules/owl.carousel2/dist/assets/owl.theme.default.min.css">

<script src="node_modules/owl.carousel2/dist/owl.carousel.min.js"></script>

<!-- font awesome -->
<script src="https://kit.fontawesome.com/c4e6061e97.js" crossorigin="anonymous"></script>

<!-- Bootstrap 5.1.3 -->
<script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="node_modules/bootstrap/dist/css/bootstrap.min.css">
~~~

* O jeito de usar o jquery agora não é mais o mesmo, fique atento.

Segue o trecho do jquery do meu código agora usando módulos do ES6:

~~~js
export function startThumbnail(){
    
    $(document).ready(function(){
        $(".thumbnails").owlCarousel({
            items: 4,
            loop:true,
            margin:10,
            nav: true,
            navText: ["<",">"],
            responsive:{
                0:{
                    items: 1,
                },
                180:{
                    items: 3,
                },
                480:{
                    items: 4,
                },
                768:{
                    items: 5,
                },
                1080:{
                    items: 6,
                }
            }
        });
    });
    
}
~~~
