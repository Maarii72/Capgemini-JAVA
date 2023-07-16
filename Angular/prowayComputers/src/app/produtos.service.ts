import { Injectable } from '@angular/core';
import { IProduto, produtos } from './produtos';

@Injectable({
  providedIn: 'root'
})
export class ProdutosService {
  //lista de produtos /propriedade produtos do tipo IProduto com vetor que se inicia com produtos
  produtos: IProduto[] = produtos;

  constructor() { }
  //dois métodos

  //retornar lista de produtos
  getAll(){
    return this.produtos;
  }

  //receber id do produto, de acordo com a condição find
  getOne(produtoId: number){
    return this.produtos.find(produto => produto.id = produtoId);
  }
}
