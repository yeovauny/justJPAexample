package com.tyr.service.ls.manytomany.manytomany.controller;

import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;

public interface ManytoManySearchsControllerResources {

    StudentModelDTO searchStudentByName(String name);

}
