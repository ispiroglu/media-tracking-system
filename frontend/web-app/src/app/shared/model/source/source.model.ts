export class SourceModel {
  constructor(
    public id: string,
    public name: string,
    public website: string,
    public address: string,
    public email: string,
    public phoneNumber: string,
    public sourceType: SourceType,
    public createdAt: Date,
    public lastModifiedAt: Date,
  ) {}
}
