# Images
2023-04-29
tags: [index Docker](index%20Docker.md)

Docker images are how you struct such containers, who set up the environment.

## Using an existing image 

> `docker run image` 

We define "image" as the image that you will use, you can create images or use an already created one in [dockerhub](https://hub.docker.com/)...

## Create a Image

To create a image, we have to create a Dockerfile inside our project to set up the image:

 ~~~Dockerfile
 FROM node:14
 WORKDIR /app
 COPY package.json .

 RUN npm install
 COPY . .
 
 EXPOSE 3000
 
 CMD ["node", "app.mjs"]
 ~~~

Start docker;
Run **docker build .** -> . is the path to the Dockerfile, generally we are 

And it will use the node base image to create our image as we said in line 1

### Understanding the Dockerfile

The point of understanding the Dockerfile is to dive deep into details of the image, be aware of what is happening in the container's creation and create our own images....

#### Code Explanation

Example

~~~Dockerfile
FROM node

WORKDIR /app

COPY . /app

RUN npm install

EXPOSE 3000

CMD ["node", "serverFile.js"]
~~~

##### FROM

**From** is to define a base image that you will create in top of, there is a lot of configurations that we are not going to do basically just creating a image in top of another. Examples- *node*

~~~Dockerfile
FROM node
~~~

You can specify the version by adding :version

~~~Dockerfile
FROM node:14
~~~

##### COPY

When you define a **copy** command, you define fist what should be copy to the container and then in what directory the OS, the server and the container will be running in

~~~Dockerfile
COPY . /app
~~~


So, copy everything and add those things to the /app directory

###### With WORKDIR

~~~Dockerfile
COPY . ./
~~~

In this case, the use of *./* indicates that we are going to create everything into our currently WORKDIR. However, do not use it as default, just use it into a simple project, because is clear to just say /app and do not check what directory we are using as WORKDIR.

##### RUN

**RUN** is a command to simply execute a bash command...

~~~Dockerfile
RUN npm install
~~~

But, **there is a problem to execute it**, since we defined that our container will be into a directory, if we RUN a command inside that root directory, we are going to run npm install into the root directory of our folder, so we have to say before the command what is our *WORKDIR*  to execute it into our /app directory.

##### WORKDIR

Therefore, to execute where our WORKDIR will be, we can just say:

~~~Dockerfile
WORKDIR /app
~~~

Since we said what WORKDIR we will be working in, a lot of things will chance, first, every path will be started into our WORKDIR, so, we have to change our COPY path... To simply say that we are going to copy things to our WORKDIR, we can just say **"./"**  -> see a example: [With WORKDIR](Images.md#With%20WORKDIR)

##### CMD

**CMD** command is really special because we want to execute some Bash command **after the container is started**. It is not as *RUN* command that execute something *when the image is been created*.

~~~Dockerfile
CMD ["node", "serverFileStart.js"]
~~~

##### EXPOSE

Although docker is isolated from the others servers into our machine, it is not just because a app is listening to a port that it will be able to listening, because if we do not EXPOSE the port, there is no way that our system can interact with our container...

~~~Dockerfile
EXPOSE 3000
~~~

For this reason, expose port 3000. However, EXPOSE do not make all the deal, you have to make a **port bind**, bind those ports, our local one with our docker one as we say into [Setting up a Container](Containers.md#Setting%20up%20a%20Container).

## Maintenance 

The problem with docker containers is that all of them are read only, we can not just update our code and rerun a container... Because the container already have been created
