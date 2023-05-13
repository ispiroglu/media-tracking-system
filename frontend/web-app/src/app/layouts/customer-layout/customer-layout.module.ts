import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomerLayoutComponent } from './customer-layout.component';
import { RouterModule } from '@angular/router';
import { CustomerLayoutRoutes } from './customer-layout.routes';
import { CreateDemandComponent } from './pages/demand/create-demand/create-demand.component';
import { ListDemandComponent } from './pages/demand/list-demand/list-demand.component';
import { EditDemandComponent } from './pages/demand/edit-demand/edit-demand.component';
import { SidebarModule } from "../../sidebar/sidebar.module";
import { NavbarModule } from "../../shared/navbar/navbar.module";
import { ListReportComponent } from './pages/report/list-report/list-report.component';



@NgModule({
    declarations: [
        CustomerLayoutComponent,
        CreateDemandComponent,
        ListDemandComponent,
        EditDemandComponent,
        ListReportComponent,
    ],
    imports: [
        RouterModule.forChild(CustomerLayoutRoutes),
        CommonModule,
        SidebarModule,
        NavbarModule
    ]
})
export class CustomerLayoutModule { }
