package com.cts.agrichain.dao;

import com.cts.agrichain.entity.CropListing;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CropListingRepo extends JpaRepository<CropListing, Integer> {
    List<CropListing> findByFarmerId(int farmerId);
    List<CropListing> findByStatus(String status);
}
