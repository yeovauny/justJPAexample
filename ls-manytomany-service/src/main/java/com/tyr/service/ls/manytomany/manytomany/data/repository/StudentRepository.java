package com.tyr.service.ls.manytomany.manytomany.data.repository;

import com.tyr.service.ls.manytomany.manytomany.domain.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long> {

    StudentModel findStudentModelByName(String name);

}
