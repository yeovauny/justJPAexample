package com.tyr.service.ls.manytomany.manytomany.presentation;

import com.tyr.service.ls.manytomany.manytomany.controller.ManytomanyControllerResources;
import com.tyr.service.ls.manytomany.manytomany.domain.ManytoManyService;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;


@RestController
public class ManytoManyApiDelegateImpl implements ManytomanyControllerResources {


    @Autowired
    @Qualifier("manytoManyLoggerProxy")
    ManytoManyService manytoManyService;


    @PostMapping("student/save/information")
    public StudentDTO studentSaveInformationController(@RequestBody StudentDTO request){

        return manytoManyService.saveStudentInformation(request);
    }

    @Override
    @PostMapping("save/courseinformationbyone")
    public CourseDTO saveCourseInformationbyOneController(@RequestBody CourseDTO request) {
        return manytoManyService.saveCourseInformationByOne(request);
    }

    @Override
    @PostMapping("save/bunchesofcourses")
    public Set<CourseDTO> saveBunchesOfCoursesController(@RequestBody Set<CourseDTO> request) {
        return manytoManyService.saveAllCourseInformation(request);
    }


}
