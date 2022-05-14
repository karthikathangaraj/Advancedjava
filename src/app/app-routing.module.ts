import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateStudentComponent } from './create-student/create-student.component';
import { StudentlistComponent } from './studentlist/studentlist.component';

const routes: Routes = [
  {path:"student",component:StudentlistComponent},
  {path :"createstudent",component:CreateStudentComponent},
   {path:'',redirectTo:'student',pathMatch:'full'}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
