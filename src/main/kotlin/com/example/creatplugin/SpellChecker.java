package com.example.creatplugin;

public class SpellChecker {
    public static boolean checkSpelling(String word) {
        // Logic kiểm tra chính tả đơn giản
        return word.matches("[a-zA-Z]+");
    }
}
