package com.tyr.service.ls.manytomany.manytomany.domain;

import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;

public interface ManytoManySearchOperationService {

    StudentModelDTO searchStudentByName(String name);

}
