import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

interface ExchangeRatesResponse {
  base: string;
  rates: { [key: string]: string };
}

@Injectable({
  providedIn: 'root'
})
export class ExchangeRateService {

  private apiUrl = 'http://localhost:8080/latest-rates';

  constructor(private http: HttpClient) { }

  getLatestRates(): Observable<ExchangeRatesResponse> {
    return this.http.get<ExchangeRatesResponse>(this.apiUrl);
  }
}
