package com.cts.agrichain.dao;

import com.cts.agrichain.entity.FarmerDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerDocumentRepo extends JpaRepository<FarmerDocument,Integer> {
}
