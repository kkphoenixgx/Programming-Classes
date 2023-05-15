# Docker Diccionary
2023-04-29

* **docker build path** = Create a image by a Dockerfile in the selected path, generally just ".", in the current path
* **docker run containerId** = Run a container by it's id, containerId
	* **-p** = select a port to bind with, like *-p 3000:3000*. This mean: select the container that will run in port 3000 of docker (0.0.0.0:300) and run it in the local port 3000.  
* **docker ps** = show current ports
* **docker stop containerName** = It will shut down the container that has the containerName 