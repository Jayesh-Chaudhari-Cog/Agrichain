package com.cts.agrichain.entity;

import java.util.Date;

public class Report {
    private int reportId;
    private String scope;
    private String metrics;
    private Date generatedDate;

    public int getReportId() {
        return reportId;
    }
    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getScope() {
        return scope;
    }
    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getMetrics() {
        return metrics;
    }
    public void setMetrics(String metrics) {
        this.metrics = metrics;
    }

    public Date getGeneratedDate() {
        return generatedDate;
    }
    public void setGeneratedDate(Date generatedDate) {
        this.generatedDate = generatedDate;
    }
}
