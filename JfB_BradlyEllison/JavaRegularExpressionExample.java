import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JavaRegularExpressionExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("programming", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("What is programming?");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Word Found");
        } else {
            System.out.println("Word not found");
        }
    }
}
