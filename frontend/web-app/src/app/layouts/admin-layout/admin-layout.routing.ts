import { Routes } from "@angular/router";
import { ListSourceComponent } from "./pages/source/list-source/list-source.component";
import { CreateSourceComponent } from "./pages/source/create-source/create-source.component";
import { EditSourceComponent } from "./pages/source/edit-source/edit-source.component";

export const AdminLayoutRoutes: Routes = [
  {
    path: 'source',
    component: ListSourceComponent
  },
  {
    path: 'source/create',
    component: CreateSourceComponent
  },
  {
    path: 'source/:id',
    component: EditSourceComponent
  },
]
