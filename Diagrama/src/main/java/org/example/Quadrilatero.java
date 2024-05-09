package org.example;

public class Quadrilatero extends MiniPoligonos {
    private double l4;

    public Quadrilatero(double l1, double l2, double l3, double l4) {
        super(l1, l2, l3);
        this.l4 = l4;
    }

    @Override
    public double getArea() {
        return 0;
    }
    
    @Override
    public String getTipo() {
        return "";
    }
}
