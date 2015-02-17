/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author H9352
 */
public class teht3 {
    public static void main(String args[]) {
        FileReader fr;
        BufferedReader br;
        String temp;
        try {
            fr = new FileReader("text.txt");
            br = new BufferedReader(fr); 
            while((temp = br.readLine()) != null) {
            System.out.println(temp);}
            br.close();
        } catch (Exception e) {
            System.out.println("Tapahtui poikkeus");
        }
    }
}
