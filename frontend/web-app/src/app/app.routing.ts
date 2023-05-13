import { Routes } from '@angular/router';

import { LoginComponent } from './auth/login/login.component';
import { SignupComponent } from './auth/signup/signup.component';
import { BackofficeLayoutComponent } from './layouts/backoffice-layout/backoffice-layout.component';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { CustomerLayoutComponent } from './layouts/customer-layout/customer-layout.component';
import { adminGuard, authGuard, backofficeGuard, customerGuard } from './shared/guard/auth.guard';

export const AppRoutes: Routes = [
  {
    path: '',
    redirectTo: 'dashboard',
    pathMatch: 'full',
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'signup',
    component: SignupComponent
  },
  {
    canActivate: [authGuard, adminGuard],
    path: 'admin',
    component: AdminLayoutComponent,
    children: [{
      path: '',
      loadChildren: () => import('./layouts/admin-layout/admin-layout.module').then(x => x.AdminLayoutModule)
    }]
  },
  {
    canActivate: [authGuard, backofficeGuard],
    path: 'backoffice',
    component: BackofficeLayoutComponent,
    children: [{
      path: '',
      loadChildren: () => import('./layouts/backoffice-layout/backoffice-layout.module').then(x => x.BackofficeLayoutModule)
    }]
  },
  {
    canActivate: [authGuard, customerGuard],
    path: 'customer',
    component: CustomerLayoutComponent,
    children: [{
      path: '',
      loadChildren: () => import('./layouts/customer-layout/customer-layout.module').then(x => x.CustomerLayoutModule)
    }]
  },
  {
    path: '**',
    redirectTo: 'dashboard'
  }
]
