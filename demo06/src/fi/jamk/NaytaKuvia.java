/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author H9352
 */
public class NaytaKuvia extends JFrame implements ActionListener {
    private Image img1, img2, img3;
    private MediaTracker mt;
    
    private JButton but1, but2, but3;
    private JPanel up, center;
    
    public NaytaKuvia() {
        super("NaytaKuvia Appis"); // otsikko
        lataaKuvat();
        // luodaan Buttonit
        but1 = new JButton("eka");
        but1.addActionListener(this);
        but2 = new JButton("toka");
        but2.addActionListener(this);
        but3 = new JButton("kolmas");
        but3.addActionListener(this);
        // luodaan up Paneeli
        up = new JPanel();
        up.setLayout(new FlowLayout());
        up.add(but1);
        up.add(but2);
        up.add(but3);
        // luodaan center paneeli
        center = new JPanel();
        // lisataan panelit ikkunaan eli JFrameen
        getContentPane().add(up,BorderLayout.NORTH);
        getContentPane().add(center,BorderLayout.CENTER);
        // ikkunan koko
        setSize(400,400); // (leveys, korkeus)
        // ikkunan sulkeminen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    // metodi lataa kuvat levyltä
    private void lataaKuvat() {
        img1 = getToolkit().createImage("kuva1.jpg");
        img2 = getToolkit().createImage("kuva2.jpg");
        img3 = getToolkit().createImage("kuva3.jpg");
        // odotellaan kuvien latautuminen
        mt = new MediaTracker(this);
        mt.addImage(img1,0);
        mt.addImage(img2,1);
        mt.addImage(img3,2);
        try {
        mt.waitForAll();
        } catch (Exception e) {
            // tyhjää...
        }
    }
    
    public static void main(String args[]) {
        try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Haluttua tuntumaa ei saada kayttoon");
        }
        new NaytaKuvia().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // center paneelin piirtopinta
        Graphics g = center.getGraphics();
        // mita Buttonia on painettu
        JButton pressed = (JButton) e.getSource();
        if (pressed == but1) {
            g.drawImage(img1,10,10,this);
        } else if (pressed == but2) {
            g.drawImage(img2,10,10,this);
        } else if (pressed == but3) {
            g.drawImage(img3,10,10,this);
        }
    }
}
