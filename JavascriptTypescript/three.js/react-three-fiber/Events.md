# Events
2023-03-26
tags: [-index React-three-fiber](-index%20React-three-fiber.md)

```jsx
<mesh
  onClick={(e) => console.log('click')}
  onContextMenu={(e) => console.log('context menu')}
  onDoubleClick={(e) => console.log('double click')}
  onWheel={(e) => console.log('wheel spins')}
  onPointerUp={(e) => console.log('up')}
  onPointerDown={(e) => console.log('down')}
  onPointerOver={(e) => console.log('over')}
  onPointerOut={(e) => console.log('out')}
  onPointerEnter={(e) => console.log('enter')} // see note 1
  onPointerLeave={(e) => console.log('leave')} // see note 1
  onPointerMove={(e) => console.log('move')}
  onPointerMissed={() => console.log('missed')}
  onUpdate={(self) => console.log('props have been updated')}
/>
```

![](img/Pasted%20image%2020230326193330.png)

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/react-three-fiber/learn/lecture/34495810#overview

https://docs.pmnd.rs/react-three-fiber/api/events
