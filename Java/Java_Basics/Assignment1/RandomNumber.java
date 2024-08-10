import java.util.Random;
public class RandomNumber {
    public static void main(String args[]){
        Random rand = new Random();
        int result=rand.nextInt(1000);
        System.out.print(result);
    }
}
