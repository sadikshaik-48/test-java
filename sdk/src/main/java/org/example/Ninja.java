package org.example;

import java.util.Scanner;

public class Ninja {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        long x=sc.nextLong();
        System.out.println(x);
//1836452738472647283
        if(x==1836452738472647283l)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
