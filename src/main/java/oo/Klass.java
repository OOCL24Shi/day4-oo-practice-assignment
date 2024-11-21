package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {

    public int number;
    private Student leader;
    private List<Person> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public int getClassNumber(){
        return number;
    }

    public boolean isLeader(Student student) {
        return this.leader == student;
    }

    public void assignLeader(Student leaderStudent) {
        if(!leaderStudent.isIn(this)) {
            System.out.println("It is not one of us.");
            return;
        }
        this.leader = leaderStudent;
        notifyMembers(this.number, leaderStudent.name);
    }

    public void attach(Person person) {
        members.add(person);
    }

    private void notifyMembers(int classNumber, String leaderName) {
        members.forEach(member ->{
            String notification = member.getNotification(classNumber, leaderName);
            System.out.println(notification);
        });
    }


}
