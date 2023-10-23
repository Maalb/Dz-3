import java.util.Arrays;

public class NoRepeat {
    public static void main(String[] args) {
        int[] massive = {1, 3, 7, 7, 12};
        System.out.println(Arrays.toString(getNoRepeat(massive)));
    }

    static int[] getNoRepeat(int[] mas){
        int[] mass = new int[mas.length];
        for (int i =0; i<mas.length; i++){
            for (int j=0; j<mas.length; j++){
                if (i != j && mas[j] == mas[i]) {
                    mas[j] = 0;
                }
            }
        }
        return mas;
    }
}
