public class Person {
    private int age;
    private int height;
    private int weight;
    private String name;

    static int personCount = 0;

    public Person(int personAge, int personHeight, int personWeight, String personName) {
        age = personAge;
        height = personHeight;
        weight = personWeight;
        name = personName;
    }

    boolean personSex (String personSexIdentifyer) {
        if (personSexIdentifyer == "female") {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Person kolaPerson = new Person(28,170,78,"Kola");
        kolaPerson.age = 28;
        kolaPerson.height = 170;
        kolaPerson.name = "Kola";
        kolaPerson.weight = 78;
        personCount++;
        System.out.println(kolaPerson.personSex("male"));

        Person katyaPerson = new Person(22,160,55,"Katya");
        katyaPerson.age = 22;
        katyaPerson.height = 160;
        katyaPerson.name = "Katya";
        katyaPerson.weight = 55;
        personCount++;
        System.out.println(katyaPerson.personSex("female"));
        

        

        System.out.println(kolaPerson);
        System.out.println(katyaPerson);
        System.out.println("Person count: " + personCount);
    }
    public String toString() {
        return age + " " + height + " " + weight + " " + name;   
        }
}

