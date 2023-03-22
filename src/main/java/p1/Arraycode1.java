package p1;
import java.util.Scanner;
public class Arraycode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the count of students:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the marks of student number"+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("The marks of studens are:"+arr[i]);
		}
	}

}
