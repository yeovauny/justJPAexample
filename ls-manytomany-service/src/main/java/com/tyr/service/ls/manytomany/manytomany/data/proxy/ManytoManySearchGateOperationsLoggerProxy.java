package com.tyr.service.ls.manytomany.manytomany.data.proxy;


import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.gateway.ManytoManySearchGateOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("manytoManySearchGateOperationsLoggerProxy")
public class ManytoManySearchGateOperationsLoggerProxy  implements ManytoManySearchGateOperations {

    @Autowired
    @Qualifier("manytoManySearchGatewayOperationsImpl")
    ManytoManySearchGateOperations manytoManySearchGateOperations;

    private static final Logger LOGGER = LoggerFactory.getLogger(ManytoManySearchGateOperationsLoggerProxy.class);


    @Override
    public StudentModelDTO searchStudentByName(String request) {
        try{
            LOGGER.info("searching the student with name "+request);
            return  manytoManySearchGateOperations.searchStudentByName(request);
        }catch (RuntimeException ex){

            LOGGER.error("there is an error on gateway "+ex.getMessage());
            throw ex;
        }

    }
}
