package prototype_puertas;

// Clase PerillaDuplicable que implementa Duplicable
class PerillaDuplicable implements Duplicable {
    @Override
    public Object duplicar() {
        return new Perilla(); // Crea una nueva perilla clonada
    }
}
