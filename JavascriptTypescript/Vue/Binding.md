# Binding
2024-10-18
tags: [[-indexVue]]

## Interpolation `{{x}}`

![[dataBinding1.png]]

## `v-bind`

![[vueAtributes#`v-bind`]]



## Data atributes

Well, by that, I mean call `this.dataAtribute`

```js
Vue.createApp({
	data(){
		return{
			dataAtribute: 'x'
		}
	},
	methods: {
		handleLog(){
			console.log(this.dataAtribute);
		}
	}
	
}).mount('#app');
```

## `v-model` vs `@input`

* `v-model`: Used when you want the value to be automatically synchronized with the Vue's "data attribute". It is simpler and more straightforward.
* `@input`: Used when you need more control or manual processing of the user input before updating the property.
