package com.sample;

import java.lang.reflect.Array;

public class Bubble {
	
	public void getSortedArray(int[] arry)
	{
		for(int i =0;i<arry.length;i++)
		{
			for (int j=0;j<arry.length-1;j++)
			{
				if(arry[j]> arry[j+1])
				{
					int temp =arry[j+1];
					arry[j+1]=arry[j];
					arry[j]=temp;
					
				}
			}
		}
	}
	public void display(int[] arry)
	{
		for(int i =0;i<arry.length;i++)
		{
			System.out.print(arry[i] +",");
		}
	}
	
	

}

 class test {
	 
	 public static boolean check()
	 {
		 return (3.01 == 3*0.01 ? true :false);
	 }
 }

 class Program
{

	 public static void main(String args[])
		{
			System.out.println(test.check());
			
			int[] arry = {12,78,36,5,96,23,0,89,123};
			Bubble b =new Bubble();
			b.getSortedArray(arry);
			b.display(arry);
			
			
		}
}




