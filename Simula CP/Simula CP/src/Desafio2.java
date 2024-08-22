import java.util.Arrays;

public class Desafio2 {
    //Teste na Main
    public static void main(String[] args) {
        arr arr = new arr();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr);
        System.out.println(arr.peek());
        System.out.println(arr.pop());
        System.out.println(arr);
        System.out.println(arr.popFisrt());
        System.out.println(arr);
    }
}

//Metodos
class arr{
    private int[] array = new int[0];

    public void add(int item){
        array = Arrays.copyOf(array,array.length + 1);
        array[array.length - 1] = item;
    }

    public int peek(){
        return array[array.length - 1];
    }

    public int pop(){
        int numero = array[array.length - 1];
        array = Arrays.copyOf(array, array.length - 1);
        return numero;
    }

    public int popFisrt(){
        int numero = array[0];
        int[] arr2 = new int[array.length - 1];
        int n = 0;
        for (int i = 1; i < array.length; ++i){
            arr2[n] = array[i];
            n++;
        }
        array = arr2;
        return  numero;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

}



