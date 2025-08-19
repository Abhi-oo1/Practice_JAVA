import java.io.*;
import java.util.Scanner;
class reader
{
    public static void main(String args[]) throws Exception
    {
        int c;
        FileReader r=new FileReader("a.txt");
        Scanner sc=new Scanner(r);
        while (sc.hasNextLine()) {  
            String line=sc.nextLine();
            String[] details=line.split(",");
            if(details[2].equals("Male")){
            System.out.println(line);
            }
        }
}
}