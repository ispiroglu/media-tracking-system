import { FormControl, FormGroup } from '@angular/forms';
import { SourceService } from './../../service/source.service';
import { Component, Input, OnInit } from '@angular/core';
import { SourceModel } from 'app/shared/model/source/source.model';

@Component({
  selector: 'source-form',
  templateUrl: './source-form.component.html',
  styleUrls: ['./source-form.component.scss']
})
export class SourceFormComponent implements OnInit {
  @Input() sourceId: string;
  sourceForm: FormGroup;


  constructor(private sourceService: SourceService) {}

  ngOnInit(): void {
    this.initForm();

    console.log(this.sourceId);

    if (this.sourceId)
      this.patchForm();
  }

  onSubmit() {
    console.log(this.sourceId);

    if (this.sourceId)
      this.sourceService.updateSource(this.sourceId, this.sourceForm.value).subscribe();
    else
      this.sourceService.createSource(this.sourceForm.value).subscribe();
  }

  onDelete() {
    this.sourceService.deleteSourceById(this.sourceId).subscribe();
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
    this.sourceService.getSourceById(this.sourceId).subscribe(
      response => {
        console.log(response);
        source = response.body
        this.sourceForm.patchValue({
          name: source.name,
          website: source.website,
          email: source.email,
          address: source.address,
          phoneNumber: source.phoneNumber,
          sourceType: source.sourceType
        });

        console.log(this.sourceForm.value);
      },
      error => { console.log(error) }
    )
  }
}
