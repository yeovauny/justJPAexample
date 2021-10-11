package com.tyr.service.ls.manytomany.manytomany.domain.dto;

import com.tyr.service.ls.manytomany.manytomany.data.mapper.StudentModelDTOResponseMapper;
import com.tyr.service.ls.manytomany.manytomany.domain.model.CourseModel;

import javax.persistence.*;
import java.util.Set;

public class StudentModelDTO {

    private String name;

    private String lastName;

    private SEXO sexo;

    private Set<CourseModel> courseModels ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SEXO getSexo() {
        return sexo;
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    public Set<CourseModel> getCourseModels() {
        return courseModels;
    }

    public void setCourseModels(Set<CourseModel> courseModels) {
        this.courseModels = courseModels;
    }

    public StudentModelDTO.StudentModelDTOResponseBuilder builder(){
        return  new StudentModelDTO.StudentModelDTOResponseBuilder();
    }


    public static class  StudentModelDTOResponseBuilder{

        private String name;

        private String lastName;

        private SEXO sexo;

        private Set<CourseModel> courseModels ;


        public StudentModelDTOResponseBuilder(){
        }

        public StudentModelDTOResponseBuilder withName(String name){
            this.name = name;
            return this;
        }
        public StudentModelDTOResponseBuilder  withlastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public StudentModelDTOResponseBuilder withSexo(SEXO sexo){
            this.sexo = sexo;
            return this;
        }

        public StudentModelDTOResponseBuilder andCourses(Set<CourseModel> courses){
            this.courseModels = courses;
            return this;
        }

        public StudentModelDTO build(){
             StudentModelDTO studentModelDTO = new StudentModelDTO();
            studentModelDTO.setName(name);
            studentModelDTO.setLastName(lastName);
            studentModelDTO.setSexo(sexo);
            studentModelDTO.setCourseModels(courseModels);
            return studentModelDTO;

        }



    }


}
