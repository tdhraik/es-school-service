package com.edusys.school.controller.mapper;

import com.edusys.school.controller.request.AddSchoolReq;
import com.edusys.school.domain.School;

public class SchoolMapper {

    public static School mapToSchool(AddSchoolReq addSchoolReq) {
        School school = new School();
        school.setName(addSchoolReq.getSchoolName());
        school.setDescription(addSchoolReq.getDescription());
        return school;
    }

}
