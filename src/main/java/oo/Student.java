package oo;

public class Student extends Person {

    public static final String STUDENT_ROLE = "student";
    public Klass klass;

    public Student (int id, String name, int age){
        super(id,name,age, STUDENT_ROLE);
    }

    public String introduce(){
        return super.introduce() + " I am a "+ STUDENT_ROLE + "." + (klass == null?"":" I am in class "+klass.getClassNumber() + ".");
    }

    public void join(Klass klassToJoin){
        this.klass = klassToJoin;
    }

    public boolean isIn(Klass klassToCheck){
            return this.klass != null && this.klass.equals(klassToCheck);
    }
}
