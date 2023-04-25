package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("C:\\Users\\SHALU\\OneDrive\\Desktop\\dataforder\\data1.txt");
		DataInputStream dis=new DataInputStream(fin);
		int count =fin.available();
		byte[]ba=new byte[count];

		dis.read(ba);
		for(byte b:ba) {
			System.out.print((char)b);

		}dis.close();
		}

}
