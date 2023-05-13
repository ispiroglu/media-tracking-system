import { inject } from "@angular/core";
import { CanActivateFn, Router } from "@angular/router";
import { AuthService } from "../auth/auth.service";
import { tap } from "rxjs";
import { Roles } from "../auth/model/role.model";

export const authGuard: CanActivateFn = (route, state) => {
  const authService = inject(AuthService);
  const router = inject(Router);


  return authService.isLoggedIn ? true : router.navigate(["/login"]);;
};

export const backofficeGuard: CanActivateFn = (route, state) => {
  const authService = inject(AuthService);
  const router = inject(Router);

  return authService.loggedInRole === Roles.BACKOFFICE
    ? true
    : router.navigate([""]);
};

export const adminGuard: CanActivateFn = (route, state) => {
  const authService = inject(AuthService);
  const router = inject(Router);

  return authService.loggedInRole === Roles.ADMIN ? true : router.navigate([""]);
};

export const customerGuard: CanActivateFn = (route, state) => {
  const authService = inject(AuthService);
  const router = inject(Router);

  return authService.loggedInRole === Roles.CUSTOMER
    ? true
    : router.navigate([""]);
};
