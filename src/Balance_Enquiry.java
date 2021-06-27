import java.util.Scanner;
public class Balance_Enquiry {
    void bal(){
    System.out.println("Balance is"+ Mainu.balance);
    System.out.println("Do you want to print statement  (Y) or (N)");
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    while(!a.equals( "y") && !a.equals( "n") && !a.equals( "Y") && !a.equals( "N")){
        System.out.println("yes or no");
        a = sc.nextLine();
    }
    switch(a) {
        case "y":
            System.out.println("printing");
            break;
        case "n":
            System.out.println("thank you");
            break;
        case "Y":
            System.out.println("printed");
            break;
        case "N":
            System.out.println("thank you");
            break;
    }
    }
}
