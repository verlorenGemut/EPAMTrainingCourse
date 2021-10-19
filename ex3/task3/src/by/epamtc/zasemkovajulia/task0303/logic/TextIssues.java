package by.epamtc.zasemkovajulia.task0303.logic;

import by.epamtc.zasemkovajulia.task0303.entity.Text;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TextIssues {
    public static Text getTextFromConsole(Text text) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            text.add(in.nextLine());
        }

        return text;
    }

    public static Text getTextFRomFile(String filename, Text text) {
        try(FileReader reader = new FileReader(filename))
        {
            int c;
            while((c=reader.read())!=-1){
                text.add((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        return text;
    }

    public static Text first(int k, char symbol, Text text) {
        for(int i = k; i < text.getText().length(); i += k) {
            text.getText().replace(text.getText().charAt(i), symbol);
        }

        return text;
    }

    public static Text second(Text text) {
        if(text.getText().contains("pa")) {
            text.getText().replace("pa", "po");
        }

        return text;
    }

    public static Text third(String substring, int size, Text text) {
        String[] words = text.getText().split(" ");
        for(String word : words) {
            if(word.length() == size) {
                text.getText().replace(word, substring);
            }
        }

        return text;
    }

    public static Text fourth(Text text) {
        for(int i = 0; i < text.getText().length(); i++) {
            if(text.getText().charAt(i) < 41 || text.getText().charAt(i) > 90) {
                if(text.getText().charAt(i) < 97 || text.getText().charAt(i) > 122) {
                    if(text.getText().charAt(i) != 20) {
                        text.setText(removeCharAt(text.getText(), i));
                    }
                }
            }
        }
        return text;
    }

    public static Text fifth(int size, Text text) {
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, text.getText().split(" "));
        char[] symbols = new char[]
                {'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        String soglasnie = "qwrtpsdfghjklzxcvbnm";
        for(int i = 0; i < words.size(); i++) {
            if(soglasnie.contains(String.valueOf(words.get(i).charAt(0)))) {
                words.remove(i);
            }
        }
        return text;
    }

    private static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
