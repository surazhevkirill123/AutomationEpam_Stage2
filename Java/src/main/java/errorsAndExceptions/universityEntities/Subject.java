package errorsAndExceptions.universityEntities;

public enum Subject {
    GEOMETRY, TRIGONOMETRY, ALGEBRA, ENGLISH, GERMAN, ENGLISH_LITERATURE,
    PHONETICS, ANATOMY, BOTANY, PHILOSOPHY, PSYCHOLOGY;

    @Override
    public String toString() {
        return this.name();
    }
}
