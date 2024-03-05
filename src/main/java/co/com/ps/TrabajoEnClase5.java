package co.com.ps;
import java.util.Arrays;
import java.util.List;

//Crear un programa que filtre las palabras que tengan mas de 5 caracteres
public class TrabajoEnClase5 {



    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Java", "Stream", "Ejemplo", "Programación", "Funcional");

        for(String itemListas:palabras ){
            if (itemListas.length() > 5){
                System.out.println(itemListas);
            }
        }


//        String test= "Mauricio";
//        System.out.println(test.length());
    }
}