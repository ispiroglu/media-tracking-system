import {Routes} from "@angular/router";
import {ListDemandComponent} from "./pages/demand/list-demand/list-demand.component";
import {CreateDemandComponent} from "./pages/demand/create-demand/create-demand.component";
import {EditDemandComponent} from "./pages/demand/edit-demand/edit-demand.component";
import { ListReportComponent } from "./pages/report/list-report/list-report.component";

export const CustomerLayoutRoutes: Routes = [
  {
    path: 'demand',
    component: ListDemandComponent
  },
  {
    path: 'demand/create',
    component: CreateDemandComponent
  },
  {
    path: 'demand/:id',
    component: EditDemandComponent
  },
  {
    path: 'report',
    component: ListReportComponent
  }
]
