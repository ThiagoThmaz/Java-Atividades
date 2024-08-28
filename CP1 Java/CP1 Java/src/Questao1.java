public class Questao1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,5,6,4,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,9,7,8,9};

        int[] vetorMulti = new int[10];
        for (int i = 0; i < vetorMulti.length; i++){
            vetorMulti[i] = array1[i] * array2[i];
            if (vetorMulti[i] % 2 == 0){
                System.out.println("O número é par " + vetorMulti[i]);
        } else {
                System.out.println("O número é ímpar: " + vetorMulti[i]);
            }



        }


    }
}
