import { Component, OnInit} from '@angular/core';
import { CalendarOptions } from '@fullcalendar/core'; // useful for typechecking
import dayGridPlugin from '@fullcalendar/daygrid';
import interactionPlugin from '@fullcalendar/interaction';
@Component({
  selector: 'app-calendario',
  templateUrl: './calendario.component.html',
  styleUrls: ['./calendario.component.css']
})
export class CalendarioComponent {
  calendarOptions: CalendarOptions = {
    initialView: 'dayGridMonth',
    plugins: [dayGridPlugin, interactionPlugin],
    locale: 'es',
    events: [
      { title: 'event 1', date: '2023-08-05' },
      { title: 'event 2', date: '2023-08-05' }
    ],
    dateClick: function(info: any) {
      alert('Has hecho clic en el día ' + info.date);
    },
    eventClick: this.handleDateClick.bind(this),
  };

  handleDateClick(arg: any) {
    alert('date click! ' + arg.dateStr)
  }
}
