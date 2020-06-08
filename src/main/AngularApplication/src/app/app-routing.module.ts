import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentRegistrationFormComponent } from 'src/app/student-registration/student-registration-form/student-registration-form.component';
import { LoginPageComponent } from './login-page/login-page-form/login-page.component';
import { VideoConferenceComponent } from './video-conferencing/video-conference/video-conference.component';
import { StudentCalendarComponent } from 'src/app/student-dashboard/student-calendar/student-calendar.component';

const routes: Routes = [
  { path: 'login', component: LoginPageComponent},
  { path: '', redirectTo: 'sign', pathMatch: 'full'},
  { path: 'registerStudent', component: StudentRegistrationFormComponent},
  { path: 'classroom', component: VideoConferenceComponent} ,
  { path: 'timetable', component: StudentCalendarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
 appRoutingModule = RouterModule.forRoot(routes);
}
