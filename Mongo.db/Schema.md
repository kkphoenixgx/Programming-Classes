# Schema
2024-04-16
tags: [[🍃 indexMongo.db]]

Schema, in Mongo.db, is a synonimous to a database. To create such a schema you can use the command:

> `use <db>`

And, you can replace `<db>` with the name of the database. Furthermore, you will mention this schema by just `db` and you can switch to other schema by re-entering `use <bd>` with a new db.

The hierarchy:
```
- Schema == databases
	- Collections
		- Itens
```

Examples:
```
- Users
	- UserData
		- UserData
		- UserData
		- UserData
	- UserPosts
		- Post
		- Post

- UserImages
	- User
		- Image1
	- User
		- Image1
		- Image2
		- Image3
	- User
		- Image1
		- Image2
```

