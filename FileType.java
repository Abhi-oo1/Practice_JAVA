import java.io.*;  
public class FileType {  
public static void main(String[] args) {  
    File f=new File("C:\\clg\\3-1\\OOPS");  
    String filenames[]=f.list();  
    for(String filename:filenames){  
        File f1=new File(f,filename);
        System.out.print(filename);  
	if(f1.isFile())
	{
		System.out.print(" is a file");
	}
	else if(f1.isDirectory()){
		System.out.print(" is a folder");
	}
	System.out.println("\n");
    }  
}  
}