import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginPageComponent } from './login-page-form/login-page.component';
import { MatCardModule } from '@angular/material/card';

@NgModule({
  declarations: [LoginPageComponent],
  imports: [
    CommonModule,
    MatCardModule
  ]
})
export class WelcomePageModule { }
