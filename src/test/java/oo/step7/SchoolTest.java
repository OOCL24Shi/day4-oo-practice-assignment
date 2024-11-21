package oo.step7;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//
public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void should_introduce__when_school_starts_given_a_student_is_in_the_school() {
        School school = new School();
        Student bob = new Student(1, "Bob", 18);

        school.attach(bob);
        school.startSchool();
        assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am a student.");
    }

    @Test
    public void should_introduce__when_school_starts_given_a_teacher_is_in_the_school() {
        School school = new School();
        Teacher robert = new Teacher(3, "Robert", 25);

        school.attach(robert);
        school.startSchool();
        assertThat(systemOut()).contains("My name is Robert. I am 25 years old. I am a teacher.");
    }

    @Test
    public void should_introduce__when_school_starts_given_two_student_is_in_the_school() {
        School school = new School();
        Student bob = new Student(4, "Bob", 18);
        Student alice = new Student(5, "Alice", 20);

        school.attach(bob);
        school.attach(alice);
        school.startSchool();
        assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am a student.\nMy name is Alice. I am 20 years old. I am a student.");
    }

    @Test
    public void should_introduce__when_school_starts_given_two_teachers_is_in_the_school() {
        School school = new School();
        Teacher bob = new Teacher(4, "Bob", 18);
        Teacher alice = new Teacher(5, "Alice", 20);

        school.attach(bob);
        school.attach(alice);
        school.startSchool();
        assertThat(systemOut()).contains("My name is Bob. I am 18 years old. I am a teacher.\nMy name is Alice. I am 20 years old. I am a teacher.");
    }

    @Test
    public void should_introduce__when_school_starts_given_1_teacher_1_student_is_in_the_school() {
        School school = new School();
        Teacher bob = new Teacher(4, "Bob", 28);
        Student alice = new Student(5, "Alice", 20);

        school.attach(bob);
        school.attach(alice);
        school.startSchool();
        assertThat(systemOut()).contains("My name is Bob. I am 28 years old. I am a teacher.\nMy name is Alice. I am 20 years old. I am a student.");
    }


    private String systemOut() {
        return outContent.toString();
    }
}

