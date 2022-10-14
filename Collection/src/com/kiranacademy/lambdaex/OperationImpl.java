package com.kiranacademy.lambdaex;



/* OperationImpl is called implementation class */

public class OperationImpl implements Operations{

	@Override
	public int add(int a, int b) 
	{
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Operations o=new OperationImpl();
		
		o.add(10, 20);
	}
	
}
