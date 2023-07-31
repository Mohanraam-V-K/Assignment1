package test;
import java.util.*;
public class ques5part2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n+1];
		for(int i=0;i<n+1;i++)
		{
			s[i]=sc.nextLine();
		}
		Arrays.sort(s);
		for(String i:s)
			System.out.println(i);
	}
}