import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res=num;
        int sum=0;
        int digit=Integer.toString(num).length();
        while(num>0){
           int rem=num%10;
           sum+=Math.pow(rem,digit);
           num=num/10;
        }
        if(res==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.print("Not an Armstrong");
        }

        sc.close();
    }
}
