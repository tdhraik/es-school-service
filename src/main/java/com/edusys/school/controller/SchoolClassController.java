package com.edusys.school.controller;

import com.edusys.school.controller.request.AddClassReq;
import com.edusys.school.service.SchoolClassService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/school/{schoolId}/class")
@Api(value = "/school/{schoolId}/class", description = "School registration", tags = "school-class-service")
public class SchoolClassController {

    private SchoolClassService schoolClassService;

    public SchoolClassController(SchoolClassService schoolClassService) {
        this.schoolClassService = schoolClassService;
    }

    @PostMapping
    @ApiOperation(value = "Add class to a school")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "BAD_REQUEST")
    })
    public void addClass(@PathVariable Long schoolId,
                         @RequestBody AddClassReq addClassReq) {
        schoolClassService.addSchoolClass(schoolId, addClassReq);
    }
}
