import java.io.*;
class renameto {
	public static void main(String[] args) {
		File f1=new File("oldfile.txt");
		try {
			f1.createNewFile();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		File f2=new File("newfile.txt");
		if(f1.renameTo(f2))
		{
			System.out.println("Successfully renamed");
		}
		else {
			System.out.println("Not renamed");
		}
	}
}