# App

Mod 6 -- **18/03/22**

The electron API have 3 parts:

* Main process
* Render process
* Main and Render

The app instance, that controls your application event lifecycle, and there is some events that are fundamentals to the process

* **Ready** = That makes something when things are ready

  ~~~js
  app.on('ready', ()=> { console.log('hi'); createWindow() } )
  ~~~

  There is some features that we can use to be easily to construct some code, like the **app.isReady()** that returns a bool if the process is ready or not

* **before-quit** = do a fn when the process will quit

  ~~~js
  app.on('before-quit', (event) => { console.log('quit') })
  ~~~

  A feature that is really good is we can use the event of the fn to use a method like *preventDefault()* and that will work.

There are some features that are just for one platform and we have to make exceptions to make things fell good

And there is a lot of good events that we can do, check [documentation of electron](https://www.electronjs.org/pt/docs/latest/api/app) to more information

## Get User information

To get user information on the **client-side** of electron, you have to use the app.getPath method that helps a lot

* **getPath('name')**

~~~js
app.on('ready', ()=>{
  console,log('Desktop Path: ' + app.getPath('desktop'))
  console,log('music Path: ' + app.getPath('music'))
  console,log('temp folder Path: ' + app.getPath('temp'))
  console,log('userData Path: ' + app.getPath('userData'))

  createWindow()
})
~~~
