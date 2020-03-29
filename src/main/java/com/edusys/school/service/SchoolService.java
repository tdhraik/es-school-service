package com.edusys.school.service;

import com.edusys.school.controller.request.AddSchoolReq;
import com.edusys.school.domain.School;

public interface SchoolService {

    void addSchool(AddSchoolReq addSchoolReq);
    School getSchool(Long schoolId);
}
