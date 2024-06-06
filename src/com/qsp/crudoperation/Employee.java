package com.qsp.crudoperation;
//entity class
public class Employee {
	private int id;
    private	String name;
	private long mobno;
    private	String Email;
    private String desigination;
	public Employee(int id, String name, long mobno, String email, String desigination) {
		
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		Email = email;
		this.desigination = desigination;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", mobno=" + mobno + ", Email=" + Email + ", desigination="
				+ desigination ;
	}
    

}
