package oo;

public class Teacher extends Person {

    public static final String TEACHER_ROLE = "teacher";

    public Teacher(int id, String name, int age){
        super(id,name,age, TEACHER_ROLE);
    }

    public String introduce(){
        return super.introduce() + " I am a "+ TEACHER_ROLE + ".";
    }
}
