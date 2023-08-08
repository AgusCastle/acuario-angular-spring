
export class Evento {
    nombreCliente: string;
    fecha: Date;
    descripcion: string;
    idsTareas: number[];
  
    constructor(nombreCliente: string, fecha: Date, descripcion: string, idsTareas: number[]) {
      this.nombreCliente = nombreCliente;
      this.fecha = fecha;
      this.descripcion = descripcion;
      this.idsTareas = idsTareas;
    }
  }
  