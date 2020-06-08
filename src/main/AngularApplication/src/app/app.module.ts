import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule} from './app-routing.module';
import { AppComponent } from './app.component';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatToolbarModule } from '@angular/material/toolbar';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginPageComponent } from 'src/app/login-page/login-page-form/login-page.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { StudentRegistrationFormComponent } from 'src/app/student-registration/student-registration-form/student-registration-form.component';
import { MatIconModule } from '@angular/material/icon';
import { FooterComponent } from 'src/app/shared/footer/footer.component';
import { HeaderComponent } from 'src/app/shared/header/header.component';
import { VideoConferenceComponent } from './video-conferencing/video-conference/video-conference.component';
import { environment } from 'src/environments/environment';
import { NgxAgoraModule } from 'ngx-agora';
import { MatMenuModule } from '@angular/material/menu';
import { AboutComponent } from 'src/app/shared/aboutUs/about.component';
import { StudentCalendarComponent } from 'src/app/student-dashboard/student-calendar/student-calendar.component';
import { FlatpickrModule } from 'angularx-flatpickr';
import { CalendarModule, DateAdapter } from 'angular-calendar';
import { adapterFactory } from 'angular-calendar/date-adapters/date-fns';
import { NgbModalModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms'; 

//to be removed
import { AngularAgoraRtcModule, AgoraConfig } from 'angular-agora-rtc'; // Add
const agoraConfig: AgoraConfig = {
  AppID: '5788f0cdbac7418caa9baac2eb30b967',
};

@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    StudentRegistrationFormComponent,
    HeaderComponent,
    FooterComponent,
    VideoConferenceComponent,
    AboutComponent,
    StudentCalendarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatToolbarModule,
    MatFormFieldModule,
    ReactiveFormsModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    MatMenuModule,
    //NgxAgoraModule.forRoot({ AppID: environment.agora.appId }) //uncooment later
    AngularAgoraRtcModule.forRoot(agoraConfig), // remove,
    NgbModalModule,
    FormsModule,
    FlatpickrModule.forRoot(),
    CalendarModule.forRoot({
      provide: DateAdapter,
      useFactory: adapterFactory,
    }),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
