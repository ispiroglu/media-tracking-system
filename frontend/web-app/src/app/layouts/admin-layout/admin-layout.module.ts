import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminLayoutComponent } from './admin-layout.component';
import { ActivatedRouteSnapshot, RouterModule } from '@angular/router';
import { AdminLayoutRoutes } from './admin-layout.routing';
import { ListSourceComponent } from './pages/source/list-source/list-source.component';
import { CreateSourceComponent } from './pages/source/create-source/create-source.component';
import { EditSourceComponent } from './pages/source/edit-source/edit-source.component';
import { SidebarModule } from "../../sidebar/sidebar.module";
import { SourceFormComponent } from './component/source-form/source-form.component';
import { ReactiveFormsModule } from '@angular/forms';



@NgModule({
    declarations: [
        AdminLayoutComponent,
        ListSourceComponent,
        CreateSourceComponent,
        EditSourceComponent,
        SourceFormComponent
    ],
    imports: [
        RouterModule.forChild(AdminLayoutRoutes),
        CommonModule,
        SidebarModule,
        ReactiveFormsModule
    ]
})
export class AdminLayoutModule { }
