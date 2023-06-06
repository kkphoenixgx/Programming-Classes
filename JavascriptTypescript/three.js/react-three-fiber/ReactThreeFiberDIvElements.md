# React three-fiber and derivates Divs
2023-06-06
tags: [-index React-three-fiber](-index%20React-three-fiber.md)

Para as divs que não possuem import, é simplesmente para usa-la como nativa.

* **Canvas** =  O canvas é um Canvas html especial que ajuda a renderizar os elementos do react three fiber.
	> `import { Canvas } from '@react-three/fiber'`

* **PerspectiveCamera** = É um componente para renderizar uma câmera, inclusive, facilmente manipulável.
	> `import { PerspectiveCamera } from '@react-three/drei'`

	Propriedades:
	* makeDefault = faz essa câmera ser a sua principal
	* position = define a posição [ x, y, z ] → { [ x, y, z ] }

* **OrbitControls** = Permite que a
import { OrbitControls, Edges } from '@react-three/drei'

## Mash

* **boxGeometry** = Define que o objeto será com a geometria de um cubo

* **meshBasicMaterial** = Nessa div você pode definir as propriedades base do mash
	Propriedades: 
	* **color** = define a cor do material;
	* **wireframe** = Determina se um objeto será exibido como uma malha de arame ou como um objeto sólido. Sendo true a malha de arame e false como objeto sólido