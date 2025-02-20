# Managing Containers
2024-11-08
tags: [[Containers]]

## Logs, starts, attached and detached modes

> `docker start <containerId>`

It will start your container and will run it in background.

> `docker run <containerId>`

It will run your container and will be logging log massages into your current terminal. 

Remmember you can aways run `-p` to manually bind a port to your container...

Now, in order to define if you want **attached mode** (with the terminal logging the messages) or **detached mode** (container just in background ),  you can use the flag `-d` to detached mode in `docker run`:

> `docker run -d <containerId>`

But, if you used a docker start command and you can use a attached approach by using: 

> `docker attach <dockerId | dockerName>`

This command is good if you already started a container in another mode and want to switch back to attached mode or if you started a container and want to attach it in another terminal or something like that.

However, you could have been thinking: "God dammit,  and if I start container with docker start and lost my logs", well, to this, my little genius, we have:

> `docker logs <containerId>`

Furthermore, if you want attached approach in logs, you can use `-f` flag command.

And to lovers of `docker start command`, because it's easier to remmember, we can use `-a` flag to use attached mode in `docker start`.

To summarize most important things:

![[mannagingContainers1]]

## Interactive mode 

Well, to insert data or interact with te terminal somehow, attached mode is not sufficient, so, we use `-i` to enter interactive mode and be able to input data. And, to be able to see the usual terminal interface as we input data and etc, we use `-t`. Therefore, to interact with the container, we now can combine flags and use  `-it` flag to interact with te container.

## Remmoving containers and Images

You can remmove a **container** by using `docker rm <containerNames>`, the list of container names is separated by space. Logically, you can only remmove a container that is not running.

You can also run the container with **--rm** flag to automatically remmove your container when it stops. That is actually prettty common, especially with web containers, because it will be running and you will just shut it down when you need to rebuild your container.

To show all your images, you can use `docker images` command. Futhermore, if you want to inspect your image to see futher details, you can use `docker image inspect <imageName>`.

And, you can remmove a image by running `docker rmi <imageNames>`, also separeted by spaces. However, you can only delete images that are not being used by any container.

Futhermore, if you want to delete all images, you have to use `docker image prune`