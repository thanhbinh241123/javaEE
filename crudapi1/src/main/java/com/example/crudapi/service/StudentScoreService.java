package com.example.crudapi.service;

import com.example.crudapi.entity.StudentScore;

import java.util.List;

public interface StudentScoreService {
    List<StudentScore> findAll();
    StudentScore findById(int theId);
    void save(StudentScore theStudentScore);
    void deleteById(int theId);
}