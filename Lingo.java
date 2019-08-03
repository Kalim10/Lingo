package VoorbereidingHerexamen.h3.Lingo;

import java.util.Scanner;

public class Lingo {
    final static String STOPPEN = "STOPPEN";
    Scanner sc = new Scanner(System.in);
    String invoer = " ";
    String woord = "pizza";


    public void spelen() {
        // poging();
        pogingDoorEenLoop();

    }


    public void poging() {
        for (int x = 0; x < woord.length(); x++) {
            if (invoer.charAt(x) == woord.charAt(x)) {
                System.out.print("1");
                if(invoer.charAt(0) == woord.charAt(x))
                    System.out.print("2");
                else System.out.print("0");
            }
        }
//        for (int y = 0; y < woord.length(); y++) {
//            if (invoer.charAt(0) == woord.charAt(y)) {
//                System.out.print("2");
//            }
//        }
//        for (int z = 0; z < woord.length(); z++) {
//            if (invoer.charAt(z) != invoer.charAt(z)) {
//                System.out.print("3");
//            }
//        }
    }
//                //for (int  y = 0; y<woord.length(); y++)
//                if (invoer.charAt(0) == woord.charAt(x)) {
//                    System.out.print("2");
//                  //  for (int z = 0; z<woord.length(); z++) {
//                        if (woord.charAt(x) == invoer.charAt(x)) {
//                            continue;
//                        }
//                        System.out.print("0");
//                    }
//                }
//            }
//        }
//
//
//        if (invoer.charAt(0) == woord.charAt(0)) {
//            System.out.print("1");
//
//        } else {
//            System.out.print("0");
//        }
//        if (invoer.charAt(1) == woord.charAt(1)) {
//            System.out.print("1");
//        } else {
//            System.out.print("0");
//        }
//        if (invoer.charAt(2) == woord.charAt(2)) {
//            System.out.print("1");
//        } else {
//            System.out.print("0");
//        }
//        if (invoer.charAt(3) == woord.charAt(3)) {
//            System.out.print("1");
//        } else {
//            System.out.print("0");
//        }
//        if (invoer.charAt(4) == woord.charAt(4)) {
//            System.out.print("1");
//        } else {
//            System.out.print("0");
//        }
 //   }

    public void pogingDoorEenLoop() {
        int aantalPogingen = 0;
        int maxPogingen = 5;
        boolean nogEenKeerRaden = false;
        while (!invoer.equals(woord)) {
            System.out.println("Typ je 5 letter woord");
            invoer = sc.nextLine();
            poging();
            System.out.println();
            aantalPogingen++;
            // if(aantalPogingen>maxPogingen)
        }
        System.out.println("Gefeliciteerd!");
    }
}