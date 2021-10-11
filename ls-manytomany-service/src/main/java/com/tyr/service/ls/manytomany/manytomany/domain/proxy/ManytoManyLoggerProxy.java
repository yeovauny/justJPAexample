package com.tyr.service.ls.manytomany.manytomany.domain.proxy;

import com.tyr.service.ls.manytomany.manytomany.domain.ManytoManyService;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ManytoManyLoggerProxy implements ManytoManyService {


    @Autowired
    @Qualifier("manytoManyServiceImpl")
    ManytoManyService manytoManyService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManytoManyLoggerProxy.class);

    @Override
    public StudentDTO saveStudentInformation(StudentDTO request) {

        try{
            LOGGER.info("sending the information to the service class");
            return manytoManyService.saveStudentInformation(request);

        }catch(RuntimeException ex){
            LOGGER.error("There is and error on the service class "+ex.getMessage());
            throw ex;
        }


    }

    @Override
    public CourseDTO saveCourseInformationByOne(CourseDTO request) {
        try{
            LOGGER.info("sending the information to the service class");
            return manytoManyService.saveCourseInformationByOne(request);
        }catch (RuntimeException ex){
            LOGGER.error("There is and error on service class "+ex.getMessage());
            throw ex;
        }
    }

    @Override
    public Set<CourseDTO> saveAllCourseInformation(Set<CourseDTO> request) {

        try {
            LOGGER.info("Sending all course to the service class");
            return manytoManyService.saveAllCourseInformation(request);
        }catch (RuntimeException ex){
            LOGGER.error("There is and error on service class "+ex.getMessage());
            throw  ex;
        }
    }
}
