import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { BackofficeService } from '../../service/backoffice.service';
import { InfoModel } from 'app/shared/model/source/info.model';
import { response } from 'express';

@Component({
  selector: 'info-table',
  templateUrl: './info-table.component.html',
  styleUrls: ['./info-table.component.scss']
})
export class InfoTableComponent implements OnInit {
  infoTable: InfoModel[];
  sourceID: string;


  constructor (private backofficeService: BackofficeService, @Inject(MAT_DIALOG_DATA) public data: {sourceId: string}) {}

  ngOnInit(): void {
    this.sourceID = this.data.sourceId;

    this.backofficeService.getInfosBySourceId(this.sourceID).subscribe(
      response => {
        console.log(response);
        this.infoTable = response.body;
      }
    );
  }



}
