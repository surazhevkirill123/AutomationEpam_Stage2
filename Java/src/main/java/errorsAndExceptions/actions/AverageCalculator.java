package errorsAndExceptions.actions;

import errorsAndExceptions.universityEntities.Subject;
import errorsAndExceptions.universityEntities.Student;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AverageCalculator {
    public static Double calculateAverageFromInteger(List<Integer> grades){
        Integer sumOfGrades = grades.stream().reduce(Integer::sum).orElse(0);
        return !grades.isEmpty() ? (sumOfGrades / (double) grades.size()) : sumOfGrades;
    }

    public static Double calculateAverageFromDouble(List<Double> grades){
        Double sumOfGrades = grades.stream().reduce(Double::sum).orElse(0.0);
        return !grades.isEmpty() ? (sumOfGrades / (double) grades.size()) : sumOfGrades;
    }

    public static Double calculateAverageGrade(List<Student> students, Subject subject) {
        List<Integer> subjectGrades = students.stream().filter(student -> student.isStudySubject(subject)).
                map(student -> StudentAction.getGradesBySubject(student, subject)).
                flatMap(Collection::stream).collect(Collectors.toList());

        return calculateAverageFromInteger(subjectGrades);
    }
}
