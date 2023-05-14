import { ActivatedRoute, Router} from '@angular/router';
import { BackofficeService } from './../../../service/backoffice.service';
import { Component, OnInit } from '@angular/core';
import { ReportDemandModel } from 'app/shared/model/demand/report-demand.model';

@Component({
  selector: 'list-demand',
  templateUrl: './list-demand.component.html',
  styleUrls: ['./list-demand.component.scss']
})
export class ListDemandComponent implements OnInit {
  reportDemandList: ReportDemandModel[];

  constructor(private backofficeService: BackofficeService, private route: ActivatedRoute, private router: Router) {}

  ngOnInit(): void {
    this.backofficeService.getAllReportDemands().subscribe(
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
