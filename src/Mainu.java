import java.util.Scanner;
public class Mainu {
    static String user = "Ajay";
    static int user_pin = 5899;
    static float balance = 10000;
    public static void main(String args[]) {

        Ent_Details ed = new Ent_Details();
        ed.detail();
        if(Ent_Details.e == user_pin) {
            After_Pin ap = new After_Pin();
            ap.afterpin();
       }
    }
}
