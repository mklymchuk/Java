import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class TimeExample {
    public static void main(String[] args) {
        LocalDateTime aDateObject = LocalDateTime.now();
        System.out.println("No formatting: " + aDateObject);
        DateTimeFormatter aFormatObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = aDateObject.format(aFormatObject);
        System.out.println("With formatting: " + formattedDate);
    }
}
