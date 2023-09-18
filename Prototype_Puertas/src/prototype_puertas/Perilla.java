package prototype_puertas;

// Clase Perilla
class Perilla {
    private double peso;

    public Perilla() {
    }
    
    public Object duplicar() {
        Perilla perillaClon = new Perilla();
        perillaClon.setPeso(this.peso);
        return perillaClon;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}
