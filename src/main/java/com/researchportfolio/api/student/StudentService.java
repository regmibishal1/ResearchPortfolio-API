package com.researchportfolio.api.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> GetStudents() {
        return List.of(
                new Student(
                        1L,
                        "Bishal",
                        21,
                        LocalDate.of(2003, 2, 24),
                        "test@test.com"
                )
        );
    }
}
