package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yaricap, aci;
        double pi = 3.14;

        System.out.print("Yarıçapı Giriniz :");
        yaricap = input.nextInt();

        System.out.print("Açıyı Giriniz :");
        aci = input.nextInt();

        System.out.println("Daire Diliminin Alanı = " + (pi * (yaricap * yaricap) * aci) / 360);
    }
}
