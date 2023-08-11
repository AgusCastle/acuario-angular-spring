import { Component, OnInit, ViewChild, ElementRef} from '@angular/core';
import { CalendarOptions } from '@fullcalendar/core';
import dayGridPlugin from '@fullcalendar/daygrid';
import interactionPlugin from '@fullcalendar/interaction'
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Evento } from '../../models/evento';
import { Trabajos } from '../../models/trabajos';
import { ModalCrearComponent } from './modal-crear/modal-crear.component';

import { CalendarioService } from '../../service/calendario/calendario.service';

@Component({
  selector: 'app-calendario',
  templateUrl: './calendario.component.html',
  styleUrls: ['./calendario.component.css']
})

export class CalendarioComponent implements OnInit{

  eventFocus !: Evento;

  @ViewChild('modalVerEvento') modalVerEvento!: ElementRef;
  @ViewChild('modalEliminarEvento') modalEliminarEvento!: ElementRef;

  listaTrabajos : Trabajos[] = [];
  
  constructor(private modalService: NgbModal, private calendarioService: CalendarioService) {}


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

    this.calendarioService.obtenerAgenda().subscribe(
      (data) => {
        let eventos: any = [];
        data.forEach((element: any) => {

        let color = 'cornflowerblue';
        let fontColor = 'white';
        if (element.env_estado == 0){
          color = 'red';
          fontColor = 'white';
        }else if(element.env_estado == 2){
          color = 'yellow'
          fontColor = 'black';
        }

        let aux :any = {id :element.evn_id, title : element.evn_nom_client, date: new Date(element.env_fecha).toISOString().split('T')[0], color: color, textColor: fontColor};
        eventos.push(aux);
        });

        this.calendarOptions.events = eventos;
      },
      (error) => {
        console.error('Error fetching users:', error);
      }
    );

    this.calendarioService.obtenerTrabajos().subscribe(
      (data) => {
        this.listaTrabajos = data;
      },
      (error) => {
        console.error('Error fetching users:', error);
      }
    );
    this.eventFocus = new Evento(0,'', new Date(), '', [])
  }

  previousState() {
    window.history.back();
  }

  abrirModal(modal: any){
    
    const modalref = this.modalService.open(modal);

    this.calendarioService.obtenerTrabajos().subscribe(
      (data) => {
        this.listaTrabajos = data;
      },
      (error) => {
        console.error('Error fetching users:', error);
      }
    );

    modalref.componentInstance.eventFocus = this.eventFocus;
    modalref.componentInstance.listaTrabajos = this.listaTrabajos;
  }

  handleEventClick(arg: any) {

    this.abrirModal(this.modalVerEvento)
  }

  handleDateClick(arg: any) {
    const clickedDate = arg.date;
    this.eventFocus = new Evento(2, '', new Date(clickedDate), '', []);
    
    this.abrirModal(ModalCrearComponent);
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
