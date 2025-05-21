package interfaces.formesGeometriques.formes2;

import interfaces.formesGeometriques.formes1.Rectangle;

public class TriangleCarre extends Rectangle {
    private double cote;

    public TriangleCarre(double larg, double longu, double cote) {
        super(larg, longu);
        this.cote = cote;
    }

    @Override
    public double surface() {
        return super.surface() / 2;
    }
}
