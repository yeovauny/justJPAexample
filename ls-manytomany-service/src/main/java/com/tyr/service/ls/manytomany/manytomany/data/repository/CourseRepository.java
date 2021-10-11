package com.tyr.service.ls.manytomany.manytomany.data.repository;

import com.tyr.service.ls.manytomany.manytomany.domain.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseModel,Long> {

    CourseModel findCourseModelByCode(String code);
}
