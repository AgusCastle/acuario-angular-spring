import { Component } from '@angular/core';
import {PdfService} from './../../service/pdf/pdf.service';

@Component({
  selector: 'app-nota',
  templateUrl: './nota.component.html',
  styleUrls: ['./nota.component.css']
})
export class NotaComponent {
  
  constructor(private pdfService : PdfService){}

  generatePdf(){
    this.pdfService.exportarPDF().subscribe(
      (response) =>{
        const blob = new Blob([response.body], { type: 'application/pdf' });
        const url = window.URL.createObjectURL(blob);
        window.open(url);
      },(error) => {
        console.error('error al descargaar', error);
      }
    )
  }
}
