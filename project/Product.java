package project;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import IOStream.Student;
import IOStream.StudentRecordReader;


public class Product {
	private String Prod_name;
	private int prod_id;
	private float price;
	public String getProd_name() {
		return Prod_name;
	}
	public void setProd_name(String prod_name) {
		Prod_name = prod_name;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float d) {
		this.price = d;
	}
	 public static void add(Product ac) {
		    ac.setProd_name("name");
		    ac.setProd_id(22);
		    ac.setPrice(5677.56f);
		    
		    System.out.println(ac.getProd_name()+" ");
		   // str1=str1+(ac.getPrice())+" ";
		   // str1=str1+ac.getProd_id()+" ";
			}
		public static void delete() {
		
			}
			public static void view() {
		
			}
			public static void search() {
		
			}


public static void main(String[] args) throws IOException {
	Product ac=new Product( );
	
	
	add(ac);
	
	
   

	}
}

