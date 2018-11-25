package com.posable.api.repository;

import com.posable.api.model.test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testRepository extends JpaRepository<test, Long> {



}
