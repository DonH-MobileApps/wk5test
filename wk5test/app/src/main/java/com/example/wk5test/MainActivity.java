package com.example.wk5test;


class SubString{

    public static void SubString(String sub, int f) {
        for (int i = 0; i < f; i++)
            for (int j = i + 1; j <= f; j++)

                System.out.println(sub.substring(i, j));
    }

    public static void main(String[] args) {
        String sub = "frog";
        SubString(sub, sub.length());
    }
}
