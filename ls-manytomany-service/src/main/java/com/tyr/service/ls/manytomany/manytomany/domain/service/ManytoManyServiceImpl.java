package com.tyr.service.ls.manytomany.manytomany.domain.service;


import com.tyr.service.ls.manytomany.manytomany.domain.ManytoManyService;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.gateway.ManytoManyGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Set;

@Service
public class ManytoManyServiceImpl implements ManytoManyService {

    @Autowired
    @Qualifier("manytoManyStudentGatewayOperationLoggerProxy")
    ManytoManyGateway manytoManyGateway;

    @Override
    public StudentDTO saveStudentInformation( StudentDTO request) {
        Assert.notNull(request , "the request don't be empty");
        return manytoManyGateway.saveAllStudentInformation(request);

    }

    @Override
    public CourseDTO saveCourseInformationByOne(CourseDTO request) {
        Assert.notNull(request , "the request course don't be empty");

        return manytoManyGateway.saveAllCourseInformation(request);
    }

    @Override
    public Set<CourseDTO> saveAllCourseInformation(Set<CourseDTO> request) {
        Assert.notNull(request , "the request course don't be empty");

        return manytoManyGateway.saveBunchesCourseInformation(request);
    }


}
