package com.edusys.school.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddClassReq {

    private Long schoolId;

    private String name;

    private Integer totalStudents;
}
