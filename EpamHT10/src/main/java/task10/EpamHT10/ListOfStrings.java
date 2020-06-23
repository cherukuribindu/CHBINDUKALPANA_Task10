package task10.EpamHT10;
import java.util.*;
import java.util.stream.Collectors;
public class ListOfStrings 
{
	private static Scanner in;
	public static List<String> stringssearch(List<String> str_list)
	{
		return str_list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
	}
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		System.out.println("Enter number of Strings want to insert in List:");
		int n=in.nextInt();
		List<String> str_list=new ArrayList<String>();
		String str;
		for(int i=0;i<n;i++)
		{
			str=in.next();
			str_list.add(str);
		}
		System.out.println("List after Inserting the strings:");
		System.out.println(str_list);
		System.out.println("Resultant List of Strings:");
		System.out.println(stringssearch(str_list));
	}

}
