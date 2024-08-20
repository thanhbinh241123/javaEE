package com.example.crudapi.service;

import com.example.crudapi.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findAll();
    Subject findById(int theId);
    void save(Subject theSubject);
    void deleteById(int theId);
}