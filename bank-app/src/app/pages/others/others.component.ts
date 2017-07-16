import { GestionCompteService } from './../../service/gestion-compte.service';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-others',
    templateUrl: './others.component.html',
})
export class OthersComponent implements OnInit {
    codCpte:string;
    list: any[];
    constructor(private compteService:GestionCompteService) { }

    ngOnInit() {
    }
    chercher(){
    this.compteService.consulterOperation(this.codCpte).subscribe(data=>this.list);
    console.log("listt iss"+this.list);
    }
}
