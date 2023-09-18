package prototype_puertas;

// Clase Puerta
class Puerta {
    private Ventana ventana;
    private Perilla perilla;
    private Marco marco;

    public Puerta(Ventana ventana, Perilla perilla, Marco marco) {
        this.ventana = ventana;
        this.perilla = perilla;
        this.marco = marco;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setPerilla(Perilla perilla) {
        this.perilla = perilla;
    }

    public Perilla getPerilla() {
        return perilla;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    public Marco getMarco() {
        return marco;
    }
}
