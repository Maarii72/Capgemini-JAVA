import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { NotificacaoService } from 'src/app/notificacao.service';
import { IProduto } from 'src/app/produtos';
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
    private notificacaoService: NotificacaoService
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
  }
}
