package errorsAndExceptions.run;

import errorsAndExceptions.actions.StudentAction;
import errorsAndExceptions.actions.UniversityAction;
import errorsAndExceptions.services.CodeInitializer;
import errorsAndExceptions.services.Initializer;
import errorsAndExceptions.universityEntities.*;
import errorsAndExceptions.universityExceptions.*;

import java.util.EnumSet;
import java.util.Scanner;

public class Runner {
    private final static Subject SUBJECT_FOR_TEST = Subject.ENGLISH;
    private final static int STUDENT_NUMBER_FOR_TEST = 9;

    private static void getAverageGradesOfStudent(University university) throws StudentWithoutSubjectsException,
            FacultyWithoutGroupsException, UniversityWithoutFacultiesException, GroupWithoutStudentsException {
        Student student = UniversityAction.getStudentsOfUniversity(university).get(STUDENT_NUMBER_FOR_TEST);
        System.out.println("Средние оценка студента по каждому предмету" + student.getName() + " " + student.getSurname() + "(ID " + student.getStudentIDNumber() + ")");
        System.out.println(StudentAction.getAverageGradeByEverySubjectOfStudent(student));
        System.out.println("Средняя оценка студента по всем предметам: " + student.getName() + " " + student.getSurname() + "(ID " + student.getStudentIDNumber() + ")");
        System.out.println(StudentAction.getAverageGradeByAllSubjectsOfStudent(student));
    }

    private static void getAverageGradesOfFaculties(University university) throws UniversityWithoutFacultiesException,
            FacultyWithoutGroupsException, GroupWithoutStudentsException {
        System.out.println("Средние оценки факультетов по предмету " + SUBJECT_FOR_TEST);
        for(Faculty faculty:university.getFaculties()){
            System.out.println(faculty.getFacultyName() + "=" +
                    UniversityAction.getAverageGradeOfFaculty(university, faculty.getFacultyName(), SUBJECT_FOR_TEST));
        }
    }

    private static void getAverageGradesOfGroups(University university) throws UniversityWithoutFacultiesException,
            FacultyWithoutGroupsException, GroupWithoutStudentsException {
        System.out.println("Средние оценки групп по предмету " + SUBJECT_FOR_TEST);
        for(Faculty faculty:university.getFaculties()){
            for(Group group:faculty.getGroups()){
                System.out.println(group.getGroupName()+"=" +
                        UniversityAction.getAverageGradeOfGroup(university, group.getGroupName(), SUBJECT_FOR_TEST));
            }
        }
    }

    private static void getAverageGradeOfUniversity(University university) throws UniversityWithoutFacultiesException,
            FacultyWithoutGroupsException, GroupWithoutStudentsException {
        System.out.println("Средняя оценка университета по предмету " + SUBJECT_FOR_TEST);
        System.out.println(UniversityAction.getAverageGradeOfUniversity(university, SUBJECT_FOR_TEST));
    }

    private static void getExceptions(University university) throws FacultyWithoutGroupsException,
            UniversityWithoutFacultiesException, GroupWithoutStudentsException, GradeOutOfRangeException,
            StudentWithoutSubjectsException {
        System.out.println("Введите номер сценария с исключением, который необходимо исполнить (1-5)");
        Scanner scanner = new Scanner(System.in);
        int programNumber = scanner.nextInt();
        switch (programNumber) {
            case 1:
                int incorrectGrade = 11037;
                System.out.println("Попытка поставить оценку ниже 0 или выше 10");
                Student studentWithGradeOutOfRange = UniversityAction.getStudentsOfUniversity(university).get(STUDENT_NUMBER_FOR_TEST);
                studentWithGradeOutOfRange.setGrade(Subject.PHILOSOPHY, incorrectGrade);
                System.out.println(studentWithGradeOutOfRange);
                break;
            case 2:
                System.out.println("Отсутсвие предметов у студента");
                Student studentWithoutSubjects = new Student("Ultimate", "Impostor", EnumSet.noneOf(Subject.class));
                university.getFaculties().get(0).getGroup("JD002").setStudent(studentWithoutSubjects);
                System.out.println(StudentAction.getAverageGradeByEverySubjectOfStudent(studentWithoutSubjects));
                break;
            case 3:
                System.out.println("Отсутствие студентов в группе");
                String groupWithoutStudents = "D002";
                university.getFaculties().get(0).setGroup(groupWithoutStudents);
                System.out.println(UniversityAction.getAverageGradeOfGroup(university, groupWithoutStudents, Subject.ENGLISH));
                break;
            case 4:
                System.out.println("Отсутствие групп на факультете");
                String facultyWithoutGroups = "Another";
                university.setFaculty(new Faculty(facultyWithoutGroups));
                System.out.println(UniversityAction.getAverageGradeOfFaculty(university, facultyWithoutGroups, Subject.ENGLISH));
                break;
            case 5:
                System.out.println("Отсутствие факультетов в университете");
                University universityWithoutFaculties = new University();
                System.out.println(UniversityAction.getStudentsOfUniversity(universityWithoutFaculties));
                break;
            default:
                System.out.println("Введено неверное число!");
                break;
        }
    }

    public static void main(String[] args) {
        Initializer initializer = new CodeInitializer();
        try {
            University university = initializer.initializeUniversity();

            System.out.println("Список факультетов, групп и студентов в университете:");
            System.out.println(university);

            getAverageGradesOfStudent(university);
            getAverageGradesOfFaculties(university);
            getAverageGradesOfGroups(university);
            getAverageGradeOfUniversity(university);

            getExceptions(university);
        } catch (GradeOutOfRangeException | StudentWithoutSubjectsException | GroupWithoutStudentsException |
                UniversityWithoutFacultiesException | FacultyWithoutGroupsException e) {
            e.printStackTrace();
        }
    }
}
