package com.cts.agrichain.service;

import com.cts.agrichain.dao.ReportRepo;
import com.cts.agrichain.entity.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportRepo reportRepo;

    @Override
    public Report saveReport(Report report) {
        // You could add logic here (e.g., setting the date automatically)
        if (report.getGeneratedDate() == null) {
            report.setGeneratedDate(LocalDate.now());
        }
        return reportRepo.save(report);
    }

    @Override
    public List<Report> getAllReports() {
        return reportRepo.findAll();
    }

    @Override
    public List<Report> getReportsByScope(String scope) {
        return reportRepo.findByScope(scope);
    }

    @Override
    public List<Report> getReportsAfterDate(LocalDate date) {
        return reportRepo.findByGeneratedDateAfter(date);
    }

    @Override
    public List<Report> searchByMetrics(String keyword) {
        return reportRepo.findByMetricsContaining(keyword);
    }
}
