package janani;
import java.util.*;

public class Lexography {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String str1 = sc.nextLine();
//		String str2 = str.toLowerCase();
//		String str3 = str1.toUpperCase();
//		
//		
//		System.out.println(str.compareTo(str1));
//		
		String email = sc.nextLine();
		System.out.println(email);
		if(email.contains("com") || email.contains("in") || email.contains("net") || email.contains("org"))
		{
			System.out.println("email valid");
		}
		else
		{
			System.out.println("not valid");
		}	
	}

}
