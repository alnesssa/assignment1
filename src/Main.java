public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Aliya");
        person.setSurname("Sadvokassova");
        person.setAge(18);
        person.setGender(true);
        System.out.println(person.toString());
    }
}