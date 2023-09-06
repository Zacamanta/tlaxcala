/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tlaxcala.ui;

import java.util.Scanner;
import mx.itson.talxcala.negocio.Operacion;

/**
 *
 * @author omar_
 */
public class Main {

    public static void main (String[] args)

    {

        System.out.println("resultado el enunciado a separar:");

        Scanner scanner = new Scanner(System.in);
        String enunciado = scanner.nextLine();
         
        String[] resultado = new Operacion().separar(enunciado);

        for (String s : resultado) {
            System.out.println((s));
        }

    }
}
