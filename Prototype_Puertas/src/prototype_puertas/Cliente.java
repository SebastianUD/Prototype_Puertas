package prototype_puertas;

import java.util.ArrayList;

// Clase Cliente
class Cliente {
    private PuertaDuplicable puertaBase;
    private ArrayList<Puerta> puertas = new ArrayList<>();

    public Cliente() {
    }

    public void crearPuertaBase(double anchoVentana, double altoVentana, double anchoMarco, double altoMarco, double pesoPerilla) {
        VentanaDuplicable ventanaDuplicable = new VentanaDuplicable();
        PerillaDuplicable perillaDuplicable = new PerillaDuplicable();
        MarcoDuplicable marcoDuplicable = new MarcoDuplicable();
        puertaBase = new PuertaDuplicable();
        
        // Obtener instancias duplicadas
        Ventana ventanaBase = (Ventana) ventanaDuplicable.duplicar();
        ventanaBase.setAncho(anchoVentana);
        ventanaBase.setAlto(altoVentana);

        Perilla perillaBase = (Perilla) perillaDuplicable.duplicar();
        perillaBase.setPeso(pesoPerilla);

        Marco marcoBase = (Marco) marcoDuplicable.duplicar();
        marcoBase.setAncho(anchoMarco);
        marcoBase.setAlto(altoMarco);

        // Establecer las instancias en la puerta base
        puertaBase.setVentana(ventanaBase);
        puertaBase.setPerilla(perillaBase);
        puertaBase.setMarco(marcoBase);
    }

    public void duplicarPuerta() {
        if (puertaBase != null) {
            Puerta puertaClon = (Puerta) puertaBase.duplicar();
            puertas.add(puertaClon);
        }
    }

    public String getTextoPuertaBase() {
        if (puertaBase != null) {
            return "Puerta Base:\nVentana: Ancho=" + puertaBase.getVentana().getAncho() +
                    ", Alto=" + puertaBase.getVentana().getAlto() +
                    "\nPerilla: Peso=" + puertaBase.getPerilla().getPeso() +
                    "\nMarco: Ancho=" + puertaBase.getMarco().getAncho() +
                    ", Alto=" + puertaBase.getMarco().getAlto();
        } else {
            return "Puerta Base no creada.";
        }
    }

    public String getTextoPuertaClon(int indice) {
        if (indice >= 0 && indice < puertas.size()) {
            Puerta puertaClon = puertas.get(indice);
            return "Puerta Clon " + (indice + 1) + ":\nVentana: Ancho=" + puertaClon.getVentana().getAncho() +
                    ", Alto=" + puertaClon.getVentana().getAlto() +
                    "\nPerilla: Peso=" + puertaClon.getPerilla().getPeso() +
                    "\nMarco: Ancho=" + puertaClon.getMarco().getAncho() +
                    ", Alto=" + puertaClon.getMarco().getAlto();
        } else {
            return "Puerta Clon no encontrada.";
        }
    }

    public Puerta getPuertaClon(int indice) {
        if (indice >= 0 && indice < puertas.size()) {
            return puertas.get(indice);
        } else {
            return null;
        }
    }
}
