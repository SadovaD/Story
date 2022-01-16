package com.company;

import java.util.Scanner;

 public class Main{

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int S = 0;

        System.out.println("Нью-Йорк");
        System.out.println("8:00");
        System.out.println("Начало нового рабочего дня в булочной");
        System.out.println("Цель: заработать 50 монет");

        System.out.println("Вы должны разложить булочки по полкам");
        System.out.println("(1) Положит самые дешовые на видное месть");
        System.out.println("(2) Положить средней цены на видное место");
        System.out.println("(3) Положить самые дорогие булочки на видное место");

        int a1=in.nextInt();
        if(a1==1){
            System.out.println("За весь день вы не смогли заработать нужную сумму");
        } else if(a1==2) {
            System.out.println("Вы смогли заработать нужную сумму за весь день. Вы молодец");
        } else {
            System.out.println("Вы превысили доход своей булочной. Самый лучший день для вас");
        }
        System.out.println("Рабочий день закончен");
    }

}

