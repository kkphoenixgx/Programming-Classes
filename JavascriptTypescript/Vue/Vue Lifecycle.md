# Vue Lifecycle Hooks
2024-10-21
tags: [[-indexVue]]

![[Pasted image 20241021164512.png]]

All of those are Vue methods:

* Before Create

 ~~~js
 Vue.createApp({
	methods:{
		// ...
	},
	beforeCreate(){
		console.log("This will execute before the app create itself")
	}
}).mount('#app');
 ~~~

* All others: Just change the name as the image
