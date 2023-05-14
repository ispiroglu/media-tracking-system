import { ActivatedRoute, Params } from '@angular/router';
import { CustomerService } from 'app/layouts/customer-layout/service/customer.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'view-report',
  templateUrl: './view-report.component.html',
  styleUrls: ['./view-report.component.scss']
})
export class ViewReportComponent implements OnInit{
  reportForm: FormGroup;
  reportId: string;

  constructor (private customerService: CustomerService, private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.initForm();
    this.reportForm.disable();
    this.route.params.subscribe((params: Params) => {
      this.reportId = params["id"];
    });

    this.customerService.getReport(this.reportId).subscribe(
      response => {
        const report = response.body;
        this.reportForm.patchValue({
          name: report.name,
          description: report.description,
          createdAt: report.createdAt
        });
      }
    );
  }

  private initForm() {
    this.reportForm = new FormGroup({
      name: new FormControl(null),
      description: new FormControl(null),
      createdAt: new FormControl(null),
    });
  }
}
