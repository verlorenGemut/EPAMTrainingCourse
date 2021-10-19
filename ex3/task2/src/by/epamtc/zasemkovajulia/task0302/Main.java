package by.epamtc.zasemkovajulia.task0302;

import static by.epamtc.zasemkovajulia.task0302.JaggedArrayLogic.*;

public class Main {

    public static void main(String[] args) {
        int arr[][] = new int[][]  {
                new int[] {50, 20, 40},
                new int[] {110, 60},
                new int[] {50, 10}
        };

        arr = first(arr);
        printArray(arr);

        arr = second(arr);
        printArray(arr);

        arr = third(arr);
        printArray(arr);
    }

    private static void printArray(int[][] juggedArray) {
        for (int[] ints : juggedArray) {
            for (int anInt : ints)
                System.out.print(anInt + " ");
            System.out.println();
        }
        System.out.println();
    }
}
