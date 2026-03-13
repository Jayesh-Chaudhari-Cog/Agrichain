package com.cts.agrichain.dao;

import com.cts.agrichain.entity.ComplianceRecord;
import com.cts.agrichain.enums.ComplianceResult;
import com.cts.agrichain.enums.ComplianceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface ComplianceRecordRepo extends JpaRepository<ComplianceRecord,Integer> {
    List<ComplianceRecord> findByEntityID(int entityID);

    List<ComplianceRecord> findByType(ComplianceType type);

    List<ComplianceRecord> findByResult(ComplianceResult result);

    List<ComplianceRecord> findByDate(LocalDate date);

}
