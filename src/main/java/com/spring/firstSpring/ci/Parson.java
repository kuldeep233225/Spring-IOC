package com.spring.firstSpring.ci;

public class Parson {
	private String name;
	private String parsonId;
	
	public Parson(String name,String parsonId)
	{
		this.name = name;
		this.parsonId = parsonId;
	}
	//create toString method using sourse code override empliment method

	@Override
	public String toString() {
		
		return this.name+" :- "+this.parsonId ;
	}
	

}
