import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LOCALHOST_SOURCE } from 'app/layouts/admin-layout/admin-layout.constants';
import { BaseHttpService } from 'app/shared/http/base-http.service';
import { SourceModel } from 'app/shared/model/source/source.model';

@Component({
  selector: 'list-source',
  templateUrl: './list-source.component.html',
  styleUrls: ['./list-source.component.scss']
})
export class ListSourceComponent implements OnInit{
  sourceList: SourceModel[];

  constructor(
    private http: BaseHttpService,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.http
      .httpGet<SourceModel[]>(`${LOCALHOST_SOURCE}`)
      .subscribe((response) => {
        console.log(response);
        this.sourceList = response.body;
      });
  }

  onClickAdd() {
    this.router.navigate(["create"], { relativeTo: this.route });
  }

  onClickView(sourceId: string) {
    this.router.navigate([`${sourceId}`], { relativeTo: this.route });
  }
}
