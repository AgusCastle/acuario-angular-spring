import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {APIService} from './../api.service';

@Injectable({
  providedIn: 'root'
})
export class CalendarioService {

  constructor(private apiService: APIService) { }

  obtenerTrabajos(): Observable<any>{
    return this.apiService.get("calendario/trabajos")
  }

  obtenerAgenda(): Observable<any>{
    return this.apiService.get("calendario/agenda")
  }
}
