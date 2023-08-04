import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NotaComponent } from './views/nota/nota.component';
import { CalendarioComponent } from './views/calendario/calendario.component';

const routes: Routes = [
  { path: 'nota', component: NotaComponent },
  { path: 'calendario', component: CalendarioComponent },
  { path: '', redirectTo: '/nota', pathMatch: 'full' } // Ruta predeterminada
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }