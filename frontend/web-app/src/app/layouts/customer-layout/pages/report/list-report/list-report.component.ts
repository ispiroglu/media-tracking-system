import { CustomerService } from './../../../service/customer.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ReportModel } from 'app/shared/model/report/report.model';

@Component({
  selector: 'list-report',
  templateUrl: './list-report.component.html',
  styleUrls: ['./list-report.component.scss']
})
export class ListReportComponent implements OnInit {
  reportList: ReportModel[];

  constructor(private customerService: CustomerService, private router: Router, private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.customerService.getAllReports().subscribe(
      response => {
        this.reportList = response.body;
      }
    )
  }

  onClickView(reportId: string) {
    console.log("sa");
    this.router.navigate([`${reportId}`], { relativeTo: this.route });
  }
}
