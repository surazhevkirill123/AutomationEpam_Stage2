package errorsAndExceptions.actions;

import errorsAndExceptions.universityEntities.Subject;
import errorsAndExceptions.universityEntities.Group;
import errorsAndExceptions.universityExceptions.GroupWithoutStudentsException;

public class GroupAction extends AverageCalculator {
    public static Double getAverageGradeBySubject(Group group, Subject subject)
            throws GroupWithoutStudentsException {
        return calculateAverageGrade(group.getStudents(), subject);
    }
}
