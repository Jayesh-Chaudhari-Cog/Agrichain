package com.cts.agrichain.dao;

import com.cts.agrichain.entity.Disbursement;
import com.cts.agrichain.enums.DisbursementStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisbursementRepo extends JpaRepository<Disbursement, Integer> {

    // 1. Find all disbursements for a specific farmer
    List<Disbursement> findByFarmerID(int farmerID);

    // 2. Find all disbursements that have a specific status (e.g., PENDING)
    List<Disbursement> findByDisbursementStatus(DisbursementStatus status);

    // 3. Find disbursements for a specific program
    List<Disbursement> findByProgramID(int programID);
}
