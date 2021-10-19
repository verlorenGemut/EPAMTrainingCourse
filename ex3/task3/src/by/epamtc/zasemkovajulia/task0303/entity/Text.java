package by.epamtc.zasemkovajulia.task0303.entity;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Text {

    private String text = "";

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void add(String s) {
        text += s;
    }

    public void add(char c) {
        text += c;
    }
}
