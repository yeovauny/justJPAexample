package com.tyr.service.ls.manytomany.manytomany.data.mapper;

import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.model.CourseModel;
import com.tyr.service.ls.manytomany.manytomany.domain.model.StudentModel;
import org.springframework.stereotype.Component;
import java.util.Set;
import java.util.function.BiFunction;

@Component("studentModelRequestMapper")
public class StudentModelRequestMapper implements BiFunction<StudentDTO, Set<CourseModel>, StudentModel> {

    @Override
    public StudentModel apply(StudentDTO studentDTO, Set<CourseModel> courses) {
        return new StudentModel().builder()
                .withlastname(studentDTO.getLastName())
                .withSexo(studentDTO.getSexo())
                .withName(studentDTO.getName())
                .andCurses(courses)
                .build();
    }
}
