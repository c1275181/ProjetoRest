import { Component, Output, EventEmitter } from '@angular/core';

@Component({
    selector:'produto',
    template:'\
    <button ion-button color="danger" (click)="remover()">-</button>\
    <button ion-button color="primary" (click)="adicionar()">+</button>\
    '
})
export class Produto{

    @Output()
    eventoModificador: EventEmitter<string> = new EventEmitter<string>();

    constructor(){
        console.log("evento modificador de produto...enviando");
    }

    adicionar(){
    this.eventoModificador.emit('+');
}

    remover(){
    this.eventoModificador.emit('-');
}



}



