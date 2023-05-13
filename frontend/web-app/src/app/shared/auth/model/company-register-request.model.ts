export class CompanyRegisterRequest {
  constructor(
    public companyName: string,
    public companyType: string,
    public companyManagerName: string,
    public companyEmail: string,
    public companyPhoneNumber: string,
    public companyPassword: string,
    public companyReportType: string,
    public companyAddress: string,
  ) {}
}
