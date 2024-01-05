import { Component } from '@angular/core';

@Component({
  selector: 'app-cadastrar',
  templateUrl: './cadastrar.component.html',
  styleUrls: ['./cadastrar.component.css']
})


export class CadastrarComponent {
  id: number;

    constructor() {
      this.id = 0;
    }

    lerDados(){
      let aluno = {}
      
      return aluno;
    }

    cadastrar(){
      this.lerDados();
    }

    Cancelar(){
      alert('Item deletado!')
    }
}

