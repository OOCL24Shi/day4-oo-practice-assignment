package oo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Teacher extends Person {

    public static final String TEACHER_ROLE = "teacher";
    private final Set<Klass> klasses = new HashSet<>();

    public Teacher(int id, String name, int age){
        super(id,name,age, TEACHER_ROLE);
    }

    public String introduce(){
        String classNumbers = klasses.stream()
                .map(Klass::getClassNumber)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        return super.introduce() + " I am a "+ TEACHER_ROLE + "." +(classNumbers.isEmpty()?"":" I teach Class "+classNumbers+".");
    }

    public void assignTo(Klass klassToAssign){
        klasses.add(klassToAssign);
    }

    public boolean belongsTo(Klass klassToCheck){
        return klasses.contains(klassToCheck);
    }

    public boolean isTeaching(Student studentToCheck){
        return klasses.contains(studentToCheck.klass);
    }
}
