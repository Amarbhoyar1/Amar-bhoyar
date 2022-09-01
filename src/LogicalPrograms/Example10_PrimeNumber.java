package LogicalPrograms;

public class Example10_PrimeNumber 
{
		public static void main(String[] args)
		{
            int num = 7;                         
			int count = 0;  //1
					    	
			//     2        2<6		    
			for (int i = 2; i < num; i++)           // 2 to 5
			{		
				//  6%2= 0==0
				if (num % i == 0)
				{
					count++;    //1
					break;
				}
			}

			if (count == 1)  //1==1
			{
				System.out.println("given number is not a prime number");
			} 
			else
			{
				System.out.println("given number is a prime number");
			}

		}
		
		// find prime no from 1 to 100
	}
