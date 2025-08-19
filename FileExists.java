import java.io.File;
public class FileExists {
    public static void main(String[] args) {
	 File file = new File("f1.html");
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}