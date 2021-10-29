// Würfel in Java
// 29.10.21

import java.util.*;

public class Würfel
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int zufallszahl, n, durchgänge, sechs, eins;
        
        n = 0;
        sechs = 0;
        eins = 0;
        zufallszahl = 0;
        
        System.out.println("***Willkommen zum Würfelspiel***");
        System.out.print("Bitte geben Sie eine Grenze ein, die über 50 ist: ");
        durchgänge = in.nextInt();
        
        while(durchgänge < 50)
        {
            System.out.print("Bitte geben Sie eine Grenze ein, die über 50 ist: ");
            durchgänge = in.nextInt();
        }
        while(n < durchgänge)
        {
            n++;
            zufallszahl = (int) (Math.random()*6+1);
            if(zufallszahl == 6)
            {
                sechs++;
            }
            if(zufallszahl == 1)
            {
                eins++;
            }
        }
        
        System.out.println("Nach "+n+" Würfelrunden wurde "+sechs+" mal die Sechs und "+eins+" mal die Eins gewürfelt");
        
        if(sechs > 10)
        {
            System.out.println("Du hast über 10 mal die Sechs gewürfelt. Gratulation!!!");
        }
        else
        {
            System.out.println("Du hast leider nur "+sechs+" mal die Sechs gewürfelt. Leider kein Gewinn!");
        }
    }
}