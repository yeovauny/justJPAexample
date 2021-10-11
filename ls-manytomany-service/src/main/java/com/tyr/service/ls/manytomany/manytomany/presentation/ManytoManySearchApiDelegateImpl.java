package com.tyr.service.ls.manytomany.manytomany.presentation;

import com.tyr.service.ls.manytomany.manytomany.controller.ManytoManySearchsControllerResources;
import com.tyr.service.ls.manytomany.manytomany.domain.ManytoManySearchOperationService;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentModelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManytoManySearchApiDelegateImpl implements ManytoManySearchsControllerResources {

    @Autowired
    @Qualifier("manytoManySearchOperationLoggerProxy")
    ManytoManySearchOperationService manytoManySearchOperationService;

    @Override
    @GetMapping("search/student/{name}")
    public StudentModelDTO searchStudentByName(@PathVariable String name) {
        return manytoManySearchOperationService.searchStudentByName(name);
    }
}
