package errorsAndExceptions.universityEntities;

import errorsAndExceptions.universityExceptions.GradeOutOfRangeException;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class Grades {
    private EnumMap<Subject, List<Integer>> subjectGrades = new EnumMap<>(Subject.class);

    public Grades(EnumSet<Subject> subjects) {
        for (Subject subject : subjects) {
            subjectGrades.put(subject, new ArrayList<>());
        }
    }

    public EnumMap<Subject, List<Integer>> getSubjectGrades() {
        return subjectGrades;
    }

    public void addSubject(Subject subject) {
        if (!subjectGrades.containsKey(subject)) {
            subjectGrades.put(subject, new ArrayList<>());
        }
    }

    public void setGrade(Subject subject, int grade)
            throws GradeOutOfRangeException {
        if ((grade >= 0) && (grade <= 10)) {
            List<Integer> grades = subjectGrades.get(subject);
            grades.add(grade);
            subjectGrades.put(subject, grades);
        } else {
            throw new GradeOutOfRangeException("Оценка " + grade + " является недопустимой!");
        }
    }

    @Override
    public String toString() {
        return subjectGrades.toString();
    }

}
