export class Tutorial {
  id?: any;
  nombre?: string;
  apellido?: string;
  cedula?: string;
  tipoDeLicencia?: string;
  published?: boolean;
  direccion: {
    sector: string;
    callePrincipal: string;
    calleSecundaria: string;
    numero: string;
  } = { // Inicialización predeterminada
    sector: '',
    callePrincipal: '',
    calleSecundaria: '',
    numero: ''
  };
}
