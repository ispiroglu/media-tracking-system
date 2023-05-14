import { MatDialogModule } from '@angular/material/dialog';
import { MatExpansionModule } from '@angular/material/expansion';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BackofficeLayoutComponent } from './backoffice-layout.component';
import { RouterModule } from '@angular/router';
import { BackofficeRoutes } from './backoffice-layout.routing';
import { ListSourceComponent } from './pages/source/list-source/list-source.component';
import { ViewSourceComponent } from './pages/source/view-source/view-source.component';
import { CreateReportComponent } from './components/create-report/create-report.component';
import { ViewDemandComponent } from './pages/demand/view-demand/view-demand.component';
import { SidebarModule } from "../../sidebar/sidebar.module";
import { ListDemandComponent } from './pages/demand/list-demand/list-demand.component';
import { ReactiveFormsModule } from '@angular/forms';
import { SourceFormComponent } from './components/source-form/source-form.component';
import { InfoTableComponent } from './components/info-table/info-table.component';


@NgModule({
    declarations: [
        BackofficeLayoutComponent,
        ListSourceComponent,
        ViewSourceComponent,
        CreateReportComponent,
        ViewDemandComponent,
        ListDemandComponent,
        ViewDemandComponent,
        SourceFormComponent,
        InfoTableComponent
    ],
    imports: [
        RouterModule.forChild(BackofficeRoutes),
        CommonModule,
        SidebarModule,
        ReactiveFormsModule,
        MatDialogModule,
        MatExpansionModule,
    ]
})
export class BackofficeLayoutModule { }
