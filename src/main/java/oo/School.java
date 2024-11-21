package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Person> members = new ArrayList<>();

    public void attach(Person newMemberInClass) {
        members.add(newMemberInClass);
    }

    //    public void startSchool() {
//        members.forEach(member -> {
//            String notification = member.introduce();
//            System.out.println(notification);
//        });
//    }
    public void startSchool() {
        String introductions = members.stream()
                .map(Person::introduce)
                .collect(Collectors.joining("\n"));
        System.out.println(introductions);
    }
}