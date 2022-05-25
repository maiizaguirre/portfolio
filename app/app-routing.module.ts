import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AppComponent } from './app.component';
import { CompetencesComponent } from './competences/competences.component';
import { EducationComponent } from './education/education.component';
import { LoginComponent } from './login/login.component';
import { PortfolioComponent } from './portfolio/portfolio.component';
import { ProjectsComponent } from './projects/projects.component';
import { GuardGuard } from './servicios/guard.guard';


const routes: Routes = [
  {path:'',redirectTo:'login',pathMatch:'full'},
  {path:'portfolio',component:PortfolioComponent, canActivate:[GuardGuard]},
  {path:'login',component:LoginComponent},
 ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
