import java.util.Scanner;
public class After_Pin {
    void afterpin() {
        System.out.println("Enter 1 for withdrawl");
        System.out.println("Enter 2 for enquiry");
        System.out.println("Enter 3 for transactions");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 1 && a != 2 && a != 3) {
            System.out.println("Enter between 1 and 3");
            a = sc.nextInt();
        }
        switch (a) {
            case 1:
                System.out.println("for withdrawl");
                Cash_Withdrawl cw = new Cash_Withdrawl();
                cw.withdraw();
                break;
            case 2:
                System.out.println("Enquiry");
                Balance_Enquiry be = new Balance_Enquiry();
                be.bal();
                break;
            case 3:
                System.out.println("transactions");
                Recent_Transactions rt = new Recent_Transactions();
                rt.rec();

                break;
            default:
                System.out.println("select between 1 and 3");
        }
        System.out.println("anything else?");
        System.out.println("Press any key for yes");
        System.out.println("Enter N for no ");

        Scanner x = new Scanner(System.in);
        String v = x.nextLine();
        if (v.equals("n") || v.equals("N")) {
            System.out.println("Thank you");
        } else {
            afterpin();


        }
    }
}
