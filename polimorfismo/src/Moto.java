public class Moto implements Imple.Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Moto dirigindo...");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando...");
    }

    @Override
    public void abastecer() {
        System.out.println("Moto abastecendo...");
    }
}
