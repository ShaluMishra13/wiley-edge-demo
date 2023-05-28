package com.wiley.springcore1;
import java.util.*;

 class address {
	private String address1;

	public String getaddress() {
		return address1;
	}

	public void setadress(String a) {
		this.address1 = a;
	}

	public address(String a) {
		super();
		this.address1 = a;
	}

	public address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "address [address=" + address1 + "]";
	}
	
}

public class Student {
	private String studentId;
	private String studentName;
	private String studentAddress;
	private List<String> phones;
	private Map<String,String> courses;
	public Set<String>addresses;

	private address ob;
	
	public address getOb() {
		return ob;
	}
	public void setOb(address ob) {
		this.ob = ob;
	}
	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	

	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", phones=" + phones + ", courses=" + courses + ", addresses=" + addresses + ", ob=" + ob + "]";
	}
	public Student(String studentId, String studentName, String studentAddress, List<String> phones,
			Map<String, String> courses, Set<String> addresses, address ob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.phones = phones;
		this.courses = courses;
		this.addresses = addresses;
		this.ob = ob;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
}