import java.util.Scanner;
public class Ent_Details {
    static int e;

    public void detail() {
        System.out.println("Enter card number");
        int d;
        Scanner sc = new Scanner(System.in);
       d = sc.nextInt();
       String s = Integer.toString(d);
        while (s.length() != 6) {
            System.out.println("Enter correct number");
            d = sc.nextInt();
            s = Integer.toString(d);

        }

                System.out.println("Enter PIN");
                e = sc.nextInt();

                String a = Integer.toString(e);
                if(a.length() == 4  && Mainu.user_pin == e){

                    System.out.println("welcome ajay");
                }
                else{
                    System.out.println("session terminated");
                }


        }
    }

