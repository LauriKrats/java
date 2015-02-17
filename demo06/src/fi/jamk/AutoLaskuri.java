/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author H9352
 */
public class AutoLaskuri extends JFrame implements ActionListener {
    private int kauto = 0;
    private int hauto = 0;
    
    private JButton but1, but2;
    private JPanel up, upper;
    private final JLabel label, label2;
    
    public AutoLaskuri() {
        super("AutoLaskuri"); // otsikko
        // luodaan Buttonit
        but1 = new JButton("Kuorma-auto");
        but1.addActionListener(this);
        but2 = new JButton("Henkilöauto");
        but2.addActionListener(this);
        // luodaan Labelit tekstia varten
        label = new JLabel();
        label2 = new JLabel();
        // luodaan paneelit
        upper = new JPanel();
        up = new JPanel();
        up.setLayout(new FlowLayout());
        // lisataan Buttonit up paneliin
        up.add(but1);
        up.add(but2);
        // lisatana labelit upper paneeliin
        upper.add(label);
        upper.add(label2);
        // lisataan panelit ikkunaan, eli JFrameen
        getContentPane().add(up,BorderLayout.SOUTH);
        getContentPane().add(upper,BorderLayout.NORTH);
        // ikkunan koko
        setSize(400,400);
        // ikkunan sulkeminen
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String args[]) {
        try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Haluttua tuntumaa ei saatu");
        }
        new AutoLaskuri().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics g = up.getGraphics();
        // kumpaa Buttonia on painettu
        JButton pressed = (JButton) e.getSource();
        if (pressed == but1) {
            kauto++;
            label.setText("" + kauto);
        } else if (pressed == but2) {
            hauto++;
            label2.setText("" + hauto);
        }
    }
}
