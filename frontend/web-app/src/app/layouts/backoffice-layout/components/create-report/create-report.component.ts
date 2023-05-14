import { BackofficeService } from './../../service/backoffice.service';
import { Component, Inject, Input, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'create-report',
  templateUrl: './create-report.component.html',
  styleUrls: ['./create-report.component.scss']
})
export class CreateReportComponent implements OnInit {
  @Input() demandID: string;
  reportForm: FormGroup;

  constructor(private backofficeService: BackofficeService, @Inject(MAT_DIALOG_DATA) public data: {demandId: string}) {}

  ngOnInit(): void {
    this.initForm();

  }

  onSubmit() {
    const body = {...this.reportForm.value, demandId: this.data.demandId};
    this.backofficeService.createReport(body).subscribe();;
  }

  private initForm() {
    this.reportForm = new FormGroup({
      name: new FormControl(null),
      description: new FormControl(null),
    });
  }

}
