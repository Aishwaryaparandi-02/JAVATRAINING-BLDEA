package p1;
import java.util.Scanner;
public class Code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the age");
int age=sc.nextInt();
if(age<18) {
	System.out.println("you are still a minor");
	
}
else if(age>65) {
	System.out.println("you are not senior citizen.Stop over exceptioin");
}
else {
	System.out.println("Congratulation you are in the list of most eligible growm");
}
	}

}
