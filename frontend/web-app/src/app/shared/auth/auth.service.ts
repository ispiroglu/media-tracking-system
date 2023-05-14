import {LoginRequest} from './model/login-request.model';
import {BaseHttpService} from '../http/base-http.service';
import {Injectable} from '@angular/core';
import {ACCESS_TOKEN, LOCALHOST_COMPANY_REGISTER_URL, LOCALHOST_LOGIN_URL, LOCALHOST_PERSONAL_REGISTER_URL} from '../constants/auth.constants';
import {Roles} from './model/role.model';
import {PersonalRegisterRequest} from './model/personal-register-request.model';
import {CompanyRegisterRequest} from './model/company-register-request.model';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private _customerId$ = new BehaviorSubject<string>(null);
  customerId = null;

  private _isLoggedIn$ = new BehaviorSubject<boolean>(false);
  isLoggedIn = true;

  private _loggedInRole$ = new BehaviorSubject<Roles>(null);
  loggedInRole = Roles.BACKOFFICE;


  constructor(private http: BaseHttpService) { }

  login(loginRequest: LoginRequest) {
    this.http.httpPost<any>(LOCALHOST_LOGIN_URL, loginRequest)
      .subscribe(
        (response) => {
          this.setTokenToLocalStorage(response.body);
          this.customerId = response.body.customerId;
          this.loggedInRole = response.body.loggedInRole;
          this.isLoggedIn = true
        }
      )
  }

  registerPersonal(personalRegisterRequest: PersonalRegisterRequest) {
    this.http.httpPost<any>(LOCALHOST_PERSONAL_REGISTER_URL, personalRegisterRequest)
      .subscribe(
        (response) => {
          this.setTokenToLocalStorage(response.body);
        }
      )
  }

  registerCompany(companyRegisterRequest: CompanyRegisterRequest) {
    this.http.httpPost<any>(LOCALHOST_COMPANY_REGISTER_URL, companyRegisterRequest)
      .subscribe(
        (response) => {
          this.setTokenToLocalStorage(response.body);
        }
      )
  }

  private setTokenToLocalStorage(responseBody: any) {
    localStorage.setItem(ACCESS_TOKEN, responseBody.access_token)
  }
}
