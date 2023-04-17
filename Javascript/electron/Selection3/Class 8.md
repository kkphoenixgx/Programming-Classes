# Electron API
2022-09-21 - Mod 10
tags: [[Index of electron]]

The electron API is divided in three parts: 

The main process;  
The render process;  
Shares modules

That happens because of how electron works, some modules belongs to just a part of the process. Thus, a main process module will work just in the main process. So let's cover the mostly important module of the electron, the app module, that works in the main process.

## App (main)

The app module controlls our app lifecycle. Thus we can infer that all the methods that we use to: open apps; close apps; change pages... are all controlled by the app module. 
In addition to it, we have some events that can help us to controll those methods easily: 

| event                | functionality                              |
| -------------------- | ------------------------------------------ |
| ready                | emmited when the app is ready to use       |
| before-quit*         | emmited when app is quiting                |
| browser-window-blur  | emmited when a browser window gets blurred |
| browser-window-focus | emmited when the window gets foccus        |
|                      |                                            |

| events with restriction for MAC OS | functionality                                                 |
| ---------------------------------- | ------------------------------------------------------------- |
| open-file                          | emmited when you drag some file to the app (just of MAC OS) |
| open-url                           | emmited when you open a url (MEC OS)                        |


1* = important to say that event.preventDefault() works with this.

Some of the events have a way to call it as a method and the app have some nice methods that is important to be in mind:

| event                | method way              | how it works                                                            |
| -------------------- | ----------------------- | ----------------------------------------------------------------------- |
| ready                | app.ready()             | returns if the app is ready (true/false)                                |
| -                    | app.quit()              | quites the app                                                          |
| -                    | app.exit([exitCode])    | will close the app without emmiting events                              |
| -                    | app.relaunch([options]) | restart the app.                                                        |
| browser-window-focus | app.focus()             | gives manually focus back to the app                                    |
| -                    | app.getAppPath          | returns the app's path in system                                        |
| -                    | app.getPath(name)       | with one of the names, you can request one of the user's path locations |
|                      |                         |                                                                         |

