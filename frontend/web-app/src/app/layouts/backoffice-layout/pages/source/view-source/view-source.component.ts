import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'view-source',
  templateUrl: './view-source.component.html',
  styleUrls: ['./view-source.component.scss']
})
export class ViewSourceComponent implements OnInit {

  sourceId: string;

  constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.route.params.subscribe(
      (params: Params) => {
        this.sourceId = params['id'];
      }
    )
  }
}
