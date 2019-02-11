/* Zain Raza
 * A program that takes two arrays, and outputs them with switched contents.
 * Arrays may be of differing lengths.
 */
 
 import java.util.Scanner;
 
 /* Pre: two arrays initialized to a set of integers
  * Post: the two arrays are outputted, with switched contents
  */ 
 public class switchArrays
 {
 	public static int[] switchEm(int[] a, int[] b)
 	{
 		int[] c;
 		
 		if(a.length > b.length) // if the first array is longer
 		{
 		    c = new int[a.length];
 			int[] d = new int[a.length]; // making shorter array same length as the longer the same length, will be set equal to the formal param
 			for(int i = 0; i < d.length; i++)
 			{
 				d[i] = 0;
 			}
 			for(int i = 0; i < b.length; i++)
 			{
 				d[i] = b[i];
 			}
 			//d = b;
 			int i;
 			for(i = 0; i < c.length; i++)
 			{
 				c[i] = d[i];
 				d[i] = a[i];
 				a[i] = c[i];
 			}
 			return d;
 		}	
 		else // if the second array is larger 
 		{
 			c = new int[b.length];
 			int[] d = new int[b.length]; // making shorter array same length as the longer the same length, will be set equal to the formal param
 			for(int i = 0; i < d.length; i++)
 			{
 				d[i] = 0;
 			}
 			for(int i = 0; i < a.length; i++)
 			{
 				d[i] = a[i];
 			}
 			int i;
 			for(i = 0; i < c.length; i++)
 			{
 				c[i] = d[i];
 				d[i] = b[i];
 				b[i] = c[i];
 			}
 			return d;
 		}
 	}
 	/* "Main is the client" - Mr. Marques, 2019
 	 */
 	public static void main(String[] args)
 	{
 		Scanner scan = new Scanner(System.in);
 		int size1, size2;
 		int[] a1, a2;
 			System.out.print("Enter the length of the first array: ");
 			size1 = scan.nextInt();
 			a1 = new int[size1];
 			System.out.println("Enter the integers to go inside of the first array: ");
 			for(int i = 0; i < a1.length; i++)
 			{
 				a1[i] = scan.nextInt();
  			}
  			
  			System.out.println("");
  			
  			System.out.print("Enter the length of the second array: ");
 			size2 = scan.nextInt();
 			a2 = new int[size2];
 			System.out.println("Enter the integers to go inside of the second array: ");
 			for(int i = 0; i < a2.length; i++)
 			{
 				a2[i] = scan.nextInt();
  			}
  			
  			System.out.println("");
  			
  			System.out.println("Arrays have been switched. Here are the results!\n" +
  								"First Array: ");
  			if(a2.length < a1.length)
  			{
  				a2 = switchEm(a1 , a2);
  				for(int i = 0; i < size1; i++)
 				{
 					if(a1[i] != 0)
 					{
 						System.out.print(a1[i] + " ");
 					}
  				}
  				System.out.println("");
  				
  				System.out.println("Second Array: ");
  				for(int i = 0; i < a2.length; i++)
 				{
 					System.out.print(a2[i] + " ");
  				}
  			System.out.println("");
  			}
  			else if(a2.length > a1.length)
  			{
  				a1 =  switchEm(a1 , a2);
  				for(int i = 0; i < a1.length; i++)
 				{
 					System.out.print(a1[i] + " ");
  				}
  				System.out.println("");
  				
  				System.out.println("Second Array: ");
  				for(int i = 0; i < size2; i++)
 				{
 					if(a2[i] != 0)
 					{
 						System.out.print(a2[i] + " ");
 					}
  				}
  			System.out.println("");
  			}
  			else
  			{
  				switchEm(a1 , a2);
  				for(int i = 0; i < size1; i++)
 				{
 					System.out.print(a1[i] + " ");
  				}
  				System.out.println("");
  				
  				System.out.println("Second Array: ");
  				for(int i = 0; i < a2.length; i++)
 				{
 					System.out.print(a2[i] + " ");
  				}
  			System.out.println("");
  			}					
 	}
 } 