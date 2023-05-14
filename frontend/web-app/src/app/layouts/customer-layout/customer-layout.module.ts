import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomerLayoutComponent } from './customer-layout.component';
import { RouterModule } from '@angular/router';
import { CustomerLayoutRoutes } from './customer-layout.routes';
import { CreateDemandComponent } from './pages/demand/create-demand/create-demand.component';
import { ListDemandComponent } from './pages/demand/list-demand/list-demand.component';
import { EditDemandComponent } from './pages/demand/edit-demand/edit-demand.component';
import { SidebarModule } from "../../sidebar/sidebar.module";
import { ListReportComponent } from './pages/report/list-report/list-report.component';
import { ReactiveFormsModule } from '@angular/forms';
import { ViewReportComponent } from './pages/report/view-report/view-report.component';



@NgModule({
    declarations: [
        CustomerLayoutComponent,
        CreateDemandComponent,
        ListDemandComponent,
        EditDemandComponent,
        ListReportComponent,
        ViewReportComponent,
    ],
    imports: [
        RouterModule.forChild(CustomerLayoutRoutes),
        CommonModule,
        SidebarModule,
        ReactiveFormsModule
    ]
})
export class CustomerLayoutModule { }
