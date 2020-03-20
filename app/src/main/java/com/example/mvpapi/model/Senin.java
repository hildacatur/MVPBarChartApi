package com.example.mvpapi.model;

public class Senin{

	private String color;

	private double growth;

	private int value;

//	public Senin(String sColor, Double dGrowth, int iValue){
//		this.color = sColor;
//		this.growth = dGrowth;
//		this.value = iValue;
//	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setGrowth(double growth){
		this.growth = growth;
	}

	public double getGrowth(){
		return growth;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"Senin{" + 
			"color = '" + color + '\'' + 
			",growth = '" + growth + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}