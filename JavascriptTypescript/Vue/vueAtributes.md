# Vue Html Build-in Atributes
2024-10-18
tags: [[-indexVue]]

For a introductory way to Vue or a more simple approach of not using Vue to a SPA¹, we can bind things directly in `Vue.createApp()`, for a more simple approach, take those examples as the html is inside a `<div id="app"></div>`

## `v-model`

```js
Vue.createApp({
	data(){
		return{
			arrayAtributte: [],
			valueOfABinding: 'x'
		}
	}
}).mount('#app');
```

~~~html
<input type="text" v-model="valueOfABinding" ><input/>
~~~

The atribute `v-model` is a Vue atribute that only can be seen for Vue

## `v-on`

One of the most important attributes is for sure `v-on:<event>`, the `event` can be whatever you want, let's see a exemple with 'click' event:

~~~html
<button v-on:click="method">OK</button>
~~~
~~~html
<button v-on:click="method('kkkkkkk')">OK</button>
~~~

```js
Vue.createApp({
	methods :{
		method(param=null){
			if(param) console.log(param);
			console.log("ok");
		}
	}
}).mount('#app');
```

you have a shortcut  to v-on since we use it too much:

~~~html
<button @click="method">OK</button>
~~~

to get event:

![[eventBindingEvent.png]]

![[eventBindWith$event.png]]

### Event modifiers

In Vue, you can off course use `event.preventDefault()` and be happy, but why do it if engineers struggle to create this build in feature that everyone has already forgotten about? 

![[eventModifiers.png]]

You can also use `.stop` and etc... And to bind another types of click, use it like that:

![[bindWithRightClick.png]]

`keyup.enter` 
`v-on:input`

## `v-bind`

 `v-bind:<htmlAtribute> = "<atributeName>"`

![[binding.png]]

We also have a shortcut to v-bind since we use it too much:

~~~html
<input :value="someAtribute"/>
~~~

### Bind Style

Well, off course you can understand and by yourself figure it out, but wait a minute, this examples will open your mind:

Look at binding inline styles, `atr` is a boolean atribute (value of data):

~~~html
<input :style="{borderColor: atr? 'red' : none}"/>
~~~

Look at binding inline class:

~~~html
<input :class="atr? 'classOne' : 'classTwo' "/>
~~~

Look at inline class better:

~~~html
<input :class="{classOne: atr, classTwo: !atr}"/>
~~~

~~~html
<!-- Using array, you can avoid using two class atributes by making class value a array and passing normal classes as values-->
<input :class="['simpleClass', {classOne: atr, classTwo: !atr}]"/>
~~~

Look at inline classes even better

~~~html
<input :style="inputClasses"/>
~~~

```js
Vue.createApp({
	data(){
		return{
			atr: true
		}
	},
	computed:{
		inputClasses(){
			return {
				classOne: atr, 
				classTwo: !atr
			}
		}
	}
}).mount('#app');
```


## `v-html`

This is not safe at all... So, just do not use it if you do not know all the ways of how to break it.
Essentially this `v-html` can create html tags by binding it to a atribute:

![[v-htmlAtribute.png]]

you can do it safely if you use binding directly to the atribute or method:

```html
<p v-html="bindingAtribute" ><p/>
```

![[v-htmlToAtributeAndMethodSafely.png]]

But do not use it if you do not know what you are doing
 
## `v-once` 

It will make all interpolations of the element update just once

## `ref`

You can find more details in:

![[Core Features#`$refs`]]

## Conditional and loop atributes

### `v-if`

```html
<p v-if="dataAtribute.length > 0" >...<p/>
```

```js
Vue.createApp({
	data(){
		return{
			dataAtribute: []
		}
	}
}).mount('#app');
```

### `v-else`

 `v-else`  just works after `v-if`, so can not have any other div after the `v-if` statement.

```html
<p v-if="dataAtribute.length > 0" >...<p/>
<p v-else >Yeah<p/>
```

```js
Vue.createApp({
	data(){
		return{
			dataAtribute: [],
		}
	}
}).mount('#app');
```


### `v-else-if`

All of those have to be parents and one after the other. 
You can understand by yourself: if x, then "...", else if, then Yeah, and else, then T-T

```html
<p v-if="dataAtribute.length > 0" >...<p/>
<p v-else-if="dataAtribute.length > 5" >Yeah<p/>
<p v-else >T-T<p/>
```

```js
Vue.createApp({
	data(){
		return{
			dataAtribute: []
		}
	}
}).mount('#app');
```

### `v-show`

The  `v-show` element works exactly  as the `v-if`, but `v-if` completely remove the element and `v-show` set it's display to none. Use it when the element changes it's display a lot, `v-if` consumes more performance.

```html
<p v-show="dataAtribute.length > 0" >...<p/>
```

```js
Vue.createApp({
	data(){
		return{
			dataAtribute: [],
		}
	}
}).mount('#app');
```


### `v-for`

it creates a li for each item in `arrayDataAtribute`. Make sure to reed all `v-for` before using it.

```html
<ul>
	<li v-for="x in arrayDataAtribute">{{x}}<li/>
<ul/>
```

```js
Vue.createApp({
	data(){
		return{
			arrayDataAtribute: [],
		}
	}
}).mount('#app');
```

To you keep record of the index of the array, you can do the following syntex:


```html
<ul>
	<li v-for="(x, index) in arrayDataAtribute">{{index}}: {{x}}<li/>
<ul/>
```

To loop a object, is essentially the same thing:

```html
<ul>
	<li v-for="(x, key, index) in {x: 'firstValue', y: 'otherValue'}">{{index}}-{{key}}: {{x}}<li/>
<ul/>
```

You can do it with numbers too

![[Pasted image 20241021030130.png]]

Is good to know that index variable is available to be replaced in methods or whatever atribute you want:

```html
<ul>
	<li v-for="(x, index) in arrayDataAtribute" @click="removeItem(index)">{{index}}: {{x}}<li/>
<ul/>
```

Another thing that it pretty important, is that **Vue reuses content**, so, if you have a li that have a p and a input and creates a delete button to every list, every time you delete a item or updates the list that is controlling the `v-for` loop, the content that is in the input will be reset, because the element itself is re-rendered. So, to avoid this, Vue has to look at those itens as individual ones, so, you have to use a `key` atribute that regulates that:

```html
<ul>
	<li 
	v-for="(x, index) in arrayDataAtribute" 
	@click="removeItem(index)" 
	:key="id">
		{{index}}: {{x}}
	<li/>
<ul/>
```

Index is always changing, so, use a constant to key values, this `id` is not provided by Vue, you have to create it.

![[ForFurtherExemple.png]]


----------------------------------
## Bibliografia

¹ *SPA = Single Page Application*


