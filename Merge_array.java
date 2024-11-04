import java.util.Scanner;

public class Merge_array 
{

	public static void main(String[] args) 
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the size of the element:");
			int t=0;
			int s1=sc.nextInt();
			int s2=sc.nextInt();
			
			int[] a=new int[s1];
			int[] b=new int[s2];
			int[] merged=new int [s1+s2];
			
			for(int i=0;i<s1;i++)
			{
				 a[i]=sc.nextInt()	;
				
			}
			for(int i=0;i<s2;i++)
			{
				b[i]=sc.nextInt()	;
			}
			int n=s1+s2;
			for(int i=0;i<n;i++)
			{
				if(i<s1)
				{
					merged[i]=a[i];
				}
				else
				{
					
					merged[i]=b[t++];
				}
			}
			System.out.println("the merged third array is");
		
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(merged[i]>merged[j])
					{
						int temp=merged[i];
						merged[i]=merged[j];
						merged[j]=temp;
					}
				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(merged[i]);

			}

		}

	}





