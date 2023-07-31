package test;
import java.util.*;
public class ques2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ProfitsAndLosses=new int[n];
		int[] neg=new int[n];
		for(int i=0;i<n;i++)
		{
			ProfitsAndLosses[i]=sc.nextInt();
		}
		int max=ProfitsAndLosses[0];
		int c=0,sum=0,j=0;
		for(int i=1;i<n;i++)
		{
			if(ProfitsAndLosses[i]>max)
			{
				max=ProfitsAndLosses[i];
				c=i;
			}
			if(ProfitsAndLosses[i]<0)
			{
				neg[j]=ProfitsAndLosses[i];
				j++;
			}
		}
		j=0;
		for(int i=0;i<n;i++)
		{
			if(ProfitsAndLosses[i]>0 && max-neg[j]>sum )
				sum=max-neg[j];
			j++;
		}
		System.out.println(sum);
	}
}