package org.example;

public class Empregado extends Pessoa {

    private Integer codigoSetor;

    private double salaraioBase;

    private double imposto;

    public Integer getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalaraioBase() {
        return salaraioBase;
    }

    public void setSalaraioBase(double salaraioBase) {
        this.salaraioBase = salaraioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        return salaraioBase - (salaraioBase * imposto);
    }
}
