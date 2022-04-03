package org.example;

public class ClassF implements InterfaceA{
//    private String userDate;

    private String examType;
//    private ClassM cM1;

//    public ClassF() {
//    }

//    public ClassF(ClassM cM1) {
//        this.cM1 = cM1;
//        System.out.println(cM1.getexamType());
//    }
    @Override
    public String methodA() {
        return  getExamType() + " exam is currently ongoing";
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }
}
