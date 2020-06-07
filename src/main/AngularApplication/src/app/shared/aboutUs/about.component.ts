import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-aboutUs',
    templateUrl: './about.component.html',
    styleUrls: ['./about.component.css']
  })
  export class AboutComponent {
    display: boolean = true;
    constructor(private router:Router) { 
    }

    register(){
      this.display = false;
      this.router.navigateByUrl('/registerStudent');
    }

    login(){
      this.display = false;
      this.router.navigateByUrl('/login');
    }
  }
  