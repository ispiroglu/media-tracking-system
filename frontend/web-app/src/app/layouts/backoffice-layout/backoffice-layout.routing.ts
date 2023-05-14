import { Routes } from "@angular/router";
import { ListDemandComponent } from "./pages/demand/list-demand/list-demand.component";
import { ViewDemandComponent } from "./pages/demand/view-demand/view-demand.component";
import { ListSourceComponent } from "./pages/source/list-source/list-source.component";
import { ViewSourceComponent } from "./pages/source/view-source/view-source.component";

export const BackofficeRoutes: Routes = [
  {
    path: 'demand',
    component: ListDemandComponent
  },
  {
    path: 'demand/:id',
    component: ViewDemandComponent
  },
  {
    path: 'source',
    component: ListSourceComponent
  },
  {
    path: 'source/:id',
    component: ViewSourceComponent
  }
]
