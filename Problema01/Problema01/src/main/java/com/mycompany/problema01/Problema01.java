/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema01;

import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero = 0;
        boolean bandera;
        bandera = false;
        do {
            System.out.println(numero);
            numero = numero - 10;
        } while (bandera);
        System.out.println(numero);

    }
}

