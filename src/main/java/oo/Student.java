package oo;

public class Student extends Person {

    public static final String STUDENT_ROLE = "student";
    public Klass klass;

    public Student (int id, String name, int age){
        super(id,name,age, STUDENT_ROLE);
    }

    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a " + STUDENT_ROLE + ".";
        }
        String classIntroduce = klass.isLeader(this) ?
                String.format("I am the leader of class %d.", klass.getClassNumber()) :
                String.format("I am in class %d.", klass.getClassNumber());
        return super.introduce() + " I am a student. " + classIntroduce;
    }

    public void join(Klass klassToJoin){
        this.klass = klassToJoin;
    }

    public boolean isIn(Klass klassToCheck){
            return this.klass != null && this.klass.equals(klassToCheck);
    }
}
