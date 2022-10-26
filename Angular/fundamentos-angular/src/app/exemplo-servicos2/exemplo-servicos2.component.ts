import { Component, OnInit } from '@angular/core';
import { LoggerService } from '../logger.service';

@Component({
  selector: 'app-exemplo-servicos2',
  templateUrl: './exemplo-servicos2.component.html',
  styleUrls: ['./exemplo-servicos2.component.css']
})
export class ExemploServicos2Component{
  descricao= "";

  //injetar serviço logger
  constructor(public logger:LoggerService){}

  /* como ta público não vai precisar dessa
  função, só ir lá direto
  */
  adicionarProduto(){
    //console.log(`O nome do produto ${this.descricao} foi adicionado`);
    this.logger.logar(`O nome do produto ${this.descricao} foi adicionado`);
  }

}
