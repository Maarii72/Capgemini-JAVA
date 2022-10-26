import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-componente-pai',
  templateUrl: './componente-pai.component.html',
  styleUrls: ['./componente-pai.component.css']
})
export class ComponentePaiComponent{
  sobrenome = "da silva";

  //método mostrar nome para passar para o component filho
  //(mostraNome)="mostraNomeCompleto($event)" no html do pai
  mostraNomeCompleto(nomeCompleto: any){
    alert(`O nome Completo é: ${nomeCompleto}`);
  }

}
