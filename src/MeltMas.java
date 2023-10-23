import java.util.Arrays;

public class MeltMas {
    public static void main(String[] args) {
        int[] mas1 = {1, 2, 5, 12, 4};
        int[] mas2 = {3, 18, 7, 34, 0, 85, 96, 97};
        int[] mas3;
        System.out.println(Arrays.toString(getMelt(mas1, mas2)));
    }

    static int[] getMelt(int[] mas1, int[] mas2) {
        int[] mas3 = new int[mas1.length + mas2.length];
        int k1 = Math.abs(mas1.length - mas2.length);
        int k = mas3.length - k1;
        for (int i = 0, j = 0; i < k; i += 2, j++) {
            mas3[i] = mas1[j];
            mas3[i + 1] = mas2[j];
        }
        if (mas1.length > mas2.length) {

            for (int i1 = k, j1 = mas1.length - k1; i1 < mas3.length; i1++, j1++) {
                mas3[i1] = mas1[j1];
            }
        } else {
            for (int i2 = k, j2 = mas2.length - k1; j2 < mas2.length; i2++, j2++) {
                mas3[i2] = mas2[j2];
            }
        }
        return mas3;
    }
}
