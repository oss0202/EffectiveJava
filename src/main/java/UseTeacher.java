public class UseTeacher {
    public static void main(String[] args) {
        People people = new People("20210924");
        Teacher teacher = new Teacher(people);
        System.out.println(teacher);
    }
}
