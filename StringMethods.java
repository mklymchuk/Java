public class StringMethods {

    private String colorString;

    public StringMethods(String stringColor) {
        colorString = stringColor;
    }

    public String toString() {
        return "Color of text is " + colorString + ".";
    }
    public static void main(String[] args) {
        StringMethods stringMethodsObject = new StringMethods("white");
        String stringLenght = "This is string";
        String stringConcat = new String("Alpha ");
        stringConcat = stringConcat.concat("Century");
        String dog1 = "Boba";
        String dog2 = "Bobik";

        System.out.println("String toString() method - " + stringMethodsObject);
        System.out.println("String length() method - " + stringLenght.length());
        System.out.println("String concat() method - " + stringConcat);
        System.out.println("String copmareTo() method - " + dog1.compareTo(dog2));
        System.out.println("String eaquals() method" + dog1.equals(dog2));
        System.out.println("String indexOf() method - " + dog1.indexOf("o"));
        System.out.println("String idexOf() method with substring - " + dog2.indexOf("bik"));
        System.out.println("String charAt() method - " + dog1.charAt(0));
        System.out.println("String substring() method - " + stringConcat.substring(8));
        System.out.println("String substring() method with start and end index - "
        + stringConcat.substring(2, 10));
        System.out.println("String substring() method with start and end index for one character - " 
        + stringConcat.substring(2, 3));
        System.out.println("Sting toUpperCase() method - " + dog1.toUpperCase());
        System.out.println("String toLowerCase() method - " + dog2.toLowerCase());
    }
}
