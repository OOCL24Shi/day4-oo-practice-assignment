package oo;

public class Student extends Person {

    public static final String STUDENT_ROLE = "student";

    public Student (int id, String name, int age){
        super(id,name,age, STUDENT_ROLE);
    }

    public String introduce(){
        return super.introduce() + " I am a "+ STUDENT_ROLE + ".";
    }
}
