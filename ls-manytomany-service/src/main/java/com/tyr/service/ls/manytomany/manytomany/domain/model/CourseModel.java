package com.tyr.service.ls.manytomany.manytomany.domain.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "COURSE")
public class CourseModel  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name = "code",unique = true)
    private String code;

    @Column(name = "description")
    private String description;


    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "courseModels")
    private Set<StudentModel> studentModels;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<StudentModel> getStudentModels() {
        return studentModels;
    }

    public void setStudentModels(Set<StudentModel> studentModels) {
        this.studentModels = studentModels;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CourseModel.CourseModelRequestBuilder builder(){
        return new CourseModel.CourseModelRequestBuilder();
    }


    public static class CourseModelRequestBuilder{


        private String name;

        private String code;

        private String description;

        public CourseModelRequestBuilder(){}

        public CourseModelRequestBuilder withName(String name){
            this.name = name;
            return this;
        }

        public CourseModelRequestBuilder withCode(String code){
            this.code = code;
            return this;
        }

        public CourseModelRequestBuilder andDescription(String description){
            this.description = description;
            return this;
        }

        public CourseModel build(){
            CourseModel courseModel= new CourseModel();
            courseModel.setName(name);
            courseModel.setCode(code);
            courseModel.setDescription(description);
            return  courseModel;
        }

    }

}
