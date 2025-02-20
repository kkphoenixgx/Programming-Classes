# Vue Components
2024-10-21
tags: [[-indexVue]]

* **Why use components?** 
	Imagine a list of users that have information toggle when you click an item of the list. Now imagine how you are going to code this, you can not create a `toggleEl` atribute for each item and control it with a boolean variable, it will be impossible to maintain and scale... Even if you find a way of doing it, like with factory,  for sure using one component that abstracts the item and you just have to code it one time using the Vue syntax is for sure easier.

To create a component, we use `app.component(<componentName>, {})`, this `componentName` should be a compound name as "component-users" or "login-user", this will prevent that your component name have a conflict with base html. And `componentName` will be the name of your div that will encapsulate your component, take a look into a `main.js` file using our component :

 ~~~js
import { createApp } from 'vue';
import App from './App.vue';

import FriendComponent from './components/FriendComponent.vue';

const app = createApp(App);

app.component('friend-component', FriendComponent);

app.mount('#app');
 ~~~

```vue
<template>
  <section>
    <h2>My friendList</h2>
    <ul>
        <friend-component></friend-component>
        <friend-component></friend-component>
        <friend-component></friend-component>
    </ul>
  </section>
</template>

  

<script>
export default {
  data(){
    return {
      friends: [
        {
          id:"1", name: "someName", phone:"312311231231", email:"example@email.com"
        }
      ]
    }
  }
}

</script>
<style></style>
```

Components works as mini apps. Now, every component is a standalone component, that means that they are not going to have conflicts.
To create a component, generally we create a `component/` directory to our components and create a `NameComponent.vue` file to have our component, inside our file, take a look at a example:

```vue
<template>
  <li >
    <h2>{{ friend.name }}</h2>

    <button @click="toggleDetails()" > {{  toggleDetails? "Hide" : "Show"   }} </button>

    <ul v-if="toggleDetails" >

      <li>
        <strong>Phone Number: </strong> {{ friend.phone }}
      </li>
      
      <li>
        <strong>Email: </strong> {{ friend.email }}
      </li>
    </ul>
  </li>

</template>

  

<script>

export default {

  data(){
    return {
      friend:{
        id:"1",
        name: "someName",
        phone:"312311231231",
        email:"example@email.com"
      },
      toggleDetails: false
      
    }
  },

  methods:{

    handleToggleDetails(){
      this.toggleDetails = !this.toggleDetails;
    }
  }

}
</script>

<style></style>
```

## Component Communication

### Parent to Child 

To pass data inside our component, we can pass the data as atributes with this notation:

~~~html
<template>
	<some-component 
		name="someValue"
		email="othervalue"
		:phone-number="user.number"
>	<some-component/>
<template/>
~~~

And inside our component, we can take it as props:

```vue
<template></template>

<script>

export default {

  props:[
	  "name",
	  "phoneNumber",
	  "email"
  ],
  data(){
    return {
      toggleDetails: false
    }
  },
  methods:{
	  someLog(){
		  console.log(this.phoneNumber)
	  }
  }

}
</script>

<style></style>
```


You can pass props as a object to be able to define the type of the prop:

```vue
<script>

export default {
  props:{
	  name: {
		  type: String,
		  required: true
	  },
	  phoneNumber:  {
		  type: String,
		  required: false,
		  default: null // function()
	  },
	  email: String
  }
}
</script>
```

Specifically, the following value types (`type` property) are supported:

- String
- Number
- Boolean
- Array
- Object
- Date
- Function
- Symbol

But `type` can also be any constructor function (built-in ones like `Date` or custom ones).

### Child to Parent

There is no parent to child communication because Vue do not allow it :). However, you can tell to parent change value with a event and then child receive it. Vue has a special way of doing it, check it out:

```vue
// INTO CHILD
<script>

export default {
  props:{
	  name: {
		  type: String,
		  required: true
	  },
	  phoneNumber:  {
		  type: String,
		  required: false,
		  default: null // function()
	  },
	  email: String
  },
  methods:{
	  callFather(){
		this.$emit("change-name", "new name");
	  }
  }
}
</script>
```

And, into it's parent:

~~~html
<template>
	<some-component 
		name="someValue"
		email="othervalue"
		:phone-number="user.number"
		@change-name="changeName"
>	<some-component/>
<template/>
<script>

export default {
  methods:{
	  changeName(newName){
		this.name = newName;
	  }
  }
}
</script>
~~~ 

When you are using `$emit`, it is a good practice to use the `emits` Vue atribute to define all emits that components are using

```vue
// INTO CHILD
<script>

export default {
  emits: {
	  'change-name' function(name){
		  if(!name) console.warn("name is missing");
	  }
  },
  props:{
	  name: {
		  type: String,
		  required: true
	  },
	  phoneNumber:  {
		  type: String,
		  required: false,
		  default: null // function()
	  },
	  email: String
  },
  methods:{
	  callFather(){
		this.$emit("change-name", "new name");
	  }
  }
}
</script>
```

You can also define with a array and event as string to make it simple:

```vue
<script>
export default {
  emits: ['change-name']
}
</script>
```

