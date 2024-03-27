package ashiqe;
import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        // Create a File object for the directory "DIUCSE"
        File fl = new File("DIUCSE.txt");

        // Create the directory
        boolean created = fl.mkdir();

        if (created) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Failed to create directory");
        }

        // Get the absolute path of the directory
        String s = fl.getAbsolutePath();
        System.out.println("Absolute Path: " + s);

        // Get the name of the directory
        String name = fl.getName();
        System.out.println("Directory Name: " + name);
    }
}
