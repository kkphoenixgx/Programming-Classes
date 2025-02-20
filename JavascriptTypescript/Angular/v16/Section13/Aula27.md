# Aula27
2023-03-12
tags: [index Angular](index%20Angular.md)

## - Mod 83-89 - : Hands on 1-7

O httpClientModule permite você fazer requisições via http, podemos importa-lo no app.module: *import { httpClientModule } from '@angular/common/http'*. Desse modo, podemos usa-lo para requirir APIs externas, e a questão é que é bem mais rápido do que fazer um fetch ou coisas assim.

~~~ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';

@NgModule({
  imports: [BrowserModule, HttpClientModule],
})
export class AppModule {
	responseData: any;

  constructor(private http: HttpClient) { }

  getData() {
    this.http.get('https://api.example.com/data').subscribe(data => {
      this.responseData = data;
    });
  }
}

~~~

-----------------------------------------------
## Bibliografia

https://www.udemy.com/course/curso-de-angular/learn/lecture/27806728#questions