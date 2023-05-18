import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> dogs = new HashSet<>();
        dogs.add("Poodle");
        dogs.add("German Shepherd");
        dogs.add("Cocker Spaniel");
        dogs.add("Dalmatian");
        System.out.println(dogs);
    }
}
