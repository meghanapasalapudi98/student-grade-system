package com.meghana.service;

import com.meghana.entity.Grade;
import com.meghana.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public Grade addGrade(Grade grade) {
        grade.setLetterGrade(calculateLetterGrade(grade.getMarks()));
        return gradeRepository.save(grade);
    }

    public List<Grade> getGradesByStudent(Long studentId) {
        return gradeRepository.findByStudentId(studentId);
    }

    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    public double calculateGPA(Long studentId) {
        List<Grade> grades = gradeRepository.findByStudentId(studentId);
        if (grades.isEmpty()) return 0.0;
        double total = 0.0;
        for (Grade g : grades) {
            if (g.getMarks() != null) {
                total += g.getMarks().doubleValue();
            }
        }
        return total / grades.size();
    }

    public void deleteGrade(Long id) {
        gradeRepository.deleteById(id);
    }

    private String calculateLetterGrade(Double marks) {
        if (marks == null) return "N/A";
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }
    public Grade updateGrade(Long id, Grade updatedGrade) {
        Grade existing = gradeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Grade not found"));
        existing.setSubject(updatedGrade.getSubject());
        existing.setMarks(updatedGrade.getMarks());
        existing.setLetterGrade(calculateLetterGrade(updatedGrade.getMarks()));
        return gradeRepository.save(existing);
    }
}