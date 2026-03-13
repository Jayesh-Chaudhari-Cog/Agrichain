package com.cts.agrichain.dao;

import com.cts.agrichain.entity.Compliance;
import com.cts.agrichain.enums.ComplianceResult;
import com.cts.agrichain.enums.ComplianceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ComplianceRepo extends JpaRepository<Compliance,Long>{
    List<Compliance> findByEntityId(long entityId);
    List<Compliance> findByType(ComplianceType type);
    List<Compliance> findByResult(ComplianceResult result);


}
