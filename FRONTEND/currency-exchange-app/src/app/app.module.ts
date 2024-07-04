import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';




import { AppComponent } from './app.component';
import { ExchangeRatesComponent } from './exchange-rates/exchange-rates.component';
import { KeyValuePipe } from './pipes/key-value.pipe'; // Import the pipe



@NgModule({
  declarations: [
    AppComponent,
    ExchangeRatesComponent,
    KeyValuePipe // Declare the pipe

  ],
  imports: [
    BrowserModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
