import java.io.*;
import java.util.Scanner;
class ab
{
    public static void main(String args[]) throws Exception
    {
        int c;
        FileReader r=new FileReader("example123.txt");
        Scanner sc=new Scanner(r);
        while((c=r.read())!=-1)
        {
        System.out.print((char)c);
    }
}
}