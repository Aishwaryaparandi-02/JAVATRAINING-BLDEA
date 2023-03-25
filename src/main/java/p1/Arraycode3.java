package p1;
import java.util.Scanner;
public class Arraycode3 {
	public static int LinearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return (i+1);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array element to be searched:");
int key=sc.nextInt();
int arr[]= {10,20,35,40,78,67,28,56,90,8,7,5,1};
int res=LinearSearch(arr,key);
if(res>0)
{
	System.out.println("Element Found in the position: "+ (res));
}
else {
	System.out.println("Element not found:");
}
}
}
