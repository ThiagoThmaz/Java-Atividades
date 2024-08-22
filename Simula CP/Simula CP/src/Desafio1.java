public class Desafio1 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,5,6,4,7,8,9,10};

        int[] array2 = {1,2,3,4,5,6,9,7,8,9};

        int[] arraySoma = new int[10];

        for (int i = 0; i < arraySoma.length; ++i){
            arraySoma[i] = array1[i] + array2[i];
            System.out.println(arraySoma[i]);
        }
    }


}
