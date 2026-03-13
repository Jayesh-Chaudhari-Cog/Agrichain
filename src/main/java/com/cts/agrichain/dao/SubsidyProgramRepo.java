package com.cts.agrichain.dao;

import com.cts.agrichain.entity.SubsidyProgram;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubsidyProgramRepo extends JpaRepository<SubsidyProgram, Long> {
    List<SubsidyProgram> findBySubsidyProgramId(Long subsidyProgramId);

    List<SubsidyProgram> findByTitle(String title);

    List<SubsidyProgram> findByAllottedBudget(double allottedBudget);

    List<SubsidyProgram> findByConsumedBudget(double consumedBudget);
}