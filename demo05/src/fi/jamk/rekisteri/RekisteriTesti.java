/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.rekisteri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author H9352
 */
public class RekisteriTesti {
    public static void main(String args[]) {    
        Henkilo h = new Henkilo("Aku", "Ankka", "A1");
        
        // 1. kirjoitetaan henkilo-olio levylle
        
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        
        try {
        
            // luodaan binäärinen virta
            fileOut = new FileOutputStream("henkilo.dat");
            // luodaan oliovirta binäärivirran sisälle
            objOut = new ObjectOutputStream(fileOut);
            // kirjoitetaan henkilo-olio oliovirtaan eli levylle
            objOut.writeObject(h);
            System.out.println("Levylle kirjoitettu");
    } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei saada luotua");
    } catch (IOException e) {
            System.out.println("Levylle ei saada kirjoitettua");
    } finally {
            try {
                if (objOut != null) objOut.close();
            } catch (IOException e) {
                System.out.println("Tiedostoa ei saada suljettua");
            }
    }
        
        // 2. luetaan henkilo levylta
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        
        try {
            // avataan binäärinen virta
            fileIn = new FileInputStream("henkilo.dat");
            // luodaan oliovirta binäärivirtaan
            objIn = new ObjectInputStream(fileIn);
            // luetaan henkilo oliovirrasta
            h = (Henkilo) objIn.readObject();
            // tulostetaan henkilön tiedot näytölle
            System.out.println(h.getTiedot());
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löytynyt");
        } catch (IOException e) {
            System.out.println("Tiedoston luvussa virhe");
        } catch (ClassNotFoundException e) {
            System.out.println("Tiedostosta ei saada luettua henkilöitä");
        }
}
}