package com.cts.agrichain.service;

import com.cts.agrichain.entity.Report;
import java.time.LocalDate;
import java.util.List;

public interface ReportService {
    // Basic CRUD
    Report createReport(Report report);
    List<Report> fetchAllReports();

    // Analytics specific methods
    List<Report> getReportsByScope(String scope);
    List<Report> getReportsByDateRange(LocalDate start, LocalDate end);
}
