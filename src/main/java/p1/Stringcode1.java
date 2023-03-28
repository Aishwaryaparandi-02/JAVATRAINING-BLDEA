package p1;
import java.util.Scanner;
public class Stringcode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the strin-1:");
String str1=sc.nextLine();
System.out.println("Enter the string-2:");
String str2=sc.nextLine();
if(str1.equalsIgnoreCase(str2)==true) {
	System.out.println("String are equal:");

}
else {
	System.out.println("Strings are not equal:");
}
}
}