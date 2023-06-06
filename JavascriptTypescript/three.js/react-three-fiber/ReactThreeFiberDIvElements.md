# React three-fiber and derivates Divs
2023-06-06
tags: [-index React-three-fiber](-index%20React-three-fiber.md)

Para as divs que não possuem import, é simplesmente para usa-la como nativa.

## React three fiber

* **Canvas** =  O canvas é um Canvas html especial que ajuda a renderizar os elementos do react three fiber.
	> `import { Canvas } from '@react-three/fiber'`

### Mash

* **boxGeometry** = Define que o objeto será com a geometria de um cubo

* **meshBasicMaterial** = Nessa div você pode definir as propriedades base do mash
	Propriedades: 
	* **color** = define a cor do material;
	* **wireframe** = Determina se um objeto será exibido como uma malha de arame ou como um objeto sólido. Sendo true a malha de arame e false como objeto sólido

## Drei


* **PerspectiveCamera** = É um componente para renderizar uma câmera, inclusive, facilmente manipulável.
	> `import { PerspectiveCamera } from '@react-three/drei'`

	Propriedades:
	* makeDefault = faz essa câmera ser a sua principal
	* position = define a posição [ x, y, z ] → { [ x, y, z ] }

* **OrbitControls** = Permite que para onde a câmera está apontando seja movimentado com o mouse.
	> `import { OrbitControls, Edges } from '@react-three/drei'`


* **Edges** = Cria uma div que pode configurar com outras divs as bordas do mesh em questão.
	Divs relacionadas:
	* **edgesGeometry** =  Define que vai realmente ter bordas na mesh
		propriedades:
		* **attach**: Define quem vai receber essa borda. Dessa forma, ao definir `atach = "geomety"`, por exemplo, ele vai por hierarquia procurar o geometry do objeto que o attach está sendo vinculado e vincular a borda a ele.
	* **lineBasicMaterial** = define o material da borda.
		* **attach**: Define quem vai receber o material da borda. Dessa forma, ao definir `atach = "material"`, por exemplo, ele vai por hierarquia procurar o mesh mais próximo, que o attach está sendo vinculado, e vincular o material da borda a ele.
		* **color**: Vai definir a cor da borda
		* **linewidth** = Vai definir a grossura da linha


