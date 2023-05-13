import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AuthService } from 'app/shared/auth/auth.service';
import { BaseHttpService } from 'app/shared/http/base-http.service';

@Component({
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {
  isCompany: Boolean = false;

  companyForm: FormGroup;
  personalForm: FormGroup;

  constructor(private authService: AuthService) {}

  ngOnInit(): void {
    this.initCompanyForm();
    this.initPersonalForm();
  }

  onSubmit() {
    this.isCompany ?
      this.authService.registerCompany(this.companyForm.value) :
      this.authService.registerPersonal(this.personalForm.value);

      this.isCompany ? console.log(this.companyForm.value) : console.log(this.personalForm.value)
  }

  private initCompanyForm() {
    this.companyForm = new FormGroup({
      companyName: new FormControl(null, Validators.required),
      companyType: new FormControl(null, Validators.required),
      companyManagerName: new FormControl(null, Validators.required),
      companyEmail: new FormControl(null, [Validators.required, Validators.email]),
      companyPhoneNumber: new FormControl(null, Validators.required),
      companyPassword: new FormControl(null, Validators.required),
      companyReportType: new FormControl(null, Validators.required),
      companyAddress: new FormControl(null, Validators.required),
    });
  }

  private initPersonalForm() {
    this.personalForm = new FormGroup({
      firstName: new FormControl(null, Validators.required),
      lastName: new FormControl(null, Validators.required),
      email: new FormControl(null, Validators.required),
      phoneNumber: new FormControl(null, Validators.required),
      password: new FormControl(null, Validators.required),
      birthDate: new FormControl(null, Validators.required),
      placeOfBirth: new FormControl(null, Validators.required),
      address: new FormControl(null, Validators.required),
      occupation: new FormControl(null, Validators.required),
      reportType: new FormControl(null, Validators.required),
    });
  }
}
