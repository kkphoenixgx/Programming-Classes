# React Hooks

Eu já fiz uma nota sobre isso no curso de three fiber, tá em inglês mas tem, dá uma olhada e, se precisar, traduz. 

![[ReactHooks#Hooks]]

## `useOptimistic()`

Optimistic UI is a technique used to improve the perceived performance of web applications by updating the UI instantly in response to user actions, even before getting a response from the server. React's experimental hook useOptimistic() simplifies the implementation of Optimistic UI by providing a way to manage temporary optimistic state alongside the true state. Internally, useOptimistic() leverages React's update mechanism but adds a special revertLane for easy switching between optimistic and true states.

