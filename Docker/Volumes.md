# Volumes
2025-04-17
tags: [[🛳️ indexDocker]]

A container with an app is different than a container with data, with a database.... Those are called Volumes. Images are read only, once your app is running, you cannot change it, in other hand, volumes must be changed

![[DockerContainerImageReadWritePolice.png]]

See: There is different  data types

![[Types of Data.png]]

If you remove a container that is running, all data is gonna be erased, if you stop and start, that is not going to be erased, however, "how you are going to update the container without recreating it?", that is the problem with the application approach.

Well, now, let me introduce you to Volumes, those are folders in your host machine that will be mounted in your container, a way to save before restarting a container. That is different of copy instruction in Dockerfile because copy just take a snapshot and Volumes are real time, those are connected and sync

![[DockerUnderstandingVolumes.png]]

To create a volume, we can add to our Dockerfile a `VOLUME` command, but **that is not going to work**, if you are trying to save our feedback, because we are using **Anonymous Volumes**.

```Dockerfile
VOLUME ["/app/feedback"]
```

*Suppose `/app/` as your `WORKDIR`.

In the structure ahead, we are defining just the path inside our container, to manage a volume that there is no output path, we have `docker volume`  command

## `docker volume` CLI command

* `docker volume ls` to show all volumes

Run Dockerfile with `VOLUME ["/app/feedback"]`, see `docker volume ls`, remove the container and then rerun it.

## Anonymous Volumes

Anonymous Volumes are volumes that will be removed when container stop. That is why `VOLUME ["/app/feedback"]` did not helped us.

```Dockerfile
FROM node:14

WORKDIR /app

COPY package.json .

RUN "npm install"

COPY . .

VOLUME ["/app/feedback"]

EXPOSE 80

CMD ["node", "server.js"]
```

Anonymous volumes will be removed when you start / run a container with the `--rm` option.

If you start a container without `--rm`, the anonymous volume will **NOT be removed,** even if you remove the container with `docker rm <container>`

Still, if you then re-create and re-run the container (i.e. you run `docker run ...` again), a new anonymous volume will be created. So even though the anonymous volume wasn't removed automatically, your container will not use this anonymous volume, will use the new one.

You can clear them with `docker volume rm VOL_NAME` or `docker volume prune`.

To create a anonymous volume in CLI, we run >`-v <containerFolder>`

## Named Volumes

Well, now, with named volumes, the volume will not be erased from your computer. *You cannot create a named volume inside your Dockerfile*, you will have to create it when running a container with `-v` flag

> `-v <localFolder>:<containerFolder>`

ex: 

> `docker run -p 3000:80 --rm -v feedback:/app/feedback --name feedback volumes feedback-node:latest`

## How multiple Volumes work

Let's imagine that we have now two volumes, one inside other, how will that work? If you imagine that scenario, the "dad" volume will overwrite our child volume and that is not what we want. We want two volumes. So, docker always "save" volumes with  longest path, those will be maintained on overwriting.

## Bind Mounts

Bind mounts help us binding our code to our container, to do not depend on recreating containers for every change. This is simply by creating a named volume that is actually our project folder, check it out: 

**// !!!! CONTINUE READING, THAT IS NOT THE FINAL COMMAND**

> `-v <project-folder>:<workdir-folder>`

check the second `-v` flag:

> `docker run -p 3000:80 --rm -v feedback:/app/feedback -v "/home/kkphoenix/Documents/Workspace/docker_course/data-volumes-02-added-dockerfile:/app" --name feedback volumes feedback-node:latest`

You can also run `pwd` in linux/mac if you are inside that folder

> `docker run -p 3000:80 --rm -v feedback:/app/feedback -v $(pwd):/app --name feedback volumes feedback-node:latest`

or `-v "%cd%":/app` in Windows

> `docker run -p 3000:80 --rm -v feedback:/app/feedback -v "%cd%":/app --name feedback volumes feedback-node:latest`

You will have to give permission to docker to create a bind mount and use a bound mount if you are in mac or in windows

![[DockerVolumesBindMountPreferencesAccess.png]]

However, you are not installing dependencies when binding. How can we solve that? Simple, we can create another volume, now anonymous that will be maintained when docker overwrite the container. 

I am a linux user, if you are on windows you deserve to suffer a little (¬‿¬).

> `docker run -p 3000:80 --rm -v feedback:/app/feedback -v $(pwd):/app -v /app/node_modules --name feedback volumes feedback-node:latest`

### Bind mount Node problems and `docker logs`

Well, if you already create a node server, you know that if you make a change in the server, you will have to rerun the server to see changes, that in a docker container is actually not possible. with `docker logs <container>` you can see logs of some languages without any changes, but, if you need to restart the server to see changes, you will have to handle it.

So, in node, you will have to use nodemon, create a start script and add it to Dockerfile:

```json
{
	"name": "data-volume-example",
	"version": "1.0.0",
	"description": "",
	"main": "server.js",
	"author": "Maximilian Schwarzmüller / Academind GmbH",
	"license": "ISC",

	// START SCRIPT
	"scripts": {
		"start": "nodemon server.js"
	},
	
	"dependencies": {	
		"body-parser": "^1.19.0",
		"express": "^4.17.1"
	},

	// ADD NODEMON
	"devDependencies": {
		"nodemon": "3.1.9"
	
	}
}
```

Dockerfile

```Dockerfile
FROM node:14
WORKDIR /app
COPY package.json .
RUN "npm install"
COPY . .
VOLUME ["/app/feedback"]
EXPOSE 80
CMD ["npm", "start"]
```

However, to windows users, this will not work ☜(ˆ▿ˆc). You will have to change your directory to inside wsl to make it work, you will have to read this: (¬‿¬) [click if you are dumb](./pdfs/windows-wsl2-file-events.pdf). 


