package by.epamtc.zasemkovajulia.task0302;

public class JaggedArrayLogic {
    public static int[][] first(int[][] array) {
        int[] sums = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            sums[i] = 0;
            for(int j = 0; j < array[i].length; j++) {
                sums[i] += array[i][j];
            }
        }

        return almostBubbleSort(array, sums);
    }

    public static int[][] second(int[][] array) {
        int[] maxs = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            maxs[i] = array[i][0];
            for(int j = 1; j < array[i].length; j++) {
                if(array[i][j] > maxs[i]) {
                    maxs[i] = array[i][j];
                }
            }
        }

        return almostBubbleSort(array, maxs);
    }

    public static int[][] third(int[][] array) {
        int[] mins = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            mins[i] = array[i][0];
            for(int j = 1; j < array[i].length; j++) {
                if(array[i][j] < mins[i]) {
                    mins[i] = array[i][j];
                }
            }
        }

        return almostBubbleSort(array, mins);
    }

    private static int[][] almostBubbleSort(int[][] array, int[] helpArray) {
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(helpArray[i] > helpArray[i+1]){
                    isSorted = false;

                    int[] temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                    int t = helpArray[i];
                    helpArray[i] = helpArray[i+1];
                    helpArray[i+1] = t;
                }
            }
        }

        return array;
    }
}
