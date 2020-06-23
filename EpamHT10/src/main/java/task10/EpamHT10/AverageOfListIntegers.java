package task10.EpamHT10;
import java.util.*;
public class AverageOfListIntegers 
{
	private static Scanner in;
	public static double AvgList(List<Integer> array_list)
	{
		return array_list.stream().mapToInt(ele -> ele).average().getAsDouble();
	}
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		System.out.println("Enter the number of Integers to insert in the List:");
		int n=in.nextInt(),x;
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			x=in.nextInt();
			arr.add(x);
		}
		System.out.println("Stream of List Integers:");
		System.out.print(arr);
		System.out.println();
		System.out.println("Average of the Integers Stream is: "+AvgList(arr));
	}
}
