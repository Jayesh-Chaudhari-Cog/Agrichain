package com.cts.agrichain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Report {

    @Id
    private int reportId;
    private String scope;
    private String metrics;
    private LocalDate generatedDate;

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

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }
    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }
}
