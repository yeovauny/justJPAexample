package com.tyr.service.ls.manytomany.manytomany.data.gateway;

import com.tyr.service.ls.manytomany.manytomany.data.mapper.StudentModelDTOResponseMapper;
import com.tyr.service.ls.manytomany.manytomany.data.repository.StudentRepository;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.gateway.ManytoManySearchGateOperations;
import com.tyr.service.ls.manytomany.manytomany.domain.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("manytoManySearchGatewayOperationsImpl")
public class ManytoManySearchGatewayOperations implements ManytoManySearchGateOperations {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentModelDTOResponseMapper studentModelDTOResponseMapper;

    @Override
    public StudentModelDTO searchStudentByName(String request) {

        StudentModel studentModelByName = studentRepository.findStudentModelByName(request);
        return studentModelDTOResponseMapper.apply(studentModelByName);
    }
}
