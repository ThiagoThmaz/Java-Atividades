import java.util.*;

public class Questao2 {
    static class GerenciadorConvidados{

        String[] lista = new String[0];

        public void adicinarConvidado(String nome){
            lista = Arrays.copyOf(lista,lista.length + 1);
            lista[lista.length - 1] = nome;

        }

        public void print(){
            System.out.println(Arrays.toString(lista));
        }

        @Override
        public String toString() {
            return Arrays.toString(lista);
        }
    }
}
