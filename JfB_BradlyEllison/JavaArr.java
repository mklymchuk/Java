import java.util.Arrays;
import java.util.ArrayList;

public class JavaArr {

    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        String[] colors = new String[5];
        ArrayList <String> shoppingList = new ArrayList<String>();
        ArrayList assortment = new ArrayList<>();
        //assortment ArrayList
        System.out.println("Empty array length - " + colors.length);
        colors[0] = "red";
        colors[1] = "black";
        colors[2] = "yellow";
        shoppingList.add("Apples");
        //shoppingList stores ["Apples"]
        shoppingList.add("Orange");
        //shoppingList stores ["Apples","Orange"]
        shoppingList.add(0,"Milk");
        //shoppingList stores ["Milk","Apples","Orange"]
        //we moved other elements by 1 when put Milk in index 0
        assortment.add("Hello");
        assortment.add(20);
        assortment.add("there");
        //we can put different datatypes in list
        //but better do not make ArrayList in this way 

        String showNumbers = Arrays.toString(numbers);
        String showColors = Arrays.toString(colors);

        System.out.println("numbers array - " + showNumbers);
        System.out.println("numbers index 2 - " + numbers[2]);
        //number of elements in array is 10
        //but last element will be 10 - 1 = 9
        System.out.println("Numbers last element - 1 - " + numbers[9]);
        System.out.println("Colors Array - " + showColors);
        System.out.println("ArrayList shoppingList - " + shoppingList);
        System.out.println("ArrayList with mixed datatypes - " + assortment);
        System.out.println("shoppinglist size() - " + shoppingList.size());
        System.out.println("shoppinglist get() - " + shoppingList.get(0));
        shoppingList.set(0, "Chocolate Milk");
        System.out.println("shoppinglist set() - " + shoppingList);
        shoppingList.remove(0);
        System.out.println("shoppinglist remove() by index - " + shoppingList);
        shoppingList.remove("Apples");
        System.out.println("shoppinglist remove() by value itself - " + shoppingList);
        System.out.println("shoppingList indexOf('Orange') - " + shoppingList.indexOf("Orange"));
    }
}
