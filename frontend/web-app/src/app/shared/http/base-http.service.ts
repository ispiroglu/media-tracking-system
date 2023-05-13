import { HttpClient, HttpHeaders, HttpParams } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Params } from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class BaseHttpService {
  constructor(protected httpClient: HttpClient) {}

  httpGet<T>(requestUrl: string = "", headers?: HttpHeaders, params?: Params) {
    return this.httpClient.get<T>(requestUrl, {
      headers,
      observe: "response",
      params: params,
    });
  }

  httpPost<T>(
    requestUrl: string = "",
    data: any,
    headers?: HttpHeaders,
    params?: HttpParams
  ) {
    return this.httpClient.post<T>(requestUrl, data, {
      headers,
      observe: "response",
      params,
    });
  }

  httpPatch<T>(
    requestUrl: string = "",
    data: any,
    headers?: HttpHeaders,
    params?: HttpParams
  ) {
    return this.httpClient.patch<T>(requestUrl, data, {
      headers,
      observe: "response",
      params,
    });
  }

  httpDelete<T>(requestUrl: string = "", headers?: HttpHeaders, params?: HttpParams) {
    return this.httpClient.delete<T>(requestUrl, {
      headers,
      observe: "response",
      params
    });
  }
}
