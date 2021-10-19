package by.epamtc.zasemkovajulia.task0301.entity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArray() {
        array = new int[DEFAULT_CAPACITY];
    }

    public MyArray(int initialCapacity) {
        if (initialCapacity > 0) {
            this.array = new int[initialCapacity];
        } else if (initialCapacity == 0) {
            this.array = new int[0];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public MyArray(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        this.size = array.length;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Array: {" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyArray myArray = (MyArray) obj;
        return size == myArray.size && Arrays.equals(array, myArray.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
