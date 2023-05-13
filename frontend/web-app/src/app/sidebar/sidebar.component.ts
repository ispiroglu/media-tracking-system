import {Component, OnInit} from '@angular/core';
import {AuthService} from "../shared/auth/auth.service";
import {Roles} from "../shared/auth/model/role.model";


export interface RouteInfo {
  path: string;
  title: string;
  icon: string;
  class: string;
}

export let ROUTES: RouteInfo[];

const CUSTOMER_ROUTES: RouteInfo[] = [
  {path: '/dashboard', title: 'Dashboard', icon: 'nc-bank', class: ''},
  {path: '/customer/demand', title: 'Talepler', icon: 'nc-diamond', class: ''},
  {path: '/customer/report', title: 'Raporlar', icon: 'nc-diamond', class: ''},
  // { path: '/maps',          title: 'Maps',              icon:'nc-pin-3',      class: '' },
  // { path: '/notifications', title: 'Notifications',     icon:'nc-bell-55',    class: '' },
  // { path: '/user',          title: 'User Profile',      icon:'nc-single-02',  class: '' },
  // { path: '/table',         title: 'Table List',        icon:'nc-tile-56',    class: '' },
  // { path: '/typography',    title: 'Typography',        icon:'nc-caps-small', class: '' },
  // { path: '/upgrade',       title: 'Upgrade to PRO',    icon:'nc-spaceship',  class: 'active-pro' },
];

const BACKOFFICE_ROUTES: RouteInfo[] = [
  {path: '/dashboard', title: 'Dashboard', icon: 'nc-bank', class: ''},
  {path: '/backoffice/demand', title: 'Talepler', icon: 'nc-diamond', class: ''},
  {path: '/backoffice/report', title: 'Raporlar', icon: 'nc-diamond', class: ''},
  {path: '/backoffice/sources', title: 'Kaynaklar', icon: 'nc-diamond', class: ''},
  // { path: '/maps',          title: 'Maps',              icon:'nc-pin-3',      class: '' },
  // { path: '/notifications', title: 'Notifications',     icon:'nc-bell-55',    class: '' },
  // { path: '/user',          title: 'User Profile',      icon:'nc-single-02',  class: '' },
  // { path: '/table',         title: 'Table List',        icon:'nc-tile-56',    class: '' },
  // { path: '/typography',    title: 'Typography',        icon:'nc-caps-small', class: '' },
  // { path: '/upgrade',       title: 'Upgrade to PRO',    icon:'nc-spaceship',  class: 'active-pro' },
];

const ADMIN_ROUTES: RouteInfo[] = [
  {path: '/dashboard', title: 'Dashboard', icon: 'nc-bank', class: ''},
  {path: '/admin/sources', title: 'Kaynaklar', icon: 'nc-diamond', class: ''},
  // { path: '/maps',          title: 'Maps',              icon:'nc-pin-3',      class: '' },
  // { path: '/notifications', title: 'Notifications',     icon:'nc-bell-55',    class: '' },
  // { path: '/user',          title: 'User Profile',      icon:'nc-single-02',  class: '' },
  // { path: '/table',         title: 'Table List',        icon:'nc-tile-56',    class: '' },
  // { path: '/typography',    title: 'Typography',        icon:'nc-caps-small', class: '' },
  // { path: '/upgrade',       title: 'Upgrade to PRO',    icon:'nc-spaceship',  class: 'active-pro' },
];


@Component({
  moduleId: module.id,
  selector: 'sidebar-cmp',
  templateUrl: 'sidebar.component.html',
})

export class SidebarComponent implements OnInit {
  public menuItems: any[];

  constructor(private authService: AuthService) { }

  ngOnInit() {
    switch (this.authService.loggedInRole) {
      case Roles.ADMIN:
        ROUTES = ADMIN_ROUTES;
        this.menuItems = ADMIN_ROUTES.filter(menuItem => menuItem);
        break;
        case Roles.BACKOFFICE:
        ROUTES = BACKOFFICE_ROUTES;
        this.menuItems = BACKOFFICE_ROUTES.filter(menuItem => menuItem);
        break;
        case Roles.CUSTOMER:
        ROUTES = CUSTOMER_ROUTES;
        this.menuItems = CUSTOMER_ROUTES.filter(menuItem => menuItem);
        break;
      default:
        break;
    }
  }
}
