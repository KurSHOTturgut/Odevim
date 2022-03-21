import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num, sum = 0;
        
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            
            if (num%4 == 0) {
                sum +=num;
            }
        } while(num%2 == 0);
        
        
        System.out.print("Sum: " + sum);
    }
}