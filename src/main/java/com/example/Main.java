package com.example;

public class Main {
    public static void main(String[] args) {
//        String result = ReverseLetter.reverse("J@va the be$t!123");
//        System.out.println(result);

        int[] nums = {10, 20, 30, 40};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            //сложность 0(n)-линейная сложность
        }

        for (int i = 0; i < nums.length; i++) {//n шагов
            System.out.println(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]*2);
            //Всего 2n -> 0(n)
        }

        //O(n²) — квадратичная сложность, цикл внутри цикла
        for (int i = 0; i < nums.length; i++) {       // n раз
            for (int j = 0; j < nums.length; j++) {   // внутри ещё n раз
                System.out.println(nums[i] + nums[j]);
            }// n * n  ->  O(n^2)
            //Грубое правило для начала: один или несколько последовательных циклов
            // по данным — это O(n); вложенные циклы по данным — обычно O(n²).
            // Чем меньше степень n, тем быстрее алгоритм на больших объёмах.
            // Пока достаточно уметь различать эти случаи — глубже разберёте дальше.
        }
                


    }
}
