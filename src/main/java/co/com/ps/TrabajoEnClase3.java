package co.com.ps;

//crear un ingreso universitario

//pedir tres datos y los almaceno en una estructura de datos al finalizar imprimir los datos

import java.util.Arrays;
import java.util.Scanner;

public class TrabajoEnClase3 {
    public static void main(String[] args) {
        String[] nomEstudiantes = new String[3];

        System.out.println("El programa le solicitara el nombre de tres estudiantes, y al final le mostrara los datos ingresados.");

        Scanner ingresoU;
        ingresoU = new Scanner(System.in);
        System.out.println("ingrese el nombre del primer estudiante:");
        nomEstudiantes[0] = ingresoU.next();
        System.out.println("ingrese el nombre del segundo estudiante:");
        nomEstudiantes[1] = ingresoU.next();
        System.out.println("ingrese el nombre del tercer estudiante:");
        nomEstudiantes[2] = ingresoU.next();

        System.out.println("Los nombres de los estudiantes son :");



        Arrays.stream(nomEstudiantes).forEach(System.out::println);


    }
}
