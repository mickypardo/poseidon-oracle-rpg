package org.mpardo.apps;

import java.util.Scanner;

import org.mpardo.apps.initializators.InitDates;
import org.mpardo.apps.model.Odds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new InitDates();
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;

        while(seguir) {

            System.out.println("Escribe 'roll': ");
            String continuar = sc.next().toUpperCase();
            if (continuar.equals("ROLL")) {
                String response = InitDates.resultFateCheck(5, Odds.LIKELY);
                System.out.println(response);
            } else {
                seguir = false;
            }
        }
    }
}
