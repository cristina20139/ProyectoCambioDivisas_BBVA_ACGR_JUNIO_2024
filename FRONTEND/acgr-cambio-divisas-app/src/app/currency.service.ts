import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CurrencyService {
  private apiUrl = 'http://localhost:8080/latest-rates';

  constructor(private http: HttpClient) { }

  getLatestRates(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }
}
