package org.example;

public class Hexagono extends MiniPoligonos {

    private double l4, l5, l6;

    public Hexagono(double l1, double l2, double l3, double l4, double l5, double l6) {
        super(l1, l2, l3);
        this.l4 = l4;
        this.l5 = l5;
        this.l6 = l6;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getTipo() {
        return "";
    }

    public double getL6() {
        return l6;
    }
    public double getL5() {
        return l5;
    }

    public double getL4() {
        return l4;
    }
}