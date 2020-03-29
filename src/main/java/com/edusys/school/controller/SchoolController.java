package com.edusys.school.controller;

import com.edusys.school.controller.request.AddSchoolReq;
import com.edusys.school.service.SchoolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
@Api(value = "/school", description = "School registration", tags = "school-service")
public class SchoolController {

    private SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping
    @ApiOperation(value = "Add school")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "BAD_REQUEST")
    })
    public void addSchool(@RequestBody AddSchoolReq addSchoolReq) {
        schoolService.addSchool(addSchoolReq);
    }

}
