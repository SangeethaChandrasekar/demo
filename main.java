import java.util.Scanner;
public class Main{
	static boolean isPalindrome(String str)
	{
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;

			
			i++;
			j--;
		}

		
		return true;
	}
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a word: ");
	String str = scanner.nextLine();

		if (isPalindrome(str.toUpperCase()))
		
			
			System.out.print(str + " is a Pallindrome");
		else
			
			System.out.print(str + " is not a Pallindrome");
	}
}