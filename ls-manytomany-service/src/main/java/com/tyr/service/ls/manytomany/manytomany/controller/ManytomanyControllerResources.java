package com.tyr.service.ls.manytomany.manytomany.controller;


import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;

import java.util.Set;

public interface ManytomanyControllerResources {

   StudentDTO studentSaveInformationController(StudentDTO request);

   CourseDTO saveCourseInformationbyOneController(CourseDTO request);

   Set<CourseDTO> saveBunchesOfCoursesController(Set<CourseDTO> request);

}
