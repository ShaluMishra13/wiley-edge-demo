package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("C:\\Users\\SHALU\\OneDrive\\Desktop\\dataforder\\data.txt");
		String str="wiley fullstack Project";
		byte[]b=str.getBytes();
		fout.write(b);
		fout.flush();
		fout.close();

	}

}
