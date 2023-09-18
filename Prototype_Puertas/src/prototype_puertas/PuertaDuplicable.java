package prototype_puertas;

// Clase PuertaDuplicable que implementa Duplicable
class PuertaDuplicable implements Duplicable {
    @Override
    public Object duplicar() {
        // Crear una nueva instancia de PuertaDuplicable y copiar los valores
        return new Puerta(
            this.ventana != null ? (Ventana) this.ventana.duplicar() : null,
            this.perilla != null ? (Perilla) this.perilla.duplicar() : null,
            this.marco != null ? (Marco) this.marco.duplicar() : null
        );
    }

    private Ventana ventana;
    private Perilla perilla;
    private Marco marco;

    // Constructor sin argumentos
    public PuertaDuplicable() {
    }

    // Constructor para establecer Ventana, Perilla y Marco
    public PuertaDuplicable(Ventana ventana, Perilla perilla, Marco marco) {
        this.ventana = ventana;
        this.perilla = perilla;
        this.marco = marco;
    }

    // Métodos set y get para Ventana, Perilla y Marco
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
