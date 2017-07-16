import { Component } from '@angular/core';
import {Login} from "./models/login";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  loginInfo:Login = {
      first_name:'Miladi',
      last_name:'Zied',
      avatar:'ay.jpeg',
      title:'Developer'
  };
}
