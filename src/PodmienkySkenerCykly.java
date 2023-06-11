import java.util.Scanner;

public class PodmienkySkenerCykly {
    public static void main(String[] args) {
          Scanner cas = new Scanner(System.in); //Vytvorit skener
   /*     int time;                             //premenna vystupu skenera

        System.out.println("kolko je hodin? ");
        time = cas.nextInt();                   //vystup skenera
//        nextBoolean()	Reads a boolean value from the user
//        nextByte()	Reads a byte value from the user
//        nextDouble()	Reads a double value from the user
//        nextFloat()	Reads a float value from the user
//        nextInt()	Reads a int value from the user
//        nextLine()	Reads a String value from the user
//        nextLong()	Reads a long value from the user
//        nextShort()	Reads a short value from the user

        if (time < 10) {                    //ak podmienka plativykonaju sa operacie v ramci {}
            System.out.println("Je rano");
            
        } else if (time < 18) {             //ak podmienka neplati vykonaju sa tieto operacie
            System.out.println("Je den");
            
        }else {
            System.out.println("Je noc");
        }
        cas.close();*/


        int den;
        System.out.print("Aky je den? (zadaj cislo dna) : ");
        den = cas.nextInt();
        switch (den) {
            case 1:
                System.out.println("pondelok");
                break;                          //break ukonci cyklus ak je podmienka splnena
            case 2:
                System.out.println("utorok");
                break;
            case 3:
                System.out.println("streda");
                break;
            case 4:
                System.out.println("stvrtok");
                break;
            case 5:
                System.out.println("piatok");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("nedela");
                break;
            default:                          //default: ukonci cyklus ak nenajde zhodu
                System.out.println("cislo nie je dnom v tyzdni!");

        }
    }
}
