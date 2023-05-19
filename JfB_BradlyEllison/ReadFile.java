import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File readFile = new File("fileWithText.txt");
            Scanner textReader = new Scanner(readFile);
            while (textReader.hasNextLine()) {
                String data = textReader.nextLine();
                System.out.println(data);
            }
            textReader.close();
        } catch (FileNotFoundException i) {
            System.out.println("There was an error");
            i.printStackTrace();
        }
        
    }    
}
