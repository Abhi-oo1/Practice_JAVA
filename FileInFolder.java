import java.io.*;  
public class FileInFolder {  
public static void main(String[] args) {  
    File f=new File("C:\\");  
    String filenames[]=f.list();  
    for(String filename:filenames){  
        System.out.println(filename);  
    }  
}  
}