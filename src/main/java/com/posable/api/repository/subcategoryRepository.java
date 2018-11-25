package com.posable.api.repository;

import com.posable.api.model.subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface subcategoryRepository extends JpaRepository<subcategory, Long> {


}
