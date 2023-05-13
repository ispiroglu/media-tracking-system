export class PersonalRegisterRequest {
  constructor(
    public firstName: string,
    public lastName: string,
    public email: String,
    public phoneNumber: string,
    public password: string,
    public placeOfBirth: string,
    public birthDate: Date,
    public address: string,
    public occupation: string,
    public reportType: string,
  ) {}
}
