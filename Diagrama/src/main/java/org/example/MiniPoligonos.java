package org.example;

public abstract class MiniPoligonos implements GeraisParaPolignos {
    private double L1, L2, L3;

    public MiniPoligonos(double L1, double L2, double L3){
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
    }

    public abstract String getTipo();

    public double getL1() {
        return L1;
    }

    public double getL2() {
        return L2;
    }

    public double getL3() {
        return L3;
    }




}