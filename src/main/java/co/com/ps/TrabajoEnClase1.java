package co.com.ps;

import java.util.Scanner;

public class TrabajoEnClase1 {
    public static void main(String[] arg){
        Scanner scaner;
        scaner = new Scanner(System.in); //asigne un objeto de tipo scaner
        System.out.println("Ingrese su nombre");
        String nombre = scaner.next();
        System.out.println("Hola " + nombre + " este programa se encaraga de informarle el promedio de tres numero que usted ingresara, por favor ingrese el numero 1: ");
        int num_1 = scaner.nextInt();
        System.out.println("Ingrese el numero 2:" );
        int num_2 = scaner.nextInt();
        System.out.println("Ingrese el numero 3:" );
        int num_3 = scaner.nextInt();
        int prom = (num_1 + num_2 + num_3)/3;
        System.out.println("El promedio de los numeros ingresados es: " + prom );

        scaner.close();
    }
}
