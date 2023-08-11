import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { CalendarioComponent } from './views/calendario/calendario.component';
import { NotaComponent } from './views/nota/nota.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FullCalendarModule } from '@fullcalendar/angular';
import { ModalCrearComponent } from './views/calendario/modal-crear/modal-crear.component';

@NgModule({
  declarations: [
    AppComponent,
    CalendarioComponent,
    NotaComponent,
    ModalCrearComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FullCalendarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
