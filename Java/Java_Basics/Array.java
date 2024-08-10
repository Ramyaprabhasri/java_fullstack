import java.util.Scanner;
public class Array{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum=0;
System.out.print("Enter the size of array");
int size=sc.nextInt();
System.out.print("Enter array elements");
int arr[]=new int[size];
for(int i=0;i<size;i++){
arr[i]=sc.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<size;i++){
System.out.println(arr[i]);
sum=sum+arr[i];
}
System.out.println("Sum of all elements in array"+sum);
}
}