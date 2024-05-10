package org.example;
public class ContaCorrente extends Conta{

   @Override
   public void atualizaConta(double valor){
       super.depositar(valor * 2);
   }

    @Override
    public void depositar(double valor){
        super.depositar(valor - 0.10);
    }

}
