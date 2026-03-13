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
    public Report createReport(Report report) {
        // Logic: Always set the generation date to 'now' when creating a new report
        report.setGeneratedDate(LocalDate.now());
        return reportRepo.save(report);
    }

    @Override
    public List<Report> fetchAllReports() {
        return reportRepo.findAll();
    }

    @Override
    public List<Report> getReportsByScope(String scope) {
        // Logic: Useful for the "Generate dashboards for crop listings" feature
        return reportRepo.findByScope(scope);
    }

    @Override
    public List<Report> getReportsByDateRange(LocalDate start, LocalDate end) {
        return reportRepo.findByGeneratedDateAfter(start);
    }
}