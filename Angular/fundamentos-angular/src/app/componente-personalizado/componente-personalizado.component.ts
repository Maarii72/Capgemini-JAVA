import { Component, Input} from '@angular/core';

@Component({
  selector: 'app-componente-personalizado',
  templateUrl: './componente-personalizado.component.html',
  styleUrls: ['./componente-personalizado.component.css']
})
export class ComponentePersonalizadoComponent{
  //propriedades
  @Input() nome = ""
  @Input() sobrenome = "";
}
