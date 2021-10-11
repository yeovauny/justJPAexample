package com.tyr.service.ls.manytomany.manytomany.data.gateway;


import com.tyr.service.ls.manytomany.manytomany.data.mapper.CourseModelRequestMapper;
import com.tyr.service.ls.manytomany.manytomany.data.mapper.StudentModelRequestMapper;
import com.tyr.service.ls.manytomany.manytomany.data.repository.CourseRepository;
import com.tyr.service.ls.manytomany.manytomany.data.repository.StudentRepository;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.CourseDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.dto.StudentDTO;
import com.tyr.service.ls.manytomany.manytomany.domain.gateway.ManytoManyGateway;
import com.tyr.service.ls.manytomany.manytomany.domain.model.CourseModel;
import com.tyr.service.ls.manytomany.manytomany.domain.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Component
public class ManytoManyStudentGatewayOperation implements ManytoManyGateway {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseModelRequestMapper courseModelRequestBuilder;

    @Autowired
    StudentModelRequestMapper studentModelRequestMapper;


    @Override
    @Transactional
    public StudentDTO saveAllStudentInformation(StudentDTO student) {

        Set<CourseModel> bunchOfCourse = new HashSet<>();
        CourseModel courseModel;
        for(String code: student.getCourse()){

             courseModel =courseRepository.findCourseModelByCode(code);
            bunchOfCourse.add(courseModel);
        }

        StudentModel studentModel = studentModelRequestMapper.apply(student, bunchOfCourse);

        studentRepository.save(studentModel);

        return student;
    }

    @Override
    @Transactional
    public CourseDTO saveAllCourseInformation(CourseDTO course) {

        CourseModel courseModel = courseModelRequestBuilder.apply(course);
        courseRepository.save(courseModel);

        return course;
    }

    @Transactional
    @Override
    public Set<CourseDTO> saveBunchesCourseInformation(Set<CourseDTO> setCourse) {

            for (CourseDTO  course:setCourse){
                CourseModel courseModel = courseModelRequestBuilder.apply(course);
                courseRepository.save(courseModel);
            }

        return setCourse;
    }


}
