public class Main {
    public static void main(String[] args) {
        Imple.Animal MeuAnimal = new Gato();
        Imple.Veiculo MeuCarro = new Carro();
        Imple.Veiculo MinhaMoto = new Moto();

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