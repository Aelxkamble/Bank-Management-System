package rev;
import java.util.*;

public class Customer {
	private int id;
	private String name;
	private int age;
	private String phone;
	private String address;
	private int aadhar_no;
	private String pan_no;
	private String pass;


public Customer() {
	
}
public Customer(int id,String name,String phone,String address,int aadhar_no,String pan_no,String pass) {
	super();
	this.id=id;
	this.name=name;
	this.age=age;
	this.phone=phone;
	this.address=address;
	this.aadhar_no=aadhar_no;
	this.pan_no=pan_no;
	this.pass=pass;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age=age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone() {
		this.phone=phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress() {
		this.address=address;
	}
	public int setAadhar() {
		return aadhar_no;
	}
	public void getAadhar() {
		this.aadhar_no=aadhar_no;
	}
	public String setPan() {
		return pan_no;
	}
	public void getPan() {
		this.pan_no=pan_no;
	}
	public String setPass() {
		return pass;
	}
	public void getPass() {
		this.pass=pass;
	}
}
