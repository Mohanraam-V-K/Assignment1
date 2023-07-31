package test;
import java.util.*;
public class ques3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] treasure=new int[n];
		int s=0;
		for(int i=0;i<n;i++)
		{
			treasure[i]=sc.nextInt();
		}
		Arrays.sort(treasure);
		for(int i=0;i<n-1;i++)
		{
			s+=treasure[i];
		}
		if(treasure[0]==treasure[n-1])
		{
			int c1=0;
			for(int i:treasure)
				if (i==treasure[n-1]) c1+=1;
			if(c1==n && treasure[n-1]!=0) System.out.println("False");
			else if(c1==n && treasure[n-1]==0) System.out.println("True");
			return;
		}
		if(s<treasure[n-1]) System.out.println("False");
		else if(s==treasure[n-1]) System.out.println("True");
		else if(s>treasure[n-1])
		{
			int a=s-treasure[n-1];
			int flag=0;
			for(int i:treasure)
			{
				if(i==a)
				{
					System.out.println("True");
					flag=1;
					break;
				}
			}
			if(flag==0) System.out.println("False");
		}
	}
}