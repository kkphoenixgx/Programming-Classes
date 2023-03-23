# Debugging a electron app

Mod 6 -- **15/02/22**

When you opem your application, there is the developer tools of chrome in the application, that will be our way to debug our application but in the application itself it's not so good, so we generally use the chrome inspector for debugging the application, so follow those steps

- Configure chrome to look for the port that your project is running on.
  You can do that defining *electron --inspect=_YOUR-PORT _YOUR-PATH* on your terminal:  
    Exemple: *electron --inspect=4000 .*  ( . = the same directory )
- And after that the app will launch but will have the chrome debug looking to it. So we can go to chrome://inspect
  - Now that you have that settings configured, you can set in *devices* -> *configure...*, the port that you set.
  - Click in the *Remote Target* -> *Your Project Path* -> *inspect*

Amd to you just stop listening for that port, you can use *electron --inspect-brk=_PORT*
