
public class Person {
    private int age;
    private int height;
    private int weight;
    private String name;

    static int personCount = 0;

    boolean personSex (String personSexIdentifyer) {
        if (personSexIdentifyer == "female") {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Person kolaPerson = new Person();
        kolaPerson.age = 28;
        kolaPerson.height = 170;
        kolaPerson.name = "Kola";
        kolaPerson.weight = 78;
        personCount++;
        kolaPerson.personSex("male");

        Person katyaPerson = new Person();
        katyaPerson.age = 22;
        katyaPerson.height = 160;
        katyaPerson.name = "Katya";
        katyaPerson.weight = 55;
        personCount++;
        katyaPerson.personSex("female");

        System.out.println(kolaPerson);
        System.out.println(katyaPerson);
        System.out.println("Person count: " + personCount);
    }
}

