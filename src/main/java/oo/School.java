package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Person> members = new ArrayList<>();

    public void attach(Person newMemberInSchool) {
        members.add(newMemberInSchool);
    }

    public void startSchool() {
        String introductions = members.stream()
                .map(Person::introduce)
                .collect(Collectors.joining("\n"));
        System.out.println(introductions);
    }
}