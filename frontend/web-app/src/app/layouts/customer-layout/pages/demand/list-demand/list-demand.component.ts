import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CustomerService } from 'app/layouts/customer-layout/service/customer.service';
import { ReportDemandModel } from 'app/shared/model/demand/report-demand.model';

@Component({
  selector: 'list-demand',
  templateUrl: './list-demand.component.html',
  styleUrls: ['./list-demand.component.scss']
})
export class ListDemandComponent implements OnInit{
  reportDemandList: ReportDemandModel[];

  constructor(private customerService: CustomerService, private router: Router, private route: ActivatedRoute ) {}

  ngOnInit(): void {
    this.customerService.getAllReportDemands().subscribe(
      response => {
        console.log(response);
        this.reportDemandList = response.body;
      }
    );
  }

  onClickAdd() {
    this.router.navigate(["create"], { relativeTo: this.route });
  }

  onClickView(demandId: string) {
    this.router.navigate([`${demandId}`], { relativeTo: this.route });
  }
}
