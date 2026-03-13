package com.cts.agrichain.service;

import com.cts.agrichain.entity.Report;
import java.time.LocalDate;
import java.util.List;

public interface ReportService {
    Report saveReport(Report report);
    List<Report> getAllReports();
    List<Report> getReportsByScope(String scope);
    List<Report> getReportsAfterDate(LocalDate date);
    List<Report> searchByMetrics(String keyword);
}
