package Stories;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        int floor = 5;
        move(floor);

    }
    static void move(int floor) {
        int currentFloor = 2;
        if (floor<currentFloor){
            for (int i = currentFloor; i >= floor; i--) {
                currentFloor =-i;
                System.out.println(currentFloor);
            }
        } else {
            for (int i = currentFloor; i <= floor; i++) {
                currentFloor =+i;
                System.out.println(currentFloor);
            }
        }
    }
}
