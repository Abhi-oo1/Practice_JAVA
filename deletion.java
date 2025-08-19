import java.io.*;
class deletion{
    public static void main(String[] args){
        try {
            File F1=new File("example.txt");
            if(F1.createNewFile())
            {
                System.out.println("New File Created");
            }
            if(F1.delete())
            {
                System.out.println("File Deleted");
            }
            else{
                System.out.println("File Doesnot Exists");
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}