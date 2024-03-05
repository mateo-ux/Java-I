package co.com.ps;

import java.util.Scanner;

public class TrabajoEnClase4 {
    //1. Detectar si un numero ingresado por consolaes negativo, positivo o igual a 0.
    public static void main(String[] args) {
        Scanner solucitudNum;
        solucitudNum = new Scanner(System.in);
        System.out.println("Ingrese un numero, este programa indica si es positivo, negativo o es igual a 0");
        int num = solucitudNum.nextInt();
        //solucitudNum.close();
        if (num == 0){
            System.out.println("El numero ingresado es igual a 0");
        } else if (num > 0) {
            System.out.println("El numero ingresado es positivo");
        }else {
            System.out.println("El numero ingresado es negativo");
        }

        /*2) Crea un programa que solicite al usuario ingresar el precio de un artículo y
        su categoría (por ejemplo, "electrónicos", "ropa", "alimentos").
        Aplica un descuento del 10% si es electrónica, 5% si es ropa y 2%
        si son alimentos. Imprime el precio final.
        */

        solucitudNum = new Scanner(System.in);
        System.out.println("Ingrese la categoria del  articulo, ya sea electrónicos, ropa o  alimentos");
        String categoria = solucitudNum.next();
        System.out.println("Ingrese el precio del articulo que va a comprar");
        Float precio = solucitudNum.nextFloat();
        solucitudNum.close();
        switch (categoria){
            case "electrónicos" :
                precio = precio * 0.9F;
                System.out.println("se efectuo un descuanto del 10% sobre su articulo, el precio final de este es: " +  precio);
            break;
            case "ropa" :
                precio = precio * 0.95F;
                System.out.println("se efectuo un descuanto del 5% sobre su articulo, el precio final de este es: " +  precio);
            break;
            case "alimentos" :
                precio = precio * 0.98F;
                System.out.println("se efectuo un descuanto del 2% sobre su articulo, el precio final de este es: " +  precio);
            break;
            default:
                System.out.println("Categoria no valida");
        }


    }
}
