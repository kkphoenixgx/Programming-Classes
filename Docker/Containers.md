# Containers
2023-04-29
tags: [index Docker](index%20Docker.md)

Containers are virtual containers that encapsulates some app or some process, databases... Some kind of production that will be running in the container's environment  

## Setting up a Container

To run our container, we need a image, check how to create one in [Create a Image](Images.md#Create%20a%20Image)

With *imageId*, what is displayed in the  last line of `docker build .` like it: "Successfully built *d2cc7b04fb0a*" we can create our container with the image just running: **docker run imageId**. However, since our container has a port to connect, we publish **docker run -p 3000:3000 imageId** to fully connect our local port to the container port.

And, to shut down a container, we can run `docker ps` to show the containerName and shut down it running **docker stop containerName**

### Util note:

As an additional **quick side-note**: For **all docker commands** where an **ID** can be used, you **don't always have to copy** / write out the **full id.**  
You can also **just use the first (few) character(s)** - just enough to have a unique identifier.

So instead of:
> **docker run abcdefg**

You could also run:
>  **docker run abc**

Or, if there's no other image ID starting with "a", you could even run just:
> **docker run a**

This applies to ALL Docker commands where IDs are needed.

~ [udemy lecture course's note](https://www.udemy.com/course/docker-kubernetes-the-practical-guide/learn/lecture/22181376#overview)

## Util command lines

* **docker ps** = show all running containers with userfull info
	* **-a**: Show all containers