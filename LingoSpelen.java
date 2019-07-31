package VoorbereidingHerexamen.h3.Lingo;

public class LingoSpelen {
    public static void main(String[] args) {
        System.out.println("Welkom bij lingo typ STOPPEN om te stoppen");
        System.out.println("1 = letter op goede plaats");
        System.out.println("2 = letter zit er in maar niet op de goede plaats");
        System.out.println("0 = letter zit er niet in");

        Lingo lingo = new Lingo();

        lingo.spelen();
    }
}
