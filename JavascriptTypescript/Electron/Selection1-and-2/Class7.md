# Browser Indow part 2

Mod 9 -- **25/03/22**

We saw on last classes that we can read and load the html file that we have on our project with an outdated command, to understand well how to do it and the process some years ago, but we can view this in new way now:

> mainWindow.loadFile('path')

And take note of it, when we import BrowserWindow on our require and instance that in a new variable (usually called by mainWindow), as the exemple above, we are creating an Chromium window on our machine, and we hame a parameter that is set to have a json onh it, the first parameter of this method, so we can define the window:

~~~js

const {app, BrowserWindow} = require(electron)

let mainWindow = new BrowserWindow({
    width: 400px,
    height: 400px,
    webPreferences = { nodeIntegration: true }
})
~~~

We are in this exemple, creating that chromium window.  
The loadFile method that we saw in the first exemple is a method of that window, push yourself to understand the system. Well, so in theory, if it is a browser, we can opem a url? - Yes, my friend, we can use **mainWindow.loadURL('url')** to opem it in a browser, but that is not good and it's really a pain to wait to it complete (┬┬﹏┬┬). So to be possible we render things, it's better to load by file all of it, to make it we can use the method **once('ready-to-show')** and we can define teh window with **show: false** and just **mainWindow.show = true**, when it is ready, so:

~~~js

const {app, BrowserWindow} = require(electron)

let mainWindow = new BrowserWindow({
    width: 400px,
    height: 400px,
    webPreferences = { nodeIntegration: true },
    show: false

    // and that we use to don't have a flick of wite when loaded
    backgroundColor: '#black'
})

// mainWindow.once('event', fn)
mainWindow.once('ready-to-show', mainWindow.show = true)
~~~
