import java.io.*;
import java.util.*;

class creation {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("New File Created");
            } else {
                System.out.println("File already Exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
