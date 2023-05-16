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


