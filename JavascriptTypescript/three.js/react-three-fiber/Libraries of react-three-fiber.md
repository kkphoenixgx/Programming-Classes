# Libraries of react-three-fiber
2023-05-25
tags: [-index React-three-fiber](-index%20React-three-fiber.md)

React three fiber has some libraries that will help us in development and in coding facilities.

To understand those libraries, is important to notice that anywhere you put it, it will change for who those libraries will be executed. Exemple, [OrbitControls](Libraries%20of%20react-three-fiber.md#OrbitControls), if you put it in the scene, it will move the entire scene, if you put it in a object, it will allow you to move the object.

* Args is a common template element to define things in react:
	~~~jsx
	<someComponent args={ [] }>
	~~~
	when this component render, it will be adding the proprieties that you passed right in args, so, whenever args be mentioned, just infer that we are mention this structure, *changing args means changing args's (element) value position of the expected array.*
	
## Native Libraries

### axesHelper
[axesHelper](https://sbcode.net/react-three-fiber/axes-helper/)

This library is already imported in react, so you do not have to import nothing, just use it inside a canvas and everything will be ok.

~~~jsx
<axesHelper>
~~~

This allow us to see the axes ( x, y and z ) of the scene.

![](img/Pasted%20image%2020230525092217.png)

**Each of those lines are one unit in length**, you can change it by changing the first argument in args:

~~~jsx
<axesHelper args={ [5] } >
~~~

Now, those lines will have five unities in length.

### gridHelper
[gridHelper](https://sbcode.net/react-three-fiber/grid-helper/)

gridHelper is a native Library too, it allow you to see a grid that helps you to define where objects will be located.

![](img/Pasted%20image%2020230525094233.png)

You can change args to decide:

> **args = { [ size, divisions, primaryColor, secondaryColor ] }**

*exemple:*
~~~jsx
<gridHelper args={ [20, 20, 0xff0000, 'teal'] }>
~~~

will result in:

![](img/Pasted%20image%2020230525095435.png)

And grid is a Object3D of thee.js, so you can change positions and all those default atributes

## Non-native Libraries

### drei

"drei" is a collection of libraries of Three.js re-implemented to react-three-fiber.

> **npm install @react-three/drei**

#### Stats Panel
[Stats Panel](https://sbcode.net/react-three-fiber/stats/)

The stats panel allow us to quickly control and see informations  about the scene.

To use it, just import after installing drei:

~~~jsx
import { Stats } from '@react-three/drei'

/* Note:
	<Stats/> → use it anywhere you want inside a Canvas
*/
~~~

#### OrbitControls
[OrbitControls](https://sbcode.net/react-three-fiber/orbit-controls/)

This allows us to just control with the mouse the scene.

~~~jsx
import { OrbitControls } from '@react-three/drei'

/* Note:
	<OrbitControls/> → use it anywhere you want inside a Canvas
*/
~~~

There is a lot of things that you can do, a lot of proprieties that you can dive in [documentation](https://threejs.org/docs/#examples/en/controls/OrbitControls) 




### leva
[Leva](https://sbcode.net/react-three-fiber/leva/)

Leva is basically a control panel that you can bind values into a panel that can be changed with the program running

> **npm install leva**

~~~jsx
import { useControls } from "leva"

const valueName = useControls({
	value: 'someValue' // ex: value: 'green'
})
~~~

Since you've added it, you can change this value into a panel in the app and you can attach valueName.value to anywhere. 