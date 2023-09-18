package prototype_puertas;

public class PruebaCliente {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente();

        // Crear la puerta base
        cliente.crearPuertaBase(80.0, 200.0, 10.0, 200.0, 2.5);

        // Duplicar la puerta base
        cliente.duplicarPuerta();

        // Obtener texto de la puerta base
        String textoPuertaBase = cliente.getTextoPuertaBase();
        System.out.println("Información de la Puerta Base:\n" + textoPuertaBase);

        // Obtener texto de la puerta clonada
        String textoPuertaClon = cliente.getTextoPuertaClon(0); // Cambia el índice si duplicas más puertas
        System.out.println("\nInformación de la Puerta Clonada:\n" + textoPuertaClon);

        // Realizar cambios en el clon
        Puerta puertaClon = cliente.getPuertaClon(0);
        if (puertaClon != null) {
            // Cambiar el ancho de la ventana en el clon
            puertaClon.getVentana().setAncho(90.0);

            // Cambiar el peso de la perilla en el clon
            puertaClon.getPerilla().setPeso(3.0);

            // Obtener texto del clon modificado
            String textoPuertaClonModificado = cliente.getTextoPuertaClon(0);
            System.out.println("\nInformación de la Puerta Clonada Modificada:\n" + textoPuertaClonModificado);
        } else {
            System.out.println("\nNo se encontró la puerta clonada.");
        }
    }
}
