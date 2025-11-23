# Dependencies
2023-06-10
tags: [📱 indexDart](📱%20indexDart.md)

When we talk about dependencies in dart, we have to understand that every dependency of your code will be written in `pubspec.yaml` and managed by Dart package manager called "pub.". Here is an exemple of a flutter app base `pubspec.yaml`:

~~~yaml
name: flutter_application_1
description: A new Flutter project.
publish_to: 'none'
version: 1.0.0+1
environment:
sdk: '>=3.1.0-180.0.dev <4.0.0'

dependencies:
flutter:
sdk: flutter
cupertino_icons: ^1.0.2
dev_dependencies:
flutter_test:
sdk: flutter
flutter_lints: ^2.0.0
flutter:
uses-material-design: true
~~~

In Dart, you use the `pub get` command to install dependencies listed in your `pubspec.yaml` file. You don't specify the package name directly in the command; Instead, you list the dependencies in the `pubspec.yaml` file and then run `pub get`.
