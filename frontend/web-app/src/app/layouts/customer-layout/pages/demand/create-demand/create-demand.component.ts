import { Component } from "@angular/core";
import { FormGroup, FormControl } from "@angular/forms";
import { ActivatedRoute, Router } from "@angular/router";
import { CustomerService } from "app/layouts/customer-layout/service/customer.service";

@Component({
  selector: "create-demand",
  templateUrl: "./create-demand.component.html",
  styleUrls: ["./create-demand.component.scss"],
})
export class CreateDemandComponent {
  demandForm: FormGroup;

  constructor(
    private customerSerivce: CustomerService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.initForm();
  }

  onSubmit() {
    this.customerSerivce.createReportDemand(this.demandForm.value).subscribe()

    // this.router.navigate();
  }

  private initForm() {
    this.demandForm = new FormGroup({
      name: new FormControl(null),
      description: new FormControl(null),
      reportPeriodType: new FormControl(null),
    });
  }
}
