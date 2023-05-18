public class PolymorphismExample {
    class Mammal {
        public void salutation(){
            System.out.println("Animals salute you.");
        }
    }

    class Dog extends Mammal {
        public void salutation() {
            System.out.println("The dog barks");
        }
    }

    class MainClass {
        public static void main(String[] args) {
            Mammal mammal1 = new Mammal();
            Mammal dog1 = new dog();
            mammal1.salutation();
            dog1.salutation();
        }
    }
}
