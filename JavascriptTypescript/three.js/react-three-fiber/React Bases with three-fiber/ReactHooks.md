# React Hooks
tags: [-index React-three-fiber](-index%20React-three-fiber.md) [-Index react and native](-Index%20react%20and%20native.md)

## Hooks

### `useRef()`

~~~js 
import { useRef } from 'react'
~~~

This allows us to just reference some mash object or any object in react using in a tag element `ref={refVariable}`

~~~js
import {useRef} from 'react'

export default function Component (props){
	const ref = useRef()
	
	return(
		<mesh {...props} >
			<boxGeometry ref= {ref}/>
		</mesh>
	)
}
~~~

### `useEffect()`

~~~js 
import {useEffect} from 'react'
~~~

The `useEffect` just start running after components are loaded. 

### `useFrame()`

~~~js 
import {useFrame} from 'react'
~~~

Basically, is a frame loop, it will be executed 60 times a frame, it has a delta param that will be used to move something.


**WOW, I did not know that if you write _ in the parameter, js just ignores it... That is pretty userfull**

### `useState()`

~~~js 
import {useState} from 'react'
~~~

The `useState` hook allow us to re-render objects when we change a propriety automatically, we can not change a object's variable, for example, let color = 'blue'; color = 'green'; the object is not going change because we do not re-rendered it, changing variables;

### `useMemo()`

~~~js 
import {useMemo} from 'react'
~~~

To do not lose data in state changes, we have to use this **`useMemo`** hook, imagine if you have to create a new three.js mesh object, this will be created in production so it will be created every time. However, it cannot be recreated every time that the state changes, the performance of the react app will be really, really bad if you do so...

> `const someName = useMemo( () => fn, [dependencies] )`

Thus, we create this mesh in a `useMemo` hook:

~~~js
import { useMemo } from 'react'
import * as THREE from 'three'

const geometry = useMemo( () => new THREE.BoxGeometry(), [] )
~~~


-----------------------------------------------
## Bibliography

https://sbcode.net/react-three-fiber/use-ref/

https://sbcode.net/react-three-fiber/use-effect/

https://sbcode.net/react-three-fiber/use-frame/

https://sbcode.net/react-three-fiber/use-state/

https://sbcode.net/react-three-fiber/use-memo/