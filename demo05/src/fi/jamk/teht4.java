/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author H9352
 */
public class teht4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float i = 0;
        System.out.println("Ohjelma lopetaan syottamalla: 666");
        do {
            System.out.println("Anna luku:");
            i = sc.nextFloat();
            try {
                if (i % 1 == 0) {
                    FileOutputStream fos = new FileOutputStream("kok.txt");
                    DataOutputStream dos = new DataOutputStream(fos);
                    dos.writeFloat(i);
                    dos.close();
                } else {
                    FileOutputStream fos = new FileOutputStream("real.txt");
                    DataOutputStream dos = new DataOutputStream(fos);
                    dos.writeFloat(i);
                    dos.close();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Tapahtui poikkeus");
            } catch (IOException e) {
                System.out.println("Tapahtui poikkeus");
            }
        } while(i != 666);
    }
}
