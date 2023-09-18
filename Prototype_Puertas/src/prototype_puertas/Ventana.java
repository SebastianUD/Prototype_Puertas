package prototype_puertas;

// Clase Ventana
class Ventana {
    private double ancho;
    private double alto;

    public Ventana() {
    }

    public Object duplicar() {
        Ventana ventanaClon = new Ventana();
        ventanaClon.setAncho(this.ancho);
        ventanaClon.setAlto(this.alto);
        return ventanaClon;
    }
    
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }
}
