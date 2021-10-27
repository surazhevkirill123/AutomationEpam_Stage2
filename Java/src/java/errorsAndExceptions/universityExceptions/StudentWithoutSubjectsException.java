package errorsAndExceptions.universityExceptions;

public class StudentWithoutSubjectsException extends Exception {
    public StudentWithoutSubjectsException() {
    }

    public StudentWithoutSubjectsException(String message) {
        super(message);
    }

    public StudentWithoutSubjectsException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentWithoutSubjectsException(Throwable cause) {
        super(cause);
    }
}
