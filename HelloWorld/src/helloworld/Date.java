/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.logging.Logger;

/**
 *
 * @author p2103678
 */
public class Date {
    private int jour, mois, annee;
    public Date() {
        this.jour = 1;
        this.mois = 1;
        this.annee = 1970;
    }
    public Date (int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
    public int getJour() {return this.jour;}
    public int getMois() {return this.mois;}
    public int getAnnee() {return this.annee;}

    public void setJour(int jour) {
        this.jour = jour;
    }
    public void setMois(int mois) {
        this.mois = mois;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
    @Override
    public String toString() {
        
        Jours tab[] = Jours.values();
        
        String date = new String(tab[DayOfWeek()].toString());
        date += " ";
        if (this.jour < 10) {
            date += "0";
        }
        date += this.jour + "/";
        
        if (this.mois < 10) {
            date += "0";
        }
        date += this.mois + "/" + this.annee;
        
        return date;
    }
    
    public int DayOfWeek() {
    
       int r = (int)Math.floor((23*mois) / 9) + jour + 4 + annee;
       if (this.mois >= 3) { 
          r+= (int)Math.floor(annee/4) - (int)Math.floor(annee/100)+ (int)Math.floor(annee/400) - 2;
       }
       else {
          r+= (int)Math.floor((annee-1)/4) - (int)Math.floor((annee-1)/100)+ (int)Math.floor((annee-1)/400);
       }
       return (r % 7);
    }
    
    public void affiche(){
        
        System.out.println(toString());
    }
 
}
