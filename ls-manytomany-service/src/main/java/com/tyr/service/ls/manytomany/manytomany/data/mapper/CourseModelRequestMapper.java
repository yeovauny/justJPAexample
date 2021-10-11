package com.tyr.service.ls.manytomany.manytomany.data.mapper;


import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.model.CourseModel;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("courseModelRequestMapper")
public class CourseModelRequestMapper  implements Function<CourseDTO,CourseModel> {


    @Override
    public CourseModel apply(CourseDTO courseDTO) {
        return new CourseModel().builder()
                .withName(courseDTO.getName())
                .withCode(courseDTO.getCode())
                .andDescription(courseDTO.getDescription())
                .build();
    }
}
