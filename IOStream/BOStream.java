package IOStream;

import java.io.IOException;
import java.io.*;
public class BOStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        FileOutputStream fout=new FileOutputStream("C:\\Users\\SHALU\\OneDrive\\Desktop\\dataforder\\data.txt");
		BufferedOutputStream bof= new BufferedOutputStream(fout);//for writing data in file
        String str="Iam a java programer";
        byte[]b=str.getBytes();
        try {
        	bof.write(b);
        	bof.flush();
        	bof.close();
        }
        catch(IOException e) {
        	e.printStackTrace();
        }
        FileInputStream fin=new FileInputStream("C:\\Users\\SHALU\\OneDrive\\Desktop\\dataforder\\data.txt");
        BufferedInputStream bis= new BufferedInputStream(fin);//reading data from file
        int i;
        //i=bis.read();
        while((i= bis.read())!=-1) {
        	System.out.print((char)i);
        }
        bis.close();
        fin.close();
	}

}
