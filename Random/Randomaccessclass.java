package Random;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Randomaccessclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile file =new RandomAccessFile("C:\\Users\\SHALU\\OneDrive\\Desktop\\dataforder\\record.txt","rw");
			file.writeBytes("Hello, wiley");
			file.seek(0);
			byte[] bytes=new byte[13];
			file.read(bytes);
			String data=new String(bytes);
			System.out.println(data);
			file.seek(7);
			file.writeBytes("java");
			file.seek(0);
			bytes=new byte[13];
			file.read(bytes);
			data=new String(bytes);
			System.out.println(data);
			file.close();
			
			
			
		}catch(IOException e){
			e.printStackTrace();
			
		}

	}

}
