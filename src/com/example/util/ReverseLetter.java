package com.example.util;
//В следующем задании нужно будет развернуть буквы в строке, оставив все небуквенные символы на своих
// местах. Здесь — строительные блоки, из которых вы соберёте решение сами

public class ReverseLetter {

    public static String reverse(String text) {
        char[] arrayText = text.toCharArray(); //получаем массив символов
        int left = 0;
        int right = arrayText.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(arrayText[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(arrayText[right])) {
                right--;
            }
            if (left < right) {
                char result = arrayText[right];
                arrayText[right] = arrayText[left];
                arrayText[left] = result;
                left++;
                right--;
            }
        }
        return new String(arrayText);


    }
}





