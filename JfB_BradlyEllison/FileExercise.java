import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileExercise {
    public static void main(String[] args) {
        File newFile = new File("file.txt");
        
        try {
            FileWriter newFileWritter = new FileWriter("fileWithText.txt");
            newFileWritter.write("This is text in file!");
            newFileWritter.close();
            System.out.println("fileWithText.txt is written");
        if (newFile.createNewFile() || newFile.exists()) {
            System.out.println("This is new file.tx - " + newFile.getName());
            System.out.println("Name of file: " + newFile.getName());
            System.out.println("Get the Path: " + newFile.getAbsolutePath());
            System.out.println("Is it readable?: " + newFile.canRead());
            System.out.println("Is it writable?: " + newFile.canWrite());
            System.out.println("Size of the file: " + newFile.length());
        } else {
            System.out.println("The file alredy exist");
        }
        } catch(IOException i) {
            System.out.println("There was an error");
            i.printStackTrace();
        }
    }
}