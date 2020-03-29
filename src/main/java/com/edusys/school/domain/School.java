package com.edusys.school.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "school")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "school_generator")
    @SequenceGenerator(name="school_generator", sequenceName = "school_seq", allocationSize = 1)
    private Long id;

    private String name;

    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<SchoolClass> schoolClasses;
}
