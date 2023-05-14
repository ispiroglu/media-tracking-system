import { Injectable } from '@angular/core';
import { BaseHttpService } from 'app/shared/http/base-http.service';
import { LOCALHOST_SOURCE } from '../admin-layout.constants';
import { SourceModel } from 'app/shared/model/source/source.model';

@Injectable({
  providedIn: 'root'
})
export class SourceService {

  constructor(private http: BaseHttpService) { }

  createSource(body: any) {
    return this.http.httpPost<any>(`${LOCALHOST_SOURCE}`, body);
  }

  getAllSources() {
    return this.http.httpGet<SourceModel[]>(`${LOCALHOST_SOURCE}`);
  }

  getSourceById(id: string) {
    return this.http.httpGet<SourceModel>(`${LOCALHOST_SOURCE}/${id}`);
  }

  updateSource(id: string, updateBody: any) {
    return this.http.httpPatch<any>(`${LOCALHOST_SOURCE}/${id}`, updateBody);
  }

  deleteSourceById(id: string) {
    return this.http.httpDelete<any>(`${LOCALHOST_SOURCE}/${id}`);
  }
}
