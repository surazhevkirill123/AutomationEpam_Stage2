package classes;

import java.util.UUID;

public class Student {
    private String id;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student(String name, String surname, String dateOfBirth, String phoneNumber, String faculty, String course, String group) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        id = UUID.randomUUID().toString();;
    }


    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String toString() {
        return String.format("Student{ id %s, name='%s', surname='%s', dateOfBirth='%s', phoneNumber='%s', faculty='%s', course='%s', group='%s'}", id, name, surname, dateOfBirth, phoneNumber, faculty, course, group);
    }

    public String fullName() {
        return String.format("%s %s", name, surname);
    }
}
