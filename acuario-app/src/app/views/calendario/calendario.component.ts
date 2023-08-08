import { Component, OnInit, ViewChild, ElementRef} from '@angular/core';
import { CalendarOptions } from '@fullcalendar/core';
import dayGridPlugin from '@fullcalendar/daygrid';
import interactionPlugin from '@fullcalendar/interaction'
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Evento } from '../../models/evento';


@Component({
  selector: 'app-calendario',
  templateUrl: './calendario.component.html',
  styleUrls: ['./calendario.component.css']
})

export class CalendarioComponent {

  eventFocus !: Evento;

  @ViewChild('modalCrearEvento') modalCrearEvento!: ElementRef;
  @ViewChild('modalVerEvento') modalVerEvento!: ElementRef;
  @ViewChild('modalEliminarEvento') modalEliminarEvento!: ElementRef;
  
  constructor(private modalService: NgbModal) {}


  calendarOptions: CalendarOptions = {
    initialView: 'dayGridMonth',
    plugins: [dayGridPlugin, interactionPlugin],
    locale: 'es',
    events: [
      { title: 'event 1', date: '2023-08-05' },
      { title: 'event 2', date: '2023-08-05' }
    ],
    dateClick: this.handleDateClick.bind(this),
    eventClick: this.handleEventClick.bind(this),
  };

  ngOnInit() {
    this.eventFocus = new Evento('', new Date(), '', [])
  }

  previousState() {
    window.history.back();
  }

  abrirModal(modal: any){
    this.modalService.open(modal);
  }

  handleEventClick(arg: any) {

    this.abrirModal(this.modalVerEvento)
  }

  handleDateClick(arg: any) {
    const clickedDate = arg.date;
    console.log(arg.date)
    this.eventFocus = new Evento('', new Date(clickedDate), '', [])
    this.abrirModal(this.modalCrearEvento)
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
