import { CustomerService } from "app/layouts/customer-layout/service/customer.service";
import { Component, OnInit } from "@angular/core";
import { FormControl, FormGroup } from "@angular/forms";
import { ActivatedRoute, Params } from "@angular/router";
import { ReportDemandModel } from "app/shared/model/demand/report-demand.model";

@Component({
  selector: "edit-demand",
  templateUrl: "./edit-demand.component.html",
  styleUrls: ["./edit-demand.component.scss"],
})
export class EditDemandComponent implements OnInit {
  demandForm: FormGroup;
  demandId: string;

  constructor(
    private customerSerivce: CustomerService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.initForm();
    this.demandForm.disable();

    this.route.params.subscribe((params: Params) => {
      this.demandId = params["id"];
    });

    this.customerSerivce
      .getReportDemandById(this.demandId)
      .subscribe((response) => {
        const demand: ReportDemandModel = response.body;
        this.demandForm.patchValue({
          name: demand.name,
          description: demand.description,
          reportPeriodType: demand.reportPeriodType,
          deadline: demand.deadline,
          active: demand.active ? "AKTİF" : "SONUÇLANDIRILDI",
          createdAt: demand.createdAt,
          lastModifiedDate: demand.lastModifiedDate,
        });
      });
  }

  onDelete() {
    this.customerSerivce.deleteReportDemandById(this.demandId).subscribe();
  }

  private initForm() {
    this.demandForm = new FormGroup({
      name: new FormControl(null),
      description: new FormControl(null),
      reportPeriodType: new FormControl(null),
      deadline: new FormControl(null),
      active: new FormControl(null),
      createdAt: new FormControl(null),
      lastModifiedDate: new FormControl(null),
    });
  }
}
