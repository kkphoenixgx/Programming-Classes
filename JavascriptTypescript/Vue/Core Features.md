# Core Features
2024-10-18
tags: [[-indexVue]]

The fundamental parts of Vue are all with the hole Vue Object been imported, please, take it easy because those were my first steps and the course was designed to start with this. However, to production, we will use standart

## data

Atributes rendered by Vue:

```js
Vue.createApp({
	data(){
		return{
			valueOfABinding: 'x',
			valueOfABindingNumber: 12
		}
	},
}).mount('#app');
```

## methods

this updates whenever state change

 ~~~js
 Vue.createApp({
	methods:{
		logConsoleValue(){
			console.log("value")
		}
	} 	
}).mount('#app');
 ~~~

So, you should just use it directly when it has to update every time.

## computed

We call it as `computedValue` and it will be auto rendered when `this.valueOfABindingNumber` changes. It is used when you have a value that depends of other value.

 ~~~js
 Vue.createApp({
	data(){
		return{
			valueOfABinding: 'x',
			valueOfABindingNumber: 12
		}
	},
	computed:{
		computedValue(){
			return this.valueOfABindingNumber + 3;
		}
	} 	
}).mount('#app');
 ~~~

## watch

Its a function that you can tell Vue to execute whenever it's dependences change. It is used to control things like change something in a view, atributes who depends of the atribute watched or the atribute itself.

 ~~~js
 Vue.createApp({
	data(){
		return {
			name: 'Kauã',
			fullName: 'Kauã Alves Santos'
		}
	},
	watch:{
		name(value, oldValue){
			this.fullName = `${this.name} Alves Santos`
			console.log("Old value: " + oldValue)
		}
	}	
}).mount('#app');
 ~~~

Whenever `this.name` changes, the `name()` method will reexecute. 

## template

Template is a core atribute that can receive a html template string or something like that to create your integrated Vue app inside your html element:


```js
Vue.createApp({
	template: `
		<input type="text" v-model="valueOfABinding" ><input/>
	`, 
	data(){
		return{
			valueOfABinding: 'x'
		}
	}
}).mount('#app');
```

Your html will be just the app with the id

~~~html
<div id="#app"><div/>
~~~


## props

![[Vue Components#Component Communication]]

## Core Global Atributes

### `$refs`

`$ref` is a global atribute of Vue that you can use inside Vue app to get whatever html element binded with a `ref` html element

```js
Vue.createApp({
	template: `
		<input type="text"
			ref="inputEl"
		><input/>
	`, 
	methods:{
		logText(){
			console.log(this.$refs.inputEl.value)
		}
	}
}).mount('#app');
```

### `props`

![[Vue Components#Component Communication]]

Because Vue has built-in support for **prop (and event) "fallthrough"**.

Props and events added on a custom component tag **automatically fall through** to the **root component** in the template of that component. In the above example, `type` and `@click` get added to the `<button>` in the `BaseButton` component.

You can get access to these fallthrough props on a built-in `$attrs` property (e.g. `this.$attrs`).

This can be handy to build "utility" or pure presentational components where you don't want to define all props and events individually.

----------------------------
## Bibliografia

https://www.udemy.com/course/vuejs-2-the-complete-guide/learn/lecture/21463198?start=60#content
