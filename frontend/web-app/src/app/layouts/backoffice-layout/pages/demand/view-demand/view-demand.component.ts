import { BackofficeService } from "./../../../service/backoffice.service";
import { Component, OnInit } from "@angular/core";
import { FormControl, FormGroup } from "@angular/forms";
import { MatDialog } from "@angular/material/dialog";
import { ActivatedRoute, Params } from "@angular/router";
import { CreateReportComponent } from "app/layouts/backoffice-layout/components/create-report/create-report.component";
import { ReportDemandModel } from "app/shared/model/demand/report-demand.model";

@Component({
  selector: "view-demand",
  templateUrl: "./view-demand.component.html",
  styleUrls: ["./view-demand.component.scss"],
})
export class ViewDemandComponent implements OnInit {
  demandForm: FormGroup;
  demandId: string;

  constructor(
    private backofficeService: BackofficeService,
    private route: ActivatedRoute,
    public dialog: MatDialog
  ) {}

  ngOnInit(): void {
    this.initForm();
    this.demandForm.disable();

    this.route.params.subscribe((params: Params) => {
      this.demandId = params["id"];
    });

    this.backofficeService
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

  openDialog() {
    const dialogRef = this.dialog.open(CreateReportComponent, {
      data: {
        demandId: this.demandId,
      },
      height: "40%",
      width: "60%",
    });
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
