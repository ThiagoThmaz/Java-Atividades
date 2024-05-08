public class Carro implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Carro dirigindo...");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }

    @Override
    public void abastecer() {
        System.out.println("Carro abastecido...");
    }
}
