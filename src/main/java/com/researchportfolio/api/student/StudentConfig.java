package com.researchportfolio.api.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return  args -> {
            Student bishal = new  Student(
                    "Bishal",
                    LocalDate.of(2003, 2, 24),
                    "bishal@test.com"
            );

            Student test = new  Student(
                    "Test",
                    LocalDate.of(2004, 2, 24),
                    "test@test.com"
            );

            repository.saveAll(
                    List.of(bishal, test)
            );
        };
    }
}
