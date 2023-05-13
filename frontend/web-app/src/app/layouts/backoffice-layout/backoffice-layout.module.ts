import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BackofficeLayoutComponent } from './backoffice-layout.component';
import { RouterModule } from '@angular/router';
import { BackofficeRoutes } from './backoffice-layout.routing';
import { ListSourceComponent } from './pages/source/list-source/list-source.component';
import { ViewSourceComponent } from './pages/source/view-source/view-source.component';
import { CreateReportComponent } from './pages/report/create-report/create-report.component';
import { ListReportComponent } from './pages/report/list-report/list-report.component';
import { ListDemandComponent } from './pages/demand/list-demand/list-demand.component';
import { ViewDemandComponent } from './pages/demand/view-demand/view-demand.component';



@NgModule({
  declarations: [
    BackofficeLayoutComponent,
    ListSourceComponent,
    ViewSourceComponent,
    CreateReportComponent,
    ListReportComponent,
    ListDemandComponent,
    ViewDemandComponent
  ],
  imports: [
    RouterModule.forChild(BackofficeRoutes),
    CommonModule
  ]
})
export class BackofficeLayoutModule { }
