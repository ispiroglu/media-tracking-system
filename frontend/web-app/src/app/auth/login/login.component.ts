import { Component, OnInit } from "@angular/core";
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { AuthService } from "app/shared/auth/auth.service";

@Component({
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.scss"],
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;

  constructor(private authService: AuthService) {}

  ngOnInit(): void {
    this.loginForm = new FormGroup({
      companyEmail: new FormControl(null, Validators.required),
      companyPassword: new FormControl(null, Validators.required)
    });
  }

  onSubmit() {
    console.log("Login");
    console.log(this.loginForm.value);

    this.authService.login(this.loginForm.value);
  }
}
