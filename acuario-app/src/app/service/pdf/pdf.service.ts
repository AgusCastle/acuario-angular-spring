import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {APIService} from './../api.service';

@Injectable({
  providedIn: 'root'
})

export class PdfService {

  constructor(private apiService: APIService) { }

  exportarPDF(): Observable<any>{
    return this.apiService.getFile("nota/export-pdf");
  }
}
