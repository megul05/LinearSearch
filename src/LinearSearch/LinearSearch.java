package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
	
	public static int Search(int arr[],int size,int index)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==index)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
		}		
		int size = arr.length;
		int index = scan.nextInt();
		int result = Search(arr,size,index);
		System.out.println(result);
	}

}
