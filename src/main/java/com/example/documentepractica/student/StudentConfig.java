package com.example.documentepractica.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner studentConfigInit(StudentRepository studentRepository) {
        return args -> {
            Student student1 = new Student("Jeler", "Eduard",234, "jeir2531@scs.ubbcluj.ro", false);
            Student student2 = new Student("Jeler", "Cristiana",234, "jcir2435@scs.ubbcluj.ro", false);
            Student student3 = new Student("Jora", "George",234, "jgir2678@scs.ubbcluj.ro", false);
            Student student4 = new Student("Lenghel", "Raluca",234, "lrir2531@scs.ubbcluj.ro", false);
            Student student5 = new Student("Lazar", "Maria",234, "lmir2531@scs.ubbcluj.ro", false);
            Student student6 = new Student("Beraru", "Ioana",936, "biie2531@scs.ubbcluj.ro", false);
            studentRepository.saveAll(Arrays.asList(student1,student2,student3,student4,student5,student6));
        };
    }
}
