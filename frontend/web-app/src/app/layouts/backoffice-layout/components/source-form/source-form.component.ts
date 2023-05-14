import { Component, Input, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { SourceModel } from 'app/shared/model/source/source.model';
import { BackofficeService } from '../../service/backoffice.service';
import { MatDialog } from '@angular/material/dialog';
import { InfoTableComponent } from '../info-table/info-table.component';

@Component({
  selector: 'source-form-cmp',
  templateUrl: './source-form.component.html',
  styleUrls: ['./source-form.component.scss']
})
export class SourceFormComponent implements OnInit {
  @Input() sourceId: string;
  sourceForm: FormGroup;


  constructor(private backofficeService: BackofficeService, public dialog: MatDialog) {}

  ngOnInit(): void {
    this.initForm();
    this.sourceForm.disable();

    if (this.sourceId)
      this.patchForm();
  }

  onClickInfo() {
    const dialogRef = this.dialog.open(InfoTableComponent, {
      data: {
        sourceId: this.sourceId,
      },
      height: "80%",
      width: "60%",
    });
  }

  private initForm() {
    this.sourceForm = new FormGroup({
      name: new FormControl(null),
      website: new FormControl(null),
      address: new FormControl(null),
      email: new FormControl(null),
      phoneNumber: new FormControl(null),
      sourceType: new FormControl(null),
    });
  }

  private patchForm() {
    let source: SourceModel;
    this.backofficeService.getSourceById(this.sourceId).subscribe(
      response => {
        source = response.body
        this.sourceForm.patchValue({
          name: source.name,
          website: source.website,
          email: source.email,
          address: source.address,
          phoneNumber: source.phoneNumber,
          sourceType: source.sourceType
        });

      },
      error => { console.log(error) }
    )
  }
}

