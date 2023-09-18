package prototype_puertas;

// Clase Marco
class Marco {
    private double ancho;
    private double alto;

    public Marco() {
    }
    
    public Object duplicar() {
        Marco marcoClon = new Marco();
        marcoClon.setAncho(this.ancho);
        marcoClon.setAlto(this.alto);
        return marcoClon;
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
