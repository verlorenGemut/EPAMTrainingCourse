package by.epamtc.zasemkovajulia.task0301.logic;

import by.epamtc.zasemkovajulia.task0301.entity.MyArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ActionsWithArray {
    public static MyArray bubbleSort(MyArray array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.getSize() - 1; i++) {
                if (array.getArray()[i] > array.getArray()[i + 1]) {
                    temp = array.getArray()[i];
                    array.getArray()[i] = array.getArray()[i + 1];
                    array.getArray()[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static MyArray insertionSort(MyArray array) {
        for (int i = 1; i < array.getArray().length; i++) {
            int current = array.getArray()[i];
            int j = i - 1;
            while (j >= 0 && current < array.getArray()[j]) {
                array.getArray()[j + 1] = array.getArray()[j];
                j--;
            }
            array.getArray()[j + 1] = current;
        }
        return array;
    }

    public static MyArray selectionSort(MyArray array) {
        for (int i = 0; i < array.getSize(); i++) {
            int min = array.getArray()[i];
            int minId = i;
            for (int j = i + 1; j < array.getSize(); j++) {
                if (array.getArray()[j] < min) {
                    min = array.getArray()[j];
                    minId = j;
                }
            }
            int temp = array.getArray()[i];
            array.getArray()[i] = min;
            array.getArray()[minId] = temp;
        }
        return array;
    }

    public static int binarySearch(int key, MyArray array) {
        int low = 0;
        int high = array.getSize();
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.getArray()[mid] < key) {
                low = mid + 1;
            } else if (array.getArray()[mid] > key) {
                high = mid - 1;
            } else if (array.getArray()[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int findMax(MyArray array) {
        int max = array.getArray()[0];
        for (int i = 1; i < array.getSize(); i++) {
            if (array.getArray()[i] > max) {
                max = array.getArray()[i];
            }
        }
        return max;
    }

    public static int findMin(MyArray array) {
        int min = array.getArray()[0];
        for (int i = 1; i < array.getSize(); i++) {
            if (array.getArray()[i] < min) {
                min = array.getArray()[i];
            }
        }
        return min;
    }

    public static int[] findSimpleNumbers(MyArray array) {
        int counter = 0;
        for(int number : array.getArray()) {
            if(isSimpleNumber(number)) {
                counter++;
            }
        }

        int[] simpleNumbers = new int[counter];
        int i = 0;
        for(int number : array.getArray()) {
            if(isSimpleNumber(number)) {
                simpleNumbers[i] = number;
                i++;
            }
        }

        return simpleNumbers;
    }

    private static boolean isSimpleNumber(int number) {
        int temp;
        for (int i = 2; i <= number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] findFibonacciNumbers(MyArray array) {
        int counter = 0;
        for(int number : array.getArray()) {
            if(isFibonacciNumber(number)) {
                counter++;
            }
        }

        int[] fibonacciNumbers = new int[counter];
        int i = 0;
        for(int number : array.getArray()) {
            if(isFibonacciNumber(number)) {
                fibonacciNumbers[i] = number;
                i++;
            }
        }

        return fibonacciNumbers;
    }

    private static boolean isFibonacciNumber(int number) {
        double temp = 5 * number * number - 4;
        double squareOfNumber = (long)Math.sqrt(temp);
        return squareOfNumber * squareOfNumber == temp;
    }

    public static int[] getUnusualNumbers(MyArray array) {
        int counter = 0;
        for(int number : array.getArray()) {
            if(isUnusualNumber(number)) {
                counter++;
            }
        }

        int[] unusualNumbers = new int[counter];
        int i = 0;
        for(int number : array.getArray()) {
            if(isUnusualNumber(number)) {
                unusualNumbers[i] = number;
                i++;
            }
        }

        return unusualNumbers;
    }

    private static boolean isUnusualNumber(int number) {
        if(number < 100 || number > 999) {
            return false;
        }
        int firstDigit = number/100;
        int secondDigit = number - firstDigit*100;
        int thirdDigit = number% 10;

        if(firstDigit == secondDigit || firstDigit == thirdDigit || secondDigit == thirdDigit) {
            return false;
        }

        return true;
    }

    public static MyArray randomizeArray(MyArray array) {
        Random random = new Random();
        for(int i = 0; i < array.getSize(); i++) {
            array.getArray()[i] = random.nextInt(666);
        }
        return array;
    }

    public static MyArray fillFromFile(String fileName, MyArray array) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));

        for(int i = 0; i < array.getSize(); i++) {
            array.getArray()[i] = scanner.nextInt();
        }
        return array;
    }

    public static MyArray fillFromConsole(MyArray array) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array.getSize(); i++) {
            array.getArray()[i] = scanner.nextInt();
        }

        return array;
    }
}
