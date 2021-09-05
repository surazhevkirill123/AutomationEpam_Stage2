package errorsAndExceptions;

import java.util.Dictionary;
import java.util.UUID;

public class Student {
    private String id;
    private String name;
    private String faculty;
    private String group;
    private Dictionary<String, Double> ListOfGradesBySubject;

    public Student(String name, String faculty, String group, Dictionary<String, Double> ListOfGradesBySubject) {
        this.name = name;
        this.faculty = faculty;
        this.group = group;
        this.ListOfGradesBySubject = ListOfGradesBySubject;
        id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Dictionary<String, Double> getListOfGradesBySubject() {
        return ListOfGradesBySubject;
    }

    public void setListOfGradesBySubject(Dictionary<String, Double> listOfGradesBySubject) {
        ListOfGradesBySubject = listOfGradesBySubject;
    }

    @Override
    public String toString() {
        return String.format("Student{id='%s', name='%s', faculty='%s', group='%s', ListOfGradesBySubject=%s}", id, name, faculty, group, ListOfGradesBySubject);
    }
}