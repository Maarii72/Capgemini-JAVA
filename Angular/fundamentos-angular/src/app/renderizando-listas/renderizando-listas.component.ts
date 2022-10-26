import { Component, OnInit } from '@angular/core';
import { Celular } from '../types/Celular';

@Component({
  selector: 'app-renderizando-listas',
  templateUrl: './renderizando-listas.component.html',
  styleUrls: ['./renderizando-listas.component.css']
})
export class RenderizandoListasComponent{
  celulares: Celular[] = [
    {id: 1, nome: "celular XL", descricao: "preto", esgotado: false},
    {id: 2, nome: "celular normal", esgotado: true},
    {id: 3, nome: "celular mini", descricao: "rosa", esgotado: false},
  ]

}
