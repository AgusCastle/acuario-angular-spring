
export class Evento {
    id: number;
    nombreCliente: string;
    fecha: Date;
    descripcion: string;
    idsTareas: number[];
  
    constructor(id: number,nombreCliente: string, fecha: Date, descripcion: string, idsTareas: number[]) {
      this.id = id;
      this.nombreCliente = nombreCliente;
      this.fecha = fecha;
      this.descripcion = descripcion;
      this.idsTareas = idsTareas;
    }
  }
  