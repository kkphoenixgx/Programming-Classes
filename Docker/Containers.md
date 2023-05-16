# Containers
2023-04-29
tags: [index Docker](index%20Docker.md)

Containers are virtual containers that encapsulates some app or some process, databases... Some kind of production that will be running in the container's environment  

## Setting up a Container

To run our container, we need a image, check how to create one in [Create a Image](Images.md#Create%20a%20Image)

With *imageId* that is displayed in the  last line of `docker build .` like it: "Successfully built *d2cc7b04fb0a*" we can create our container with the image running: **docker run containerId**. However, since our container has a port to connect, we publish **docker run -p 3000:3000 containerId** to fully connect our local port to the container port.

And, to shut down a container, we can run `docker ps` look out the containerName and shut down it running **docker stop containerName**

## Util command lines

* **docker ps** = show all running containers with userfull info