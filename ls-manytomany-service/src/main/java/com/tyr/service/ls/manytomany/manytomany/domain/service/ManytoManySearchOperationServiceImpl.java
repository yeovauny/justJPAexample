package com.tyr.service.ls.manytomany.manytomany.domain.service;

import com.tyr.service.ls.manytomany.manytomany.data.gateway.ManytoManySearchGatewayOperations;
import com.tyr.service.ls.manytomany.manytomany.domain.ManytoManySearchOperationService;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.gateway.ManytoManySearchGateOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class ManytoManySearchOperationServiceImpl implements ManytoManySearchOperationService {


    @Autowired
    @Qualifier("manytoManySearchGateOperationsLoggerProxy")
    ManytoManySearchGateOperations manytoManySearchGatewayOperations;

    @Override
    public StudentModelDTO searchStudentByName(String name) {
        Assert.notNull(name , "the request don't be empty");
        return manytoManySearchGatewayOperations.searchStudentByName(name);
    }

}
