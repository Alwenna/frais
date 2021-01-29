/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alwen
 */
public class Representant {

    int numero;
    String nom;
    String prenom;
    String adresse;
    double salaireFixe;
    double CAMensuel;

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setSalaireFixe(double salaireFixe) {
        this.salaireFixe = salaireFixe;
    }

    public ZoneGeographique getSecteur() {
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

    public void setSecteur(ZoneGeographique secteur) {
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

    public void enregistrerCA(int mois, double montant) {
        if (mois < 0 || mois > 11) {
            throw new IllegalArgumentException("le mois doit être compris entre 0 et 11 ");
        }
        if (mois < 0) {
            throw new IllegalArgumentException("le mois doit être supérieur ou égal à 0 ");
        }
        throw new UnsupportedOperationException("Pas encore implémenté");
    }
    
    public double salaireMensuel (int mois, double pourcentage){
        throw new UnsupportedOperationException("Pas encore implémenté");
    }
    
    public String toString(){
        return "Représentant numéro" + numero + "nom : " + nom + "prenom : " + prenom;
    }

}
