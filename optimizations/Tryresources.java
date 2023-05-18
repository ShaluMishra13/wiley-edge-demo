package optimizations;
import java.io.*;

public class Tryresources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("myfile.txt")){
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
