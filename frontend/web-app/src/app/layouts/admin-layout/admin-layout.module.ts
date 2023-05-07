import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminLayoutComponent } from './admin-layout.component';
import { RouterModule } from '@angular/router';
import { AdminLayoutRoutes } from './admin-layout.routing';



@NgModule({
  declarations: [
    AdminLayoutComponent
  ],
  imports: [
    RouterModule.forChild(AdminLayoutRoutes),
    CommonModule
  ]
})
export class AdminLayoutModule { }
