public abstract class AbstractClass {
    public abstract void insectNoise();
    public void sleep(){
        System.out.println("Bzzz");
    }
    public static void main(String[] args) {
        
    }
}

interface Insect {
    public void insectNoise();
    //interface method
    public void sleep();
    //interface method
}

class Bee implements Insect {
    public void insectNoise() {
        //body of insectNoise()
        System.out.println("The bee goes: bzzzz");
    }
    public void sleep(){
        //body of sleep()
        System.out.println("Bzzz");
    }
}