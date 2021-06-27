import java.util.Scanner;
import java.math.BigInteger;
public class Cash_Withdrawl {
    void withdraw() {
        System.out.println("Current(C) or Savings(S)");
        Scanner s = new Scanner(System.in);
        String z = s.nextLine();
        while(!z.equals( "C") && !z.equals( "S") && !z.equals("c") && !z.equals("s")){
            System.out.println("Enter C for current and Enter S for savings");
            z= s.nextLine();
        }
        System.out.println("Enter amount");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        while(a % 100 !=0 && a<=Mainu.balance){
            System.out.println("Enter a number divisible in 100");
            a = sc.nextFloat();
        }
        if (a <= Mainu.balance) {
            System.out.println("Success");
            Mainu.balance= Mainu.balance - a;

        } else
            System.out.println("insufficient");

    }
}
