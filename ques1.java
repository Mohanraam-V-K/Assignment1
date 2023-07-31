package test;
import java.util.*;
public class ques1 {
	static int c=0;
	public static int demo()
	{
		System.out.println("Enter a starting distance(between 5km to 8km)");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=5&&a<=8)
			{System.out.println();
			c=a;
		return a;
		}
		else {
			System.out.println("Sorry Choose between 5km to 8km");
			demo();
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=demo();
		for(int i=b;i>0;i--)
		{
			System.out.println("Distance to run:"+i);
			if(i==b-1) System.out.println("Good Start keep it up");
			else if(i==2) System.out.println("Almost there!");
			else if(i==1) {
				System.out.println("Almost there!");
				System.out.println("Done for the day!");
			}
		}
	}
}