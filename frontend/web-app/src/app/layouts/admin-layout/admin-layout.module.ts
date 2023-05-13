import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminLayoutComponent } from './admin-layout.component';
import { RouterModule } from '@angular/router';
import { AdminLayoutRoutes } from './admin-layout.routing';
import { ListSourceComponent } from './pages/source/list-source/list-source.component';
import { CreateSourceComponent } from './pages/source/create-source/create-source.component';
import { EditSourceComponent } from './pages/source/edit-source/edit-source.component';
import { NavbarModule } from "../../shared/navbar/navbar.module";
import { SidebarModule } from "../../sidebar/sidebar.module";



@NgModule({
    declarations: [
        AdminLayoutComponent,
        ListSourceComponent,
        CreateSourceComponent,
        EditSourceComponent
    ],
    imports: [
        RouterModule.forChild(AdminLayoutRoutes),
        CommonModule,
        NavbarModule,
        SidebarModule
    ]
})
export class AdminLayoutModule { }
