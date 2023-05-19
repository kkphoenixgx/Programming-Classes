# Docker Diccionary
2023-04-29
[index Docker](index%20Docker.md)

* **docker build path** = Create a image by a Dockerfile in the selected path, generally just ".", in the current path
* **docker run imageId** = Creates a container using a image identified by the image's id 
	* **-p** = select a port to bind with, like *-p 3000:3000*. This mean: select the container that will run in port 3000 of docker (0.0.0.0:300) and run it in the local port 3000.
	* **-it** = This categorize the container as a interactive container and it means that it will be able to run comands from the container
* **docker ps** = show current ports
	* **-a** = will show all the containers
* **docker stop containerName** = It will shut down the container that has the containerName 
