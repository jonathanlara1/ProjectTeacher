package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = input.nextInt();
        System.out.println("Ingresa otro numero");
        int num2 = input.nextInt();
        int resultado = num1+num2;
        System.out.println("Resultado: " + resultado);
    }
}