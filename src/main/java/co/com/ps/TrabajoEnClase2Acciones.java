package co.com.ps;
//ACCIONES PUBLICAS
//horno


public class TrabajoEnClase2Acciones {
    public static void main(String[] args) {
        TrabajoEnClase2Atributos accion_1 = new TrabajoEnClase2Atributos();
        accion_1.setPuerta("Abrir");
        System.out.println(accion_1.getPuerta());
        TrabajoEnClase2Atributos accion_2 = new TrabajoEnClase2Atributos();
        accion_2.setChispero(true);
        System.out.println(accion_2.getChispero());
        TrabajoEnClase2Atributos accion_3 = new TrabajoEnClase2Atributos();
        accion_3.setPerilla(180);
        System.out.println(accion_3.getPerilla());
        TrabajoEnClase2Atributos accion_4 = new TrabajoEnClase2Atributos();
        accion_4.setTermometro(3.14F);
        System.out.println(accion_4.getTermometro());
    }
}

