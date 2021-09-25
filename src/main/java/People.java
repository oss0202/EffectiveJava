public class People {
    private final String id;
    public People(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                '}';
    }
}
