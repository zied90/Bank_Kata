import { GestionCompteService } from './../../service/gestion-compte.service';
import {OnInit, Component} from "@angular/core";
import {Compte} from '../../models/compte'
@Component({
    selector: 'home',
    templateUrl: './home.component.html'
})
export class HomeComponent implements OnInit {
    compte=new Compte();
    show=false;
    constructor( private gestionService:GestionCompteService) { }

    ngOnInit() {
    } 
    verser(compte){
        
     console.log(compte);
     this.gestionService.verser(compte).subscribe();
     this.show=true;
    }
    retirer(compte){
this.gestionService.retirer(compte).subscribe();
    }
}