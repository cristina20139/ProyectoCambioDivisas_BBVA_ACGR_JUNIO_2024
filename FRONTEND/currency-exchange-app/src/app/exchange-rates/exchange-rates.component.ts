import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

interface ExchangeRateApiResponse {
  rates: { [key: string]: number };
}

@Component({
  selector: 'app-exchange-rates',
  templateUrl: './exchange-rates.component.html',
  styleUrls: ['./exchange-rates.component.css']
})
export class ExchangeRatesComponent implements OnInit {
  rates: { [key: string]: number } = {};

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.fetchExchangeRates();
  }

  fetchExchangeRates(): void {
    this.http.get<ExchangeRateApiResponse>('http://localhost:8080/latest-rates') // https://api.exchangerate-api.com/v4/latest/USD
      .subscribe(data => {
        this.rates = data.rates;
      });
  }
}
