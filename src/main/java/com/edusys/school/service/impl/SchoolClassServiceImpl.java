package com.edusys.school.service.impl;

import com.edusys.school.adapter.repository.SchoolClassRepository;
import com.edusys.school.controller.mapper.SchoolClassMapper;
import com.edusys.school.controller.request.AddClassReq;
import com.edusys.school.domain.SchoolClass;
import com.edusys.school.service.SchoolClassService;
import com.edusys.school.service.SchoolService;
import org.springframework.stereotype.Service;

@Service
public class SchoolClassServiceImpl implements SchoolClassService {

    private SchoolClassRepository schoolClassRepository;

    private SchoolService schoolService;

    public SchoolClassServiceImpl(SchoolClassRepository schoolClassRepository, SchoolService schoolService) {
        this.schoolClassRepository = schoolClassRepository;
        this.schoolService = schoolService;
    }

    @Override
    public void addSchoolClass(Long schoolId, AddClassReq addClassReq) {
        SchoolClass schoolClass = SchoolClassMapper.mapToSchoolClass(addClassReq);
        schoolClass.setSchool(schoolService.getSchool(addClassReq.getSchoolId()));
        schoolClassRepository.save(schoolClass);
    }
}
