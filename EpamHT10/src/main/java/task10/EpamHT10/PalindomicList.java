package task10.EpamHT10;
import java.util.*;
import java.util.stream.IntStream;
public class PalindomicList 
{
	private static Scanner in;
	public static List<String> palindromicsearch(List<String> str_list)
	{
		List<String> palindromestrings=new ArrayList<String>();
		for(String str:str_list)
		{
			String temp=str.replaceAll("\\s+","").toLowerCase();
			if(IntStream.range(0, temp.length() / 2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1)))
				palindromestrings.add(temp);
		}
		return palindromestrings;
	}
	public static void main(String[] args) 
	{
		in = new Scanner(System.in);
		System.out.println("Enter number of Strings want to insert in List:");
		int n=in.nextInt();
		List<String> s_list=new ArrayList<String>();
		String s;
		for(int i=0;i<n;i++)
		{
			s=in.next();
			s_list.add(s);
		}
		System.out.println("Palindromic List of Strings:");
		System.out.println(palindromicsearch(s_list));
	}

}
