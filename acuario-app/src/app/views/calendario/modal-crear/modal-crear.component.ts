import { Component, Input } from '@angular/core';
import { NgbModal, NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Evento } from '../../../models/evento';
import { Trabajos } from '../../../models/trabajos';

@Component({
  selector: 'app-modal-crear',
  templateUrl: './modal-crear.component.html',
  styleUrls: ['./modal-crear.component.css']
})
export class ModalCrearComponent {

  @Input() eventFocus !: Evento;
  @Input() listaTrabajos : Trabajos[] = [];

  constructor(public modal: NgbActiveModal){
  }

  formatearFecha(fecha: Date): string {
    const opcionesMes = { month: 'long' } as const; // Obtén el nombre del mes completo
    const dia = fecha.getDate();
    const mes = fecha.toLocaleDateString(undefined, opcionesMes);
    const anio = fecha.getFullYear();
    
    const fechaFormateada = `${dia} de ${mes} de ${anio}`;
    return fechaFormateada;
  }
}
