package com.tyr.service.ls.manytomany.manytomany.domain.dto;

import java.util.Set;

public class StudentDTO {

    private String name;

    private String lastName;

    private SEXO sexo;

    private Set<String> course;

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

    public Set<String> getCourse() {
        return course;
    }

    public void setCourse(Set<String> course) {
        this.course = course;
    }
}

