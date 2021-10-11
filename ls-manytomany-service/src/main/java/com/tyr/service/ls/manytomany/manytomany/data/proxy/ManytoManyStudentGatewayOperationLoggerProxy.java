package com.tyr.service.ls.manytomany.manytomany.data.proxy;


import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.gateway.ManytoManyGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ManytoManyStudentGatewayOperationLoggerProxy implements ManytoManyGateway {


    @Autowired
    @Qualifier("manytoManyStudentGatewayOperation")
    ManytoManyGateway manytoManyGateway;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManytoManyStudentGatewayOperationLoggerProxy.class);

    @Override
    public StudentDTO saveAllStudentInformation(StudentDTO student) {

        try{
            LOGGER.info("Sending the data to manytomany gateway operations");
            return manytoManyGateway.saveAllStudentInformation(student);
        }catch (RuntimeException ex){
            LOGGER.error("there is an error on manytomanygateway operations");
            throw ex;
        }
    }

    @Override
    public CourseDTO saveAllCourseInformation(CourseDTO course) {
        try{
            LOGGER.info("Sending the course data to manytomany gateway operations");
            return manytoManyGateway.saveAllCourseInformation(course);

        }catch (RuntimeException ex){
            LOGGER.error("There is an error on manytomanygateway operations ");
            throw ex;
        }
    }

    @Override
    public Set<CourseDTO> saveBunchesCourseInformation(Set<CourseDTO> setCourse) {
        try{
            LOGGER.info("Sending the course data to manytomany gateway operations");
            return manytoManyGateway.saveBunchesCourseInformation(setCourse);

        }catch (RuntimeException ex){
            LOGGER.error("There is an error on manytomany gateway operations" );
            throw ex;
        }
    }
}
