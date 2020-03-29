package com.edusys.school.service;

import com.edusys.school.controller.request.AddClassReq;

public interface SchoolClassService {

    void addSchoolClass(Long schoolId, AddClassReq addClassReq);
}
