/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.rekisteri;

import java.util.ArrayList;

/**
 *
 * @author H9352
 */
public class Rekisteri {
    private ArrayList<Henkilo> henkilot;
    
    public Rekisteri() {
        this.henkilot = new ArrayList<>();
    }
    
    public int getHenkilomaara() {
        return this.henkilot.size();
    }
    
    public boolean addHenkilo(Henkilo h) {
        return this.henkilot.add(h);
    }
    
    public Henkilo getHenkilo(int index) {
        if (index < getHenkilomaara()) 
            return this.henkilot.get(index);
        else
            return null;
    }
    
    public Henkilo findHenkilo(String sotu) {
        for (Henkilo h : this.henkilot) {
            // onko vuorossa olevan henkilon sotu sama kuin etsittävä
            if(sotu.equalsIgnoreCase(h.getSotu()))
                return h;
        }
        // sotua vastaavaa henkiloa ei loydy
        return null;
    }
}
