package com.example.crudapi.dao;

import com.example.crudapi.entity.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentScoreRepository extends JpaRepository<StudentScore, Integer> {
}