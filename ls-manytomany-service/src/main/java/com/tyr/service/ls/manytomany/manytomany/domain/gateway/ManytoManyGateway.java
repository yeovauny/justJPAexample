package com.tyr.service.ls.manytomany.manytomany.domain.gateway;

import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;

import java.util.Set;

public interface ManytoManyGateway {

    StudentDTO saveAllStudentInformation(StudentDTO student);

    CourseDTO saveAllCourseInformation(CourseDTO course);

    Set<CourseDTO> saveBunchesCourseInformation(Set<CourseDTO> setCourse);

}
