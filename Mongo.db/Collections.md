# Collections
2024-05-27
tags: [[🍃 indexMongo.db]]

A collection is a array of objects

| method         | description                                                                  |
| -------------- | ---------------------------------------------------------------------------- |
| `find()`       | show documents.                                                              |
| `insertMany()` | Add many itens to a collection                                               |
| `insertOne()`  | add to a collection and create a document<br>actually creating our database. |

### `insertOne()`

 You can add a new collection by using the `insertOne()` method:

> `db.<collectionName>.insertOne(data)` 

![[Pasted image 20240416010140.png]]

Take a look that we did not added a id, so, Mongo.db will provide it.

If you provide a id:

![[Pasted image 20240416012413.png]]

You will take the id in the param `insertedId`.

### `find()`
 
> `dn.<collectionName>.find(params = *)`   
   If you run without parameters (`params`), you will get it all.

To run this command to get a specific find, define a object with the values that you want and it will return those finds:  

Especific item: > `db.someCollection.find({_id: 1})`    
* **Larger** than: > `db.someCollection.find({value: {$lt: 1000} })`   
* **Greater** than: > `db.someCollection.find({price: {$gt: 1000} })` 
* **Or**
	Find all itens that applies to x **or** y:   
	Ex: > `db.someCollection.find({$or: [ { value: {$lt: 1000}, {$gt: 2000} } ] )`   
* **And**
	Find all itens that applies to x **and** y:   
	Ex: > `db.someCollection.find({ value: {$gt: 2000}, {$lt: 1000} })`

Find out that we can create expressions with `{}` and we have variables that are expressions defined with `$` in the front, so we can percept in this example that `$lt` = larger then `$gt` = greater then.

| variable | expression   |
| -------- | ------------ |
| $lt      | larger then  |
| $gt      | greater then |
| $or      | or           |


## `insertMany()`


> `db.<collection>.insertMany([object, object, object])`

So you can add a array of objects to a collection

