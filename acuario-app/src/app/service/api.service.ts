import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders, HttpResponse} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class APIService {

  private apiUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  get(endpoint: string): Observable<any>{
    const url = `${this.apiUrl}/${endpoint}`;
    return this.http.get(url); 
  }

  getFile(endpoint: string): Observable<HttpResponse<ArrayBuffer>>{
    const url = `${this.apiUrl}/${endpoint}`;
    return this.http.get(url, {
      responseType: 'arraybuffer',
      observe: 'response',
    }); 
  }
}
