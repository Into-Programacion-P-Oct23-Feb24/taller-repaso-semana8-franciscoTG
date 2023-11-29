/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int contador = 1;
        System.out.println("Ingrese un numero positivo y par ");
        n = entrada.nextInt();
        while (contador <= n) {
            if (n % 2 == 0) {
                System.out.printf("%s\n", contador);
            } else {
                System.out.println("Numero incorrecto");
            }
            contador = contador + 1;
        }
    }
}