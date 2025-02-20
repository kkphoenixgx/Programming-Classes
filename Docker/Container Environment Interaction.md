# Container Environment Interaction
2024-11-08
tags: [[Containers]]

## Coping into and from a container

Well, let's say that you have a already running container and you want to add a new file to that. For it, we can use `docker cp`, let's see it calmly:

> `docker cp <pathToChange/.> <imageId>:<pathToBe>`

This "." Inside path to be is to copy everything inside this related directory. You can copy just a file if you want.
The ":" is precisely important. Don't miss it.

However, this command is pretty bad if you want to update something or you want to add new features. Imagine if you update something and forgot about a implementation, or a file, this will broke your container, so, take it easy. In other hand, this command can be pretty helpful if you want to copy log files of your container or something like this.