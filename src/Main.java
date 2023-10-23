import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] massive = {1, 3, 7, 7, 12};
        System.out.println(Arrays.toString(getPlusOne(massive)));

    }
    static int[] getPlusOne(int[] mas){
        int[] mass = new int[mas.length];
        for (int i = 0; i<mas.length; i++){
            mass[i] = mas[i]+1;
        }
        return mass;
    }

}