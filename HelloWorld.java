import java.net.SocketPermission;

public class HelloWorld {
    public static void main(String[] args) { 
        //primitives
    byte bytePrimitive = 127;
    short shortPrimitive = 3419;
    char charPrimitive = 'a';
    int intPrimitive = 32345434;
    long longPrimitive = 2131234323;
    float floatPrimitive = 123.123f;
    double doublePrimitive = 123.1231231343454564;
    double doubleTransition = intPrimitive;
    int intTransition = (int)doublePrimitive;
        //String is non-primitive because it is a method()
    String string = "This is String";
        
    
        
    System.out.println("Hello world!");
        //Output is: Hello World!
    System.out.println("bytePrimitive - " + bytePrimitive);
    System.out.println("shortPrimitive - " + shortPrimitive);
    System.out.println("charPrimitive - " + charPrimitive);
    System.out.println("intPrimitive - " + intPrimitive);
    System.out.println("longPrimitive - " + longPrimitive);
    System.out.println("floatPrimitive - " + floatPrimitive);
    System.out.println("doublePrimitive - " + doublePrimitive);
    System.out.println("string - " + string);
    //boolean true, false
    System.out.println("True -" + true);
    System.out.println("False -" + false);
        //Scientific numbers with exponent
    float scientificNumber = 21e5f;
    System.out.println("scientificNumber - " + scientificNumber);
        //Typecasting
        //Widening casting automaticly
    System.out.println("Int - " + intPrimitive + " to double - " + doubleTransition);
        //Narrow casting manually
    System.out.println("Double - " + doublePrimitive + " to int - " + intTransition);
    }
    
}