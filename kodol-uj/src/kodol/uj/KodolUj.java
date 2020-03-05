/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodol.uj;

import java.util.Scanner;

/**
 *
 * @author gvajd
 */
public class KodolUj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nyilt;
        System.out.println("Kérem adjon meg egy maximum 255 karakter hosszúságú szöveget!");
        nyilt=sc.nextLine();
        //SZÓKÖZELTÁVOLÍTÓ
        nyilt.trim();
        //NAGYBETŰTELENÍTŐ
        nyilt.toUpperCase();
        System.out.println(nyilt);
        //MEGINT UGYANAZ A PROBLÉMA, NEM TESZI A DOLGÁT, van szóköz, van kisbetű, ellenben az ékezetes betűk felismerhetetlenné válnak.
        /*for (int i = 0; i < 255; i++) {
            if (nyilt.charAt(i)) {
                
            }
        }*/
      
    }
    
}
