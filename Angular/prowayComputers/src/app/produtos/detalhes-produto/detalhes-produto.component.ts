import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CarrinhoService } from 'src/app/carrinho.service';
import { NotificacaoService } from 'src/app/notificacao.service';
import { IProduto, IProdutoCarrinho } from 'src/app/produtos';
import { ProdutosService } from 'src/app/produtos.service';

@Component({
  selector: 'app-detalhes-produto',
  templateUrl: './detalhes-produto.component.html',
  styleUrls: ['./detalhes-produto.component.css']
})
export class DetalhesProdutoComponent implements OnInit {
  //criar propriedade inicialmemnte indefinida
  produto: IProduto | undefined;
  quantidade = 1;

  constructor(
    //injetar serviço de produtos
    private produtosService: ProdutosService,
    //utilizar serviço de rota
    private route: ActivatedRoute,
    //utilizar a notificacao.service.ts
    private notificacaoService: NotificacaoService,
    //serviço de carrinho
    private carrinhoService: CarrinhoService
  ) { }

  ngOnInit(): void {
    //ao inicializar pega os parâmetros da rota(o id da rota)
    const routeParams = this.route.snapshot.paramMap;
    const produtoId = Number(routeParams.get("id")); //obteve o parametro e vem como string
    //associa dentro da propriedade produto, com o id específico
    this.produto = this.produtosService.getOne(produtoId);
  }

  adicionarAoCarrinho(){
    this.notificacaoService.notificar("O produto foi adicionado ao carrinho");
    const produto: IProdutoCarrinho = {
      //tudo que ja tem no produto
      ...this.produto!,
      quantidade: this.quantidade
    }
    this.carrinhoService.adicionarAoCarrinho(produto);
  }
}
