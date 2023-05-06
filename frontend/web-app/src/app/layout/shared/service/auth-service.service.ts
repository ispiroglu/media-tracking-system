import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

// TODO: AUTH SERVICE -> BASE-HTTP SERVICe
export class AuthServiceService {
  private _isLoggedIn$ = new BehaviorSubject<boolean>(false);
  isLoggedIn = this._isLoggedIn$.asObservable();

  constructor() { }

  login() {
    return this.getToken
  }

  private getToken(): string {
    return "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJFdnJlbiIsImlhdCI6MTY4MzM5NTAxOCwiZXhwIjoxNzE0OTMxMDE4LCJhdWQiOiJ3d3cuZXhhbXBsZS5jb20iLCJzdWIiOiJqcm9ja2V0QGV4YW1wbGUuY29tIiwiR2l2ZW5OYW1lIjoiSm9obm55IiwiU3VybmFtZSI6IlJvY2tldCIsIkVtYWlsIjoianJvY2tldEBleGFtcGxlLmNvbSIsIlJvbGUiOlsiQWRtaW4iLCJQcm9qZWN0IEFkbWluaXN0cmF0b3IiXX0.Mc4HqIqa3iyHUXdc3DunbJsACU3f0Z9DSVrAodvvwhs";
  }
}
