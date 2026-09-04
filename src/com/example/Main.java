package com.example;

public class Main {
    public static void main(String[] args) {
        String text = "J@va the be$t!123";
        int length = text.length();
        System.out.println("Длина текста составляет : " + length);
//        for (int i = 0; i < length; i++) {
//            char charText = text.charAt(i);//
//            System.out.print(charText + " ");
//            System.out.println(Character.isLetter(text.charAt(i)));
//
//        }
        System.out.println("Переворачиваем строку:");

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
            } //if нет букв на пути
        } //основн цикл while
        System.out.println(new String(arrayText));


    }
}
