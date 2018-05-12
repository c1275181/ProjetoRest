import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  public contador: number =0;

  constructor(public navCtrl: NavController) {
  }


  mudar($event){
    console.log($event);
    if($event=='+') this.contador++;
    else if($event=='-'&& this.contador>0) this.contador--;
    
  }

}
