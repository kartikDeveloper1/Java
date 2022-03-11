/*
Problem Statement:-the process of registration of students and displaying the details of the registered students along with their residential status.
The residential status can be "H" for hostellers and "D" for day scholars. To achieve the requirement, they created a class Student having getters and 
setters in order to access the private member variables. getxxx() and setxxx() methods are the getter and setter methods, where 'xxx' is the member variable name

This Problem helps you to understand concept of classes and objects in Java.
*/


public class StudentTester {
    int studentId,yearOfEngg; //Year of Engineering
    String studentName;
    float qualifyingExamMarks;
    char residentalStatus;

    int getStudentId(){
        return studentId;
    }
    void setStudentId(int studentId){
        this.studentId=studentId;
    }
    String getStudentName(){
        return studentName;
    }
    void setStudentName(String studentName){
        this.studentName=studentName;
    }
    float getQualifyingExamMarks(){
        return qualifyingExamMarks;
    }
    public void setQualifyingExamMarks(float qualifyingExamMarks){
        this.qualifyingExamMarks=qualifyingExamMarks;
    }
    String  getResidentalStatus(){
        String status="";
        if(residentalStatus=='H'){
            status="Hostellers";
        }
        if(residentalStatus=='D'){
            status="Day Scolars";
        }
        return status;
    }
    void setResidentalStatus(char residentalStatus){
       this.residentalStatus=residentalStatus;
    }
    int getYearOfEngg(){
        return yearOfEngg;
    }
    void setYearOfEngg(int yearOfEngg){
        this.yearOfEngg=yearOfEngg;
    }
    
    public static void main(String args[]){
        StudentTester test1=new StudentTester();
        test1.setStudentId(1001);
        test1.setStudentName("kartik");
        test1.setQualifyingExamMarks(68);
        test1.setResidentalStatus('D');
        test1.setYearOfEngg(3);

        System.out.println("Student Name : "+test1.getStudentName());
        System.out.println("Student Id : "+test1.getStudentId());
        System.out.println("Qualifying Marks : "+test1.getQualifyingExamMarks());
        System.out.println("Year of Engineering : "+test1.getYearOfEngg());
        System.out.println("Residental Status : "+test1.getResidentalStatus());
    }

}
