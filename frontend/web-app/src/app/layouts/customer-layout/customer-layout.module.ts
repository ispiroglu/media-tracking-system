import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomerLayoutComponent } from './customer-layout.component';
import { RouterModule } from '@angular/router';
import { CustomerLayoutRoutes } from './customer-layout.routes';



@NgModule({
  declarations: [
    CustomerLayoutComponent
  ],
  imports: [
    RouterModule.forChild(CustomerLayoutRoutes),
    CommonModule
  ]
})
export class CustomerLayoutModule { }
