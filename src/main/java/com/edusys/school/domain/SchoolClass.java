package com.edusys.school.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "school_class")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "school_class_generator")
    @SequenceGenerator(name="school_class_generator", sequenceName = "school_class_seq", allocationSize = 1)
    private Long id;

    private String name;

    private Integer totalStudents;

    @ManyToOne(cascade = CascadeType.ALL)
    private School school;
}
