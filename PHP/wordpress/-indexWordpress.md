# Wordpress
2024-11-01
tags: [[-IndexPhp 🐘]]

Wordpress is a framework that manages backend to you and makes development pretty simple. It is pretty cool actually, do not take it as bullshit, it is fun to learn and a lot of companies, small startups, small business or even companies uses it, it will surly make you some money as freelancer...

To take first steps into Wordpress, **please install MySQL, vscode with php intelisense and localwp**, this localwp will make your workspace and will setup your server, so, just create a project, it's all pretty intuitive, so, let's start...

Let's see some important info:

* You can see your **local site** into: `<your-project-name>.local`

* You can see the **adm panel** into: `<your-project-name>.local/wp-admin/`

Your Wordpress theme is your front-end, so, you can create a new theme by adding a folder inside /themes directory: `<your-project-name>\app\public\wp-content\themes`. After that, you can create your 3 main files:

* `index.php` → It will provide your php.
* `style.css` → It will provide your css. 
* `screenshot.<png || jpeg || ...>` → The theme icon into Wordpress adm.

Pretty much intuitive, <mark>those names has to be those mentioned</mark>, because Wordpress will search for those when compiling and interpreting your app.

Into your css file, you can give your Wordpress theme some basic info:

~~~css
/*
  Theme Name: <Theme Name>
  Author: <Your Name>
  Version: 1.0
*/
~~~

<mark>Wordpress will search for this comment</mark> to define those details into your project admin.

Adding to it, you can **select your theme** into your adm panel and navigating into appearance → themes and selecting your theme in in themes list.

By the way, your css is not being rendered yet.
