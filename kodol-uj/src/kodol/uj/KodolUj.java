/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodol.uj;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author gvajd
 */
public class KodolUj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //WINDOWS-1252 encoding addad, because Scenner uses operating system character coding, SzeG
        Scanner sc = new Scanner(System.in, "Windows-1252");
        String nyilt;
        System.out.println("Kérem adjon meg egy maximum 255 karakter hosszúságú szöveget!");

        //nyilt="kérem dg";
        nyilt = sc.nextLine();
        //SZÓKÖZELTÁVOLÍTÓ
        nyilt = nyilt.trim();

        //NAGYBETŰTELENÍTŐ
        nyilt = nyilt.toUpperCase();
        System.out.println(nyilt);
// Creating a Set of Characters; adding characters from A to Z to the set. SzeG
        Set jobetuk = new HashSet();
        for (char i = 'A'; i <= 'Z'; i++) {
            jobetuk.add(i);
        }
        System.out.println(jobetuk.contains('A') ); //returns true, becuse set contains character A
        System.out.println(jobetuk.contains('j'));//returns false, becouse set does'nt contain xharacter j
        //  List<Character>lista=new ArrayList<>();
        //MEGINT UGYANAZ A PROBLÉMA, NEM TESZI A DOLGÁT, van szóköz, van kisbetű, ellenben az ékezetes betűk felismerhetetlenné válnak.
        /*for (int i = 0; i < 255; i++) {
            if (nyilt.charAt(i)) {
                
            }
        }*/
    }

}
