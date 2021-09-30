package by.epamtc.zasemkovajulia.task0104.entity;

import java.util.ArrayList;

public class Numbers {
    private ArrayList<Integer> arrayList;

    public Numbers() {
        arrayList = new ArrayList<>();
    }

    public Numbers(int a, int b, int c, int d) {
        arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
}
