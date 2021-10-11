package com.tyr.service.ls.manytomany.manytomany.domain.gateway;

import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;

public interface ManytoManySearchGateOperations {

    StudentModelDTO searchStudentByName(String request);
}
