package com.care.root02;

public class STBean {
	private String name;
	private int age;
	private Student st;
	//STBean은 이름과 나이를 저장하는 기능
	
	public void namePrint() {
		st.namePrint(name);
	}
	public void agePrint() {
		st.agePrint(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	
}