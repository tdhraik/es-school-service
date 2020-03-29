package com.edusys.school.service.impl;

import com.edusys.school.adapter.repository.SchoolRepository;
import com.edusys.school.controller.mapper.SchoolMapper;
import com.edusys.school.controller.request.AddSchoolReq;
import com.edusys.school.domain.School;
import com.edusys.school.service.SchoolService;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    private SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public void addSchool(AddSchoolReq addSchoolReq) {
        schoolRepository.save(SchoolMapper.mapToSchool(addSchoolReq));
    }

    @Override
    public School getSchool(Long schoolId) {
        return schoolRepository.findById(schoolId)
                .orElseThrow(IllegalStateException::new);
    }
}
