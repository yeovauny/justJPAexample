package com.tyr.service.ls.manytomany.manytomany.data.mapper;

import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("studentModelDTOResponseMapper")
public class StudentModelDTOResponseMapper implements Function<StudentModel, StudentModelDTO> {
    @Override
    public StudentModelDTO apply(StudentModel studentModel) {

        return new StudentModelDTO().builder()
                .withName(studentModel.getName())
                .withlastName(studentModel.getLastName())
                .withSexo(studentModel.getSexo())
                .andCourses(studentModel.getCourseModels())
                .build();
    }
}
