package prototype_puertas;

// Clase VentanaDuplicable que implementa Duplicable
class VentanaDuplicable implements Duplicable {
    @Override
    public Object duplicar() {
        return new Ventana(); // Crea una nueva instancia de Ventana
    }
}