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

##### RUN

**RUN** is a command to simply execute a bash command...

~~~Dockerfile
RUN npm install
~~~

But, **there is a problem to execute it**, since we defined that our container will be into a directory, if we RUN a command inside the root directory, we are going to 
