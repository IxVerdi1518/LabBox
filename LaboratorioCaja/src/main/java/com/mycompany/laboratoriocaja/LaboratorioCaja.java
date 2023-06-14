/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratoriocaja;

import Clases.Caja;
import java.util.Scanner;

/**
 *
 * @author Esteban
 */
public class LaboratorioCaja {

    public static void main(String[] args) {
        System.out.println("EN ESTE PROGRAMA SE REALIZA EL CALCULO DE UNA CAJA CON DATOS INGRESADOS POR"
                + "CONSOLA");
        int ancho = 0,alto = 0, profundidad =0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el ancho; ");
        ancho = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingresa el alto: ");
        alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingresa la profundidad");
        profundidad = Integer.parseInt(entrada.nextLine());
        Caja caja = new Caja(ancho, alto, profundidad);
        caja.calcularCaja();
    }
}
