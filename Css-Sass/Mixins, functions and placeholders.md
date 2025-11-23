# Mixins
2025-09-22
tags: [[🎨 -indexSaasCss]]

Mixin is like function... It encapsulate a set of  rules to reuse it. You can define it with `@mixin <mixinName> (args) {}` and you can use it with `@inclue <mixinName>(args)`. It is different of a function in the way that you cannot call it, you include it and you cannot make math operations... Is about re-utilization. 

## Mixins

A good observation is that  [[Nesting and Hosting#`&` Operator]] is extremely necessary to mixins, take a look:

```scss
$default-red: red;

@mixin backgoundToRed($color) {
	& {
		backgroundColor: $color;
	}
}   

.someClass{
	@include backgoundToRed($default-red);
}
```

## Functions

To create a function you can just create a `@function <functionName> (args)` and you return values with `@return`:

```scss
@function divide ($a, $b){
	@return $a / $b;
}
```

## Placeholders

You already felt that when you need to write something common to two classes is strange? You always have to write code to your classes and write code that is in common to both classes. Placeholder is the way you go to solve it:

You can add a placeholder with `%<placeholderName>` and call it inside those selectors that you already have with `@extend %<placeholderName>:

```scss
%classes-placeholder{
	padding: 3%;
	color: white;
}

.classOne {
	@extend %classes-placeholder;
}

.classTwo {
	@extend %classes-placeholder;
}
```

Now, both classes have the same rules, you are not adding selectors to a rule, you add rules to selectors and it can save a lot of time.

**However, you can be asking why use it instead of mixins**... The answer is that the CSS compiled is different , you do not copy the code and paste it somewhere, you create a list of selectors that have the same rule. **The CSS will be shorter and faster**.
