import { BaseHttpService } from "app/shared/http/base-http.service";
import { LOCALHOST_DEMAND, LOCALHOST_INFO, LOCALHOST_REPORT, LOCALHOST_SOURCE } from "../backoffice-layout.constant";
import { ReportDemandModel } from "app/shared/model/demand/report-demand.model";
import { ReportModel } from "app/shared/model/report/report.model";
import { SourceModel } from "app/shared/model/source/source.model";
import { Injectable } from "@angular/core";
import { InfoModel } from "app/shared/model/source/info.model";
import { HttpParams } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class BackofficeService {
  constructor(private http: BaseHttpService) { }

  getAllReportDemands() {
    return this.http.httpGet<ReportDemandModel[]>(`${LOCALHOST_DEMAND}`);
  }

  getReportDemandById(id: string) {
    return this.http.httpGet<ReportDemandModel>(`${LOCALHOST_DEMAND}/${id}`);
  }

  createReport(body: any) {
    return this.http.httpPost<any>(`${LOCALHOST_REPORT}`, body);
  }

  getAllSources() {
    return this.http.httpGet<SourceModel[]>(`${LOCALHOST_SOURCE}`);
  }

  getSourceById(id: string) {
    return this.http.httpGet<SourceModel>(`${LOCALHOST_SOURCE}/${id}`);
  }

  getInfosBySourceId(sourceId: string) {
    const params = new HttpParams().set('sourceId', sourceId);
    return this.http.httpGet<InfoModel[]>(`${LOCALHOST_INFO}`, null, params);
  }
}

