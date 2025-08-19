import java.io.*;

public class textfiles{
    public static void main(String[] args) {
        File folder = new File("C:\\Training\\HETraining");

        // Filter for .txt files only
        String[] textFiles = folder.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        });

        if (textFiles != null) {
            for (String filename : textFiles) {
                System.out.println(filename);
            }
        } else {
            System.out.println("Folder does not exist or is not accessible.");
        }
    }
}
