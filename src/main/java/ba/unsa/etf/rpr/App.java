package ba.unsa.etf.rpr;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Imenik imenik = new Imenik();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Unesite ime osobe ili ispisi za kraj: ");
            String line = scanner.nextLine();
            if ("ispisi".equalsIgnoreCase(line.trim())) {
                System.out.println(imenik.ispisiSve());
            }
            String ime = new String(line);
            System.out.println("Unesite drzavu: ");
            line = scanner.nextLine();

            String drz = new String(line);


            System.out.println("Unesite broj: ");
            line = scanner.nextLine();
            String broj = new String(line);
            MedunarodniBroj f = new MedunarodniBroj(drz,broj);
            imenik.dodaj(ime,f);


        }
    }

    }

