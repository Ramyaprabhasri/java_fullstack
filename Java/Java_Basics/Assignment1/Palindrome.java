import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=n;
        int rem=0;
        while(n>0){
            rem=(rem*10)+n%10;
            n=n/10;
        }
        if(result==rem)
        System.out.print("Palindrome");
        else
        System.out.print("Not a Palindrome");
        sc.close();
    }
}
