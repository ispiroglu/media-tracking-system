export class ReportDemandModel {
  constructor(
    public id: string,
    public name: string,
    public description: string,
    public reportPeriodType: ReportPeriodType,
    public active: boolean,
    public deadline: Date,
    public createdAt: Date,
    public lastModifiedDate: Date,
  ) {}
}
