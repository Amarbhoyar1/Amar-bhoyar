package LogicalPrograms;

import java.util.Scanner;

public class Eaxmple7_factor_of_num
	{
	 public static void main(String[] args) 
	 {
		
		System.out.print("enter num: ");
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();    //4	
		
		int fact = 1;     //24

		//    4        0>=1
		for(int i =num; i>=1; i--)
		{
			fact = fact*i;     //12*2=24*1=24
		}
		

		System.out.println(fact);
	}
	
	}

