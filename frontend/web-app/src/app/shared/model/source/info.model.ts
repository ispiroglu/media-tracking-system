export class InfoModel {
  constructor(
    public id: string,
    public name: string,
    public topic: string,
    public description: string,
    public email: string,
    public isValid: boolean,
    public createdAt: Date,
  ) {}
}
