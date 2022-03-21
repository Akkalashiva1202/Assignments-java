package wiprojava;

import java.util.Scanner;

class Calculator
{
	public void Add(int a,int b)
	{
		int res=a+b;
		System.out.println("result  for Add is : "+ res);
	}
	public void sub(int a,int b)
	{
		int res =a-b;

		System.out.println("result for sub  is : "+ res);
	}
	public void mul(int a,int b)
	{
		int res =a*b;

		System.out.println("result for mul is : "+ res);
	}
	public void div(int a,int b)
	{
		int res =a%b;

		System.out.println("result for div is : "+ res);
	}
	
}
public class Assignmentday1calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Calculator c =new Calculator();
		int r1,r2;
		System.out.println("enter r1 and r2 values ");
		r1 =sc.nextInt();
		r2 =sc.nextInt();
		c.Add(r1, r2);
		c.sub(r1, r2);
		c.mul(r1, r2);
		c.div(r1, r2);
	}

}
