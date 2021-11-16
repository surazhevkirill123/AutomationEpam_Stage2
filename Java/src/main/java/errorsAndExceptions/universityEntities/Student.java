package errorsAndExceptions.universityEntities;

import errorsAndExceptions.universityExceptions.GradeOutOfRangeException;
import errorsAndExceptions.universityExceptions.StudentWithoutSubjectsException;

import java.util.EnumSet;
import java.util.Objects;

public class Student {
    private static long studentsCount = 0;

    private String name;
    private String surname;
    private long studentIDNumber;
    private EnumSet<Subject> subjects;
    private Grades grades;

    public Student(String name, String surname, EnumSet<Subject> subjects) {
        this.name = name;
        this.surname = surname;
        this.subjects = subjects;
        grades = new Grades(this.subjects);
        studentIDNumber = studentsCount;
        studentsCount++;
    }

    public long getStudentIDNumber() {
        return studentIDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public EnumSet<Subject> getSubjects()
            throws StudentWithoutSubjectsException {
        if (subjects.isEmpty()) {
            throw new StudentWithoutSubjectsException("У студента " +
                    getName() + " " + getSurname() + " с номером студенческого билета "
                    + getStudentIDNumber() + " отсутствуют предметы!");
        }
        return subjects;
    }

    public boolean isStudySubject(Subject subject) {
        return subjects.contains(subject);
    }

    public void setAcademicSubject(Subject subject) {
        subjects.add(subject);
        grades.addSubject(subject);
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrade(Subject subject, int grade)
            throws GradeOutOfRangeException, StudentWithoutSubjectsException {
        if (!getSubjects().contains(subject)) {
            setAcademicSubject(subject);
        }
        grades.setGrade(subject, grade);
    }

    @Override
    public String toString() {
        return "Student " + studentIDNumber + ' ' + name + ' ' +
                surname + ' ' + grades + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentIDNumber == student.studentIDNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentIDNumber);
    }
}
