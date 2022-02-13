/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shared.entities;

import java.sql.Date;

/**
 *
 * @author l3ej
 */
public class Evenement extends Offres {
    public String lieu;

    public Evenement(int i, String cours_de_guitare, String cours_gratuit, Date date, Date date0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Evenement() {
    }

    public Evenement(String lieu, String nom, String description, Date datedebut, Date datefin, float prix, boolean etat, String ville) {
        super(nom, description, datedebut, datefin, prix, etat, ville);
        this.lieu = lieu;
    }

    public Evenement(String lieu) {
        this.lieu = lieu;
    }

    @Override
    public String toString() {
        return "Evenements{" + super.toString()  + ", lieu=" + lieu + '}';
    }
    
    
    
    
}
