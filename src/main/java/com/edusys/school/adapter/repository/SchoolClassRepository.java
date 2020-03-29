package com.edusys.school.adapter.repository;

import com.edusys.school.domain.SchoolClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRepository extends CrudRepository<SchoolClass, Long> {
}
