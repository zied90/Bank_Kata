import { Injectable } from '@angular/core';
import{Http ,Headers,RequestOptions,URLSearchParams} from '@angular/http';
import {Observable} from  'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/Rx';

@Injectable()
export class GestionCompteService {
   url:any="http://localhost:8080";

  constructor( private _http:Http) { }

  verser(compte){
    console.log(compte)
  let headers = new Headers();
    headers.append('Content-Type', 'application/json');
  const params = new URLSearchParams();
  params.append('solde', compte.solde);
  //params.append('montant', compte.montant);
  console.log(compte)
   var content = JSON.stringify({
      codCpte: compte.codCpte,
      montant:compte.montant
    });
    console.log(content);
 return  this._http.post(this.url +"/verser", content,{headers:headers});
 //.map(res => res.json())
  }

retirer(compte){
   console.log(compte)
  let headers = new Headers();
    headers.append('Content-Type', 'application/json');
    var content = JSON.stringify({
      codCpte: compte.codCpte,
      montant:compte.montant
    });
    return  this._http.post(this.url +"/retirer", content,{headers:headers}).map(res => res.json())
}
  consulterOperation(codCpte:string){
 let cpHeaders = new Headers({ 'Content-Type': 'application/json' });

 cpHeaders.set('Access-Control-Allow-Origin','*') 
   let cpParams = new URLSearchParams();
   cpParams.set('id', codCpte);			
   let options = new RequestOptions({ headers: cpHeaders, params: cpParams });
  cpParams.set('code', codCpte);
 
	return this._http.get(this.url +"/getAllOperation/codCpte=",options)
		.map(res => res.json())
  }   

 
   

}
 