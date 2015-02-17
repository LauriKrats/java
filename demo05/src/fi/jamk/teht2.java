/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author H9352
 */
public class teht2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String txt = null;
        
        FileWriter fw;
        BufferedWriter bw; // kirjoittamista varten
        System.out.println("Lopeta ohjelma kirjoittamalla: LOPETUS");
        try {
            fw = new FileWriter("data.txt"); // avataan tiedosto 
            bw = new BufferedWriter(fw);
            while (!"LOPETUS".equals(txt)) {
                System.out.println("Anna merkkijono:");
                txt = scanner.nextLine();
                bw.write(txt);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            System.out.println("Tapahtui poikkeus");
        } 
    }
}
