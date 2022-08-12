package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String city;
    private Lesson lesson;
    private String changeLesson;
    private  User registeredUser;

    public Student(String name, String surname, int age, String phoneNumber, String city, Lesson lesson, User currentUser) {

    }
}
