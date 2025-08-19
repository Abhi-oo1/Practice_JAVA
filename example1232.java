import java.io.*;
class example1232{
    public static void main(String[] args) throws Exception {
        char c;
        FileReader file = new FileReader("example123.txt");
        System.out.println((char)file.read());
    }
}