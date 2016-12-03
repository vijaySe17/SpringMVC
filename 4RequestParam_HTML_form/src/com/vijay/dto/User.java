package com.vijay.dto;

public class User {
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name,int age) {
		mAge = age;
		mName = name;
	}
	private String mName;
	private int mAge;
	
	public String getName() {
		return mName;
	}
	public void setName(String pName) {
		mName = pName;
	}
	public int getAge() {
		return mAge;
	}
	public void setAge(int pAge) {
		mAge = pAge;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [mName=");
		builder.append(mName);
		builder.append(", mAge=");
		builder.append(mAge);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return mName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User){
			return ((User) obj).getName().equals(getName());
		}
		return false;
	}
	
}
