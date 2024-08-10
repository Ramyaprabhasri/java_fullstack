import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        sc.close();
        boolean flag = true;
        if(n==0||n==1){
            flag=false;
        }
        else if(n>1){
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    flag=false;
                }
            }
        }
        if(flag){
            System.out.print("Prime number");
        }
        else{
            System.out.print("Not a prime number");
        }
    }
}