package errorsAndExceptions.services;

import errorsAndExceptions.universityEntities.University;
import errorsAndExceptions.universityExceptions.*;

public abstract class Initializer {
    protected University university;

    public Initializer() {
        university = new University();
    }

    protected abstract void setFaculties();

    protected abstract void setGroups() throws UniversityWithoutFacultiesException;

    protected abstract void setStudents() throws UniversityWithoutFacultiesException, FacultyWithoutGroupsException;

    protected abstract void setGrades() throws GradeOutOfRangeException, StudentWithoutSubjectsException, GroupWithoutStudentsException, FacultyWithoutGroupsException, UniversityWithoutFacultiesException;

    public University initializeUniversity() throws GradeOutOfRangeException, StudentWithoutSubjectsException,
            GroupWithoutStudentsException, FacultyWithoutGroupsException, UniversityWithoutFacultiesException {
        setFaculties();
        setGroups();
        setStudents();
        setGrades();
        return university;
    }
}
