public class pattern {
	public static void main(String[] args) throws Exception{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		
		/*
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}*/
		/*
		int mid=n/2;
		for(int i=0;i<n;i++)
		{
			if(i<=mid)
			{
				for(int k=0;k<i+1;k++)
				{
					System.out.print("*");
				}
			}
			else
			{
				for(int k=0;k<n-i;k++)
				{
					System.out.print("*");
				}
			}
			
			System.out.print("\n");	
		}*
		/*
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				  if(j==0 || j==i || i==n-1)
			           System.out.print("*"); 
			       else
			            System.out.print(" ");
			}
			
			System.out.print("\n");
			
		}*/
		
		
	}

}
