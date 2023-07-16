import { Component, OnInit } from '@angular/core';
import { IProduto, produtos } from '../produtos';
import { ProdutosService } from '../produtos.service';

@Component({
  selector: 'app-produtos',
  templateUrl: './produtos.component.html',
  styleUrls: ['./produtos.component.css']
})
export class ProdutosComponent implements OnInit {
  produtos: IProduto[] | undefined;

  constructor(
    //importação do serviço de produtos
    private produtosService: ProdutosService
  ) { }

  ngOnInit(): void {
    //pag de produtos vai receber todos produtos 
    this.produtos = this.produtosService.getAll();
  }

}
