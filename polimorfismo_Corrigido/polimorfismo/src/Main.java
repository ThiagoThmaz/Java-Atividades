public class Main {
    public static void main(String[] args) {
        Animal MeuAnimal = new Gato();
        Veiculo MeuCarro = new Carro();
        Veiculo MinhaMoto = new Moto();

        //GATO
        MeuAnimal.comer();
        MeuAnimal.dormir();

        //CARRO
        MeuCarro.dirigir();
        MeuCarro.frear();
        MeuCarro.abastecer();

        //MOTO
        MinhaMoto.dirigir();
        MinhaMoto.frear();
        MinhaMoto.abastecer();
    }
}