package org.example.sem3;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            charList.add(String.valueOf((char) i));
        }
        System.out.println(charList);
        return charList;
    }
}
