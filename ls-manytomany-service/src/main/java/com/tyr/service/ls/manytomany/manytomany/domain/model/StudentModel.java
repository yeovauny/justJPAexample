package com.tyr.service.ls.manytomany.manytomany.domain.model;

import com.tyr.service.ls.manytomany.manytomany.domain.dto.SEXO;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "STUDENT")
public class StudentModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="NAME")
    private String name;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "SEXO")
    @Enumerated(EnumType.STRING)
    private SEXO sexo;

   @ManyToMany(fetch=FetchType.LAZY,
           cascade = {CascadeType.PERSIST , CascadeType.MERGE,
                   CascadeType.DETACH,CascadeType.REFRESH})
   @JoinTable(
           name="course_student",
           joinColumns={@JoinColumn(name="student_id")},
           inverseJoinColumns={@JoinColumn(name="course_id")}
   )
    private Set<CourseModel> courseModels ;

    public Set<CourseModel> getCourseModels() {
        return courseModels;
    }

    public void setCourseModels(Set<CourseModel> courseModels) {


        this.courseModels = courseModels;
    }

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

    public StudentModel.StudentModelRequestBuilder builder(){
        return new StudentModel.StudentModelRequestBuilder();
    }



    public static class StudentModelRequestBuilder{

        private String name;

        private String lastName;

        private SEXO sexo;

        private Set<CourseModel> courseModels ;

        public StudentModelRequestBuilder withName(String name){
            this.name = name;
            return this;
        }

        public  StudentModelRequestBuilder withlastname(String lastName){
            this.lastName = lastName;
            return this;
        }
        public StudentModelRequestBuilder withSexo(SEXO sexo){
            this.sexo = sexo;
            return this;
        }
        public StudentModelRequestBuilder andCurses(Set<CourseModel> courseModels){
            this.courseModels = courseModels;
            return this;
        }
        public StudentModel build(){
            StudentModel studentModel= new StudentModel();
            studentModel.setName(name);
            studentModel.setSexo(sexo);
            studentModel.setLastName(lastName);
            studentModel.setCourseModels(courseModels);
            return  studentModel;
        }

    }
}
