public class TypesOfVariables {
    /*There is three types of variables:
    - Class variable
    - Local variable
    - Instance variable
    */
    //Class variable with static word
    private static int classVariableNumbersOfStrings = 0;
    //Instance variable
    private int instanceIDVariable;
    //local variable inside method
    void LocalVariable () {
        String locaString = "This is local string";
        System.out.println(locaString);
    }
    public static void main(String[] args) {
    
    TypesOfVariables newObj = new TypesOfVariables();
    TypesOfVariables newObj1 = new TypesOfVariables();
    System.out.println("Instance variable with obj - " + (newObj.instanceIDVariable = 1));
    System.out.println("Instance variable with obj1 - " + (newObj1.instanceIDVariable = 2));
    System.out.println(TypesOfVariables.classVariableNumbersOfStrings + 1);
    newObj.LocalVariable();
}
}

