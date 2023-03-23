# Using native modules of node

Mod 5 -- **01/02/22**

Node modules with electron has a pretty big problem but with a easy solution, the node module that you use in your require statement generally came with the wrong version to electron runs it, so to just solve that problem we can use the electron-rebuild, you download it globally:

> npm i electron-rebuild -g

And runs it with:

> electron rebuild node-module-name
