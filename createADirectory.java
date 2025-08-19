import java.io.*;
class createADirectory{
    public static void main(String[] args) {
        File file = new File("Abhi");
        if(file.mkdir())
        {
            System.out.println("New Directory Created");
        }
        else{
            System.out.println("NOt Created");
        }
    }
}