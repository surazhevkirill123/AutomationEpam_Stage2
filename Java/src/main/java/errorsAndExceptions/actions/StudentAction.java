package errorsAndExceptions.actions;

import errorsAndExceptions.universityEntities.Subject;
import errorsAndExceptions.universityEntities.Student;
import errorsAndExceptions.universityExceptions.StudentWithoutSubjectsException;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;

public class StudentAction extends AverageCalculator {
    public static List<Integer> getGradesBySubject(Student student, Subject subject) {
        return student.getGrades().getSubjectGrades().get(subject);
    }

    public static double getAverageGradeBySubject(Student student, Subject subject) {
        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(student);
        return calculateAverageGrade(studentList, subject);
    }

    public static EnumMap<Subject, Double> getAverageGradeByEverySubjectOfStudent(Student student) throws StudentWithoutSubjectsException {
        EnumMap<Subject, Double> averageGrades = new EnumMap<>(Subject.class);

        for (Subject subject : student.getSubjects()) {
            averageGrades.put(subject, getAverageGradeBySubject(student, subject));
        }
        return averageGrades;
    }

    public static double getAverageGradeByAllSubjectsOfStudent(Student student) throws StudentWithoutSubjectsException {
        List<Double> gradesOfStudent = new ArrayList<>();

        for (Subject subject : student.getSubjects()) {
            gradesOfStudent.add(getAverageGradeBySubject(student, subject));
        }

        return calculateAverageFromDouble(gradesOfStudent);
    }
}
