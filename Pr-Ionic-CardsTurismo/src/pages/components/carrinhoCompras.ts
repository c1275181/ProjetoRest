import { Component, Input} from '@angular/core';


@Component({
    selector:'carrinho-compras',
    template:'\"<img src="assets\\imgs\\cart.png" width="300" height="250">\<h2>Quantidade de Produtos: {{quantidade}}</h2>'
})

export class CarrinhoCompras{

    @Input()
    quantidade:number=0;

    constructor(){
        console.log('Instancia do carrinho de compras');

    }
}