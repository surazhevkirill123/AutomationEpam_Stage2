package errorsAndExceptions.services;

import errorsAndExceptions.universityEntities.Subject;
import errorsAndExceptions.universityEntities.Faculty;
import errorsAndExceptions.universityEntities.Group;
import errorsAndExceptions.universityEntities.Student;
import errorsAndExceptions.universityExceptions.*;

import java.util.EnumSet;

public class CodeInitializer extends Initializer {

    @Override
    protected void setFaculties() {
        university.setFaculty(new Faculty("JuiceDrinkers"));
        university.setFaculty(new Faculty("Impostors"));
        university.setFaculty(new Faculty("Despairs"));
    }

    @Override
    protected void setGroups() throws UniversityWithoutFacultiesException {
        university.getFaculties().get(0).setGroup("JD001");
        university.getFaculties().get(0).setGroup("JD002");
        university.getFaculties().get(1).setGroup("I001");
        university.getFaculties().get(1).setGroup("I002");
        university.getFaculties().get(2).setGroup("D001");
        university.getFaculties().get(2).setGroup("D002");
    }

    @Override
    protected void setStudents() throws UniversityWithoutFacultiesException, FacultyWithoutGroupsException {
        university.getFaculties().get(0).getGroup("JD001").setStudent(new Student("Kaede", "Akamatsu",
                EnumSet.of(Subject.BOTANY, Subject.ANATOMY, Subject.PHILOSOPHY)));
        university.getFaculties().get(0).getGroup("JD001").setStudent(new Student("Shuichi", "Saihara",
                EnumSet.of(Subject.BOTANY, Subject.ANATOMY, Subject.PHILOSOPHY)));
        university.getFaculties().get(0).getGroup("JD002").setStudent(new Student("Kirumi", "Tojo",
                EnumSet.of(Subject.BOTANY, Subject.ANATOMY, Subject.PHILOSOPHY)));

        university.getFaculties().get(1).getGroup("I001").setStudent(new Student("Rantaro", "Amami",
                EnumSet.of(Subject.ENGLISH_LITERATURE, Subject.ENGLISH, Subject.GERMAN, Subject.PHILOSOPHY)));
        university.getFaculties().get(1).getGroup("I001").setStudent(new Student("Ryoma", "Hoshi",
                EnumSet.of(Subject.ENGLISH_LITERATURE, Subject.ENGLISH, Subject.GERMAN, Subject.PHILOSOPHY)));
        university.getFaculties().get(1).getGroup("I001").setStudent(new Student("Angie", "Yonaga",
                EnumSet.of(Subject.ENGLISH_LITERATURE, Subject.ENGLISH, Subject.GERMAN, Subject.PHILOSOPHY)));
        university.getFaculties().get(1).getGroup("I002").setStudent(new Student("Tenko", "Chabashira",
                EnumSet.of(Subject.ENGLISH_LITERATURE, Subject.ENGLISH, Subject.GERMAN, Subject.PHONETICS)));
        university.getFaculties().get(1).getGroup("I002").setStudent(new Student("Korekiyo", "Shinguji",
                EnumSet.of(Subject.ENGLISH_LITERATURE, Subject.ENGLISH, Subject.GERMAN, Subject.PHONETICS)));

        university.getFaculties().get(2).getGroup("D001").setStudent(new Student("Miu", "Iruma",
                EnumSet.of(Subject.GEOMETRY, Subject.ENGLISH, Subject.TRIGONOMETRY, Subject.ALGEBRA, Subject.PHILOSOPHY)));
        university.getFaculties().get(2).getGroup("D001").setStudent(new Student("Kokichi", "Oma",
                EnumSet.of(Subject.GEOMETRY, Subject.ENGLISH, Subject.TRIGONOMETRY, Subject.ALGEBRA, Subject.PHILOSOPHY)));
        university.getFaculties().get(2).getGroup("D002").setStudent(new Student("Gonta", "Gokuhara",
                EnumSet.of(Subject.GEOMETRY, Subject.ENGLISH, Subject.TRIGONOMETRY, Subject.ALGEBRA, Subject.PHILOSOPHY)));
        university.getFaculties().get(2).getGroup("D002").setStudent(new Student("Kaito", "Momota",
                EnumSet.of(Subject.GEOMETRY, Subject.TRIGONOMETRY, Subject.ALGEBRA, Subject.PHILOSOPHY)));
    }

    @Override
    protected void setGrades() throws GradeOutOfRangeException, StudentWithoutSubjectsException,
            GroupWithoutStudentsException, FacultyWithoutGroupsException, UniversityWithoutFacultiesException {
        for (Faculty faculty : university.getFaculties()) {
            for (Group group : faculty.getGroups()) {
                for (Student student : group.getStudents()) {
                    for (Subject studentSubject : student.getSubjects()) {
                        int gradesCount = (int) (Math.random() * 4);
                        for (int i = 0; i < gradesCount; i++) {
                            student.setGrade(studentSubject, (int) ((Math.random() * 10) + 1));
                        }
                    }
                }
            }
        }
    }
}
