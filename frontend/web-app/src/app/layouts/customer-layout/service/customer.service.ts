import { BaseHttpService } from "app/shared/http/base-http.service";
import { ReportDemandModel } from "app/shared/model/demand/report-demand.model";
import { LOCALHOST_DEMAND, LOCALHOST_REPORT } from "../customer-layout.constants";
import { Injectable } from "@angular/core";
import { ReportModel } from "app/shared/model/report/report.model";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  constructor(private http: BaseHttpService) { }

  createReportDemand(body: any) {
    return this.http.httpPost<any>(`${LOCALHOST_DEMAND}`, body);
  }

  getAllReportDemands() {
    return this.http.httpGet<ReportDemandModel[]>(`${LOCALHOST_DEMAND}`);
  }

  getReportDemandById(id: string) {
    return this.http.httpGet<ReportDemandModel>(`${LOCALHOST_DEMAND}/${id}`);
  }

  updateReportDemand(id: string, updateBody: any) {
    return this.http.httpPatch<any>(`${LOCALHOST_DEMAND}/${id}`, updateBody);
  }

  deleteReportDemandById(id: string) {
    return this.http.httpDelete<any>(`${LOCALHOST_DEMAND}/${id}`);
  }

  getAllReports() {
    return this.http.httpGet<ReportModel[]>(`${LOCALHOST_REPORT}`);
  }

  getReport(reportId: string) {
    return this.http.httpGet<ReportModel>(`${LOCALHOST_REPORT}/${reportId}`);
  }
}
