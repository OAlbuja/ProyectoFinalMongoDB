import { Component, OnInit } from '@angular/core';
import { Tutorial } from 'src/app/models/tutorial.model';
import { TutorialService } from 'src/app/services/tutorial.service';

@Component({
  selector: 'app-tutorials-list',
  templateUrl: './tutorials-list.component.html',
  styleUrls: ['./tutorials-list.component.css']
})
export class TutorialsListComponent implements OnInit {

  tutorials?: Tutorial[];
  currentTutorial: Tutorial = {
    nombre: '',
    apellido: '',
    cedula: '',
    tipoDeLicencia: '',
    published: false,
    direccion: {
      sector: '',
      callePrincipal: '',
      calleSecundaria: '',
      numero: ''
    }
  };

  currentIndex = -1;
  nombre = '';

  constructor(private tutorialService: TutorialService) { }

  ngOnInit(): void {
    this.retrieveTutorials();
  }

  retrieveTutorials(): void {
    this.tutorialService.getAll()
      .subscribe({
        next: (data) => {
          this.tutorials = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

  refreshList(): void {
    this.retrieveTutorials();
    this.currentTutorial = {
      nombre: '',
      apellido: '',
      cedula: '',
      tipoDeLicencia: '',
      published: false,
      direccion: {
        sector: '',
        callePrincipal: '',
        calleSecundaria: '',
        numero: ''
      }
    };
    this.currentIndex = -1;
  }

  setActiveTutorial(tutorial: Tutorial, index: number): void {
    this.currentTutorial = tutorial;
    this.currentIndex = index;
  }

  removeAllTutorials(): void {
    this.tutorialService.deleteAll()
      .subscribe({
        next: (res) => {
          console.log(res);
          this.refreshList();
        },
        error: (e) => console.error(e)
      });
  }

  searchNombre(): void {
    this.currentTutorial = {
      nombre: '',
      apellido: '',
      cedula: '',
      tipoDeLicencia: '',
      published: false,
      direccion: {
        sector: '',
        callePrincipal: '',
        calleSecundaria: '',
        numero: ''
      }
    };
    this.currentIndex = -1;

    this.tutorialService.findByNombre(this.nombre)
      .subscribe({
        next: (data) => {
          this.tutorials = data;
          console.log(data);
        },
        error: (e) => console.error(e)
      });
  }

}
