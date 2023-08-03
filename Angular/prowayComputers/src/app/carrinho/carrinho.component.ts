import { Component, OnInit } from '@angular/core';
import { CarrinhoService } from '../carrinho.service';
import { IProdutoCarrinho } from '../produtos';
import { Router } from '@angular/router';

@Component({
  selector: 'app-carrinho',
  templateUrl: './carrinho.component.html',
  styleUrls: ['./carrinho.component.css']
})
export class CarrinhoComponent implements OnInit {
  itensCarrinho: IProdutoCarrinho[] =[];
  total = 0;

  constructor(
    //injetar serviço de carrinho
    public carrinhoService: CarrinhoService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.itensCarrinho = this.carrinhoService.obtemCarrinho();
    this.calculaTotal();
  }

  //metodo para calcular total
  calculaTotal(){
    //reduce prev= elemento anterior, curr= elemento atual
    //somar o total com elemento atual
    this.total = this.itensCarrinho.reduce((prev, curr) => prev + (curr.preco * curr.quantidade), 0)

  }

  //ao clickar no botão passar o produto id tipado
  removerProdutoCarrinho(produtoId: number){
    //filtro dos itens carrinho
    this.itensCarrinho = this.itensCarrinho.filter(item => item.id !== produtoId);
    //remover do localStorage
    this.carrinhoService.removerProdutoCarrinho(produtoId);
    this.calculaTotal();
  }

  comprar(){
    alert("Compra finalizada com sucesso!")
    this.carrinhoService.limparCarrinho();
    this.router.navigate(["produtos"])
  }
}
