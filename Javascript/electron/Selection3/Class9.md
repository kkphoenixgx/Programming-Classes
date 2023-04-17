# Class9
2022-10-03
tags: [[Index of electron]]

## - Mod 10 - Secondary window

In electron, we can create **more than one instance of a browser window**.

~~~js
// in main.js

let mainWindow, secondWindow

mainWindow = new BrowserWindow({
  width: 400px, height : 400px,
  webPreferences: { nodeIntegration: true }
})

secondWindow = new BrowserWindow({
  width: 400px, height : 400px,
  webPreferences: { nodeIntegration: true }
})


mainWindow.loadFile('index.html');
secondWindow.loadFile('secondScreen.html');
~~~

And to make that **secondary window** a child, **linked to the main** window, we can just informe in parameter parent when creating our window:

~~~js
mainWindow = new BrowserWindow({
  width: 400px, height : 200px,
  webPreferences: { nodeIntegration: true },
  parent: mainWindow
})
~~~

We can also use **modal: true** to make the **window "stapled"** with the main window

## - Mod 11 - 

We can also create a **window without the those borders** with close button and others just by using **frame: false**

-----------------------------------------------
## Bibliografia