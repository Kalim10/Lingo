package VoorbereidingHerexamen.h3.Lingo;

import java.util.Scanner;

public class Lingo {
    final static String STOPPEN = "STOPPEN";
    Scanner sc = new Scanner(System.in);
    String invoer = sc.next();
    String woord = "pizza";


    public void spelen() {
        poging();

    }

    public void poging() {
        if (invoer.charAt(0) == woord.charAt(0)) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }if(invoer.charAt(1) == woord.charAt(1)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }if(invoer.charAt(2) == woord.charAt(2)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }if(invoer.charAt(3)==woord.charAt(3)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }if(invoer.charAt(4) == woord.charAt(4)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}
