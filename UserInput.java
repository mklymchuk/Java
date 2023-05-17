import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner aObject = new Scanner(System.in);
        System.out.println("Enter nickname");
        String userNickname = aObject.nextLine();
        System.out.println("Nickname is" + userNickname);
    }
}
