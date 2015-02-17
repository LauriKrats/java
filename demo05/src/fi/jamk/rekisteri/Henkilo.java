/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.rekisteri;

import java.io.Serializable;

/**
 *
 * @author H9352
 */
public class Henkilo implements Serializable{
    private String etunimi;
    private String sukunimi;
    private String sotu;

    public Henkilo(String etunimi, String sukunimi, String sotu) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.sotu = sotu;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public void setSotu(String sotu) {
        this.sotu = sotu;
    }
    
    public String getTiedot() {
        return this.etunimi + " " + this.sukunimi + " " + this.sotu;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public String getSotu() {
        return sotu;
    }
    
    
}
