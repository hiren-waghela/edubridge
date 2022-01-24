package com;

public class Patterns {
	public static void main(String args[])   
	{   
		
		 
		
			
		
		//************************pattern 1.1 n =5********************************************
	/*int i, j, n=5;     
	for(i=1; i<n; i++)   
	{   
	//inner loop for columns  
	for(j=1; j<=n; j++)   
	{   
	//prints stars   
	System.out.print("* ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   
	}   */
		//************************pattern 1.2 n =8********************************************
		/*int i, j, n=8;     
		for(i=1; i<n; i++)   
		{   
		//inner loop for columns  
		for(j=1; j<=n; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		}   */
	
		/*
		************************pattern 2.1 n =5********************************************
	int i, j, n=5;     
	 for(i=1;i<=n;i++)
     {
         for(j=1;j<=n;j++)
         {
             System.out.print(i);
         }
 
         System.out.println("");
     }*/
		
	/*	************************pattern 2.2 n =8********************************************
	int i, j, n=5;     
	 for(i=1;i<=n;i++)
     {
         for(j=1;j<=n;j++)
         {
             System.out.print(i);
         }
 
         System.out.println("");
     }*/
		
     // ************************pattern 3.1 n =5********************************************
	 /*      int i, j, n=5;   
	       //outer loop for rows  
	for(i=0; i<n; i++)   
	{   
	//inner loop for columns  
	for(j=0; j<=i; j++)   
	{   
	//prints stars   
	System.out.print("* ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   */
		
		// ************************pattern 3.2 n =8********************************************
		 /*      int i, j, n=8;   
		       //outer loop for rows  
		for(i=0; i<n; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   */
		
		// ************************pattern 4.1 n =5********************************************
		/*int i, j, n=5;
		for (i=0; i<n; i++)   
		{  
		//inner loop work for space      
		for (j=2*(n-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}  */
		
		
		// ************************pattern 4.2 n =8********************************************
				/*int i, j, n=8;
				for (i=0; i<n; i++)   
				{  
				//inner loop work for space      
				for (j=2*(n-i); j>=0; j--)         
				{  
				//prints space between two stars      
				System.out.print(" ");   
				}   
				//inner loop for columns  
				for (j=0; j<=i; j++ )   
				{   
				//prints star      
				System.out.print("* ");   
				}   
				//throws the cursor in a new line after printing each line  
				System.out.println();   
				}  */
     
		// ************************pattern 5.1 n =5*******************************************
		/*int n=5;      
		//inner loop  
		for (int i= n-1; i>=0 ; i--)  
		{  
		//outer loop  
		for (int j=0; j<=i; j++)  
		{  
		//prints star and space  
		System.out.print("*" + " ");  
		}  
		//throws the cursor in the next line after printing each line  
		System.out.println();  

		}*/
		
		// ************************pattern 5.2 n =8*******************************************
		/*int n=8;      
		//inner loop  
		for (int i= n-1; i>=0 ; i--)  
		{  
		//outer loop  
		for (int j=0; j<=i; j++)  
		{  
		//prints star and space  
		System.out.print("*" + " ");  
		}  
		//throws the cursor in the next line after printing each line  
		System.out.println();  

		}*/
		
		// ************************pattern 6.1 n =5*******************************************
		/*
		int n = 5;  
		for (int i= n; i>= 1; i--)  
		{  
		for (int j=n; j>i;j--)  
		{  
		System.out.print(" ");  
		}  
		for (int k=1;k<=i;k++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		 */
		// ************************pattern 6.2 n =8*******************************************
				/*
				int n = 8;  
				for (int i= n; i>= 1; i--)  
				{  
				for (int j=n; j>i;j--)  
				{  
				System.out.print(" ");  
				}  
				for (int k=1;k<=i;k++)  
				{  
				System.out.print("*");  
				}  
				System.out.println("");  
				}  
				 */
		
		// ************************pattern 7.1 n =5*******************************************
		/*
		int i,j,n=5;
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= n; j++)
			{
				if(i == 1 || i == n || j == 1 || j == n)
				{
					System.out.print("1"); 
				}
				else
				{
					System.out.print(" "); 
				}
			}
			System.out.print("\n"); 
		}
		*/
		// ************************pattern 7.2 n =8*******************************************
				/*
				int i,j,n=8;
				for(i = 1; i <= n; i++)
				{
					for(j = 1; j <= n; j++)
					{
						if(i == 1 || i == n || j == 1 || j == n)
						{
							System.out.print("1"); 
						}
						else
						{
							System.out.print(" "); 
						}
					}
					System.out.print("\n"); 
				}
				*/
			
			
			
			// ************************pattern 8.1 n =5*******************************************
			/*
			int n = 5;
			int value = 1;
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n+1; j++) {
					if(i % 2 == 1 && j == n+1) {
						System.out.print(++value);
					}
					else if(i % 2 == 0 && j == 1) {
						System.out.print(++value);
					}
					else
						System.out.print(i);
				}
				System.out.println();
			}
			System.out.println();
		
		*/
		// ************************pattern 8.2 n =8*******************************************
		/*
		int n = 8;
		int value = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n+1; j++) {
				if(i % 2 == 1 && j == n+1) {
					System.out.print(++value);
				}
				else if(i % 2 == 0 && j == 1) {
					System.out.print(++value);
				}
				else
					System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
	
	*/
		
		
		// ************************pattern 9.1 n =5*******************************************
	/*	
		int i, j, n = 5;       
		//Outer loop work for rows  
		for (i=0; i<n; i++)   
		{  
		//inner loop work for space      
		for (j=n-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   	
	*/
		
		// ************************pattern 9.2 n =8*******************************************
		/*	
			int i, j, n = 8;       
			//Outer loop work for rows  
			for (i=0; i<n; i++)   
			{  
			//inner loop work for space      
			for (j=n-i; j>1; j--)   
			{  
			//prints space between two stars  
			System.out.print(" ");   
			}   
			//inner loop for columns  
			for (j=0; j<=i; j++ )   
			{   
			//prints star      
			System.out.print("* ");   
			}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
			}   	
		*/
		
		// ************************pattern 10.1 n =5*******************************************
		/*
		int n=5;  
		for (int i= 0; i<= n-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=n-1-i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		}  
		*/
		// ************************pattern 10.2 n =8*******************************************
				/*
				int n=8;  
				for (int i= 0; i<= n-1; i++)  
				{  
				for (int j=0; j<=i; j++)  
				{  
				System.out.print(" ");  
				}  
				for (int k=0; k<=n-1-i; k++)  
				{  
				System.out.print("*" + " ");  
				}  
				System.out.println();  
				}  
				*/
		// ************************pattern 11.1 n =5*******************************************
		/*
		int i,j,n=5;
		for (i= 0; i<= n-1; i++)  
		{  
		for (j=0; j<=i; j++)   
		{  
		System.out.print("*"+ " ");  
		}   
		System.out.println("");   
		}   
		for (i=n-1; i>=0; i--)  
		{  
		for(j=0; j <= i-1;j++)  
		{  
		System.out.print("*"+ " ");  
		}  
		System.out.println("");  
		}  
		*/
		// ************************pattern 11.2 n =8*******************************************
				/*
				int i,j,n=8;
				for (i= 0; i<= n-1; i++)  
				{  
				for (j=0; j<=i; j++)   
				{  
				System.out.print("*"+ " ");  
				}   
				System.out.println("");   
				}   
				for (i=n-1; i>=0; i--)  
				{  
				for(j=0; j <= i-1;j++)  
				{  
				System.out.print("*"+ " ");  
				}  
				System.out.println("");  
				}  
				*/
		// ************************pattern 12.1 n =5*******************************************
	/*
		int i,j,k,n=5;
		for (i= 1; i<= n ; i++)  
		{  
		for (j=i; j <n ;j++)              
		{  
		System.out.print(" ");  
		}  
		for (k=1; k<=i;k++)   
		{  
		System.out.print("*");   
		}   
		System.out.println("");   
		}   
		for (i=n; i>=1; i--)  
		{  
		for(j=i; j<=n;j++)  
		{  
		System.out.print(" ");  
		}  
		for(k=1; k<i ;k++)   
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		*/
		// ************************pattern 12.2 n =8*******************************************
		/*
			int i,j,k,n=8;
			for (i= 1; i<= n ; i++)  
			{  
			for (j=i; j <n ;j++)              
			{  
			System.out.print(" ");  
			}  
			for (k=1; k<=i;k++)   
			{  
			System.out.print("*");   
			}   
			System.out.println("");   
			}   
			for (i=n; i>=1; i--)  
			{  
			for(j=i; j<=n;j++)  
			{  
			System.out.print(" ");  
			}  
			for(k=1; k<i ;k++)   
			{  
			System.out.print("*");  
			}  
			System.out.println("");  
			}  
			*/
		
		// ************************pattern 13.1 n =5*******************************************
		/*
		int i,j,n=5;
		int space = n - 1;
		for (j = 1; j<= n; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= n - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (n - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		*/
		
		// ************************pattern 13.2 n =8*******************************************
				/*
				int i,j,n=8;
				int space = n - 1;
				for (j = 1; j<= n; j++)  
				{  
				for (i = 1; i<= space; i++)  
				{  
				System.out.print(" ");  
				}  
				space--;  
				for (i = 1; i <= 2 * j - 1; i++)  
				{  
				System.out.print("*");  
				}  
				System.out.println("");  
				}  
				space = 1;  
				for (j = 1; j<= n - 1; j++)  
				{  
				for (i = 1; i<= space; i++)  
				{  
				System.out.print(" ");  
				}  
				space++;  
				for (i = 1; i<= 2 * (n - j) - 1; i++)  
				{  
				System.out.print("*");  
				}  
				System.out.println("");  
				}  
				*/
		// ************************pattern 14.1 n =5*******************************************
		/*
		int n = 5;
		
		for (int i = 1; i <= (n * 2 + 1); i++)
		   {
		       for (int j = 0; j <= (n * 2 + 1); j++)
		       {
		           if (i == j) 
		           {
		               System.out.print("*");
		           }
		           else if (i + j == (n * 2 + 2))
		           {
		               System.out.print("*");
		           }
		           else
		           {
		               System.out.print(" ");
		           }
		       }
		       System.out.println("");
		   }
	*/
		// ************************pattern 14.2 n =8*******************************************
				/*
				int n = 8;
				
				for (int i = 1; i <= (n * 2 + 1); i++)
				   {
				       for (int j = 0; j <= (n * 2 + 1); j++)
				       {
				           if (i == j) 
				           {
				               System.out.print("*");
				           }
				           else if (i + j == (n * 2 + 2))
				           {
				               System.out.print("*");
				           }
				           else
				           {
				               System.out.print(" ");
				           }
				       }
				       System.out.println("");
				   }
			*/
		
		
		
		// ************************pattern 15.1 n =5*******************************************
		/*
		int n = 5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==1) ||(i==n))
				{
					System.out.print("*");
				}
				else if((j==1)||(j==n))
				{
					System.out.print("*");
				}
				else if(j==i)
				{
					System.out.print("*");
				}
				else if((j+i)==(n+1))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		*/
		// ************************pattern 15.2 n =8*******************************************
				/*
				int n = 8;
				for(int i=1;i<=n;i++)
				{
					for(int j=1;j<=n;j++)
					{
						if((i==1) ||(i==n))
						{
							System.out.print("*");
						}
						else if((j==1)||(j==n))
						{
							System.out.print("*");
						}
						else if(j==i)
						{
							System.out.print("*");
						}
						else if((j+i)==(n+1))
						{
							System.out.print("*");
						}
						else 
						{
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				
				*/
	
	
		// ************************pattern 17.1 n =5*******************************************
		/*	
	
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				
				if(j>=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			for(int k=2;k<=5;k++)
			{
				if(k<=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				
				if(j>=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			for(int k=2;k<=5;k++)
			{
				if(k<=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}
*/
		// ************************pattern 17.2 n =7*******************************************
		/*	
	
		for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=1;j--)
			{
				
				if(j>=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			for(int k=2;k<=7;k++)
			{
				if(k<=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}
		for(int i=2;i<=7;i++)
		{
			for(int j=7;j>=1;j--)
			{
				
				if(j>=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(i);
				}
			}
			for(int k=2;k<=7;k++)
			{
				if(k<=i)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}
*/
		// ************************pattern 18.1 n =5*******************************************	
		/*
		for (int i = 1; i <= 4; i++)  
		{  
		int n = 5;  
		for (int j = 1; j<= n - i; j++)   
		{   
		System.out.print(" ");   
		}   
		for (int k = i; k >= 1; k--)  
		{  
		System.out.print(k);  
		}  
		for (int l = 2; l <= i; l++)   
		{  
		System.out.print(l);   
		}   
		System.out.println();   
		}   
		for (int i = 3; i >= 1; i--)  
		{  
		int n = 7;  
		for (int j = 0; j<= n - i; j++)   
		{  
		System.out.print(" ");   
		}   
		for (int k = i; k >= 1; k--)  
		{  
		System.out.print(k);  
		}  
		for (int l = 2; l <= i; l++)  
		{  
		System.out.print(l);  
		}  
		System.out.println();  
		}  
	*/
		
		
		// ************************pattern 18.2 n =8*******************************************
				/*		
				int var = 1;
				int n = 8;
				for(int i = 1; i <= 2 * n - 1; i++) {
					if(i > n) {
						for(int j = 1; j <= i - n; j++) {
							System.out.print(" ");
						}
						for(int j = 2 * (i-2*var) -1; j >= 1; j--) {
							if(j % 2 == 1)
								System.out.print(i-2*var);
							else
							 System.out.print("*");
						}
						var++;
					}
					else {
						for(int j = n; j > i; j--) {
							System.out.print(" ");
						}
						for(int j = 1; j <= 2 * i - 1; j++) {
							if(j % 2 == 1) {
								System.out.print(i);
							}
							else
								System.out.print("*");
						}
					}
					System.out.println();
				}
				System.out.println();
			*/
		
		// ************************pattern 19 *******************************************
		/*
		for(int i=1; i<=2; i++)
	     {
	         for(int k=1; k<=2-i; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=2*i; j++)
	         {
	             System.out.print("*");
	         } 
	         for(int k=1; k<=2*(2-i+1)-1; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=2*i; j++)
	         {
	             System.out.print("*");
	         } 
	         System.out.println();
	     }
	     for(int i=1; i<=5; i++)
	     {
	         for(int k=1; k<=i-1; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=2*(5-i+1)-1; j++)
	         {
	             System.out.print("*");
	         } 
	         System.out.println();
	     }
	   */
		
		// ************************pattern 20 *******************************************
		/*
		int n = 5;
		int size = n / 2 + 1; // number / 2 == 3 -> 3 + 1 = 4
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i <= size && j == 1) {
					System.out.print("*");
				}
				else if(i == size || j == size) {
					System.out.print("*");
				}
				else if(i == 1 && j > n/2) {
					System.out.print("*");
				}
				else if(i > n/2 && j == n) {
					System.out.print("*");
				}
				else if(i == n && j <= n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	*/

	
		// ************************series 21.1 n=5 *******************************************
		/*
		int n = 5;
		int var = 1;
		for(int i = 1; i <= n; i++) {
			System.out.print(var + " ");
			var += 3;	
		}
		System.out.println();
		*/
		
		// ************************series 21.2 n=8 *******************************************
		/*int n = 8;
		int var = 1;
		for(int i = 1; i <= n; i++) {
			System.out.print(var + " ");
			var += 3;	
		}
		System.out.println();
		*/
		
		// ************************series 22.1 n=5 *******************************************
		/*int n = 5;
		int var = 1;
		for(int i = 1; i <= n; i++) {
			System.out.print(var+" ");
			var += 2;
		}
		System.out.println();*/
	
		// ************************series 22.2 n=8 *******************************************
				/*int n = 8;
				int var = 1;
				for(int i = 1; i <= n; i++) {
					System.out.print(var+" ");
					var += 2;
				}
				System.out.println();*/
		
		// ************************series 23.1 n=5 *******************************************
		/*
		int n = 5;
		int count = 0;
		int odd = 1;
		int even = 2;
		int i = 1;
		while(true) {
			if(count == n) break;
			if(i % 2 == 1) {
				System.out.print(odd+" ");
				count++;
				odd += 3;
			}
			else {
				System.out.print(even+" ");
				count++;
				even += 2;
			}
			i++;
		}
		System.out.println();
	*/
		// ************************series 23.2 n=12 *******************************************
				/*
				int n = 12;
				int count = 0;
				int odd = 1;
				int even = 2;
				int i = 1;
				while(true) {
					if(count == n) break;
					if(i % 2 == 1) {
						System.out.print(odd+" ");
						count++;
						odd += 3;
					}
					else {
						System.out.print(even+" ");
						count++;
						even += 2;
					}
					i++;
				}
				System.out.println();
			*/
		// ************************series 24.1 n=7 *******************************************
		/*
		int n = 7;
		int first = 1;
		int second = 1;
		System.out.print(first+" "+second+" ");
		for(int i = 1; i <= n-2; i++) {
			int sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum+" ");
		}
		System.out.println();
		*/
		
		// ************************series 24.2 n=12 *******************************************
				/*
				int n = 12;
				int first = 1;
				int second = 1;
				System.out.print(first+" "+second+" ");
				for(int i = 1; i <= n-2; i++) {
					int sum = first + second;
					first = second;
					second = sum;
					System.out.print(sum+" ");
				}
				System.out.println();
				*/
		
		// ************************series 25.1 n=6 *******************************************
		/*
		int n = 6;
		int count = 0;
		int even = 2;
		int odd = 3;
		for(int i = 1;; i++) {
			if(count == n) break;
			if(i % 2 == 1) {
				System.out.print(even+" ");
				even *= 2;
			}
			else {
				System.out.print(odd+" ");
				odd *= 3;
			}
			count++;
		}
		System.out.println();
		*/
		// ************************series 25.2 n=10 *******************************************
				/*
				int n = 6;
				int count = 0;
				int even = 2;
				int odd = 3;
				for(int i = 1;; i++) {
					if(count == n) break;
					if(i % 2 == 1) {
						System.out.print(even+" ");
						even *= 2;
					}
					else {
						System.out.print(odd+" ");
						odd *= 3;
					}
					count++;
				}
				System.out.println();
				*/
		// ************************series 26.1 n=5 *******************************************
		/*
		
		int n =5;
int count = 0;
		
		int increment = 2;
		for(int i = 1;;) {
			System.out.print(i+" ");
			if(count == n) break;
			i += increment;
			increment++;
			count++;
		}
		System.out.println();
		*/
		// ************************series 26.2 n=10 *******************************************
				/*
				
				int n =10;
		int count = 0;
				
				int increment = 2;
				for(int i = 1;;) {
					System.out.print(i+" ");
					if(count == n) break;
					i += increment;
					increment++;
					count++;
				}
				System.out.println();
				*/
		// ************************series 27.1 n=5 *******************************************
		/*
		int n =5;
		int var = 5;
		for(int i = 1; i <= n; i++) {
			System.out.print(var+" ");
			var *= 2;
		}
		System.out.println();
		*/
		// ************************series 27.2 n=8 *******************************************
				/*
				int n =8;
				int var = 5;
				for(int i = 1; i <= n; i++) {
					System.out.print(var+" ");
					var *= 2;
				}
				System.out.println();
				*/
		
		// ************************series 28 n = 6 *******************************************
		/*
		int n =6;
		for(int i = 1; i <= n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		*/
		
		// ************************series 29 n = 5 *******************************************
		/*
		int n =5;
		int var = 1;
		for(int i = 1; i <= n; i++) {
			System.out.print(var+" ");
			var *= i+1;
		}
		System.out.println();
		*/
		// ************************series 29 n = 8 *******************************************
				/*
				int n =8;
				int var = 1;
				for(int i = 1; i <= n; i++) {
					System.out.print(var+" ");
					var *= i+1;
				}
				System.out.println();
				*/
		// ************************series 30 n = 5 *******************************************
		/*
		int n = 5;
		for(int i = 1; i <= n; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
		*/
		// ************************series 30 n = 8 *******************************************
				/*
		int n = 8;
		for(int i = 1; i <= n; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
		*/
	}
	
}




