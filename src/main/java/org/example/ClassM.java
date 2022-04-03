package org.example;

import java.util.Objects;

public class ClassM implements InterfaceA{
//    private String userDate;
    private String examType;


    @Override
    public String methodA() {

            return this.examType + " Exam is currently ongoing";

    }

    public String getExamType() {
        return examType;
    }



    public void setExamType(String examType) {
        this.examType = examType;
    }

}
