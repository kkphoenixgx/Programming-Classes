# Variables
2024-08-19
tags: [[🎨 -indexSaasCss]]

In pure CSS:

```css
:root{
	--light-green: #7ed56f;
}

.someRandomClass{
	background-color: var(--light-green);
}
```

Look 🤠:

```scss
$hello-i-am-a-variable: "black";
```

import:

```scss
@use "../../styles/variables.scss" as *;
```


