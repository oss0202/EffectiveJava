import java.util.Objects;

public class Teacher {
    private final People people;
    public Teacher(People people){
        this.people = Objects.requireNonNull(people);
    }

    public People getPeople() {
        return people;
    }
}
