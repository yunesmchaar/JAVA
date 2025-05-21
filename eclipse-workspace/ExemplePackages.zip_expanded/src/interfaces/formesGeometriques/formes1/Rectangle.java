package interfaces.formesGeometriques.formes1;

import interfaces.formesGeometriques.FormesGeometriques;

public class Rectangle implements FormesGeometriques {
    private double largeur, longueur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.longueur = hauteur;
    }

    @Override
    public double surface() {
        return largeur * longueur;
    }
}
