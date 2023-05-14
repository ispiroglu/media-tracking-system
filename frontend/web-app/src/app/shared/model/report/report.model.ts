export class ReportModel {
  constructor(
    public id: string,
    public name: string,
    public description: string,
    public reportPeriodType: ReportPeriodType,
    public createdAt: Date,
  ) {}
}
