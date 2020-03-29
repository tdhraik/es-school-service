package com.edusys.school.controller.mapper;

import com.edusys.school.controller.request.AddClassReq;
import com.edusys.school.domain.SchoolClass;

public class SchoolClassMapper {

    public static SchoolClass mapToSchoolClass(AddClassReq addClassReq) {
        SchoolClass clazz = new SchoolClass();
        clazz.setName(addClassReq.getName());
        clazz.setTotalStudents(addClassReq.getTotalStudents());
        return clazz;
    }
}
