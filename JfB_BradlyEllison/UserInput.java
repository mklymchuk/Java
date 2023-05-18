import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter nickname");
        String userNickname = inputObject.nextLine();
        System.out.println("Nickname is" + userNickname);
        inputObject.close();
    }
}
