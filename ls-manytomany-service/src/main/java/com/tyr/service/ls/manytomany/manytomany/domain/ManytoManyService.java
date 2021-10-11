package com.tyr.service.ls.manytomany.manytomany.domain;

import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;

import java.util.Set;

public interface ManytoManyService {

    StudentDTO saveStudentInformation(StudentDTO request);

    CourseDTO saveCourseInformationByOne(CourseDTO request);

    Set<CourseDTO> saveAllCourseInformation(Set<CourseDTO> request);


}
