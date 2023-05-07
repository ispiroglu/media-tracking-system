import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BackofficeLayoutComponent } from './backoffice-layout.component';
import { RouterModule } from '@angular/router';
import { BackofficeRoutes } from './backoffice-layout.routing';



@NgModule({
  declarations: [
    BackofficeLayoutComponent
  ],
  imports: [
    RouterModule.forChild(BackofficeRoutes),
    CommonModule
  ]
})
export class BackofficeLayoutModule { }
