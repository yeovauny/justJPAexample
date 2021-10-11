package com.tyr.service.ls.manytomany.manytomany.domain.proxy;

import com.tyr.service.ls.manytomany.manytomany.domain.ManytoManySearchOperationService;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ManytoManySearchOperationLoggerProxy implements  ManytoManySearchOperationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManytoManySearchOperationLoggerProxy.class);


    @Autowired
    @Qualifier("manytoManySearchOperationServiceImpl")
    ManytoManySearchOperationService manytoManySearchOperationService;


    @Override
    public StudentModelDTO searchStudentByName(String name) {
        try{
            LOGGER.info("Searching the student called "+name);
            return manytoManySearchOperationService.searchStudentByName(name);

        }catch (RuntimeException ex){
            LOGGER.error("Error searchin the student "+name+ " error on service "+ex.getMessage());
            throw ex;
        }
    }
}
