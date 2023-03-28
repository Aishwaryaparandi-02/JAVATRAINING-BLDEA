package p1;
import java.util.Scanner;
public class Strincode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str1=sc.next();
String str2=sc.next();
for(int i=str1.length()-1;i>=0;i--) {
	str2=str2+str1.charAt(1);
	
}
if(str1.equals(str2)==true) {
	System.out.println("Palindrome:");
}
else {
	System.out.println("not palindrome:");
}
	}

}
