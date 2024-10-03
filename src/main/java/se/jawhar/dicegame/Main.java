package se.jawhar.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);       // skapa Scanner för att läsa in användardata
        Random random = new Random();              // skapa Random för att generera slumptal
        Player spelare = new Player("Spelare1: ");
        Player spelare2 = new Player("Spelare2: ");
        showWelcomeMessage();
        System.out.println("Var vänlig och knappa in ditt namn spelare 1: ");
        String Player1 = sc.nextLine();
        System.out.println("Välkommen " + spelare.getplayerName() + Player1);
        System.out.println();

        System.out.println("Spelare2: var vänlig och knappa in ditt namn");
        String Player2 = sc.nextLine();
        System.out.println("Välkommen " + spelare2.getplayerName() + Player2 + "\n");
        System.out.println("Spelare1: " + Player1 + " Du slår tärningarna först!");


        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int roll3 = random.nextInt(6) + 1;
        int roll4 = random.nextInt(6) + 1;
        int summa = roll1 + roll2;
        int summa2 = roll3 + roll4;


        System.out.println(Player1 + ": Kastade: " + roll1);            //resultat för tärningskasten
        System.out.println(Player1 + ": Kastade " + roll2);
        System.out.println(Player1 + ": Resultat " + summa + "\n");

        System.out.println("Spelare2: " + Player2 + " nu är det din tur att slå tärningarna!");

        System.out.println(Player2 + ": kastade: " + roll3);
        System.out.println(Player2 + ": kastade: " + roll4);           //resultat för tärningskasten
        System.out.println(Player2 + ": resultat " + summa2);


        if (summa > summa2) {
            System.out.println();
            System.out.println(Player1 + ": Grattis du har vunnit!");
        } else if (summa2 > summa) {
            System.out.println();
            System.out.println(Player2 + ": Grattis du har vunnit!");
        } else if (summa == summa2) {
            System.out.println();
            System.out.println("Det blev oavgjort!");

        }


    }

    private static void showWelcomeMessage() {
        System.out.println("*****************************");
        System.out.println("Välkommen till tärningspelet!");
        System.out.println("*****************************");
        System.out.println();
        System.out.println("Spelet går ut på att varje spelare slår 2 tärningar var,\npersonen med högst totala siffra vinner, Lycka till!");
        System.out.println();
    }
}


