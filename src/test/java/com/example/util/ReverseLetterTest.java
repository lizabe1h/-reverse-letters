package com.example.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ReverseLetterTest {

    @Test
    public void keepNonLettersInPlace() {


        //arrange-подготовка
        String textInitial = "J@va the be$t!123";
        String expected = "t@eb eht av$J!123"; //ожидаемый

        //act - действие
        String actual = ReverseLetter.reverse(textInitial); //фактический;

        //assert -проверка
        Assertions.assertEquals(expected, actual, "должна быть строка- t@eb eht av$J!123");
    }

    @Test
    public void returnsEmptyForEmptyInput() {
        //arrange -подготовка
        String textInitial = "";
        String expected = "";

        //act -действие
        String actual = ReverseLetter.reverse(textInitial);

        //assert - проверка
        Assertions.assertEquals(expected, actual, "проверка пустой строки");
    }

    @Test
    public void returnOnlyA() {
        //arrange -подготовка
        String textInitial = "a";
        String expected = "a";

        //act-действие
        String actual = ReverseLetter.reverse(textInitial);

        //assert -проверка
        Assertions.assertEquals(expected, actual, "проверка одиночных символов-оставить как есть");
    }

    @Test
    public void returnStringWithoutLetters() {
        //arrange -проверка
        String textInitial = "123 !@#";
        String expected = "123 !@#";

        //act -действие
        String actual = ReverseLetter.reverse(textInitial);

        //assert - проверка
        Assertions.assertEquals(expected, actual, "строка без букв - без изменений");

    }

    @Test
    public void reversesOnlyLetters() {
        //arrange-подготовка
        String textInitial = "abcd";
        String expected = "dcba";

        //act-действие
        String actual = ReverseLetter.reverse(textInitial);

        //assert - проверка
        Assertions.assertEquals(expected, actual, "переворачивает только буквы");
    }

    @Test
    public void leaveSymbolsNotTheLetters() {
        String textInitial = "123!. Hello321!bye";
        String expected = "123!. eybol321!leH";

        String actual = ReverseLetter.reverse(textInitial);

        Assertions.assertEquals(expected, actual, "небуквенный символы остаются на местах");
    }

    @Test
    public void returnTheSameRegister() {
        String textInitial = "ПривЕт";
        String expected = "тЕвирП";

        String actual = ReverseLetter.reverse(textInitial);

        Assertions.assertEquals(expected, actual, "регистр остается без изменений");
    }

    @Test
    public void nullCheck() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> ReverseLetter.reverse(null));
        assertEquals("Строка не должна быть null", exception.getMessage());

    }

}
