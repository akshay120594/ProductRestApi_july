package com.kiranacademy.lambdaex;

@FunctionalInterface
public interface Operations {

	int add(int a,int b);
}

interface Operations2
{
	void add(int a,int b);
	
}

class TestLambda
{
	public static void main(String[] args) {
		
		Operations2 op=(a,b)-> System.out.println(a+b);
		
		op.add(10, 20);
		
		Operations o=(a,b)-> a+b;
		
		
	}
}
