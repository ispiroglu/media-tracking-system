import { Injectable } from "@angular/core";
import {
  HttpEvent,
  HttpInterceptor,
  HttpHandler,
  HttpRequest,
} from "@angular/common/http";
import { Observable } from "rxjs";
import { ACCESS_TOKEN } from "../constants/auth.constants";

@Injectable()
export class HeaderInterceptor implements HttpInterceptor {
  constructor() {}

  intercept(
    req: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    let headers = req.headers
      .set("Content-Type", "application/json")
      .set("Access-Control-Allow-Origin", "http://localhost:8080/");

    const token = localStorage.getItem(ACCESS_TOKEN);
    if (token) {
      headers = headers.set("Authroization", `Bearer ${token}`);
    }

    const authReq = req.clone({ headers });
    return next.handle(authReq);
  }
}
