# App structure

Mod 4 -- **01/20/22**

Electron runs with two different process of running an application, **The main process** that is an node.js process and the **Renderer process** that creates an instance of the browser and exactly as the web development, we can deal those two parts as front-end, the Renderer process, and back-end, the main process of the application.

## How that works?

Well, I promptly recommend you to check the main.js file for yourself, but I will guide you up ^^

We can see that the main.js file contains a function that creates an window with the required module of electron **"BrowserWindow"** that may have an class that contains the methods used on the file, so somehow we create an window when the window loads with the method loadFile of that class, and the class read the html file.
In the html file we require node and the module that will render the backend with node.js, the module that render it is the file *renderer.js* that will render the back-end process with all the node.js apis and functions if in the **webPreferences** in BrowserWindow the **nodeIntegration:** sets true and with that we use require() of node to render the backend process in the *renderer.js* file.

## Updating the window

We can use ctrl + r to update the window manually but with our project there is a command sets as "npm run *watch*" that runs nodemon and make our application reload alone and with nodemon, the logs in the function create window will be in the terminal as the window load.
