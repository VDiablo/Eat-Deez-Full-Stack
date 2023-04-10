import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InsertComponent } from './insert/insert.component';
import { UpdateComponent } from './update/update.component';
import { DeleteComponent } from './delete/delete.component';
import { ViewComponent } from './view/view.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
const routes: Routes = [
  {path:'insert',component:InsertComponent},
  {path:'update',component:UpdateComponent},
  {path:'delete',component:DeleteComponent},
  {path:'view',component:ViewComponent},
  {path:'login',component:LoginComponent},
  {path:'about',component:AboutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
