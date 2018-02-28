package com.gmail.gelios3031;

public class Student extends Human {
	
	private int nrecbook;

	public Student(String name, int age, String sex, int nrecbook) {
		super(name, age, sex);
		this.nrecbook = nrecbook;
	}

	public Student(String name, int age, String sex) {
		super(name, age, sex);
	}

	public int getNrecbook() {
		return nrecbook;
	}

	public void setNrecbook(int nrecbook) {
		this.nrecbook = nrecbook;
	}

	@Override
	public String toString() {
		return "Student [nrecbook=" + nrecbook + "]"+" "+super.toString();
	}
		

}
